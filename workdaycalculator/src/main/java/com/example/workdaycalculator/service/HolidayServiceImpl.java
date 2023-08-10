package com.example.workdaycalculator.service;

import com.example.workdaycalculator.repository.HolidayRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class HolidayServiceImpl implements HolidayService {

    private final HolidayRepository repository;
    @Override
    public LocalDate getDate(String isoCode, int offSet, LocalDate startDate) {
        repository.findByIsoCode(isoCode);
        return null;
    }
}
