package com.aydakar.plus30backend.controller;

import com.aydakar.plus30backend.service.SummonerService;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/summoner")
public class SummonerController {
    private final SummonerService summonerService;

    public SummonerController(SummonerService summonerService){
        this.summonerService = summonerService;
    }

    @GetMapping("/")
    public JsonNode currentSummoner() {
        return summonerService.currentSummoner();
    }

    @PutMapping("icon")
    public JsonNode changeIcon(@RequestBody JsonNode data){
        return summonerService.changeIcon(data);
    }

}
