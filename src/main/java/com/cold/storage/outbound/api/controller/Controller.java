package com.cold.storage.outbound.api.controller;

import com.cold.storage.outbound.api.model.Amad;
import com.cold.storage.outbound.api.repository.AmadRepoImpl;
import com.cold.storage.outbound.api.service.AmadService;
import io.swagger.v3.oas.annotations.headers.Header;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/org/csoutbound")
public class Controller {
    @Autowired
    private AmadService amadService;

    @GetMapping(value = "/amads")
    public List<Amad> getAmads() {
        return amadService.getAmads();
    }

    @GetMapping(value = "/amads/amadNo")
    @ResponseBody
    public List<Amad> getAmadByNumber(@RequestParam int amadNo) {
        return amadService.getAmadByNumber(amadNo);
    }

    @PostMapping(value="/amads")
    public  List<Amad> postAmads(@RequestBody Amad amad ){
        return amadService.postAmad(amad);
    }
}


