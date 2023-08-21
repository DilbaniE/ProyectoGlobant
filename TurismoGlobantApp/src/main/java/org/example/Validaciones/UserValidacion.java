package org.example.Validaciones;

import org.example.utilidades.Messaje;
import org.example.utilidades.Util;

public class UserValidacion {

    private Util util = new Util();


    public Boolean validarNombres(String nombres) throws  Exception{
        if (!util.buscarCoincidencia(nombres,"^[a-zA-Z ]+$")){
            throw  new Exception(Messaje.FORMATO_NOMBRE.getMessaje());
        } else if (nombres.length() < 10){
                throw new Exception(Messaje.LONGITUG_NAME.getMessaje()) ;
        }else{
            return true;
        }
    }
    public Boolean validarCorreo(String correo) throws  Exception{

        String expresionRegular ="^^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        String ex = " ^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,4}$";
        if (!util.buscarCoincidencia(correo,expresionRegular )){

            throw new Exception(Messaje.CORREO_VALIDO.getMessaje());
        }

        return true;
    }

    public Boolean validarUbicacion(Integer ubicacion) throws  Exception{
       if(ubicacion.equals(1) || ubicacion.equals(2) || ubicacion.equals(3) || ubicacion.equals(4)){
           return true;
       }else {
           throw new Exception( Messaje.UBICACON.getMessaje());
       }
    }

}
