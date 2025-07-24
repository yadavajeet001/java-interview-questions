package com.example.java.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeasonService {

    @Autowired
    private SeasonRepo seasonRepo;

    public Season createSeason(SeasonRequest seasonRequest) throws Exception {
        if(seasonRequest.getStartDate().isAfter(seasonRequest.getEndDate())){
           throw new Exception("Start date must be before end date");
        }
        List<Season> list = seasonRepo.findOverLapSeason(seasonRequest.getStartDate(), seasonRequest.getEndDate());
        if(!list.isEmpty()){
            throw new Exception("Season start date and end date overlapped");
        }
        Season season = new Season();
        season.setName(seasonRequest.getName());
        season.setStartDate(seasonRequest.getStartDate());
        season.setEndDate(seasonRequest.getEndDate());

        return seasonRepo.save(season);
    }
}
