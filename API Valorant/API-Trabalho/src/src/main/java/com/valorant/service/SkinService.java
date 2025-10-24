package com.valorant.service;
import com.valorant.model.Skin;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Collections;

@Service
public class SkinService {
    private final ApiClient apiClient;
    public SkinService(ApiClient apiClient) { this.apiClient = apiClient; }

    public List<Skin> getSkins() throws Exception {
        Skin.SkinResponse resp = apiClient.get("/weapons/skins", Skin.SkinResponse.class);
        if (resp == null || resp.lista == null) return Collections.emptyList();
        return resp.lista;
    }
}
