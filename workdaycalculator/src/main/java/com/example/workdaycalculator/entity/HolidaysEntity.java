package com.example.workdaycalculator.entity;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class HolidaysEntity {

    private String isoCode;

    private LocalDate holiday;

}
