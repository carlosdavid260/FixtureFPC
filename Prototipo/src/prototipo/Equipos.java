/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipo;

/**
 *
 * @author Carlos David Quijano
 */
public class Equipos {

    //Atributos de los equipos.
    int codigoEquipo;
    String nombreEquipo;
    String nombreEstadio;
    String nombreCiudad;

    
    
    //Metodos

    
    
    public Equipos(int codigoEquipo, String nombreEquipo, String nombreEstadio, String nombreCiudad) {
        this.codigoEquipo = codigoEquipo;
        this.nombreEquipo = nombreEquipo;
        this.nombreEstadio = nombreEstadio;
        this.nombreCiudad = nombreCiudad;
    }

    public int getCodigoEquipo() {
        return codigoEquipo;
    }

    public void setCodigoEquipo(int codigoEquipo) {
        this.codigoEquipo = codigoEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getNombreEstadio() {
        return nombreEstadio;
    }

    public void setNombreEstadio(String nombreEstadio) {
        this.nombreEstadio = nombreEstadio;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }
   
}
