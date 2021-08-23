package com.example.timegenerator.services;

import com.example.timegenerator.services.model.DateTimeDto;

public interface FormatDateTimeHttpClient {
    void sendDateTime(DateTimeDto dto);
}
