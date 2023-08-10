package com.example.workdaycalculator.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class RequestDTO {

    private String isoCode;

    private LocalDate startDate;

    private int offset;
}
