package com.example.demo.Domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Game {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private Date data;
    private String team1;
    private String team2;
    private int scorTeam1;
    private int scorTeam2;
    private String turneu;
    private String tara;

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", data=" + data +
                ", team1='" + team1 + '\'' +
                ", team2='" + team2 + '\'' +
                ", scorTeam1=" + scorTeam1 +
                ", scorteam2=" + scorTeam2 +
                ", turneu='" + turneu + '\'' +
                ", tara='" + tara + '\'' +
                '}';
    }
}
