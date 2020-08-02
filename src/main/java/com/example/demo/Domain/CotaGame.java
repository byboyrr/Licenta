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
public class CotaGame {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private Date data;
    private String team1;
    private String team2;
    private int cotaTeam1;
    private int cotaTeam2;
    private String turneu;
    private String tara;

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", data=" + data +
                ", team1='" + team1 + '\'' +
                ", team2='" + team2 + '\'' +
                ", cotaTeam1=" + cotaTeam1 +
                ", cotaTeam2=" + cotaTeam2 +
                ", turneu='" + turneu + '\'' +
                ", tara='" + tara + '\'' +
                '}';
    }
}
