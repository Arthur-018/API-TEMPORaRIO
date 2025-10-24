package com.valorant.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;



@JsonIgnoreProperties(ignoreUnknown = true)
public class Weapon {
    public String uuid;
    public String displayName;
    public String category;
    public String displayIcon;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class WeaponResponse {
        public List<Weapon> data;
    }
}
