package com.example.demotest.service;


import com.example.demotest.dto.LoginRequest;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LoggingService {

    private static final String LOG_API_URL = "http://20.244.56.144/evaluation-service/logs";

    public void log(String stack, String level, String logPackage, String message) {
        try {
            RestTemplate restTemplate = new RestTemplate();

            LoginRequest logRequest = new LoginRequest(stack, level, logPackage, message);

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);

            HttpEntity<LoginRequest> request = new HttpEntity<>(logRequest, headers);

            ResponseEntity<String> response =
                    restTemplate.postForEntity(LOG_API_URL, request, String.class);

            System.out.println("✅ Log sent: " + response.getBody());
        } catch (Exception e) {
            System.err.println("❌ Failed to send log: " + e.getMessage());
        }
    }
}
