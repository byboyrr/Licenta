package com.example.demo.Controller;

import com.example.demo.Domain.CotaGame;


import com.example.demo.Repository.CotaGameRepository;

import com.example.demo.Service.CotaGameService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/cotagame")
public class CotaGameController {

    private final CotaGameRepository cgameRepository;
    private final CotaGameService cgameService;

    @Autowired
    public CotaGameController(CotaGameRepository cgameRepository, CotaGameService cgameService) {
        this.cgameRepository = cgameRepository;
        this.cgameService = cgameService;
    }


    @GetMapping("/all")
    public List<CotaGame> getAllGames() {
        return cgameRepository.findAll();
    }

    @GetMapping("/get/{id}")
    public CotaGame getGame(@PathVariable("id") int id) {
        return cgameService.getCotaGame(id);
    }


    @PostMapping("/save-game")
    public CotaGame saveCotaGame(@RequestBody CotaGame cgame) {
        System.out.println(cgame);
        return cgameService.saveCotaGame(cgame);
    }
}