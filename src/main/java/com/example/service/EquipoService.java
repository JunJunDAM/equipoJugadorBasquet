package com.example.service;


import com.example.domain.Equipo;
import com.example.repository.EquipoRepository;
import com.example.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import sun.plugin2.message.ShowStatusMessage;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by usu22 on 02/11/2016.
 */
@Service
public class EquipoService {
    @Autowired private JugadorRepository jugadorR;
    @Autowired private EquipoRepository equipoR;
    public void equipos() {
        Equipo e1 = new Equipo("GoldenStateWarriors", "Oakland", LocalDate.of(1946, 1, 1));
        Equipo e2 = new Equipo("LosAngelesLakers", "LosAngeles", LocalDate.of(1946, 1, 1));
        Equipo e3 = new Equipo("ChicagoBulls", "Chicago", LocalDate.of(1966, 1, 1));
        Equipo e4 = new Equipo("OklahomaCityThunder", "OklahomaCity", LocalDate.of(1967, 1, 1));
        Equipo e5 = new Equipo("ClevelandCavaliers", "Cleverland", LocalDate.of(1967, 1, 1));

        equipoR.save(e1);
        equipoR.save(e2);
        equipoR.save(e3);
        equipoR.save(e4);
        equipoR.save(e5);

        System.out.print("Equipos de una localidad determinada [Oakland]: ");
        System.out.println(equipoR.findByLocalidadContains("Oakland"));
        System.out.print("Buscar jugadores de un equipo determinado [GoldenStateWarriors]: ");
        System.out.println(jugadorR.findByEquipoNombre("GoldenStateWarriors"));
        System.out.print("Buscar jugadores de un equipo y una posicion determinada [GoldenStateWarriors][Base]: ");
        System.out.println(jugadorR.findByEquipoNombreAndPosicion("GoldenStateWarriors", "Base"));
        System.out.print("Buscar jugador con mas canastas de un equipo [OklahomaCity]: ");
        System.out.println(equipoR.canastasJugadorEquipo("OklahomaCity", new PageRequest(0, 1)));
    }

}
