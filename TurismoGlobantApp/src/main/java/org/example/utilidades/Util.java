package org.example.utilidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {
    public Boolean buscarCoincidencia(String cadena, String expresionRegular){
        Pattern patron = Pattern.compile(expresionRegular);
        Matcher coincidencia = patron.matcher(cadena);
        if (coincidencia.matches()){
            return false;
        } else {
            return true;
        }
    }

}
//  boolean b = ((coincidencia.matches())) ? true : false;
