package com.example.demo.Service;

import com.example.demo.Domain.Game;


public interface GameService {
    Game saveGame(Game game);
    Game getGame(int id);
}
