package com.example.workdaycalculator.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class HolidaysEntity {

    @Id
    private Long id;
    private String isoCode;

    private LocalDate holiday;

}
