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
public class Deportista {
    private String nombres;
    private String paterno;
    private String materno;
    private String federacion;
    private String pais;
    private int anio;
    private String pad;
    private String nivel;
    private double monto;
    private LugarNacimiento lugarNacimiento;

    public Deportista(String nombres, String paterno, String materno, String federacion, String pais, int anio, String pad, String nivel, double monto, LugarNacimiento lugarNacimiento) {
        this.nombres = nombres;
        this.paterno = paterno;
        this.materno = materno;
        this.federacion = federacion;
        this.pais = pais;
        this.anio = anio;
        this.pad = pad;
        this.nivel = nivel;
        this.monto = monto;
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getFederacion() {
        return federacion;
    }

    public void setFederacion(String federacion) {
        this.federacion = federacion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getPad() {
        return pad;
    }

    public void setPad(String pad) {
        this.pad = pad;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public LugarNacimiento getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(LugarNacimiento lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    @Override
    public String toString() {
        return "Deportista: " + nombres + " " + paterno + " " + materno +
               "\nFederación: " + federacion + 
               "\nPaís: " + pais +
               "\nAño: " + anio +
               "\nPAD: " + pad + 
               "\nNivel: " + nivel + 
               "\nMonto: " + monto + 
               "\nLugar de Nacimiento: " + lugarNacimiento;
    }
}
