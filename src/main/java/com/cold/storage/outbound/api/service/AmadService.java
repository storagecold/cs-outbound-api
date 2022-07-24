package com.cold.storage.outbound.api.service;

import com.cold.storage.outbound.api.model.Amad;
import com.cold.storage.outbound.api.repository.AmadRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AmadService {
    @Autowired
    private AmadRepoImpl amadRepo;

    public List<Amad> getAmads() {
        return amadRepo.getAmads();
    }

    public List<Amad> getAmadByNumber(int amadNo) {
        return amadRepo.getAmadByNumber(amadNo);
    }
   public List <Amad> getAmadByPartyName(String accountName){
        return amadRepo.getAmadByPartyName(accountName);
   }
   public List<Amad> postAmad(Amad amad){
        return amadRepo.postAmad(amad);
   }

}
