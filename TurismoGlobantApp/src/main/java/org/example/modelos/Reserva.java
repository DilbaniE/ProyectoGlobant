package org.example.modelos;

import org.example.Validaciones.ReservaValidacion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reserva {
    private Integer id;
    private String idUsuario;
    private Integer idOferta;
    private Double costoTotal;
    private LocalDate fechaReserva;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    ReservaValidacion validacion = new ReservaValidacion();
    public Reserva() {
    }

    public Reserva(Integer id, String idUsuario, Integer idOferta, Double costoTotal, LocalDate fechaReserva) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idOferta = idOferta;
        this.costoTotal = costoTotal;
        this.fechaReserva = fechaReserva;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", idUsuario=" + idUsuario +
                ", idOferta=" + idOferta +
                ", costoTotal=" + costoTotal +
                ", fechaReserva=" + fechaReserva +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        /*try {
            this.validacion.validarIduser(idUsuario);
            this.idUsuario = idUsuario;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }*/
        this.idUsuario = idUsuario;
    }

    public Integer getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(Integer idOferta) {
        this.idOferta = idOferta;
    }

    public Double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        try {
            this.validacion.validarFechaReserva(fechaReserva);
            this.fechaReserva = LocalDate.parse(fechaReserva,formatter);
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }
}
