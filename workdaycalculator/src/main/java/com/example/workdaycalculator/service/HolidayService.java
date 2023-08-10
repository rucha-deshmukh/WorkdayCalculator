package com.example.workdaycalculator.service;

import java.time.LocalDate;

public interface HolidayService {

    LocalDate getDate(String isoCode, int offSet,LocalDate startDate);
}
