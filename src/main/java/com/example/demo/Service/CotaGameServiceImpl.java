package com.example.demo.Service;

import com.example.demo.Domain.CotaGame;
import com.example.demo.Repository.CotaGameRepository;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CotaGameServiceImpl implements CotaGameService{

    private final CotaGameRepository cgameRepository;
    @Autowired
    public CotaGameServiceImpl(final CotaGameRepository cgameRepository) {
        this.cgameRepository = cgameRepository;
    }

    @Override
    public void removeCotaGame (int id) {
        try{
            CotaGame p=cgameRepository.findOneById(id);
            cgameRepository.delete(p);
        }catch (Exception e){

        }
    }

    @Override
    public CotaGame saveCotaGame(CotaGame cgame) {
        return cgameRepository.save(cgame);
    }

    @Override
    public CotaGame getCotaGame(int id) {
        return cgameRepository.findOneById(id);
    }
}
