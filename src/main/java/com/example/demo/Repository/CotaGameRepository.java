package com.example.demo.Repository;

import com.example.demo.Domain.CotaGame;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CotaGameRepository extends JpaRepository<CotaGame, Long> {
    CotaGame findOneById(int id);
}