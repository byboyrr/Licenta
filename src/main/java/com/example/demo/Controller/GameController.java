package com.example.demo.Controller;

import com.example.demo.Domain.Game;

import com.example.demo.Domain.User;
import com.example.demo.Repository.GameRepository;

import com.example.demo.Service.GameService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/api/game")
public class GameController {

    private final GameRepository gameRepository;
    private final GameService gameService;

    @Autowired
    public GameController(GameRepository gameRepository, GameService gameService) {
        this.gameRepository = gameRepository;
        this.gameService = gameService;
    }


    @GetMapping("/all")
    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }

    @GetMapping("/get/{id}")
    public Game getGame(@PathVariable("id") int id) {
        return gameService.getGame(id);
    }


    @PostMapping("/save-game")
    public Game saveGame(@RequestBody Game game) {
        System.out.println(game);
        return gameService.saveGame(game);
    }

    @PostMapping("/inoatachelutu")
    public void preluareDate(){
        String line = "";
        String splitBy = ",";
        try
        {
//parsing a CSV file into BufferedReader class constructor
            int nr =0;
            BufferedReader br = new BufferedReader(new FileReader("rezultate2000.csv"));
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                String[] meci= line.split(splitBy);    // use comma as separator

                //System.out.println("Employee [First Name=" + employee[0] + ", Last Name=" + employee[1] + ", Designation=" + employee[2] + ", Contact=" + employee[3] + ", Salary= " + employee[4] + ", City= " + employee[5] +"]");
                if(nr!=0){
                    Game m=new Game(Integer.parseInt(meci[0]), Date.valueOf(meci[1]),meci[2],meci[3],Integer.parseInt(meci[4]),Integer.parseInt(meci[5]),meci[6],meci[8]);
                    gameService.saveGame(m);
                }
                nr++;

            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }




}