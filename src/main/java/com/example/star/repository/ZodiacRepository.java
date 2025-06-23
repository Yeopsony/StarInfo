package com.example.star.repository;

import com.example.star.dto.ZodiacDTO;
import com.example.star.entity.Zodiac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ZodiacRepository extends JpaRepository<Zodiac, Integer> {
    @Query("SELECT z FROM Zodiac z " +
            "WHERE (z.startdate <= :mmdd AND z.enddate >= :mmdd) " +
            "OR (z.startdate > z.enddate AND (:mmdd >= z.startdate OR :mmdd <= z.enddate))")
    Zodiac findByBirth(@Param("mmdd") String mmdd);

}
