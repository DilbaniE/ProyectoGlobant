package org.example.validaciones;

import org.example.Validaciones.MenbresiaValidacion;
import org.example.utilidades.Messaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class EventoValidacionTest {
    MenbresiaValidacion menbresiaValidacion;

    @BeforeEach
    public void configurarPruebaInicio(){
        System.out.println("estoy ejecutando");
        this.menbresiaValidacion = new MenbresiaValidacion();
    }

    /*@Test
    public void validarPago(){
        //prepara
        Integer numeroNegativo = 0;
        //ejecuta
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.menbresiaValidacion.validarTopePago(numeroNegativo));
        //verificando que son iguales
        Assertions.assertEquals(Messaje.VALIDAR_NEGATIVO.getMessaje(),respuesta.getMessage());
    }*/

}



