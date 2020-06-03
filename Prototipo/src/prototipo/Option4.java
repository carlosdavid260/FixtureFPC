/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipo;

import java.util.Random;
import java.util.Vector;
import static prototipo.Prototipo.Equipos;

/**
 *
 * @author Carlos
 */
public class Option4 extends javax.swing.JFrame {

    /**
     * Creates new form Option4
     */
    public Option4() {
        initComponents();
        this.setLocationRelativeTo(null);
        ganadorLiga a = new ganadorLiga();
        
        int ganador = Integer.parseInt(a.texto);
        
        
        
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
        
        int FILAS = 19;
        int COLS = 20;
        Equipos matriz[][] = new Equipos[FILAS][COLS];
        Random rnd = new Random();

        int fecha = 1;
        Salida.append("El ganador de la Super Liga es " + equiposOrganizados.elementAt(0).nombreEquipo);
        for (int fil = 0; fil < FILAS; fil++) {
            for (int col = 0; col < COLS; col++) {
                //si es la primera fila
                if (fil == 0) {
                    matriz[fil][col] = equiposOrganizados.elementAt(col);
                } //si no, si es la primera columna
                else if (col == 0) {
                    matriz[fil][col] = matriz[fil - 1][COLS - 1];
                } // para el resto de casos
                else {
                    matriz[fil][col] = matriz[fil - 1][col - 1];
                }
            }
        }
        Salida.append("\nPRIMERA TEMPORADA.");
        for (int i = 0; i < FILAS; i++) {
            Salida.append("\n");
            Salida.append("Fecha " + fecha + "\n");
            for (int j = 0; j < COLS; j++) {
                if (j % 2 != 1) {
                    Salida.append("@" + matriz[i][j].acronimo + " ");
                } else {

                    Salida.append(matriz[0][j].acronimo + " ");
                    //System.out.print(equipos.elementAt(rnd.nextInt(equipos.size())).acronimo);

                }
                if (j % 2 != 1) {
                    Salida.append(" vs ");
                }
                if (j % 2 == 1) {
                    Salida.append("|");
                }
            }
            Salida.append("\n");
            fecha++;
        }
        Salida.append("\n\n");
        
        int FILAS2 = 19;
        int COLS2 = 20;

        int fecha2 = 1;
        for (int fil = 0; fil < FILAS2; fil++) {
            for (int col = 0; col < COLS2; col++) {
                //si es la primera fila
                if (fil == 0) {
                    matriz[fil][col] = equiposOrganizados.elementAt(col);
                } //si no, si es la primera columna
                else if (col == 0) {
                    matriz[fil][col] = matriz[fil - 1][COLS - 1];
                } // para el resto de casos
                else {
                    matriz[fil][col] = matriz[fil - 1][col - 1];
                }
            }
        }
        Salida.append("SEGUNDA TEMPORADA.\n");
        for (int i = 0; i < FILAS; i++) {
            Salida.append("\n\n");
            Salida.append("Fecha " + fecha2 + "\n");
            for (int j = 0; j < COLS; j++) {
                if (j % 2 != 1) {
                    Salida.append(matriz[i][j].acronimo + " ");
                } else {

                    Salida.append("@" + matriz[0][j].acronimo + " ");
                    //System.out.print("@" + equipos.elementAt(rnd.nextInt(equipos.size())).acronimo);

                }
                if (j % 2 != 1) {
                    Salida.append(" vs ");
                }
                if (j % 2 == 1) {
                    Salida.append("|");
                }
            }
            Salida.append("\n");
            fecha2++;
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Salida = new javax.swing.JTextArea();
        boton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Se ha realizado con éxito el cuadrado latino");

        Salida.setColumns(20);
        Salida.setRows(5);
        jScrollPane1.setViewportView(Salida);

        boton.setText("Continuar");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(boton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel2)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(boton)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
        // TODO add your handling code here:
        
        Interface ventana = new Interface();
        ventana.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_botonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Option4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Option4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Option4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Option4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Option4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Salida;
    private javax.swing.JButton boton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}