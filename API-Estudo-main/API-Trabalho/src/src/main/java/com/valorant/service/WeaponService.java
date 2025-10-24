package com.valorant.service;
import com.valorant.model.Weapon;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Collections;

@Service
public class WeaponService {
    private final ApiClient apiClient;
    public WeaponService(ApiClient apiClient) { this.apiClient = apiClient; }

    public List<Weapon> getWeapons() throws Exception {
        Weapon.WeaponResponse resp = apiClient.get("/weapons", Weapon.WeaponResponse.class);
        if (resp == null || resp.data == null) return Collections.emptyList();
        return resp.data;
    }
}
