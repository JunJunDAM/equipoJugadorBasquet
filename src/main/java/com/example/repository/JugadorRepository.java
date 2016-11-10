package com.example.repository;

import java.time.LocalDate;
import java.util.List;
import com.example.domain.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by usu22 on 02/11/2016.
 */
public interface JugadorRepository extends JpaRepository<Jugador, Long>{
    List<Jugador> findByNombreJugadorContains(String nombre);
    List<Jugador> findByCanastasGreaterThanEqual(Integer canastas);
    List<Jugador> findByAsistenciasBetween(Integer min, Integer max);
    List<Jugador> findByPosicionContains(String posicion);
    List<Jugador> findByFechaNacimientoLessThan(LocalDate fecha);
    @Query("SELECT jugador.posicion, AVG(jugador.canastas), AVG(jugador.rebotes), AVG(jugador.asistencias) FROM Jugador jugador GROUP BY jugador.posicion")
    List<Object[]> mediaJugadoresPorPosicion();

    @Query("SELECT jugador.posicion, AVG(jugador.canastas), MAX(jugador.canastas), MIN(jugador.canastas), AVG(jugador.asistencias), MAX(jugador.asistencias), MIN(jugador.asistencias), AVG(jugador.rebotes), MAX(jugador.rebotes), MIN(jugador.rebotes) " +
            "FROM Jugador jugador GROUP BY jugador.posicion")
    List<Object[]> maxMinJugadoresPorPosicion();
    List<Jugador> findByEquipoNombre(String nombreEquipo);
    List<Jugador> findByEquipoNombreAndPosicion(String nombreEquipo, String posicion);
}
