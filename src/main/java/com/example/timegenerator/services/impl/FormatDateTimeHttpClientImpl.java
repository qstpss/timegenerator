package com.example.timegenerator.services.impl;

import com.example.timegenerator.services.FormatDateTimeHttpClient;
import com.example.timegenerator.services.model.DateTimeDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class FormatDateTimeHttpClientImpl implements FormatDateTimeHttpClient {

    private final RestTemplate restTemplate;
    private final String formatServiceUrl;

    public FormatDateTimeHttpClientImpl(RestTemplate restTemplate, @Value("${format-date-time.service.base.url}") String formatServiceUrl) {
        this.restTemplate = restTemplate;
        this.formatServiceUrl = formatServiceUrl;
    }

    @Override
    public void sendDateTime(DateTimeDto dto) {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(formatServiceUrl);
        uriBuilder.path("/format/sendDateTime");
        restTemplate.postForEntity(uriBuilder.build().toUri(), dto, Void.class);
    }
}
