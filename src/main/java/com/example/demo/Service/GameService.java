package com.example.demo.Service;

import com.example.demo.Domain.Game;

import java.util.List;


public interface GameService {
    Game saveGame(Game game);
    Game getGame(int id);
    List<Game> findAll();
}
