package com.valorant.service;
import com.valorant.model.Season;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Collections;

@Service
public class SeasonService {
    private final ApiClient apiClient;
    public SeasonService(ApiClient apiClient) { this.apiClient = apiClient; }

    public List<Season> getSeasons() throws Exception {
        Season.SeasonResponse resp = apiClient.get("/seasons", Season.SeasonResponse.class);
        if (resp == null || resp.lista == null) return Collections.emptyList();
        return resp.lista;
    }
}
