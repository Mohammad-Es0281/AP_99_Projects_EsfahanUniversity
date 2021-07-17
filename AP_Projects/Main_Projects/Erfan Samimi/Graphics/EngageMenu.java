package Main.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Main.Building.*;
import Main.Main;

import javax.swing.*;

/**
 *
 * @author erfan
 */
public class EngageMenu extends javax.swing.JFrame {

    /**
     * Creates new form EngageMenu
     */
    public EngageMenu() {
        initComponents();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        pilotButton = new javax.swing.JButton();
        driverButton = new javax.swing.JButton();
        sailorButton = new javax.swing.JButton();
        locoDriverButton = new javax.swing.JButton();
        attendanteButton = new javax.swing.JButton();
        employeeButton = new javax.swing.JButton();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        pilotButton.setText("Pilot");
        pilotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilotButtonActionPerformed(evt);
            }
        });

        driverButton.setText("Driver");
        driverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driverButtonActionPerformed(evt);
            }
        });

        sailorButton.setText("Sailor");
        sailorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sailorButtonActionPerformed(evt);
            }
        });

        locoDriverButton.setText("Locomotive Driver");
        locoDriverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locoDriverButtonActionPerformed(evt);
            }
        });

        attendanteButton.setText("Flight Attendant");
        attendanteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendantsButtonActionPerformed(evt);
            }
        });

        employeeButton.setText("Employee");
        employeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pilotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(locoDriverButton, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(driverButton, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(attendanteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(employeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sailorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(pilotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(driverButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sailorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(locoDriverButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(attendanteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(employeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void pilotButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        dispose();

        new EngagePerson<Airport>("pilot" , Main.selectedCity.getCityAirportList());
    }

    private void driverButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        dispose();

        new EngagePerson<Bus_Terminal>("driver" , Main.selectedCity.getCityBusTerminalList());
    }

    private void sailorButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        dispose();

        new EngagePerson<ShippingPort>("sailor" , Main.selectedCity.getCityShippingPortList());
    }

    private void locoDriverButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        dispose();

        new EngagePerson<TrainStation>("locomotive driver" , Main.selectedCity.getCityTrainStationList());
    }

    private void attendantsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        dispose();

        new EngagePerson<Airport>("flight attendant" , Main.selectedCity.getCityAirportList());
    }

    private void employeeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        dispose();

        new EngagePerson<Terminal>("employee" , Main.selectedCity.getAllTerminals());
    }

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify
    private javax.swing.JButton attendanteButton;
    private javax.swing.JButton driverButton;
    private javax.swing.JButton employeeButton;
    private javax.swing.JButton locoDriverButton;
    private javax.swing.JButton pilotButton;
    private javax.swing.JButton sailorButton;
    // End of variables declaration
}