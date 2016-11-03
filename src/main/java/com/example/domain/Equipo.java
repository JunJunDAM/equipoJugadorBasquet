package com.example.domain;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by usu22 on 02/11/2016.
 */
@Entity
public class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String idEquipo;
    private String nombreEquipo;
    private String localidad;
    private LocalDate fechaCreacion;

    public Equipo(String idEquipo, String nombreEquipo, String localidad, LocalDate fechaCreacion) {
        this.idEquipo = idEquipo;
        this.nombreEquipo = nombreEquipo;
        this.localidad = localidad;
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "idEquipo='" + idEquipo + '\'' +
                ", nombreEquipo='" + nombreEquipo + '\'' +
                ", localidad='" + localidad + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Equipo equipo = (Equipo) o;

        if (idEquipo != null ? !idEquipo.equals(equipo.idEquipo) : equipo.idEquipo != null) return false;
        if (nombreEquipo != null ? !nombreEquipo.equals(equipo.nombreEquipo) : equipo.nombreEquipo != null)
            return false;
        if (localidad != null ? !localidad.equals(equipo.localidad) : equipo.localidad != null) return false;
        return fechaCreacion != null ? fechaCreacion.equals(equipo.fechaCreacion) : equipo.fechaCreacion == null;
    }

    @Override
    public int hashCode() {
        int result = idEquipo != null ? idEquipo.hashCode() : 0;
        result = 31 * result + (nombreEquipo != null ? nombreEquipo.hashCode() : 0);
        result = 31 * result + (localidad != null ? localidad.hashCode() : 0);
        result = 31 * result + (fechaCreacion != null ? fechaCreacion.hashCode() : 0);
        return result;
    }

    public String getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(String idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
