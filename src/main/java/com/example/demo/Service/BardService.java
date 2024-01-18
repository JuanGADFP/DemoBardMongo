package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class BardService {

    @Autowired
    private RestTemplate restTemplate;

    public String generate(String message) {
        String url = "https://bard.ai/v1/generate";
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer fQj3mJXbfSMkt7ZIqkpklYkB-vrcvuSRrTKXnLYbx1fjHMv_RqaDdkItpzOKAbX1z1PkZA.");
        HttpEntity<String> request = new HttpEntity<>(message, headers);

        ResponseEntity<Map> response = restTemplate.postForEntity(url, request, Map.class);

        return (String) response.getBody().get("response");
    }
}