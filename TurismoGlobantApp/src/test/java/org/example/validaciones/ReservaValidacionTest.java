package org.example.validaciones;

import org.example.Validaciones.ReservaValidacion;
import org.example.Validaciones.UserValidacion;
import org.example.utilidades.Messaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaValidacionTest {

    ReservaValidacion reservaValidacion;
    @BeforeEach
    public void configurarPruebaInicio(){
        System.out.println("estoy ejecutando");
        this.reservaValidacion = new ReservaValidacion();
    }

    @Test
    public void validarOferta(){
        Integer nombrePrueba = 12222;
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.reservaValidacion.validarOferta(nombrePrueba));
        Assertions.assertTrue(respuesta);
    }
    @Test
    public void validarCosto(){
        Double nombrePrueba = 12.2222;
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.reservaValidacion.validarCostoTotal(nombrePrueba));
        Assertions.assertTrue(respuesta);
    }
    @Test
    public void validarNombre(){
        String nombrePrueba = "Dilbani";
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.reservaValidacion.validarNombre(nombrePrueba));
        Assertions.assertTrue(respuesta);
    }
    @Test
    public void validarFechaCorrecta(){
        String fechaPrueba = "9/11/2023";
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.reservaValidacion.validarFechaReserva(fechaPrueba));
        Assertions.assertTrue(respuesta);
    }
    @Test
    public void validarFechaFechaIncorrecta(){
        String fechaPrueba = "30/2023";
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.reservaValidacion.validarFechaReserva(fechaPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarFechaFechaInt(){
        String fechaPrueba = "9/30";
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.reservaValidacion.validarFechaReserva(fechaPrueba));
        Assertions.assertTrue(respuesta);
    }


}