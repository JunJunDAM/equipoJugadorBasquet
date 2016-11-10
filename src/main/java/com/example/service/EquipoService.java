package com.example.service;


import com.example.domain.Equipo;
import com.example.repository.EquipoRepository;
import com.example.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

/**
 * Created by usu22 on 02/11/2016.
 */
@Service
public class EquipoService {
    @Autowired private JugadorRepository jugadorR;
    @Autowired private EquipoRepository equipoR;
    public void equipos(){
        Equipo e1 = new Equipo("1", "GoldenStateWarriors", "Oakland", LocalDate.of(1946, 1, 1));
        Equipo e2 = new Equipo("2", "LosAngelesLakers", "LosAngeles", LocalDate.of(1946, 1, 1));
        Equipo e3 = new Equipo("3", "ChicagoBulls", "Chicago", LocalDate.of(1966, 1, 1));
        Equipo e4 = new Equipo("4", "OklahomaCityThunder", "OklahomaCity", LocalDate.of(1967, 1, 1));
        Equipo e5 = new Equipo("5", "ClevelandCavaliers", "Cleverland", LocalDate.of(1967, 1, 1));
        equipoR.save(e1);
        equipoR.save(e2);
        equipoR.save(e3);
        equipoR.save(e4);
        equipoR.save(e5);

        System.out.print("Equipos de una localidad determinada []: ");
        System.out.println(equipoR.findByLocalidadContains(""));
        System.out.print("Buscar jugadores de un equipo determinado []: ");
        System.out.println();
        System.out.print("Buscar jugadores de una posicion determinada []: ");
        System.out.println();
        System.out.print("Buscar jugador con mas canastas []: ");
        System.out.println();
    }
}
