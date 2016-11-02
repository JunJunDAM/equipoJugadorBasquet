package com.example.service;

import com.example.domain.Equipo;
import com.example.domain.Jugador;
import com.example.repository.EquipoRepository;
import com.example.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

/**
 * Created by usu22 on 02/11/2016.
 */
@Service
public class JugadorService {
    @Autowired private JugadorRepository jugadorR;
    @Autowired private EquipoRepository equipoR;
    public void jugadores(){
        Jugador j1 = new Jugador("30", "StephenCurry", LocalDate.of(1988, 3, 14), 22, 7, 4, "base");
        Jugador j2 = new Jugador("13", "JamesHarden", LocalDate.of(1989, 9, 26), 25, 6, 5, "escolta");
        Jugador j3 = new Jugador("35", "KevinDurant", LocalDate.of(1988, 9, 29), 27, 3, 7, "alero");
        Jugador j4 = new Jugador("32", "BlakeGriffin", LocalDate.of(1989, 3, 16), 24, 4, 10, "alaPivot");
        Jugador j5 = new Jugador("15", "DeMarcusCousins", LocalDate.of(1990, 8, 13), 23, 0, 12, "pivot");
        jugadorR.save(j1);
        jugadorR.save(j2);
        jugadorR.save(j3);
        jugadorR.save(j4);
        jugadorR.save(j5);
    }

}
