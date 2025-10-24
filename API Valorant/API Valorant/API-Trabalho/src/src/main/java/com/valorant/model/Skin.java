package com.valorant.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;



@JsonIgnoreProperties(ignoreUnknown = true)
public class Skin {
    public String uuid;
    public String displayName;
    public String themeUuid;
    public String weaponUuid;
    public String displayIcon;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class SkinResponse {
        public List<Skin> data;
    }
}

