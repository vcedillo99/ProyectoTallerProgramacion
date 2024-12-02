/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Grey Cedillo
 */
public class LugarNacimiento {
    private String departamento;
    private String provincia;
    private String distrito;

    public LugarNacimiento(String departamento, String provincia, String distrito) {
        this.departamento = departamento;
        this.provincia = provincia;
        this.distrito = distrito;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }
}
