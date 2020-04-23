/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
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
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Prototipo menuDespliegue = new Prototipo();
        try {
            int salir = 1;
            while (salir == 1) {

                menuDespliegue.Menu();
                System.out.println("¿Deseas continuar ejecutando la aplicación?\n Escribe '0' para salir o '1' para continuar");
                salir = sc.nextInt();

            }
        } catch (InputMismatchException e) {
            System.out.println("Por favor digitar un número en la proxima ejecución del programa.");
        }

    }

    public static Vector<Equipos> Equipos() {
        Vector<Equipos> vectorEquipos = new Vector();
        Equipos equipo1 = new Equipos(0, "Millonarios", "Estadio Nemesio Camacho el Campin", "Bogotá", "MIL");
        Equipos equipo2 = new Equipos(1, "Deportivo Pasto", "Estadio Departamental Libertad", "Pasto", "PAS");
        Equipos equipo3 = new Equipos(2, "Deportivo Cali", "Estadio Deportivo Cali", "Cali", "CAL");
        Equipos equipo4 = new Equipos(3, "Deportes Tolima", "Estadio Manuel Murillo Toro", "Ibagué", "TOL");
        Equipos equipo5 = new Equipos(4, "Atlético Nacional", "Estadio Atanasio Girardot", "Medellin", "NAL");
        Equipos equipo6 = new Equipos(5, "América", "Estadio Pascual Guerrero", "Cali", "AME");
        Equipos equipo7 = new Equipos(6, "Junior", "Estadio Metropolitano Roberto Meléndez", "Barranquilla", "JUN");
        Equipos equipo8 = new Equipos(7, "Unión Magdalena", "Estadio Sierra Nevada", "Santa Marta", "MAG");
        Equipos equipo9 = new Equipos(8, "Independiente Medellin", "Estadio Atanasio Girardot", "Medellin", "MED");
        Equipos equipo10 = new Equipos(9, "Once Caldas", "Estadio Palogrande", "Manizales", "ONC");
        Equipos equipo11 = new Equipos(10, "Deportivo Cúcuta", "Estadio General Santander", "Cúcuta", "CUC");
        Equipos equipo12 = new Equipos(11, "Patriotas F.C", "Estadio la Independencia", "Tunja", "PAT");
        Equipos equipo13 = new Equipos(12, "Envigado F.C", "Estadio Polideportivo Sur", "Envigado", "ENV");
        Equipos equipo14 = new Equipos(13, "Alianza Petrolera", "Estadio Daniel Villa Zapata", "Barrancabermeja", "ALI");
        Equipos equipo15 = new Equipos(14, "Jaguares de Córdova", "Estadio Municipal de Monteria", "Monteria", "JAG");
        Equipos equipo16 = new Equipos(15, "Equidad", "Estadio Metropolitano de Techo", "Bogotá", "EQU");
        Equipos equipo17 = new Equipos(16, "Atlético Bucaramanga", "Estadio Alfonzo López", "Bucaramamga", "BUC");
        Equipos equipo18 = new Equipos(17, "Atlético Huila", "Estadio Guillermo Plazas Alcid", "Neiva", "HUI");
        Equipos equipo19 = new Equipos(18, "Rionegro Águilas", "Estadio Alberto Grisales", "Rionegro", "RIO");
        Equipos equipo20 = new Equipos(19, "Santa Fe", "Estadio Nemesio Camacho el Campin", "Bogotá", "SFE");

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
                + "3. Seleccionar crear fixture (Prueba aleatoria). \n"
                + "4. Seleccionar prueba del cuadrado latino (Avances) \n"
                + "5. Seleccionar prueba del cuadrado latino estandar. (Numerico) \n"
                + "6. Seleccionar prueba del fixture optimo. \n"
                + "7. Seleccionar prueba del fixture comparable. \n");

        int caso = sc.nextInt();

        Vector<Equipos> equipos = new Vector();
        equipos = Equipos();
        if (caso > 0 && caso < 8) {
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
                    System.out.println("Ingrese quien fue el equipo ganador de la super liga: ");
                    System.out.println("Ha seleccionado crear fixture");
                    Fixture();
                    System.out.println("\n");
                    break;

                case 4:
                    System.out.println("Ha solicitado la prueba del cuadrado latino:");
                    System.out.println("Ingrese el ganador de la super liga: ");
                    int ganador = sc.nextInt();
                    ejemploCuadrado2(GanadorSuperLiga(ganador));
                    System.out.println("\n");
                    ejemploCuadrado3(GanadorSuperLiga(ganador));
                    break;

                case 5:
                    System.out.println("Ha solicitado la prueba del cuadrado latino estandar:");
                    ejemploCuadrado();
                    break;
                case 6:
                    System.out.println("Ha solicitado la creación del fixture optimo.");
                    System.out.println("Ingrese el ganador de la super liga: ");
                    int ganador2 = sc.nextInt();
                    equiposdistancia(GanadorSuperLiga(ganador2));
                    System.out.println("\n");
                    equiposdistancia2(GanadorSuperLiga(ganador2));
                    //ejemploCuadrado();
                case 7:
                    System.out.println("Ha solicitado la creación del fixture comparable.");
                    System.out.println("Ingrese el ganador de la super liga: ");
                    int ganador3 = sc.nextInt();
                    distanciaOptima(GanadorSuperLiga(ganador3));
                    //ejemploCuadrado();
            }
        } else {
            System.out.println("El numero digitado no esta entre las opciones.");
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

    public void ejemploCuadrado2(Vector<Equipos> ganador) {
        int FILAS = 19;
        int COLS = 20;
        Equipos matriz[][] = new Equipos[FILAS][COLS];
        Random rnd = new Random();

        int fecha = 1;
        System.out.println("El ganador de la Super Liga es " + ganador.elementAt(0).nombreEquipo);
        for (int fil = 0; fil < FILAS; fil++) {
            for (int col = 0; col < COLS; col++) {
                //si es la primera fila
                if (fil == 0) {
                    matriz[fil][col] = ganador.elementAt(col);
                } //si no, si es la primera columna
                else if (col == 0) {
                    matriz[fil][col] = matriz[fil - 1][COLS - 1];
                } // para el resto de casos
                else {
                    matriz[fil][col] = matriz[fil - 1][col - 1];
                }
            }
        }
        System.out.println("PRIMERA TEMPORADA.");
        for (int i = 0; i < FILAS; i++) {
            System.out.print("\n");
            System.out.println("\033[0;1m" + "Fecha " + fecha);
            for (int j = 0; j < COLS; j++) {
                if (j % 2 != 1) {
                    System.out.print("@" + matriz[i][j].acronimo + " ");
                } else {

                    System.out.print(matriz[0][j].acronimo + " ");
                    //System.out.print(equipos.elementAt(rnd.nextInt(equipos.size())).acronimo);

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

    public void ejemploCuadrado3(Vector<Equipos> ganador) {
        int FILAS = 19;
        int COLS = 20;
        Equipos matriz[][] = new Equipos[FILAS][COLS];
        Random rnd = new Random();

        int fecha = 1;
        for (int fil = 0; fil < FILAS; fil++) {
            for (int col = 0; col < COLS; col++) {
                //si es la primera fila
                if (fil == 0) {
                    matriz[fil][col] = ganador.elementAt(col);
                } //si no, si es la primera columna
                else if (col == 0) {
                    matriz[fil][col] = matriz[fil - 1][COLS - 1];
                } // para el resto de casos
                else {
                    matriz[fil][col] = matriz[fil - 1][col - 1];
                }
            }
        }
        System.out.println("SEGUNDA TEMPORADA.");
        for (int i = 0; i < FILAS; i++) {
            System.out.print("\n");
            System.out.println("\033[0;1m" + "Fecha " + fecha);
            for (int j = 0; j < COLS; j++) {
                if (j % 2 != 1) {
                    System.out.print(matriz[i][j].acronimo + " ");
                } else {

                    System.out.print("@" + matriz[0][j].acronimo + " ");
                    //System.out.print("@" + equipos.elementAt(rnd.nextInt(equipos.size())).acronimo);

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

    private Vector<Equipos> GanadorSuperLiga(int ganador) {
        Vector<Equipos> equipos = new Vector();
        Vector<Equipos> equiposOrganizados = new Vector();
        equipos = Equipos();
        for (int i = 0; i < 20; i++) {
            if (equipos.get(i).codigoEquipo == ganador) {
                equiposOrganizados.add(equipos.get(i));
            }

        }
        for (int j = 0; j < 20; j++) {
            if (equipos.get(j).codigoEquipo != ganador) {
                equiposOrganizados.add(equipos.get(j));
            }
        }
        return equiposOrganizados;
    }

//    private Vector<Equipos> Rivales(int ganador){
//        Vector<Equipos> rivales = new Vector();
//        Vector<Equipos> totales = new Vector();
//        Vector<Equipos> locales = new Vector();
//        totales = Equipos();
//        locales = GanadorSuperLiga(ganador);
//        
//        for(int i=0;i<=10;i++){
//            for(int j=0;j<10;j++){
//                if(totales.elementAt(i).codigoEquipo != locales.elementAt(j).codigoEquipo){
//                    if(i>1){
//                        if((locales.elementAt(i).codigoEquipo == locales.elementAt(i-1).codigoEquipo)){
//                            rivales.add(totales.elementAt(i));
//                        }
//                    }
//                
//            }
//            }
//        }
//        return rivales;
//    }
    private Vector<Equipos> clasicos() {
        Vector<Equipos> equipos = new Vector();
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

        equipos.add(equipo3);
        equipos.add(equipo6);
        equipos.add(equipo9);
        equipos.add(equipo5);
        equipos.add(equipo20);
        equipos.add(equipo1);
        equipos.add(equipo7);
        equipos.add(equipo8);
        equipos.add(equipo17);
        equipos.add(equipo11);
        equipos.add(equipo4);
        equipos.add(equipo18);
        return equipos;
    }
    
        private double[][] distanciaOptima(){
//        Vector<Equipos> equipos = Equipos();
    
        double[][] distancias = new double[20][20];
        //FILA 0
        distancias[0][0] = 0;
        distancias[0][1] = 522.73;
        distancias[0][2] = 288.00;
        distancias[0][3] = 125.21;
        distancias[0][4] = 245.20;
        distancias[0][5] = 304.87;
        distancias[0][6] = 702.95;
        distancias[0][7] = 727.87;
        distancias[0][8] = 245.20;
        distancias[0][9] = 163.05;
        distancias[0][10] = 401.20;
        distancias[0][11] = 127.91;
        distancias[0][12] = 238.54;
        distancias[0][13] = 270.91;
        distancias[0][14] = 491.48;
        distancias[0][15] = 6.88;
        distancias[0][16] = 296.63;
        distancias[0][17] = 232.30;
        distancias[0][18] = 220.03;
        distancias[0][19] = 0;
        
        //FILA 1
        distancias[1][0] = 784.10;
        distancias[1][1] = 0.00;
        distancias[1][2] = 275.49;
        distancias[1][3] = 426.74;
        distancias[1][4] = 592.85;
        distancias[1][5] = 261.32;
        distancias[1][6] = 1115.87;
        distancias[1][7] = 1161.95;
        distancias[1][8] = 592.85;
        distancias[1][9] = 472.76;
        distancias[1][10] = 913.45;
        distancias[1][11] = 650.38;
        distancias[1][12] = 582.79;
        distancias[1][13] = 754.93;
        distancias[1][14] = 850.41;
        distancias[1][15] = 516.56;
        distancias[1][16] = 805.50;
        distancias[1][17] = 294.30;
        distancias[1][18] = 589.45;
        distancias[1][19] = 522.73;
        
        //FILA 2
        distancias[2][0] = 432.00;
        distancias[2][1] = 413.24;
        distancias[2][2] = 0.00;
        distancias[2][3] = 169.16;
        distancias[2][4] = 317.64;
        distancias[2][5] = 17.14;
        distancias[2][6] = 842.50;
        distancias[2][7] = 887.09;
        distancias[2][8] = 317.64;
        distancias[2][9] = 199.27;
        distancias[2][10] = 651.15;
        distancias[2][11] = 407.17;
        distancias[2][12] = 307.52;
        distancias[2][13] = 485.58;
        distancias[2][14] = 580.44;
        distancias[2][15] = 281.17;
        distancias[2][16] = 543.19;
        distancias[2][17] = 142.01;
        distancias[2][18] = 313.99;
        distancias[2][19] = 288.00;
        
        //FILA 3
        distancias[3][0] = 187.82;
        distancias[3][1] = 640.11;
        distancias[3][2] = 253.74;
        distancias[3][3] = 0.00;
        distancias[3][4] = 209.63;
        distancias[3][5] = 186.30;
        distancias[3][6] = 725.25;
        distancias[3][7] = 761.10;
        distancias[3][8] = 209.63;
        distancias[3][9] = 79.00;
        distancias[3][10] = 487.33;
        distancias[3][11] = 238.28;
        distancias[3][12] = 199.84;
        distancias[3][13] = 329.83;
        distancias[3][14] = 480.85;
        distancias[3][15] = 121.95;
        distancias[3][16] = 380.28;
        distancias[3][17] = 166.29;
        distancias[3][18] = 191.65;
        distancias[3][19] = 125.21;
        
        //FILA 4
        distancias[4][0] = 367.80;
        distancias[4][1] = 889.28;
        distancias[4][2] = 476.46;
        distancias[4][3] = 314.45;
        distancias[4][4] = 0.00;
        distancias[4][5] = 331.53;
        distancias[4][6] = 526.50;
        distancias[4][7] = 569.50;
        distancias[4][8] = 0.00;
        distancias[4][9] = 133.88;
        distancias[4][10] = 386.37;
        distancias[4][11] = 259.85;
        distancias[4][12] = 10.33;
        distancias[4][13] = 211.08;
        distancias[4][14] = 274.26;
        distancias[4][15] = 242.74;
        distancias[4][16] = 290.16;
        distancias[4][17] = 370.85;
        distancias[4][18] = 26.97;
        distancias[4][19] = 245.20;
        
        //FILA 5
        distancias[5][0] = 457.31;
        distancias[5][1] = 391.98;
        distancias[5][2] = 25.71;
        distancias[5][3] = 279.45;
        distancias[5][4] = 497.30;
        distancias[5][5] = 0.00;
        distancias[5][6] = 855.43;
        distancias[5][7] = 900.72;
        distancias[5][8] = 331.53;
        distancias[5][9] = 215.22;
        distancias[5][10] = 667.93;
        distancias[5][11] = 424.29;
        distancias[5][12] = 321.24;
        distancias[5][13] = 501.91;
        distancias[5][14] = 592.58;
        distancias[5][15] = 298.04;
        distancias[5][16] = 560.00;
        distancias[5][17] = 150.39;
        distancias[5][18] = 328.66;
        distancias[5][19] = 304.87;
        
        //FILA 6
        distancias[6][0] = 1054.43;
        distancias[6][1] = 1673.81;
        distancias[6][2] = 1263.75;
        distancias[6][3] = 1087.88;
        distancias[6][4] = 789.75;
        distancias[6][5] = 1283.15;
        distancias[6][6] = 0.00;
        distancias[6][7] = 71.88;
        distancias[6][8] = 526.50;
        distancias[6][9] = 657.11;
        distancias[6][10] = 421.01;
        distancias[6][11] = 619.58;
        distancias[6][12] = 536.80;
        distancias[6][13] = 440.70;
        distancias[6][14] = 270.78;
        distancias[6][15] = 704.74;
        distancias[6][16] = 460.21;
        distancias[6][17] = 890.14;
        distancias[6][18] = 535.26;
        distancias[6][19] = 702.95;
       
        //FILA 7
        distancias[7][0] = 1091.81;
        distancias[7][1] = 1742.93;
        distancias[7][2] = 1330.64;
        distancias[7][3] = 1141.65;
        distancias[7][4] = 854.25;
        distancias[7][5] = 1351.08;
        distancias[7][6] = 107.82;
        distancias[7][7] = 0.00;
        distancias[7][8] = 569.50;
        distancias[7][9] = 696.67;
        distancias[7][10] = 411.00;
        distancias[7][11] = 634.95;
        distancias[7][12] = 579.68;
        distancias[7][13] = 459.33;
        distancias[7][14] = 328.30;
        distancias[7][15] = 730.28;
        distancias[7][16] = 466.19;
        distancias[7][17] = 925.60;
        distancias[7][18] = 575.50;
        distancias[7][19] = 727.87;
       
        //FILA 8
        distancias[8][0] = 367.80;
        distancias[8][1] = 889.28;
        distancias[8][2] = 476.46;
        distancias[8][3] = 314.45;
        distancias[8][4] = 0.00;
        distancias[8][5] = 497.30;
        distancias[8][6] = 789.75;
        distancias[8][7] = 854.25;
        distancias[8][8] = 0.00;
        distancias[8][9] = 133.88;
        distancias[8][10] = 386.37;
        distancias[8][11] = 259.85;
        distancias[8][12] = 10.33;
        distancias[8][13] = 211.08;
        distancias[8][14] = 274.26;
        distancias[8][15] = 242.74;
        distancias[8][16] = 290.16;
        distancias[8][17] = 370.85;
        distancias[8][18] = 26.97;
        distancias[8][19] = 245.20;
        
        //FILA 9
        distancias[9][0] = 244.58;
        distancias[9][1] = 709.14;
        distancias[9][2] = 298.91;
        distancias[9][3] = 118.50;
        distancias[9][4] = 200.82;
        distancias[9][5] = 322.83;
        distancias[9][6] = 985.67;
        distancias[9][7] = 1045.01;
        distancias[9][8] = 200.82;
        distancias[9][9] = 0.00;
        distancias[9][10] = 456.65;
        distancias[9][11] = 242.64;
        distancias[9][12] = 123.74;
        distancias[9][13] = 287.32;
        distancias[9][14] = 408.14;
        distancias[9][15] = 157.65;
        distancias[9][16] = 349.75;
        distancias[9][17] = 237.00;
        distancias[9][18] = 121.86;
        distancias[9][19] = 163.05;
        
        //FILA 10
        distancias[10][0] = 601.53;
        distancias[10][1] = 1370.18;
        distancias[10][2] = 976.73;
        distancias[10][3] = 731.00;
        distancias[10][4] = 579.56;
        distancias[10][5] = 1001.90;
        distancias[10][6] = 631.52;
        distancias[10][7] = 616.50;
        distancias[10][8] = 579.56;
        distancias[10][9] = 684.98;
        distancias[10][10] = 0.00;
        distancias[10][11] = 277.99;
        distancias[10][12] = 392.24;
        distancias[10][13] = 175.82;
        distancias[10][14] = 377.09;
        distancias[10][15] = 406.08;
        distancias[10][16] = 108.16;
        distancias[10][17] = 631.32;
        distancias[10][18] = 371.68;
        distancias[10][19] = 401.20;
        
        //FILA 11
        distancias[11][0] = 191.87;
        distancias[11][1] = 975.57;
        distancias[11][2] = 610.76;
        distancias[11][3] = 357.42;
        distancias[11][4] = 389.78;
        distancias[11][5] = 636.44;
        distancias[11][6] = 929.37;
        distancias[11][7] = 952.43;
        distancias[11][8] = 389.78;
        distancias[11][9] = 363.96;
        distancias[11][10] = 416.99;
        distancias[11][11] = 0.00;
        distancias[11][12] = 257.90;
        distancias[11][13] = 179.36;
        distancias[11][14] = 445.86;
        distancias[11][15] = 133.92;
        distancias[11][16] = 179.24;
        distancias[11][17] = 360.03;
        distancias[11][18] = 233.28;
        distancias[11][19] = 127.91;
        
        //FILA 12
        distancias[12][0] = 357.81;
        distancias[12][1] = 874.19;
        distancias[12][2] = 461.28;
        distancias[12][3] = 299.76;
        distancias[12][4] = 15.50;
        distancias[12][5] = 481.86;
        distancias[12][6] = 805.20;
        distancias[12][7] = 869.52;
        distancias[12][8] = 15.50;
        distancias[12][9] = 185.61;
        distancias[12][10] = 588.36;
        distancias[12][11] = 386.85;
        distancias[12][12] = 0.00;
        distancias[12][13] = 216.60;
        distancias[12][14] = 284.42;
        distancias[12][15] = 235.86;
        distancias[12][16] = 294.75;
        distancias[12][17] = 360.74;
        distancias[12][18] = 25.13;
        distancias[12][19] = 238.54;
        
        //FILA 13
        distancias[13][0] = 406.37;
        distancias[13][1] = 1132.40;
        distancias[13][2] = 728.37;
        distancias[13][3] = 494.75;
        distancias[13][4] = 316.62;
        distancias[13][5] = 752.87;
        distancias[13][6] = 661.05;
        distancias[13][7] = 689.00;
        distancias[13][8] = 316.62;
        distancias[13][9] = 430.98;
        distancias[13][10] = 263.73;
        distancias[13][11] = 269.04;
        distancias[13][12] = 324.90;
        distancias[13][13] = 0.00;
        distancias[13][14] = 282.83;
        distancias[13][15] = 274.02;
        distancias[13][16] = 82.84;
        distancias[13][17] = 486.01;
        distancias[13][18] = 195.86;
        distancias[13][19] = 270.91;
        
        //FILA 14
        distancias[14][0] = 737.22;
        distancias[14][1] = 1275.62;
        distancias[14][2] = 870.66;
        distancias[14][3] = 721.28;
        distancias[14][4] = 411.39;
        distancias[14][5] = 888.87;
        distancias[14][6] = 406.17;
        distancias[10][7] = 492.45;
        distancias[14][8] = 411.39;
        distancias[14][9] = 612.21;
        distancias[14][10] = 565.64;
        distancias[14][11] = 668.79;
        distancias[14][12] = 426.63;
        distancias[14][13] = 424.25;
        distancias[14][14] = 0.00;
        distancias[14][15] = 491.57;
        distancias[14][16] = 346.22;
        distancias[14][17] = 645.11;
        distancias[14][18] = 289.63;
        distancias[14][19] = 491.48;
        
        //FILA 15
        distancias[15][0] = 10.32;
        distancias[15][1] = 774.84;
        distancias[15][2] = 421.76;
        distancias[15][3] = 182.93;
        distancias[15][4] = 364.11;
        distancias[15][5] = 447.06;
        distancias[15][6] = 1057.11;
        distancias[15][7] = 1095.42;
        distancias[15][8] = 364.11;
        distancias[15][9] = 236.48;
        distancias[15][10] = 609.12;
        distancias[15][11] = 200.88;
        distancias[15][12] = 353.79;
        distancias[15][13] = 411.03;
        distancias[15][14] = 737.36;
        distancias[15][15] = 0.00;
        distancias[15][16] = 301.31;
        distancias[15][17] = 226.61;
        distancias[15][18] = 217.84;
        distancias[15][19] = 6.88;
        
        //FILA 16
        distancias[16][0] = 444.95;
        distancias[16][1] = 1208.25;
        distancias[16][2] = 814.79;
        distancias[14][3] = 570.42;
        distancias[16][4] = 435.24;
        distancias[16][5] = 840.00;
        distancias[16][6] = 690.32;
        distancias[16][7] = 699.29;
        distancias[16][8] = 435.24;
        distancias[16][9] = 524.63;
        distancias[16][10] = 162.24;
        distancias[16][11] = 268.86;
        distancias[16][12] = 442.13;
        distancias[16][13] = 124.26;
        distancias[16][14] = 519.33;
        distancias[16][15] = 451.97;
        distancias[16][16] = 0.00;
        distancias[16][17] = 524.96;
        distancias[16][18] = 272.42;
        distancias[16][19] = 296.63;
        
        //FILA 17
        distancias[17][0] = 348.45;
        distancias[17][1] = 441.45;
        distancias[17][2] = 213.02;
        distancias[17][3] = 249.44;
        distancias[17][4] = 556.28;
        distancias[17][5] = 225.59;
        distancias[17][6] = 1335.21;
        distancias[17][7] = 1388.40;
        distancias[17][8] = 556.28;
        distancias[17][9] = 355.50;
        distancias[17][10] = 946.98;
        distancias[17][11] = 540.05;
        distancias[17][12] = 541.11;
        distancias[17][13] = 729.02;
        distancias[17][14] = 967.67;
        distancias[17][15] = 339.92;
        distancias[17][16] = 787.44;
        distancias[17][17] = 0.00;
        distancias[17][18] = 357.17;
        distancias[17][19] = 232.30;
        
        //FILA 18
        distancias[18][0] = 330.05;
        distancias[18][1] = 884.18;
        distancias[18][2] = 470.99;
        distancias[18][3] = 287.48;
        distancias[18][4] = 40.46;
        distancias[18][5] = 492.99;
        distancias[18][6] = 802.89;
        distancias[18][7] = 863.25;
        distancias[18][8] = 40.46;
        distancias[18][9] = 182.79;
        distancias[18][10] = 557.52;
        distancias[18][11] = 349.92;
        distancias[18][12] = 37.70;
        distancias[18][13] = 293.79;
        distancias[18][14] = 434.45;
        distancias[18][15] = 326.76;
        distancias[18][16] = 408.63;
        distancias[18][17] = 535.76;
        distancias[18][18] = 0.00;
        distancias[18][19] = 220.03;
        
        //FILA 19
        distancias[19][0] = 0.00;
        distancias[19][1] = 784.10;
        distancias[19][2] = 432.00;
        distancias[19][3] = 187.82;
        distancias[19][4] = 367.80;
        distancias[19][5] = 457.31;
        distancias[19][6] = 1054.43;
        distancias[19][7] = 1091.81;
        distancias[19][8] = 367.80;
        distancias[19][9] = 244.58;
        distancias[19][10] = 601.80;
        distancias[19][11] = 191.87;
        distancias[19][12] = 357.81;
        distancias[19][13] = 406.37;
        distancias[19][14] = 737.22;
        distancias[19][15] = 10.32;
        distancias[19][16] = 444.95;
        distancias[19][17] = 348.45;
        distancias[19][18] = 330.05;
        distancias[19][19] = 0.00;
        
//        for(int col=0; col<20;col++){
//            for(int fil=0; fil<20;fil++){
//                for(int iter=0; iter<20;iter++){
//                    if(equipos.get(fil).codigoEquipo == distancias[fil][0]){
//                        
//                    }
//                }
//            }
//        }
        
        return distancias;
    }
        
    
    public void equiposdistancia(Vector<Equipos> ganador) {
        int FILAS = 19;
        int COLS = 20;
        double total = 0;
        Equipos matriz[][] = new Equipos[FILAS][COLS];
        
        double distancia[][];
        
        distancia = distanciaOptima();

        int fecha = 1;
        double sum = 0;
        System.out.println("El ganador de la Super Liga es " + ganador.elementAt(0).nombreEquipo);
        for (int fil = 0; fil < FILAS; fil++) {
            for (int col = 0; col < COLS; col++) {
                //si es la primera fila
                if (fil == 0) {
                    matriz[fil][col] = ganador.elementAt(col);
                    
                } //si no, si es la primera columna
                else if (col == 0) {
                    matriz[fil][col] = matriz[fil - 1][COLS - 1];
                } // para el resto de casos
                else {
                    matriz[fil][col] = matriz[fil - 1][col - 1];
                }
            }
        }
        System.out.println("PRIMERA TEMPORADA.");
        for (int i = 0; i < FILAS; i++) {
            System.out.print("\n");
            System.out.println("\033[0;1m" + "Fecha " + fecha);
            for (int j = 0; j < COLS; j++) {
                if (j % 2 != 1) {
                    System.out.print("@" + matriz[i][j].acronimo + " ");
                } else {

                    System.out.print(matriz[0][j].acronimo + " ");
                    //System.out.print(equipos.elementAt(rnd.nextInt(equipos.size())).acronimo);

                }
                if (j % 2 != 1) {
                    System.out.print(" vs ");
                }
                if (j % 2 == 1) {
                    System.out.print("|");
                    System.out.println(" La distancia recorrida fue: " + distancia[i][j] + "Kms");
                    sum = sum + distancia[i][j];
                    total = total + sum;
                }
                
                if (j == 19) {
                    System.out.println("El recorrido total fue de: " + sum + " en esta fecha");
                    sum = 0;
                }
                        
            }
            System.out.println();
            fecha++;
        }
        System.out.println("El recorrido total de la primera temporada fue de: " + total + " kms");
    }
     
    public void equiposdistancia2(Vector<Equipos> ganador) {
        int FILAS = 19;
        int COLS = 20;
        double total = 0;
        Equipos matriz[][] = new Equipos[FILAS][COLS];
        double distancia[][];
        
        double sum=0;
        
        distancia = distanciaOptima();

        int fecha = 1;
        for (int fil = 0; fil < FILAS; fil++) {
            for (int col = 0; col < COLS; col++) {
                //si es la primera fila
                if (fil == 0) {
                    matriz[fil][col] = ganador.elementAt(col);
                } //si no, si es la primera columna
                else if (col == 0) {
                    matriz[fil][col] = matriz[fil - 1][COLS - 1];
                } // para el resto de casos
                else {
                    matriz[fil][col] = matriz[fil - 1][col - 1];
                }
            }
        }
        System.out.println("SEGUNDA TEMPORADA.");
        for (int i = 0; i < FILAS; i++) {
            System.out.print("\n");
            System.out.println("\033[0;1m" + "Fecha " + fecha);
            for (int j = 0; j < COLS; j++) {
                if (j % 2 != 1) {
                    System.out.print(matriz[i][j].acronimo + " ");
                } else {

                    System.out.print("@" + matriz[0][j].acronimo + " ");
                    //System.out.print("@" + equipos.elementAt(rnd.nextInt(equipos.size())).acronimo);

                }
                if (j % 2 != 1) {
                    System.out.print(" vs ");
                }
                if (j % 2 == 1) {
                    System.out.print("|");
                    System.out.println(" La distancia recorrida fue: " + distancia[i][j] + "Kms");
                    sum = sum + distancia[i][j];
                    total = total + sum;
                }
                
                if (j == 19) {
                    System.out.println("El recorrido total fue de: " + sum + " en esta fecha");
                    sum = 0;
                }
            }
            System.out.println();
            fecha++;
        }
        System.out.println("El recorrido total de la segunda temporada fue de: " + total + " kms");
    }
    
    
    public void distanciaOptima(Vector<Equipos> ganador) {
        int FILAS = 19;
        int COLS = 20;
        double total = 0;
        double total1 = 0;
        double total2 = 0;
        double total3 = 0;
        double total4 = 0;
        double respuestatotal=0;
        Equipos matriz[][] = new Equipos[FILAS][COLS];
        
        double distancia[][];
        
        distancia = distanciaOptima();

        int fecha = 1;
        int fecha2 = 1;
        double sum = 0;
        
        Random rnd = new Random();
        System.out.println("El ganador de la Super Liga es " + ganador.elementAt(0).nombreEquipo);
        for (int fil = 0; fil < FILAS; fil++) {
            for (int col = 0; col < COLS; col++) {
                //si es la primera fila
                if (fil == 0) {
                    matriz[fil][col] = ganador.elementAt(col);
                    
                } //si no, si es la primera columna
                else if (col == 0) {
                    matriz[fil][col] = matriz[fil - 1][COLS - 1];
                } // para el resto de casos
                else {
                    matriz[fil][col] = matriz[fil - 1][col - 1];
                }
            }
        }
        System.out.println("PRIMERA TEMPORADA.");
        fecha = 1;
        total = 0;
        for (int i = 0; i < FILAS; i++) {
            System.out.print("\n");
            System.out.println("\033[0;1m" + "Fecha " + fecha);
            for (int j = 0; j < COLS; j++) {
                if (j % 2 != 1) {
                    System.out.print("@" + matriz[i][j].acronimo + " ");
                } else {

                    System.out.print(matriz[0][j].acronimo + " ");
                    //System.out.print(equipos.elementAt(rnd.nextInt(equipos.size())).acronimo);

                }
                if (j % 2 != 1) {
                    System.out.print(" vs ");
                }
                if (j % 2 == 1) {
                    System.out.print("|");
                    System.out.println(" La distancia recorrida fue: " + distancia[10][j] + "Kms");
                    sum = sum + distancia[10][j];
                    total = total + sum;
                }
                
                if (j == 19) {
                    System.out.println("El recorrido total fue de: " + sum + " en esta fecha");
                    sum = 0;
                }
                        
            }
            System.out.println();
            fecha++;
        }
        System.out.println("El recorrido total de la primera temporada fue de: " + total + " kms");
        
        for (int fil = 0; fil < FILAS; fil++) {
            for (int col = 0; col < COLS; col++) {
                //si es la primera fila
                if (fil == 0) {
                    matriz[fil][col] = ganador.elementAt(col);
                } //si no, si es la primera columna
                else if (col == 0) {
                    matriz[fil][col] = matriz[fil - 1][COLS - 1];
                } // para el resto de casos
                else {
                    matriz[fil][col] = matriz[fil - 1][col - 1];
                }
            }
        }
        System.out.println("SEGUNDA TEMPORADA.");
        fecha2 = 1;
        total = 1;
        for (int i = 0; i < FILAS; i++) {
            System.out.print("\n");
            System.out.println("\033[0;1m" + "Fecha " + fecha2);
            for (int j = 0; j < COLS; j++) {
                if (j % 2 != 1) {
                    System.out.print(matriz[i][j].acronimo + " ");
                } else {

                    System.out.print("@" + matriz[0][j].acronimo + " ");
                    //System.out.print("@" + equipos.elementAt(rnd.nextInt(equipos.size())).acronimo);

                }
                if (j % 2 != 1) {
                    System.out.print(" vs ");
                }
                if (j % 2 == 1) {
                    System.out.print("|");
                    System.out.println(" La distancia recorrida fue: " + distancia[10][j] + "Kms");
                    sum = sum + distancia[10][j];
                    total = total + sum;
                }
                
                if (j == 19) {
                    System.out.println("El recorrido total fue de: " + sum + " en esta fecha");
                    sum = 0;
                }
            }
            System.out.println();
            fecha2++;
        }
        System.out.println("El recorrido total de la segunda temporada fue de: " + total + " kms");
        
        
        
        
        System.out.println("PRIMERA TEMPORADA.");
        fecha = 1;
        total1 = 0;
        for (int i = 0; i < FILAS; i++) {
            System.out.print("\n");
            System.out.println("\033[0;1m" + "Fecha " + fecha);
            for (int j = 0; j < COLS; j++) {
                if (j % 2 != 1) {
                    System.out.print("@" + matriz[i][j].acronimo + " ");
                } else {

                    System.out.print(matriz[0][j].acronimo + " ");
                    //System.out.print(equipos.elementAt(rnd.nextInt(equipos.size())).acronimo);

                }
                if (j % 2 != 1) {
                    System.out.print(" vs ");
                }
                if (j % 2 == 1) {
                    System.out.print("|");
                    System.out.println(" La distancia recorrida fue: " + distancia[5][j] + "Kms");
                    sum = sum + distancia[5][j];
                    total1 = total1 + sum;
                }
                
                if (j == 19) {
                    System.out.println("El recorrido total fue de: " + sum + " en esta fecha");
                    sum = 0;
                }
                        
            }
            System.out.println();
            fecha++;
        }
        System.out.println("El recorrido total de la primera temporada fue de: " + total1 + " kms");
        
        for (int fil = 0; fil < FILAS; fil++) {
            for (int col = 0; col < COLS; col++) {
                //si es la primera fila
                if (fil == 0) {
                    matriz[fil][col] = ganador.elementAt(col);
                } //si no, si es la primera columna
                else if (col == 0) {
                    matriz[fil][col] = matriz[fil - 1][COLS - 1];
                } // para el resto de casos
                else {
                    matriz[fil][col] = matriz[fil - 1][col - 1];
                }
            }
        }
        System.out.println("SEGUNDA TEMPORADA.");
        fecha2 = 1;
        total1 = 0;
        for (int i = 0; i < FILAS; i++) {
            System.out.print("\n");
            System.out.println("\033[0;1m" + "Fecha " + fecha2);
            for (int j = 0; j < COLS; j++) {
                if (j % 2 != 1) {
                    System.out.print(matriz[i][j].acronimo + " ");
                } else {

                    System.out.print("@" + matriz[0][j].acronimo + " ");
                    //System.out.print("@" + equipos.elementAt(rnd.nextInt(equipos.size())).acronimo);

                }
                if (j % 2 != 1) {
                    System.out.print(" vs ");
                }
                if (j % 2 == 1) {
                    System.out.print("|");
                    System.out.println(" La distancia recorrida fue: " + distancia[5][j] + "Kms");
                    sum = sum + distancia[5][j];
                    total1 = total1 + sum;
                }
                
                if (j == 19) {
                    System.out.println("El recorrido total fue de: " + sum + " en esta fecha");
                    sum = 0;
                }
            }
            System.out.println();
            fecha2++;
        }
        System.out.println("El recorrido total de la segunda temporada fue de: " + total1 + " kms");
        
        
        
        
        System.out.println("PRIMERA TEMPORADA.");
        fecha = 1;
        total2 = 0;
        for (int i = 0; i < FILAS; i++) {
            System.out.print("\n");
            System.out.println("\033[0;1m" + "Fecha " + fecha);
            for (int j = 0; j < COLS; j++) {
                if (j % 2 != 1) {
                    System.out.print("@" + matriz[i][j].acronimo + " ");
                } else {

                    System.out.print(matriz[0][j].acronimo + " ");
                    //System.out.print(equipos.elementAt(rnd.nextInt(equipos.size())).acronimo);

                }
                if (j % 2 != 1) {
                    System.out.print(" vs ");
                }
                if (j % 2 == 1) {
                    System.out.print("|");
                    System.out.println(" La distancia recorrida fue: " + distancia[6][j] + "Kms");
                    sum = sum + distancia[6][j];
                    total2 = total2 + sum;
                }
                
                if (j == 19) {
                    System.out.println("El recorrido total fue de: " + sum + " en esta fecha");
                    sum = 0;
                }
                        
            }
            System.out.println();
            fecha++;
        }
        System.out.println("El recorrido total de la primera temporada fue de: " + total2 + " kms");
        
        for (int fil = 0; fil < FILAS; fil++) {
            for (int col = 0; col < COLS; col++) {
                //si es la primera fila
                if (fil == 0) {
                    matriz[fil][col] = ganador.elementAt(col);
                } //si no, si es la primera columna
                else if (col == 0) {
                    matriz[fil][col] = matriz[fil - 1][COLS - 1];
                } // para el resto de casos
                else {
                    matriz[fil][col] = matriz[fil - 1][col - 1];
                }
            }
        }
        System.out.println("SEGUNDA TEMPORADA.");
        fecha2 = 1;
        total2 = 0;
        for (int i = 0; i < FILAS; i++) {
            System.out.print("\n");
            System.out.println("\033[0;1m" + "Fecha " + fecha2);
            for (int j = 0; j < COLS; j++) {
                if (j % 2 != 1) {
                    System.out.print(matriz[i][j].acronimo + " ");
                } else {

                    System.out.print("@" + matriz[0][j].acronimo + " ");
                    //System.out.print("@" + equipos.elementAt(rnd.nextInt(equipos.size())).acronimo);

                }
                if (j % 2 != 1) {
                    System.out.print(" vs ");
                }
                if (j % 2 == 1) {
                    System.out.print("|");
                    System.out.println(" La distancia recorrida fue: " + distancia[6][j] + "Kms");
                    sum = sum + distancia[6][j];
                    total2 = total2 + sum;
                }
                
                if (j == 19) {
                    System.out.println("El recorrido total fue de: " + sum + " en esta fecha");
                    sum = 0;
                }
            }
            System.out.println();
            fecha2++;
        }
        System.out.println("El recorrido total de la segunda temporada fue de: " + total2 + " kms");
        
        
        
        
        System.out.println("PRIMERA TEMPORADA.");
        fecha = 1;
        total3 = 0;
        for (int i = 0; i < FILAS; i++) {
            System.out.print("\n");
            System.out.println("\033[0;1m" + "Fecha " + fecha);
            for (int j = 0; j < COLS; j++) {
                if (j % 2 != 1) {
                    System.out.print("@" + matriz[i][j].acronimo + " ");
                } else {

                    System.out.print(matriz[0][j].acronimo + " ");
                    //System.out.print(equipos.elementAt(rnd.nextInt(equipos.size())).acronimo);

                }
                if (j % 2 != 1) {
                    System.out.print(" vs ");
                }
                if (j % 2 == 1) {
                    System.out.print("|");
                    System.out.println(" La distancia recorrida fue: " + distancia[7][j] + "Kms");
                    sum = sum + distancia[7][j];
                    total3 = total3 + sum;
                }
                
                if (j == 19) {
                    System.out.println("El recorrido total fue de: " + sum + " en esta fecha");
                    sum = 0;
                }
                        
            }
            System.out.println();
            fecha++;
        }
        System.out.println("El recorrido total de la primera temporada fue de: " + total3 + " kms");
        
        for (int fil = 0; fil < FILAS; fil++) {
            for (int col = 0; col < COLS; col++) {
                //si es la primera fila
                if (fil == 0) {
                    matriz[fil][col] = ganador.elementAt(col);
                } //si no, si es la primera columna
                else if (col == 0) {
                    matriz[fil][col] = matriz[fil - 1][COLS - 1];
                } // para el resto de casos
                else {
                    matriz[fil][col] = matriz[fil - 1][col - 1];
                }
            }
        }
        System.out.println("SEGUNDA TEMPORADA.");
        fecha2 = 1;
        total3 = 0;
        for (int i = 0; i < FILAS; i++) {
            System.out.print("\n");
            System.out.println("\033[0;1m" + "Fecha " + fecha2);
            for (int j = 0; j < COLS; j++) {
                if (j % 2 != 1) {
                    System.out.print(matriz[i][j].acronimo + " ");
                } else {

                    System.out.print("@" + matriz[0][j].acronimo + " ");
                    //System.out.print("@" + equipos.elementAt(rnd.nextInt(equipos.size())).acronimo);

                }
                if (j % 2 != 1) {
                    System.out.print(" vs ");
                }
                if (j % 2 == 1) {
                    System.out.print("|");
                    System.out.println(" La distancia recorrida fue: " + distancia[7][j] + "Kms");
                    sum = sum + distancia[7][j];
                    total3 = total3 + sum;
                }
                
                if (j == 19) {
                    System.out.println("El recorrido total fue de: " + sum + " en esta fecha");
                    sum = 0;
                }
            }
            System.out.println();
            fecha2++;
        }
        System.out.println("El recorrido total de la segunda temporada fue de: " + total3 + " kms");
        
        
        
        
        System.out.println("PRIMERA TEMPORADA.");
        fecha = 1;
        total4 = 0;
        for (int i = 0; i < FILAS; i++) {
            System.out.print("\n");
            System.out.println("\033[0;1m" + "Fecha " + fecha);
            for (int j = 0; j < COLS; j++) {
                if (j % 2 != 1) {
                    System.out.print("@" + matriz[i][j].acronimo + " ");
                } else {

                    System.out.print(matriz[0][j].acronimo + " ");
                    //System.out.print(equipos.elementAt(rnd.nextInt(equipos.size())).acronimo);

                }
                if (j % 2 != 1) {
                    System.out.print(" vs ");
                }
                if (j % 2 == 1) {
                    System.out.print("|");
                    System.out.println(" La distancia recorrida fue: " + distancia[8][j] + "Kms");
                    sum = sum + distancia[8][j];
                    total4 = total4 + sum;
                }
                
                if (j == 19) {
                    System.out.println("El recorrido total fue de: " + sum + " en esta fecha");
                    sum = 0;
                }
                        
            }
            System.out.println();
            fecha++;
        }
        System.out.println("El recorrido total de la primera temporada fue de: " + total4 + " kms");
        
        for (int fil = 0; fil < FILAS; fil++) {
            for (int col = 0; col < COLS; col++) {
                //si es la primera fila
                if (fil == 0) {
                    matriz[fil][col] = ganador.elementAt(col);
                } //si no, si es la primera columna
                else if (col == 0) {
                    matriz[fil][col] = matriz[fil - 1][COLS - 1];
                } // para el resto de casos
                else {
                    matriz[fil][col] = matriz[fil - 1][col - 1];
                }
            }
        }
        System.out.println("SEGUNDA TEMPORADA.");
        fecha2 = 1;
        total4 = 0;
        for (int i = 0; i < FILAS; i++) {
            System.out.print("\n");
            System.out.println("\033[0;1m" + "Fecha " + fecha2);
            for (int j = 0; j < COLS; j++) {
                if (j % 2 != 1) {
                    System.out.print(matriz[i][j].acronimo + " ");
                } else {

                    System.out.print("@" + matriz[0][j].acronimo + " ");
                    //System.out.print("@" + equipos.elementAt(rnd.nextInt(equipos.size())).acronimo);

                }
                if (j % 2 != 1) {
                    System.out.print(" vs ");
                }
                if (j % 2 == 1) {
                    System.out.print("|");
                    System.out.println(" La distancia recorrida fue: " + distancia[8][j] + "Kms");
                    sum = sum + distancia[8][j];
                    total4 = total4 + sum;
                }
                
                if (j == 19) {
                    System.out.println("El recorrido total fue de: " + sum + " en esta fecha");
                    sum = 0;
                }
            }
            System.out.println();
            fecha2++;
        }
        System.out.println("El recorrido total de la segunda temporada fue de: " + total4 + " kms");
        System.out.println();
        
        
        if(total <= total1 && total <= total2 && total <= total3 && total <= total4){
            respuestatotal = total;
            System.out.println("Primer fixture: " + total*2);
        }
        if(total1 <= total && total1 <= total2 && total1 <= total3 && total1 <= total4){
            respuestatotal = total1;
            System.out.println("Segundo fixture: " + total1*2);
        }
        if(total2 <= total1 && total2 <= total1 && total2 <= total3 && total2 <= total4){
            respuestatotal = total2;
            System.out.println("Tercer fixture: " + total2*2);
        }
        if(total3 <= total1 && total3 <= total2 && total3 <= total1 && total3 <= total4){
            respuestatotal = total3;
            System.out.println("Cuarto fixture: " + total3);
        }
        if(total4 <= total1 && total4 <= total2 && total4 <= total3 && total4 <= total1){
            respuestatotal = total4;
            System.out.println("Quinto fixture: " + total4*2);
        }
        
        System.out.println("El mejor valor es el: " + respuestatotal*2);
    }
}
