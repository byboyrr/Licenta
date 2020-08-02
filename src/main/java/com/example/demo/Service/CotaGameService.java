package com.example.demo.Service;

import com.example.demo.Domain.CotaGame;

public interface CotaGameService {
    CotaGame saveCotaGame(CotaGame game);
    CotaGame getCotaGame(int id);
}
