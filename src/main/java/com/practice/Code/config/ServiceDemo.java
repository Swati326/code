package com.practice.Code.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Collections;

@Service
public class ServiceDemo {

    private final RestTemplate oauth2RestTemplate;

    // 💡 Constructor-based injection is बेहतर (null-safe & test-friendly)
    @Autowired
    public ServiceDemo(RestTemplate oauth2RestTemplate) {
        this.oauth2RestTemplate = oauth2RestTemplate;
        addLoggingInterceptor(this.oauth2RestTemplate);   // interceptor एक-ही बार set कर दिया
    }

    /**  🔹 सिर्फ़ LOGGING interceptor जोड़ता है  */
    private static void addLoggingInterceptor(RestTemplate template) {
        template.setInterceptors(
                Collections.singletonList(new RequestResponseLoggingInterceptor())
        );
    }

    /**  🔹 Actual API call — वही structure जो पहले था */
    public String callApi(String url, HttpHeaders headers, Object body) {

        HttpEntity<Object> entity = new HttpEntity<>(body, headers);

        ResponseEntity<String> response = oauth2RestTemplate.exchange(
                url,
                HttpMethod.POST,
                entity,
                String.class
        );

        return response.getBody();
    }
}
