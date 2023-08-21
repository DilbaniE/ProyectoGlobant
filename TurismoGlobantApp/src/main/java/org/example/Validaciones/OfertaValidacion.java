package org.example.Validaciones;

import org.example.utilidades.Messaje;
import org.example.utilidades.Util;

import java.time.LocalDate;
import java.util.Date;

public class OfertaValidacion {
    private Util util = new Util();
//
    public Boolean validarTitulo(String titulo) throws  Exception{
        if (titulo.length() > 20) {
            throw new Exception(Messaje.TITULO.getMessaje());
        } else {
            return false;
        }
    }

    public Boolean validarFechaInicio(String fechaInicio) throws Exception{
        String  expresion = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[0-2])/\\d{4}$";
        String ex =  "^(0[1-9]|[12][0-9]|3[01]) (0[1-9]|1[0-2]) [1-9][0-9]{3}$";
        String gh = "^(0[1-9]|[12]\\\\d|3[01])/(0[1-9]|1[0-2])/\\\\d{4}$";
        String expresionRegular ="^^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        String ff = "\\d+";
        if ( (util.buscarCoincidencia(fechaInicio,ex ) ) ){
            throw new Exception(Messaje.FECHA_INICIO.getMessaje());
        }
        else{
            return true;
        }


    }
    public Boolean validarFechaFin(String fechaFin) throws Exception{
        String ex =  "^(0[1-9]|[12][0-9]|3[01]) (0[1-9]|1[0-2]) [1-9][0-9]{3}$";
        if ( (util.buscarCoincidencia(fechaFin,ex ) ) ){
            throw new Exception(Messaje.FECHA_INICIO.getMessaje());
        }
        else{
            return true;
        }
    }

    public Boolean validarDiferenciaFecha(LocalDate fechaInicio, LocalDate fechaFin) throws Exception{
        if (fechaInicio.isAfter(fechaFin)){
            throw new Exception(Messaje.FECHA_FIN.getMessaje());
        }
        else{
            return true;
        }
    }

    public Boolean validarcostoPersona(Double costoPerson) throws Exception {
        if (costoPerson < 0){
            throw  new Exception(Messaje.COSTO_PERSONA.getMessaje());
        }
        return true;
    }

}
