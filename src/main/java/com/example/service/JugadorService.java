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
        Jugador j1 = new Jugador("30", "StephenCurry", LocalDate.of(1988, 3, 14), 22, 7, 4, "Base");
        Jugador j2 = new Jugador("13", "JamesHarden", LocalDate.of(1989, 9, 26), 25, 6, 5, "Escolta");
        Jugador j3 = new Jugador("35", "KevinDurant", LocalDate.of(1988, 9, 29), 27, 3, 7, "Alero");
        Jugador j4 = new Jugador("32", "BlakeGriffin", LocalDate.of(1989, 3, 16), 24, 4, 10, "AlaPivot");
        Jugador j5 = new Jugador("15", "DeMarcusCousins", LocalDate.of(1990, 8, 13), 23, 0, 12, "Pivot");

        Equipo Warriors = equipoR.findByNombre("GoldenStateWarriors");
        j1.setEquipo(Warriors);

        Equipo Lakers = equipoR.findByNombre("LosAngelesLakers");
        j2.setEquipo(Lakers);

        Equipo Bulls = equipoR.findByNombre("ChicagoBulls");
        j3.setEquipo(Bulls);

        Equipo Thunder = equipoR.findByNombre("OklahomaCityThunder");
        j4.setEquipo(Thunder);

        Equipo Cavaliers = equipoR.findByNombre("ClevelandCavaliers");
        j5.setEquipo(Cavaliers);

        jugadorR.save(j1);
        jugadorR.save(j2);
        jugadorR.save(j3);
        jugadorR.save(j4);
        jugadorR.save(j5);

        System.out.print("Buscar a StephenCurry: ");
        System.out.println(jugadorR.findByNombreJugadorContains("StephenCurry"));
        System.out.print("Buscar por canastas mayores que 15: ");
        System.out.println(jugadorR.findByCanastasGreaterThanEqual(15));
        int min = 3;
        int max = 100;
        System.out.print("Buscar por asistencias entre " + min + " y " + max + " :");
        System.out.println(jugadorR.findByAsistenciasBetween(min, max));
        System.out.print("Buscar por posicon [Alero]: ");
        System.out.println(jugadorR.findByPosicionContains("Alero"));
        System.out.println("Buscar por fecha nacimiento menor que [15/5/1989]");
        System.out.println(jugadorR.findByFechaNacimientoLessThan(LocalDate.of(1989,5,15)));
        System.out.println("Media de canastas, asistencias y rebotes de los jugadores");
        System.out.println(jugadorR.mediaJugadoresPorPosicion());
        System.out.println("Maximo, minimo de canastas, asistencias y rebores de los jugadores");
        System.out.println(jugadorR.maxMinJugadoresPorPosicion());
    }

}
