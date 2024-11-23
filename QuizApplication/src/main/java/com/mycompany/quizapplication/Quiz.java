package com.mycompany.quizapplication;

import java.awt.Dimension;
import java.awt.*;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Quiz extends javax.swing.JFrame {

    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    public static int timer = 15, ans_given = 0, count = 0, score = 0;
    String useranswers[][] = new String[10][1];
    String name;

    public Quiz(String name) {
        this.name = name;
        initComponents();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();

        this.setSize(screenSize.width, screenSize.height);

        this.setLayout(null);
        label.setSize(screenSize.width, screenSize.height / 2);
        label.setLocation(0, 0); // Ensure label is positioned at the top of the screen

        this.add(label); // Add label to the frame
        this.validate();
        ImageIcon i1 = new ImageIcon("C:\\Users\\sahus\\Documents\\NetBeansProjects\\QuizApplication\\src\\main\\java\\images\\quiz.jpg");
        Image img = i1.getImage();
        Image img1 = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon im = new ImageIcon(img1);
        label.setIcon(im);
        questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        questions[0][1] = "JVM";
        questions[0][2] = "JDB";
        questions[0][3] = "JDK";
        questions[0][4] = "JRE";

        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        questions[1][1] = "int";
        questions[1][2] = "Object";
        questions[1][3] = "long";
        questions[1][4] = "void";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";

        answers[0][1] = "JDB";
        answers[1][1] = "int";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "Heap memory";
        answers[5][1] = "Remote interface";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Bytecode is executed by JVM";
        buttonGroup1.add(opt1);
        buttonGroup1.add(opt2);
        buttonGroup1.add(opt3);
        buttonGroup1.add(opt4);
        submit.setEnabled(false);
        start(count);
        getContentPane().setBackground(new Color(255, 255, 255));

        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        label = new javax.swing.JLabel();
        qno = new javax.swing.JLabel();
        question = new javax.swing.JLabel();
        opt1 = new javax.swing.JRadioButton();
        opt2 = new javax.swing.JRadioButton();
        opt4 = new javax.swing.JRadioButton();
        opt3 = new javax.swing.JRadioButton();
        lifeline = new javax.swing.JButton();
        next = new javax.swing.JButton();
        submit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        label.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        qno.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        question.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        opt1.setBackground(new java.awt.Color(255, 255, 255));
        opt1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        opt2.setBackground(new java.awt.Color(255, 255, 255));
        opt2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        opt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt2ActionPerformed(evt);
            }
        });

        opt4.setBackground(new java.awt.Color(255, 255, 255));
        opt4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        opt3.setBackground(new java.awt.Color(255, 255, 255));
        opt3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lifeline.setBackground(new java.awt.Color(29, 75, 228));
        lifeline.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lifeline.setForeground(new java.awt.Color(255, 255, 255));
        lifeline.setText("50 50 LifeLine");
        lifeline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lifelineActionPerformed(evt);
            }
        });

        next.setBackground(new java.awt.Color(29, 75, 228));
        next.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        next.setForeground(new java.awt.Color(255, 255, 255));
        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        submit.setBackground(new java.awt.Color(29, 75, 228));
        submit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(qno, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(opt4, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                                .addComponent(opt2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(opt3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(opt1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lifeline, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(submit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(question, javax.swing.GroupLayout.PREFERRED_SIZE, 1370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(434, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(question, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qno, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(next)
                        .addGap(94, 94, 94)
                        .addComponent(lifeline))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(opt1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(opt2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(opt3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(opt4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(submit)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opt2ActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        repaint();

        opt1.setEnabled(true);
        opt2.setEnabled(true);
        opt3.setEnabled(true);
        opt4.setEnabled(true);

        ans_given = 1;
        if (buttonGroup1.getSelection() == null) {
            useranswers[count][0] = "";
        } else {
            useranswers[count][0] = buttonGroup1.getSelection().getActionCommand();
        }

        if (count == 8) {
            next.setEnabled(false);
            submit.setEnabled(true);
        }
        count++;
        start(count);

    }//GEN-LAST:event_nextActionPerformed

    private void lifelineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lifelineActionPerformed
        if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
            opt2.setEnabled(false);
            opt3.setEnabled(false);
        } else {
            opt1.setEnabled(false);
            opt4.setEnabled(false);
        }
        lifeline.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_lifelineActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        ans_given = 1;
        if (buttonGroup1.getSelection() == null) {
            useranswers[count][0] = "";
        } else {
            useranswers[count][0] = buttonGroup1.getSelection().getActionCommand();
        }
        for (int i = 0; i < useranswers.length; i++) {
            if (useranswers[i][0].equals(answers[i][1])) {
                score += 10;
            }
        }
        setVisible(false);
        new Score(name, score).setVisible(true);
    }//GEN-LAST:event_submitActionPerformed

    public void paint(Graphics g) {  //this is call automatically
        super.paint(g);
        String time = "Time left - " + timer + " Seconds";
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 25));
        if (timer > 0) {
            g.drawString(time, 1600, 620);
        } else {
            g.drawString("Times up!!", 1600, 620);

        }
        timer--;
        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            System.out.println(e);
        }

        if (ans_given == 1) {
            ans_given = 0;
            timer = 15;
        } else if (timer < 0) {
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9) {//submit button
                if (buttonGroup1.getSelection() == null) {
                    useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = buttonGroup1.getSelection().getActionCommand();
                }
                for (int i = 0; i < useranswers.length; i++) {
                    if (useranswers[i][0].equals(answers[i][1])) {
                        score += 10;
                    }
//                      }else{
//                          score += 0;
//                      }
                }
                setVisible(false);
                new Score(name, score);
            } else {//next button

            }

            if (buttonGroup1.getSelection() == null) {
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = buttonGroup1.getSelection().getActionCommand();
            }
            count++;
            start(count);
        }
    }

    public void start(int count) {
        qno.setText("" + (count + 1) + ". ");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);
        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);
        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);
        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);
        buttonGroup1.clearSelection();
    }

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
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quiz("user").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel label;
    private javax.swing.JButton lifeline;
    private javax.swing.JButton next;
    private javax.swing.JRadioButton opt1;
    private javax.swing.JRadioButton opt2;
    private javax.swing.JRadioButton opt3;
    private javax.swing.JRadioButton opt4;
    private javax.swing.JLabel qno;
    private javax.swing.JLabel question;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
