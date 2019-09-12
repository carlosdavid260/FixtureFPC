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
    String nombreAbreviación;
    String acronimo;

    
    
    //Metodos

    
    
    public Equipos(int codigoEquipo, String nombreEquipo, String nombreEstadio, String nombreCiudad, String acronimo) {
        this.codigoEquipo = codigoEquipo;
        this.nombreEquipo = nombreEquipo;
        this.nombreEstadio = nombreEstadio;
        this.nombreCiudad = nombreCiudad;
        this.acronimo = acronimo;
    }
    
    public String getAcronimo() {
        return acronimo;
    }
    
    public void setAcronimo(String acronimo) {
        this.acronimo = acronimo;
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
