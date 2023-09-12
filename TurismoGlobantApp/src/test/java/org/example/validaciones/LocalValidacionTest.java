package org.example.validaciones;

import org.example.Validaciones.EmpresaValidacion;
import org.example.utilidades.Messaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LocalValidacionTest {

    EmpresaValidacion localValidacion;

    @BeforeEach
    public void configurarPruebaInicio(){
        System.out.println("estoy ejecutando");
        this.localValidacion = new EmpresaValidacion();
    }

    @Test
    public void validarlongitudNit(){
        //prepara
        String nombrePrueba = "1234567890";
        //ejecuta
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.localValidacion.validarNit(nombrePrueba));
        //verificando que son iguales
        Assertions.assertEquals(Messaje.LONGITUD_NIT.getMessaje(),respuesta.getMessage());
    }

    @Test
    public void validarTipoDato(){
        //prepara
        String nombrePrueba = "sdfghjkl";
        //ejecuta
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.localValidacion.validarNit(nombrePrueba));
        //verificando que son iguales
        Assertions.assertEquals(Messaje.FORMATO_NUMERO.getMessaje(),respuesta.getMessage());
    }

    @Test
    public void validarlongitudNombre(){
        //prepara
        String nombrePrueba = "tiena lo maximo pero ya no esw";
        //ejecuta
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.localValidacion.validarName(nombrePrueba));
        //verificando que son iguales
        Assertions.assertEquals(Messaje.NOMBRE_LONGITUD.getMessaje(),respuesta.getMessage());
    }

    @Test
    public void validarTipoNombre(){
        //prepara
        String nombrePrueba = "asdfg123456789 123456";
        //ejecuta
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.localValidacion.validarName(nombrePrueba));
        //verificando que son iguales
        Assertions.assertEquals(Messaje.NOMBRE_FORMATO.getMessaje(),respuesta.getMessage());
    }






}