package com.valorant.service;
import com.valorant.model.PlayerTitle;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Collections;

@Service
public class PlayerTitleService {
    private final ApiClient apiClient;
    public PlayerTitleService(ApiClient apiClient) { this.apiClient = apiClient; }

    public List<PlayerTitle> getTitles() throws Exception {
        PlayerTitle.TitleResponse resp = apiClient.get("/playertitles", PlayerTitle.TitleResponse.class);
        if (resp == null || resp.data == null) return Collections.emptyList();
        return resp.data;
    }
}
