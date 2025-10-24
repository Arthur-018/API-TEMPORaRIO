package com.valorant.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MapModel {
    public String uuid;
    public String displayName;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class MapResponse {
        public List<MapModel> data;
    }
}
