/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package order;

import java.awt.Color;
import java.awt.Graphics;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author dell
 */
public class choose extends javax.swing.JFrame {

    /**
     * Creates new form choose
     */

    public choose() {
        initComponents();
        //this.getContentPane().setBackground(Color.pink);
        setLocationRelativeTo(null);

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
        jLabel5 = new javax.swing.JLabel();
        btneathere = new javax.swing.JButton();
        btnTakeaway = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome to Heaven!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 616, 61));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Add: 141 Chien Thang - Ha Dong - Ha Noi");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 402, 25));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hotline: 1900.1506");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 175, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Open: 8AM - 10PM");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 195, 18));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("You want?");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 296, 83));

        btneathere.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btneathere.setText("Eat here!");
        btneathere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneathereActionPerformed(evt);
            }
        });
        getContentPane().add(btneathere, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 392, 160, 50));

        btnTakeaway.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnTakeaway.setText("Take away");
        btnTakeaway.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTakeawayActionPerformed(evt);
            }
        });
        getContentPane().add(btnTakeaway, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 170, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/anh/a.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 870, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTakeawayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTakeawayActionPerformed
        // TODO add your handling code here:
        informationform i=new informationform();
        i.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTakeawayActionPerformed

    private void btneathereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneathereActionPerformed
        btnTakeawayActionPerformed(evt);
    }//GEN-LAST:event_btneathereActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
  
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new choose().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTakeaway;
    private javax.swing.JButton btneathere;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
