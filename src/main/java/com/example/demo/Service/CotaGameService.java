package com.example.demo.Service;

import com.example.demo.Domain.CotaGame;

import java.util.List;

public interface CotaGameService {
    CotaGame saveCotaGame(CotaGame game);
    void removeCotaGame(int id);
    CotaGame getCotaGame(int id);
    List<CotaGame> findAll();
}
