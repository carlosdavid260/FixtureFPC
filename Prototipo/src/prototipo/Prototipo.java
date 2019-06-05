/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Carlos David Quijano
 */
public class Prototipo {

    /**
     * @param args the command line arguments
     */
    Scanner src = new Scanner(System.in);

    public static void main(String[] args) {

        Prototipo menuDespliegue = new Prototipo();
        menuDespliegue.Menu();

    }

    public static Vector<Equipos> Equipos() {
        Vector<Equipos> vectorEquipos = new Vector();
        Equipos equipo1 = new Equipos(1, "Millonarios", "Estadio Nemesio Camacho el Campin", "Bogotá");
        Equipos equipo2 = new Equipos(2, "Deportivo Pasto", "Estadio Departamental Libertad", "Pasto");
        Equipos equipo3 = new Equipos(3, "Deportivo Cali", "Estadio Deportivo Cali", "Cali");
        Equipos equipo4 = new Equipos(4, "Deportes Tolima", "Estadio Manuel Murillo Toro", "Ibagué");
        Equipos equipo5 = new Equipos(5, "Atlético Nacional", "Estadio Atanasio Girardot", "Medellin");
        Equipos equipo6 = new Equipos(6, "América", "Estadio Pascual Guerrero", "Cali");
        Equipos equipo7 = new Equipos(7, "Junior", "Estadio Metropolitano Roberto Meléndez", "Barranquilla");
        Equipos equipo8 = new Equipos(8, "Unión Magdalena", "Estadio Sierra Nevada", "Santa Marta");
        Equipos equipo9 = new Equipos(9, "Independiente Medellin", "Estadio Atanasio Girardot", "Medellin");
        Equipos equipo10 = new Equipos(10, "Once Caldas", "Estadio Palogrande", "Manizales");
        Equipos equipo11 = new Equipos(11, "Deportivo Cúcuta", "Estadio General Santander", "Cúcuta");
        Equipos equipo12 = new Equipos(12, "Patriotas F.C", "Estadio la Independencia", "Tunja");
        Equipos equipo13 = new Equipos(13, "Envigado F.C", "Estadio Polideportivo Sur", "Envigado");
        Equipos equipo14 = new Equipos(14, "Alianza Petrolera", "Estadio Daniel Villa Zapata", "Barrancabermeja");
        Equipos equipo15 = new Equipos(15, "Jaguares de Córdova", "Estadio Municipal de Monteria", "Monteria");
        Equipos equipo16 = new Equipos(16, "Equidad", "Estadio Metropolitano de Techo", "Bogotá");
        Equipos equipo17 = new Equipos(17, "Atlético Bucaramanga", "Estadio Alfonzo López", "Bogotá");
        Equipos equipo18 = new Equipos(18, "Atlético Huila", "Estadio Guillermo Plazas Alcid", "Neiva");
        Equipos equipo19 = new Equipos(19, "Rionegro Águilas", "Estadio Alberto Grisales", "Rionegro");
        Equipos equipo20 = new Equipos(20, "Santa Fe", "Estadio Nemesio Camacho el Campin", "Bogotá");

        vectorEquipos.add(equipo1);
        vectorEquipos.add(equipo2);
        vectorEquipos.add(equipo3);
        vectorEquipos.add(equipo4);
        vectorEquipos.add(equipo5);
        vectorEquipos.add(equipo6);
        vectorEquipos.add(equipo7);
        vectorEquipos.add(equipo8);
        vectorEquipos.add(equipo9);
        vectorEquipos.add(equipo10);
        vectorEquipos.add(equipo11);
        vectorEquipos.add(equipo12);
        vectorEquipos.add(equipo13);
        vectorEquipos.add(equipo14);
        vectorEquipos.add(equipo15);
        vectorEquipos.add(equipo16);
        vectorEquipos.add(equipo17);
        vectorEquipos.add(equipo18);
        vectorEquipos.add(equipo19);
        vectorEquipos.add(equipo20);

        return vectorEquipos;
    }

    public static void Estadios(Vector<Equipos> Equipos) {
        for (int j = 0; j < Equipos.size(); j++) {
            System.out.println(Equipos.elementAt(j).nombreCiudad);
        }
    }

    public void Menu() {
        System.out.println("Digíte el numero del caso que desea realizar: \n"
                + "1. Seleccionar los equipos. \n"
                + "2. Seleccionar los estadios. \n"
                + "3. Seleccionar crear fixture. \n");
        int caso = src.nextInt();
        Vector<Equipos> equipos = new Vector();
        equipos = Equipos();
        switch (caso) {
            case 1:
                System.out.println("Ha decidido ver los equipos.");
                for (int i = 0; i < equipos.size(); i++) {
                    System.out.println(equipos.elementAt(i).nombreEquipo + "\n");
                }
                break;

            case 2:
                System.out.println("Ha decidido hacer el fixture.");
                for (int i = 0; i < equipos.size(); i++) {
                    System.out.println(equipos.elementAt(i).nombreEstadio + "\n");
                }
                break;

            case 3:
                System.out.println("Ha seleccionado crear fixture");
                Fixture();
                break;
        }
    }

    public static Vector<Equipos> Fixture() {
        Vector<Equipos> equipos = new Vector();
        equipos = Equipos();
        System.out.println("Ha decidido hacer el fixture.");
        for (int i = 0; i < equipos.size(); i++) {
            System.out.println("\n");
            for (int j = 0; j < equipos.size(); j++) {
                System.out.print(equipos.elementAt(j).codigoEquipo + ", ");
            }
        }
        return equipos;
    }
}
