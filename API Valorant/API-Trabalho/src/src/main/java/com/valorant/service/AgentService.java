package com.valorant.service;
import com.valorant.model.Agent;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Collections;

@Service
public class AgentService {
    private final ApiClient apiClient;
    public AgentService(ApiClient apiClient) { this.apiClient = apiClient; }

    public List<Agent> getByRoleName(String role) throws Exception {
        Agent.AgentResponse resp = apiClient.get("/agents", Agent.AgentResponse.class);
        if (resp == null || resp.data == null) return Collections.emptyList();
        return resp.data.stream()
                .filter(a -> a.role != null && a.role.displayName != null && a.role.displayName.equalsIgnoreCase(role))
                .toList();
    }
}
