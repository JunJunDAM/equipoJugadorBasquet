package com.example.repository;

import com.example.domain.Equipo;
import com.example.domain.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by usu22 on 02/11/2016.
 */
public interface EquipoRepository extends JpaRepository<Equipo, Long> {
    List<Equipo> findByLocalidadContains (String ciudad);
    @Query("SELECT equipo.localidad FROM Equipo equipo WHERE equipo.localidad = Chicago");
    List<Object[]> equiposPorLocalidad;
    @Query("SELECT jugador.nombre FROM Jugador jugador WHERE equipo.nombre = GoldenStateWarriors");
    List<Object[]> jugadoresPorEquipo;
    @Query("SELECT jugador.nombre FROM Jugador jugador WHERE jugador.posicion = alero");
    List<Object[]>jugadoresPorPosicion;

}
