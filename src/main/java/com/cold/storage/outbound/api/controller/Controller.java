package com.cold.storage.outbound.api.controller;

import com.cold.storage.outbound.api.model.Amad;
import com.cold.storage.outbound.api.model.ColdInfo;
import com.cold.storage.outbound.api.repository.ColdInfoRepoImpl;
import com.cold.storage.outbound.api.service.AmadService;
import com.cold.storage.outbound.api.service.ColdInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/org/csoutbound")
public class Controller {
    @Autowired
    private AmadService amadService;

    @Autowired
    ColdInfoService coldInfoService;

    @GetMapping(value = "/amads")
    public List<Amad> getAmads() {
        return amadService.getAmads();
    }

    @GetMapping(value = "/amads/amadNo")
    public List<Amad> getAmadByNumber(@RequestParam int amadNo) {
        return amadService.getAmadByNumber(amadNo);
    }

    @PostMapping(value="/amads")
    public  List<Amad> postAmads(@RequestBody Amad amad ){
        return amadService.postAmad(amad);
    }

    @GetMapping(value = "/coldIndfo")
    public List<ColdInfo> getColdInfo(){
        return coldInfoService.getColdInfo();}

    @GetMapping(value = "/coldInfo/{submitterId}")
    public List<String>  getColdName(@RequestParam String submitterId){
    return coldInfoService.getColdName(submitterId);
    }
}


