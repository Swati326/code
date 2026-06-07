package com.practice.Code.config;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class RBILetterContext {


    public String getAccessTokenUri() {
        return "http://localhost:8080/oauth/token"; // your actual URI
    }

    public String getClientId() {
        return "test-client";
    }

    public String getClientSecret() {
        return "test-secret";
    }

    public List<String> getScope() {
        return Arrays.asList("read", "write");  // ✅ Correct way
    }

}
