package com.example.repository;

import java.time.LocalDate;
import java.util.List;
import com.example.domain.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by usu22 on 02/11/2016.
 */
public interface JugadorRepository extends JpaRepository<Jugador, Long>{
    List<Jugador> findByNombreJugadorContains(String nombre);
    List<Jugador> findByCanastasGreaterThanEqual(Integer canastas);
    List<Jugador> findByAsistenciasBetween(Integer min, Integer max);
    List<Jugador> findByPosicionContains(String posicion);
    List<Jugador> findByFechaNacimientoLessThan(LocalDate fecha);

}
