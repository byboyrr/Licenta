package com.example.demo.Controller;

import com.example.demo.Domain.CotaGame;


import com.example.demo.Repository.CotaGameRepository;

import com.example.demo.Service.CotaGameService;

import com.example.demo.Service.CotaGameServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/cotagame")
public class CotaGameController {


    private final CotaGameService cgameService;

    @Autowired
    public CotaGameController(CotaGameService cgameService) {

        this.cgameService = cgameService;
    }


    @GetMapping("/all")
    public List<CotaGame> getAllGames() {
        return cgameService.findAll();
    }

    @GetMapping("/get/{id}")
    public CotaGame getGame(@PathVariable("id") int id) {
        return cgameService.getCotaGame(id);
    }
//salut
    @DeleteMapping("/delete/{id}")
    public  void removeCotaGame(@PathVariable("id") int id){
        try{
            cgameService.removeCotaGame(id);
        }catch (Exception e){

        }
    }

    @PostMapping("/save-game")
    public CotaGame saveCotaGame(@RequestBody CotaGame cgame) {
        System.out.println(cgame);
        return cgameService.saveCotaGame(cgame);
    }
}