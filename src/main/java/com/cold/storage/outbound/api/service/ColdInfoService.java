package com.cold.storage.outbound.api.service;

import com.cold.storage.outbound.api.model.ColdInfo;
import com.cold.storage.outbound.api.repository.ColdInfoRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColdInfoService {
    @Autowired
    private ColdInfoRepoImpl coldInfoRepo;

   public List<ColdInfo> getColdInfo(){
       return coldInfoRepo.getColdInfo();
   }
   public List<String> getColdName(String submitterId){
       return coldInfoRepo.getColdName(submitterId);
   }

   }
