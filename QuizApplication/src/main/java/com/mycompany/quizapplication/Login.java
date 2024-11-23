package com.mycompany.quizapplication;

import java.awt.Color;
import java.awt.Image;
import javax.swing.*;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        ImageIcon i1 = new ImageIcon("C:\\Users\\sahus\\Documents\\NetBeansProjects\\QuizApplication\\src\\main\\java\\images\\image.jpg");
//        image.setIcon(i1);
        Image img = i1.getImage();
        Image img1 = img.getScaledInstance(image.getWidth(), image.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon im = new ImageIcon(img1);
        image.setIcon(im);
                getContentPane().setBackground(new Color(255,255,255)); 

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        image = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfname = new javax.swing.JTextField();
        rule = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        image.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Script MT Bold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(33, 26, 238));
        jLabel1.setText("Welcome to my quiz game");

        jLabel2.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLabel2.setText("Enter your name");

        tfname.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        rule.setBackground(new java.awt.Color(43, 86, 228));
        rule.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rule.setForeground(new java.awt.Color(255, 255, 255));
        rule.setText("Rules");
        rule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruleActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(43, 86, 228));
        back.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(rule, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 335, Short.MAX_VALUE)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfname, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfname, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rule, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void ruleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruleActionPerformed

        String name = tfname.getText();
        setVisible(false);
        Rules r = new Rules(name);
        r.setVisible(true);

    }//GEN-LAST:event_ruleActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton rule;
    private javax.swing.JTextField tfname;
    // End of variables declaration//GEN-END:variables
}
