package com.cold.storage.outbound.api.repository;

import com.cold.storage.outbound.api.model.Amad;

import java.util.List;

public interface AmadRepo {
     List<Amad> getAmads();
    List<Amad> getAmadByNumber(int amadNo);
    List <Amad> getAmadByPartyName(String accountName);
    List<Amad> postAmad(Amad amad);
}

