package com.practice.Code.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

        @Autowired
        private RestTemplate oauth2RestTemplate;

        @Autowired
        ServiceDemo serviceDemo;

        @GetMapping("/test-call")
        public String makeTestApiCall() {
            // Headers
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.TEXT_PLAIN); // or application/json
            String apiUrl = "https://httpbin.org/anything";
            String requestBody = "Hello RBI";
           String result=  serviceDemo.callApi(apiUrl,headers,requestBody);
            // Free test endpoint

            // Request body (can be null for GET)




            return "API Response:\n" + result;
        }


}
