package com.practice.Code.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.Charset;


public class RequestResponseLoggingInterceptor implements ClientHttpRequestInterceptor {
    private static final Logger log =  LogManager.getLogger(RequestResponseLoggingInterceptor.class);



    private void logRequest(HttpRequest request, byte[] body) throws IOException {
        if (log.isDebugEnabled()) {
            log.debug("===== Request Begin =====");
            log.debug("URI         : {}", request.getURI());
            log.debug("Method      : {}", request.getMethod());
            log.debug("Headers     : {}", request.getHeaders());
            log.debug("Request Body: {}", new String(body, "UTF-8"));
            log.debug("===== Request End   =====");
        }
    }

    private void logResponse(ClientHttpResponse response) throws IOException {
        if (log.isDebugEnabled()) {
            log.debug("===== Response Begin =====");
            log.debug("Status Code : {}", response.getStatusCode());
            log.debug("Status Text : {}", response.getStatusText());
            log.debug("Headers     : {}", response.getHeaders());
            log.debug("Body        : {}", StreamUtils.copyToString(response.getBody(), Charset.defaultCharset()));
            log.debug("===== Response End   =====");
        }
    }

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {

        logRequest(request, body);
        ClientHttpResponse response = execution.execute(request, body);
        logResponse(response);
        return response;
    }
}
