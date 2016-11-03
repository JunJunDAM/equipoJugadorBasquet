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
    private String id_Equipo;
    private String nombre_Equipo;
    private String localidad;
    private LocalDate fechaCreacion;

    public EquipoService(String id_Equipo, String nombre_Equipo, String localidad, LocalDate fechaCreacion) {
        this.id_Equipo = id_Equipo;
        this.nombre_Equipo = nombre_Equipo;
        this.localidad = localidad;
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "id_Equipo='" + id_Equipo + '\'' +
                ", nombre_Equipo='" + nombre_Equipo + '\'' +
                ", localidad='" + localidad + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Equipo equipo = (Equipo) o;

        if (id_Equipo != null ? !id_Equipo.equals(equipo.id_Equipo) : equipo.id_Equipo != null) return false;
        if (nombre_Equipo != null ? !nombre_Equipo.equals(equipo.nombre_Equipo) : equipo.nombre_Equipo != null)
            return false;
        if (localidad != null ? !localidad.equals(equipo.localidad) : equipo.localidad != null) return false;
        return fechaCreacion != null ? fechaCreacion.equals(equipo.fechaCreacion) : equipo.fechaCreacion == null;
    }

    @Override
    public int hashCode() {
        int result = id_Equipo != null ? id_Equipo.hashCode() : 0;
        result = 31 * result + (nombre_Equipo != null ? nombre_Equipo.hashCode() : 0);
        result = 31 * result + (localidad != null ? localidad.hashCode() : 0);
        result = 31 * result + (fechaCreacion != null ? fechaCreacion.hashCode() : 0);
        return result;
    }

    public String getId_Equipo() {
        return id_Equipo;
    }

    public void setId_Equipo(String id_Equipo) {
        this.id_Equipo = id_Equipo;
    }

    public String getNombre_Equipo() {
        return nombre_Equipo;
    }

    public void setNombre_Equipo(String nombre_Equipo) {
        this.nombre_Equipo = nombre_Equipo;
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
