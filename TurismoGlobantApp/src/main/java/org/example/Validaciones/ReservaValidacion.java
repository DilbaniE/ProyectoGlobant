package org.example.Validaciones;

import org.example.utilidades.Messaje;
import org.example.utilidades.Util;

public class ReservaValidacion {

    private Util util = new Util();
    /*public boolean validarIduser(String idUsuario){

        return true;
    }*/

    public boolean validarOferta(Integer idOferta){
        return true;
    }
    public boolean validarCostoTotal(Double costoTotal){
        return true;
    }
    public boolean validarNombre(String nombre){
        return true;
    }
    public Boolean validarFechaReserva(String fechaReserva) throws Exception{
        String ex =  "^(0[1-9]|[12][0-9]|3[01]) (0[1-9]|1[0-2]) [1-9][0-9]{3}$";
        if ( (util.buscarCoincidencia(fechaReserva,ex ) ) ){
            throw new Exception(Messaje.FECHA_RESERVA.getMessaje());
        }else {
            return true;
        }
    }
}
