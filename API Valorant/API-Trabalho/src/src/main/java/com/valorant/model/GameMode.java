package com.valorant.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GameMode {
    public String uuid;
    public String displayName;
    public String description;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class GameModeResponse {
        public List<GameMode> lista;
    }
}
