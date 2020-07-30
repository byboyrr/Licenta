package com.example.demo.Repository;

import com.example.demo.Domain.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
    Game findOneById(int id);
}
