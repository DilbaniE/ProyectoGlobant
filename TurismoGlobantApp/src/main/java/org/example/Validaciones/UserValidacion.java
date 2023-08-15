package org.example.Validaciones;

import org.example.utilidades.Messaje;
import org.example.utilidades.Util;

public class UserValidacion {

    private Util util = new Util();


    public Boolean validarNombres(String nombres) throws  Exception{
        if (!util.buscarCoincidencia(nombres,"[a-zA-Z]+$")){
            throw  new Exception(Messaje.FORMATO_NOMBRE.getMessaje());
        } else if (nombres.length() < 10){
                throw new Exception(Messaje.LONGITUG_NAME.getMessaje()) ;
        }else{
            return true;
        }
    }
    public Boolean validarCorreo(String correo) throws  Exception{
        if (!util.buscarCoincidencia(correo, "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")){
            throw new Exception("revise que su correo es valido");
        }
        return true;
    }

    public Boolean validarUbicacion(Integer ubicacion) throws  Exception{
       if(ubicacion.equals(1) || ubicacion.equals(2) || ubicacion.equals(3) || ubicacion.equals(4)){
           return true;
       }else {
           throw new Exception("señor usuario revise su ubicacion");
       }
    }

}
