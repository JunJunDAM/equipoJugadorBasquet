package com.example.repository;

import java.time.LocalDate;
import java.util.List;
import com.example.domain.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by usu22 on 02/11/2016.
 */
public interface JugadorRepository extends JpaRepository<Jugador, Long>{
    List<Jugador> findByNombre_JugadorContains(String nombre);
    List<Jugador> findByCanastas(Integer canastas);
    List<Jugador> findByAsistencias(Integer asistencias);
    List<Jugador> findByPosicionContains(String posicion);
    List<Jugador> findByFechaNacimientoLessThan(LocalDate fecha);

}
