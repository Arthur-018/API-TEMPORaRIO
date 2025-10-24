package com.valorant.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.LocalDate;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Season {
    public String uuid;
    public String displayName;
    public LocalDate startTime;
    public LocalDate endTime;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class SeasonResponse {
        public List<Season> listaSeason;
    }
}
