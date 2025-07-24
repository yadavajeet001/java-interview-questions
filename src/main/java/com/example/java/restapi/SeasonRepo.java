package com.example.java.restapi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface SeasonRepo extends JpaRepository<Season, Long> {

    @Query("select s FROM Season s where s.startDate < :endDate AND  s.endDate > : startDate")
    List<Season> findOverLapSeason(@Param( "startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);

    }
