/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Garcia
 */
public class Asigntura {

    private int clave;
    private String nombre;
    private int creditos;
    private int horas;

    // CONTROL + ESP +ENTER = METODOS CONSTRUCTORES
    public Asigntura() {
    }

    public Asigntura(int clave, String nombre, int creditos, int horas) {
        this.clave = clave;
        this.nombre = nombre;
        this.creditos = creditos;
        this.horas = horas;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    
    
}
