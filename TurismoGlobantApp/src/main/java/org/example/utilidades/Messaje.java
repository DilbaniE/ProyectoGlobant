package org.example.utilidades;

public enum Messaje {
    FORMATO_NOMBRE("Revise el formato del nombre"),
    LONGITUG_NAME("Revise la longitud del nombre"),
    /********************************/
    FORMATO_NUMERO("Revise que el tipo de dato sea numero"),
    LONGITUD_NIT("Revise la cantidad de numeros en el nit"),
    /********************************/
    NOMBRE_FORMATO("Revise el formato del mensaje"),
    NOMBRE_LONGITUD("Revise lalongitud del nombre diitado");
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
