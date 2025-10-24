package com.valorant.service;
import com.valorant.model.GameMode;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Collections;

@Service
public class GameModeService {
    private final ApiClient apiClient;
    public GameModeService(ApiClient apiClient) { this.apiClient = apiClient; }

    public List<GameMode> getGameModes() throws Exception {
        GameMode.GameModeResponse resp = apiClient.get("/gamemodes", GameMode.GameModeResponse.class);
        if (resp == null || resp.data == null) return Collections.emptyList();
        return resp.data;
    }
}
