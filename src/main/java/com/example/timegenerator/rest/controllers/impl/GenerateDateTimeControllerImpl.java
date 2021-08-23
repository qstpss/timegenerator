package com.example.timegenerator.rest.controllers.impl;

import com.example.timegenerator.rest.controllers.GenerateDateTimeController;
import com.example.timegenerator.services.FormatDateTimeClientService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/generate/time")
@AllArgsConstructor
public class GenerateDateTimeControllerImpl implements GenerateDateTimeController {

    private final FormatDateTimeClientService formatDateTimeClientService;

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void generateTime() {
        formatDateTimeClientService.sendDateTime();
    }
}
