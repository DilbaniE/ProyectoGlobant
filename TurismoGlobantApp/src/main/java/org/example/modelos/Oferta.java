package org.example.modelos;

import org.example.Validaciones.OfertaValidacion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Oferta {
    private Integer id;
    private String titulo;
    private String descripcion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Double costoPerson;
    private Integer idLocal;

    //para traer el formato
    //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    OfertaValidacion validacion = new OfertaValidacion();

    public Oferta() {
    }

    public Oferta(Integer id, String titulo, String descripcion, LocalDate fechaInicio, LocalDate fechaFin, Double costoPerson, Integer idLocal) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costoPerson = costoPerson;
        this.idLocal = idLocal;
    }

    @Override
    public String toString() {
        return "Oferta{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", costoPerson=" + costoPerson +
                ", idLocal=" + idLocal +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        try {
            this.validacion.validarTitulo(titulo);
            this.titulo = titulo;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        try {
            this.validacion.validarFechaInicio(fechaInicio);
            this.fechaInicio = LocalDate.parse(fechaInicio,formatter);
        }catch (Exception error){
            System.out.println(error.getMessage());
        }

    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        try {
            this.validacion.validarFechaFin(fechaFin);
            this.fechaFin = LocalDate.parse(fechaFin,formatter);
            this.validacion.validarDiferenciaFecha(this.fechaInicio, this.fechaFin);
            this.fechaFin = LocalDate.parse(fechaFin);
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public Double getCostoPerson() {

        return costoPerson;
    }

    public void setCostoPerson(Double costoPerson) {
        try {
            this.validacion.validarcostoPersona(costoPerson);
            this.costoPerson = costoPerson;
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public Integer getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(Integer idLocal) {
        this.idLocal = idLocal;
    }
}
