/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ragnargame;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KPS
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Plan
     */
    public Menu() {

        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 710));
        setSize(new java.awt.Dimension(1200, 710));
        getContentPane().setLayout(null);

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(450, 200, 290, 80);

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(450, 310, 290, 80);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ragnargame2/Menu_Edition.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1194, 663);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Name n  = new Name();
        n.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        try {
            readFile();
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel3MouseClicked
    private void readFile() throws IOException {
        
        Castle castle1 =null;
        Castle castle2 = null;
        ArrayList<Hero> heroes = new ArrayList<>();

        File file = new File("lastGame.txt");
        file.createNewFile();

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String str;
        while ((str = br.readLine()) != null) {

            String[] line = str.split(" ");
            if (line[0].equals("T1")) {
                Name.Team1  = line[1];
                int team1_score = 0;
                team1_score = Integer.parseInt(line[2]);

            } else if (line[0].equals("T2")) {
                Name.Team2 = line[1];
                int team2_score = 0;
                team2_score = Integer.parseInt(line[2]);

            } else if (line[0].equals("C1")) {
                castle1 = new Castle(Integer.parseInt(line[1]), Integer.parseInt(line[2]));
                castle1.setHealth(Integer.parseInt(line[3]));
                
            } else if (line[0].equals("C2")) {
                castle2 = new Castle(Integer.parseInt(line[1]), Integer.parseInt(line[2]));
                castle2.setHealth(Integer.parseInt(line[3]));
                
            } else {

                Hero hero = null;
                if (line[0].equals("Ice")) {
                    hero = new Ice(line[1], Integer.parseInt(line[2]), Integer.parseInt(line[3]));

                } else if (line[0].equals("Fire")) {
                    hero = new Fire(line[1], Integer.parseInt(line[2]), Integer.parseInt(line[3]));

                } else if (line[0].equals("Wind")) {
                    hero = new Wind(line[1], Integer.parseInt(line[2]), Integer.parseInt(line[3]));

                } else if (line[0].equals("Soil")) {
                    hero = new Soil(line[1], Integer.parseInt(line[2]), Integer.parseInt(line[3]));

                }

                hero.setHealth(Integer.parseInt(line[4]));
                hero.setScore(Integer.parseInt(line[5]));
                heroes.add(hero);
            }

        }
        
        br.close();
        fr.close();
        /*
        for(Hero h : heroes)
            System.out.println(h);
        */
        Game game = new Game(castle1, castle2, heroes);
        game.setVisible(true);
        
    }
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}