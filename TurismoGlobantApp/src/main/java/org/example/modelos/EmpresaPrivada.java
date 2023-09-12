package org.example.modelos;

public class EmpresaPrivada extends Empresa{

    private String referenteLegal;
    private String Cedula;

    public EmpresaPrivada() {
    }

    public EmpresaPrivada(Integer id, String nit, String nombre, Integer ubicacion, String descripcion, String referenteLegal, String cedula, String nombre1) {
        super(id, nit, nombre, ubicacion, descripcion);
        this.referenteLegal = referenteLegal;
        Cedula = cedula;
    }

    public String getReferenteLegal() {
        return referenteLegal;
    }

    public void setReferenteLegal(String referenteLegal) {
        this.referenteLegal = referenteLegal;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String cedula) {
        Cedula = cedula;
    }


    @Override
    public Double cobrar() {
        return null;
    }
}
