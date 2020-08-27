package com.example.demo.Service;

import com.example.demo.Domain.Game;
import com.example.demo.Repository.GameRepository;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GameServiceImpl implements GameService{

    private final GameRepository gameRepository;
    @Autowired
    public GameServiceImpl(final GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }



    @Override
    public Game saveGame(Game game) {
        return gameRepository.save(game);
    }

    @Override
    public Game getGame(int id) {
        return gameRepository.findOneById(id);
    }

    @Override
    public List<Game> findAll() {
        return gameRepository.findAll();
    }
}
