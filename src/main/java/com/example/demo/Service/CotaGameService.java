package com.example.demo.Service;

import com.example.demo.Domain.CotaGame;

public interface CotaGameService {
    CotaGame saveCotaGame(CotaGame game);
    void removeCotaGame(int id);
    CotaGame getCotaGame(int id);
}
