package com.example.workdaycalculator.repository;

import com.example.workdaycalculator.entity.HolidaysEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface HolidayRepository extends JpaRepository<HolidaysEntity, Long> {

    LocalDate findByIsoCode(String isoCode);
}
