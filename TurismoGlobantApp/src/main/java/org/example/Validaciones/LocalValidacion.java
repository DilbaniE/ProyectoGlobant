package org.example.Validaciones;

import org.example.utilidades.Messaje;
import org.example.utilidades.Util;

public class LocalValidacion {

    private Util util = new Util();

    public boolean validarNit(String nit) throws Exception {
        if(!util.buscarCoincidencia(nit, "^[1-9]\\d*$\n")){
            throw new Exception(Messaje.FORMATO_NUMERO.getMessaje());
        } else if ((!(nit.length() == 10))) {
            throw new Exception(Messaje.LONGITUD_NIT.getMessaje()) ;
        }
        return true;

    }

    public boolean validarName(String nombre) throws Exception {
        if (!util.buscarCoincidencia(nombre,"[a-zA-Z]+$")){
            throw  new Exception(Messaje.NOMBRE_FORMATO.getMessaje());
        } else if (nombre.length()>30){
            throw new Exception(Messaje.NOMBRE_LONGITUD.getMessaje());
        }else{
            return true;
        }
    }
}
