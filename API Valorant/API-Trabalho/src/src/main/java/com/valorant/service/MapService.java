package com.valorant.service;
import com.valorant.model.MapModel;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Collections;

@Service
public class MapService {
    private final ApiClient apiClient;
    public MapService(ApiClient apiClient) { this.apiClient = apiClient; }

    public List<MapModel> getMaps() throws Exception {
        MapModel.MapResponse resp = apiClient.get("/maps", MapModel.MapResponse.class);
        if (resp == null || resp.data == null) return Collections.emptyList();
        return resp.data;
    }
}
