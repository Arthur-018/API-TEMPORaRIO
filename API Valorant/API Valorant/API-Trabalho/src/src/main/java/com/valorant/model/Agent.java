package com.valorant.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Agent {
    public String uuid;
    public String displayName;
    public Role role;
    public String description;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Role {
        public String uuid;
        public String displayName;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AgentResponse {
        public List<Agent> data;
    }
}
