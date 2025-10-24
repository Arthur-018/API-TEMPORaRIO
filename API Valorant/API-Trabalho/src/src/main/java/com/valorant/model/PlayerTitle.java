package com.valorant.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerTitle {
    public String uuid;
    public String displayName;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class TitleResponse {
        public List<PlayerTitle> listaPlayerTitle;
    }
}
