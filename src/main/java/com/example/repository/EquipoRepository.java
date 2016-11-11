package com.example.repository;

import com.example.domain.Equipo;
import com.example.domain.Jugador;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Objects;

/**
 * Created by usu22 on 02/11/2016.
 */
public interface EquipoRepository extends JpaRepository<Equipo, Long> {
    Equipo findByNombre(String nombre);
    List<Equipo> findByLocalidadContains (String ciudad);
    @Query("SELECT jugador.nombreJugador FROM Jugador jugador WHERE jugador.equipo.nombre = :nombreEquipo ORDER BY jugador.canastas desc")
    List<Jugador> canastasJugadorEquipo(@Param("nombreEquipo") String nombreEquipo, Pageable pageable);
}
