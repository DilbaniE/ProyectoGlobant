package org.example.Validaciones;

import org.example.utilidades.Messaje;
import org.example.utilidades.Util;

public class EmpresaValidacion {

    private Util util = new Util();

    public boolean validarNit(String nit) throws Exception {
        String f = "^[1-9]\\d*$\n";
        String d = "\\d+";
        if(!util.buscarCoincidencia(nit, d)){
            throw new Exception(Messaje.FORMATO_NUMERO.getMessaje());
        } else if ((!(nit.length() == 11))) {
            throw new Exception(Messaje.LONGITUD_NIT.getMessaje()) ;
        }
        return true;
    }

    public boolean validarName(String nombre) throws Exception {
        String d =" ^[a-zA-ZáÁéÉíÍóÓúÚñÑüÜ\\\\s]+$" ;
        String dh = "^[a-zA-Z ]+$";
        if (!util.buscarCoincidencia(nombre,dh)){
            throw  new Exception(Messaje.NOMBRE_FORMATO.getMessaje());
        } else if (nombre.length() <= 30){
            throw new Exception(Messaje.NOMBRE_LONGITUD.getMessaje());
        }else{
            return true;
        }
    }


}
