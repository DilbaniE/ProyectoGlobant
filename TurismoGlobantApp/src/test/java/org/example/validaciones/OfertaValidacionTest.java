package org.example.validaciones;

import org.example.Validaciones.OfertaValidacion;
import org.example.Validaciones.UserValidacion;
import org.example.utilidades.Messaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class OfertaValidacionTest {
    OfertaValidacion ofertaValidacion;

    @BeforeEach
    public void configurarPruebaInicio(){
        System.out.println("estoy ejecutando");
        this.ofertaValidacion = new OfertaValidacion();
    }

    @Test
    public void validarPago(){
        //prepara
        String nombrePrueba = "Tienda maximo solo j";
        //ejecuta
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.ofertaValidacion.validarTitulo(nombrePrueba));
        //verificando que son iguales
        Assertions.assertEquals(Messaje.TITULO.getMessaje(),respuesta.getMessage());
    }

    @Test
    public void validarTituloError(){
        //prepara
        String nombrePrueba = "Tienda maximo solo jh";
        //ejecuta
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.ofertaValidacion.validarTitulo(nombrePrueba));
        //verificando que son iguales
        Assertions.assertEquals(Messaje.TITULO.getMessaje(),respuesta.getMessage());
    }

    @Test
    public void validarFechaInicio(){
        String fechaInicioPrueba = "11/09";
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.ofertaValidacion.validarFechaInicio(fechaInicioPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarFechaInicio2(){
        String fechaInicioPrueba = "11/09/2023";
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.ofertaValidacion.validarFechaInicio(fechaInicioPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarFechaFin(){
        String fechaFinPrueba = "15/09/2023";
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.ofertaValidacion.validarFechaFin(fechaFinPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarFechas(){
        String fechaInicioPrueba = ("15/09/2023");
        String fechaFinPrueba = ("20/09/2023");
        /*Boolean respuesta = Assertions.assertDoesNotThrow(()->this.ofertaValidacion.validarDiferenciaFecha(fechaInicioPrueba,fechaFinPrueba));
        Assertions.assertTrue(respuesta);*/
    }

    @Test
    public void validarcostoPersona(){
        Double costoPersona = 9.0002;
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.ofertaValidacion.validarcostoPersona(costoPersona));
        Assertions.assertTrue(respuesta);
    }


}