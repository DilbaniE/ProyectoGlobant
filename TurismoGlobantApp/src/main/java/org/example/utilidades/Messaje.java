package org.example.utilidades;

public enum Messaje {
    FORMATO_NOMBRE("Revise el formato del nombre"),
    LONGITUG_NAME("Revise la longitud del nombre"),
    CORREO_VALIDO("Revise que sea un correo valido"),
    UBICACON("La ubicacion debe ser solo un numero"),

    /********************************/
    FORMATO_NUMERO("Revise que el tipo de dato sea numero"),
    LONGITUD_NIT("Revise la cantidad de numeros en el nit son solo 10"),
    /********************************/
    NOMBRE_FORMATO("Revise el formato del mensaje que sea letras "),
    NOMBRE_LONGITUD("Revise la longitud del nombre diitado no sobrepase los 30 caracteres"),
    /********************************/
    TITULO("Revise la longitud del nombre, no sobrepase los 20 caracteres"),
    FECHA_INICIO("Revise el formato de la fecha inicio"),
    FECHA_FIN("Revise el formato de la fecha fin, ademas no imposible que la fecha inicio sea supeor a la fecha fin"),
    COSTO_PERSONA("Revise el formato solo numeros positivos"),

    /********************************/
    FECHA_RESERVA("Revise el formato fecha reserva");
    private String messaje;

    Messaje(String messaje){
        this.messaje = messaje;

    }

    public String getMessaje() {
        return messaje;
    }

    public void setMessaje(String messaje) {
        this.messaje = messaje;
    }
}
