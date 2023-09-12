package org.example.validaciones;

import org.example.Validaciones.UserValidacion;
import org.example.utilidades.Messaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class UsuarioValidacionTest {
    UserValidacion usuarioValidacion;

    @BeforeEach
    public void configurarPruebaInicio(){
        System.out.println("estoy ejecutando");
        this.usuarioValidacion = new UserValidacion();
    }

    @Test
    public void validarNombreCorto(){
        //prepara
        String nombrePrueba = "Dilbani";
        //ejecuta
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.usuarioValidacion.validarNombres(nombrePrueba));
        //verificando que son iguales
        Assertions.assertEquals(Messaje.LONGITUG_NAME.getMessaje(),respuesta.getMessage());
    }

    @Test
    public void validarNombreCaracteres(){
        String nombrePrueba = "Juan @22";
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.usuarioValidacion.validarNombres(nombrePrueba));
        Assertions.assertEquals(Messaje.FORMATO_NOMBRE.getMessaje(),respuesta.getMessage());
    }
    @Test
    public void validarNombreCorrecto(){
        String nombrePrueba = "dilbanierniquez";
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.usuarioValidacion.validarNombres(nombrePrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarCorreoCorrecto(){
        String correoPrueba = "dilbanierniquez@gmail.com";
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.usuarioValidacion.validarCorreo(correoPrueba));
        Assertions.assertTrue(respuesta);
    }


    @Test
    public void validarCorreo(){
        String correoPrueba = " dilbani.com";
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.usuarioValidacion.validarCorreo(correoPrueba));
        Assertions.assertEquals(Messaje.CORREO_VALIDO.getMessaje(),respuesta.getMessage());
    }

    @Test
    public void ValidarUbicacion(){
        Integer ubicacionPrueba = 122;
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.usuarioValidacion.validarUbicacion(ubicacionPrueba));
        Assertions.assertEquals(Messaje.UBICACON.getMessaje(),respuesta.getMessage());
    }



}