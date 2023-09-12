package org.example.Validaciones;

import org.example.utilidades.Messaje;
import org.example.utilidades.Util;

public class EventoValidacion {


    public Boolean validarTopePago(Double pagoMensual) throws Exception{
        if(pagoMensual <= 0){
            throw new Exception(Messaje.VALIDAR_NEGATIVO.getMessaje());
        } else if (pagoMensual > 100000) {
            throw new Exception( Messaje.VALIDAR_TOPE.getMessaje());
        }else{
            return true;
        }
    }

}
