/*package com.practice.Code.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.security.oauth2.client.DefaultOAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.security.oauth2.client.token.AccessTokenProvider;
import org.springframework.security.oauth2.client.token.AccessTokenProviderChain;
import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsAccessTokenProvider;
import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsResourceDetails;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

import java.util.Arrays;

@Configuration
@EnableOAuth2Client
public class OAuth2Config {

    @Autowired
    private RBILetterContext context;

    @Bean
    public OAuth2ProtectedResourceDetails resourceDetails() {
        ClientCredentialsResourceDetails resourceDetails = new ClientCredentialsResourceDetails();
        resourceDetails.setAccessTokenUri(context.getAccessTokenUri());
        resourceDetails.setClientId(context.getClientId());
        resourceDetails.setClientSecret(context.getClientSecret());
        resourceDetails.setGrantType("client_credentials");
        resourceDetails.setScope(Arrays.asList(context.getScope()));
        return resourceDetails;
    }

    @Bean
    public OAuth2RestTemplate oauth2RestTemplate(OAuth2ProtectedResourceDetails resourceDetails) {
        OAuth2RestTemplate template = new OAuth2RestTemplate(resourceDetails, new DefaultOAuth2ClientContext());
        AccessTokenProvider accessTokenProvider = new AccessTokenProviderChain(
                Arrays.<AccessTokenProvider>asList(new ClientCredentialsAccessTokenProvider()));
        template.setAccessTokenProvider(accessTokenProvider);
        // Set request factory to enable request/response logging (if needed)
        template.setRequestFactory(
                new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory()));

        return template;
    }
}

 */

//////////////////////

package com.practice.Code.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.security.oauth2.client.*;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import org.springframework.security.oauth2.core.AuthorizationGrantType;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Configuration
public class OAuth2Config {

    @Autowired
    private RBILetterContext context;

    @Bean
    public ClientRegistrationRepository clientRegistrationRepository() {
        ClientRegistration registration = ClientRegistration
                .withRegistrationId("rbi-client")
                .tokenUri(context.getAccessTokenUri())
                .clientId(context.getClientId())
                .clientSecret(context.getClientSecret())
                .authorizationGrantType(AuthorizationGrantType.CLIENT_CREDENTIALS)
                .scope(context.getScope())
                .build();

        return new InMemoryClientRegistrationRepository(registration);
    }

    @Bean
    public OAuth2AuthorizedClientManager authorizedClientManager(
            ClientRegistrationRepository repo) {

        OAuth2AuthorizedClientProvider provider = OAuth2AuthorizedClientProviderBuilder.builder()
                .clientCredentials()
                .build();

        // ✅ Use AuthorizedClientServiceOAuth2AuthorizedClientManager
        AuthorizedClientServiceOAuth2AuthorizedClientManager manager =
                new AuthorizedClientServiceOAuth2AuthorizedClientManager(
                        repo,
                        new InMemoryOAuth2AuthorizedClientService(repo));

        manager.setAuthorizedClientProvider(provider);
        return manager;
    }


    @Bean
    public RestTemplate oauth2RestTemplate(OAuth2AuthorizedClientManager manager) {
        RestTemplate restTemplate = new RestTemplate(
                new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory()));

        // Add interceptor to inject Bearer token
        ClientHttpRequestInterceptor oauth2Interceptor = (request, body, execution) -> {
            OAuth2AuthorizeRequest authorizeRequest = OAuth2AuthorizeRequest
                    .withClientRegistrationId("rbi-client")
                    .principal("rbi-client-user")  // Dummy user, needed by manager
                    .build();

            OAuth2AuthorizedClient client = manager.authorize(authorizeRequest);
            if (client == null || client.getAccessToken() == null) {
                throw new IllegalStateException("Unable to fetch access token.");
            }

            String token = client.getAccessToken().getTokenValue();
            request.getHeaders().setBearerAuth(token);
            return execution.execute(request, body);
        };

        restTemplate.setInterceptors(List.of(oauth2Interceptor));

        return restTemplate;
    }
}



