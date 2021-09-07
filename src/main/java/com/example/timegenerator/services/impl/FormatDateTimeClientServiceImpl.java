package com.example.timegenerator.services.impl;

import com.example.timegenerator.services.FormatDateTimeClientService;
import com.example.timegenerator.services.FormatDateTimeHttpClient;
import com.example.timegenerator.services.model.DateTimeDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;

@Service
@AllArgsConstructor
public class FormatDateTimeClientServiceImpl implements FormatDateTimeClientService {
    private final FormatDateTimeHttpClient httpClient;

    @Override
    public void sendDateTime() {
        httpClient.sendDateTime(new DateTimeDto(LocalDateTime.now().atZone(ZoneId.systemDefault())));
    }
}
