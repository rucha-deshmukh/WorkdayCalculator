package com.example.workdaycalculator.controller;

import com.example.workdaycalculator.dto.RequestDTO;
import com.example.workdaycalculator.service.HolidayService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class HolidaysController {

    private final HolidayService service;

    @GetMapping("/getDate")
    public ResponseEntity<LocalDate> getOffsetDate(RequestDTO dto){
        return ResponseEntity.ok(service.getDate(dto.getIsoCode(),dto.getOffset(),dto.getStartDate()));
    }
}
