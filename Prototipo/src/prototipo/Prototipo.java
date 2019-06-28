/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
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
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Prototipo menuDespliegue = new Prototipo();
        menuDespliegue.Menu();

    }

    public static Vector<Equipos> Equipos() {
        Vector<Equipos> vectorEquipos = new Vector();
        Equipos equipo1 = new Equipos(1, "Millonarios", "Estadio Nemesio Camacho el Campin", "Bogotá", "MIL");
        Equipos equipo2 = new Equipos(2, "Deportivo Pasto", "Estadio Departamental Libertad", "Pasto", "PAS");
        Equipos equipo3 = new Equipos(3, "Deportivo Cali", "Estadio Deportivo Cali", "Cali", "CAL");
        Equipos equipo4 = new Equipos(4, "Deportes Tolima", "Estadio Manuel Murillo Toro", "Ibagué", "TOL");
        Equipos equipo5 = new Equipos(5, "Atlético Nacional", "Estadio Atanasio Girardot", "Medellin", "NAL");
        Equipos equipo6 = new Equipos(6, "América", "Estadio Pascual Guerrero", "Cali", "AME");
        Equipos equipo7 = new Equipos(7, "Junior", "Estadio Metropolitano Roberto Meléndez", "Barranquilla", "JUN");
        Equipos equipo8 = new Equipos(8, "Unión Magdalena", "Estadio Sierra Nevada", "Santa Marta", "MAG");
        Equipos equipo9 = new Equipos(9, "Independiente Medellin", "Estadio Atanasio Girardot", "Medellin", "MED");
        Equipos equipo10 = new Equipos(10, "Once Caldas", "Estadio Palogrande", "Manizales", "ONC");
        Equipos equipo11 = new Equipos(11, "Deportivo Cúcuta", "Estadio General Santander", "Cúcuta", "CUC");
        Equipos equipo12 = new Equipos(12, "Patriotas F.C", "Estadio la Independencia", "Tunja", "PAT");
        Equipos equipo13 = new Equipos(13, "Envigado F.C", "Estadio Polideportivo Sur", "Envigado", "ENV");
        Equipos equipo14 = new Equipos(14, "Alianza Petrolera", "Estadio Daniel Villa Zapata", "Barrancabermeja", "ALI");
        Equipos equipo15 = new Equipos(15, "Jaguares de Córdova", "Estadio Municipal de Monteria", "Monteria", "JAG");
        Equipos equipo16 = new Equipos(16, "Equidad", "Estadio Metropolitano de Techo", "Bogotá", "EQU");
        Equipos equipo17 = new Equipos(17, "Atlético Bucaramanga", "Estadio Alfonzo López", "Bucaramamga", "BUC");
        Equipos equipo18 = new Equipos(18, "Atlético Huila", "Estadio Guillermo Plazas Alcid", "Neiva", "HUI");
        Equipos equipo19 = new Equipos(19, "Rionegro Águilas", "Estadio Alberto Grisales", "Rionegro", "RIO");
        Equipos equipo20 = new Equipos(20, "Santa Fe", "Estadio Nemesio Camacho el Campin", "Bogotá", "SFE");

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
                + "3. Seleccionar crear fixture. \n"
                + "4. Seleccionar prueba del cuadrado latino. \n"
                + "5. Seleccionar prueba del cuadrado latino estandar. \n");
        int caso = sc.nextInt();
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
                System.out.println("Ha decidido seleccionar los estadios.");
                for (int i = 0; i < equipos.size(); i++) {
                    System.out.println(equipos.elementAt(i).nombreEstadio + "\n");
                }
                break;

            case 3:
                System.out.println("Ha seleccionado crear fixture");
                Fixture();
                System.out.println("\n");
                break;

            case 4:
                System.out.println("Ha solicitado la prueba del cuadrado latino:");
                ejemploCuadrado2();
                System.out.println("\n");
                ejemploCuadrado3();
                break;

            case 5:
                System.out.println("Ha solicitado la prueba del cuadrado latino estandar:");
                ejemploCuadrado();
        }
    }

    public static Vector<Equipos> Fixture() {
        Vector<Equipos> equipos = new Vector();
        equipos = Equipos();
        int fecha = 1;
        Random rnd = new Random();
        System.out.println("Ha decidido hacer el fixture.");

        for (int f = 0; f < 20; f++) {
            System.out.println("Fecha " + fecha);
            for (int i = 0; i < 10; i++) {
                System.out.println("\n");
                for (int j = 0; j < 2; j++) {
                    System.out.print(equipos.elementAt(rnd.nextInt(equipos.size())).acronimo);
                    if (j != 1) {
                        System.out.print(" vs ");
                    }
                }
            }
            System.out.println("\n");
            fecha++;
        }
        return equipos;
    }

    public void cuadradoLatino() {
        System.out.println("Ingrese numero");

        Cuadrado n = new Cuadrado(sc.nextInt());
        int x;
        int y = n.regresarValor();
        for (x = 0; x < y; x++) {
            if (x == 0) {
                n.guardarValores(y);
            } else {
                n.recorrerValores();
            }
        }
    }

    public void ejemploCuadrado() {
        System.out.println("Digite el numero para crear el cuadrado latino: ");
        int q = sc.nextInt();
        int FILAS = q;
        int COLS = q;
        int matriz[][] = new int[FILAS][COLS];
        Vector<Equipos> equipos = new Vector();

        for (int fil = 0; fil < FILAS; fil++) {
            for (int col = 0; col < COLS; col++) {
                //si es la primera fila
                if (fil == 0) {
                    matriz[fil][col] = col + 1;
                } //si no, si es la primera columna
                else if (col == 0) {
                    matriz[fil][col] = matriz[fil - 1][COLS - 1];
                } // para el resto de casos
                else {
                    matriz[fil][col] = matriz[fil - 1][col - 1];
                }
            }
        }

        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (matriz[i][j] < 10) {
                    System.out.printf("   %d", matriz[i][j]);
                } else {
                    System.out.printf("  %d", matriz[i][j]);
                }
            }
            System.out.println();
        }
    }

    public void ejemploCuadrado2() {
        int FILAS = 19;
        int COLS = 20;
        Equipos matriz[][] = new Equipos[FILAS][COLS];
        Vector<Equipos> equipos = new Vector();
        int fecha = 1;
        equipos = Equipos();
        for (int fil = 0; fil < FILAS; fil++) {
            for (int col = 0; col < COLS; col++) {
                //si es la primera fila
                if (fil == 0) {
                    matriz[fil][col] = equipos.elementAt(col);
                } //si no, si es la primera columna
                else if (col == 0) {
                    matriz[fil][col] = matriz[fil - 1][COLS - 1];
                } // para el resto de casos
                else {
                    matriz[fil][col] = matriz[fil - 1][col - 1];
                }
            }
        }
        for (int i = 0; i < FILAS; i++) {
            System.out.println("PRIMERA TEMPORADA.");
            System.out.print("\n");
            System.out.println("\033[0;1m" + "Fecha " + fecha);
            for (int j = 0; j < COLS; j++) {
                if (j%2!=1) {
                    System.out.print("@" + matriz[i][j].acronimo + " ");
                } else {
                    System.out.print(matriz[i][j].acronimo + " ");
                }
                if (j % 2 != 1) {
                    System.out.print(" vs ");
                }
                if (j % 2 == 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            fecha++;
        }
    }
    
    public void ejemploCuadrado3() {
        int FILAS = 19;
        int COLS = 20;
        Equipos matriz[][] = new Equipos[FILAS][COLS];
        Vector<Equipos> equipos = new Vector();
        int fecha = 1;
        equipos = Equipos();
        for (int fil = 0; fil < FILAS; fil++) {
            for (int col = 0; col < COLS; col++) {
                //si es la primera fila
                if (fil == 0) {
                    matriz[fil][col] = equipos.elementAt(col);
                } //si no, si es la primera columna
                else if (col == 0) {
                    matriz[fil][col] = matriz[fil - 1][COLS - 1];
                } // para el resto de casos
                else {
                    matriz[fil][col] = matriz[fil - 1][col - 1];
                }
            }
        }
        for (int i = 0; i < FILAS; i++) {
            System.out.println("SEGUNDA TEMPORADA.");
            System.out.print("\n");
            System.out.println("\033[0;1m" + "Fecha " + fecha);
            for (int j = 0; j < COLS; j++) {
                if (j%2==1) {
                    System.out.print("@" + matriz[i][j].acronimo + " ");
                } else {
                    System.out.print(matriz[i][j].acronimo + " ");
                }
                if (j % 2 != 1) {
                    System.out.print(" vs ");
                }
                if (j % 2 == 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            fecha++;
        }
    }
}
