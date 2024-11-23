package travelmanagementsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Dashboard extends javax.swing.JFrame {
    
    String username;
    
    public Dashboard(String username) {
        initComponents();
        this.username = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH); //use foropen frame on full screen
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        image.setIcon(i3);
        addpersonaldetail.setMargin(new Insets(0, 0, 0, 90)); //for margin  top,left ,bottom ,right
        updatepersonaldetail.setMargin(new Insets(0, 0, 0, 60));
        viewpersonaldetail.setMargin(new Insets(0, 0, 0, 145));
        deletepersonaldetail.setMargin(new Insets(0, 0, 0, 60));
        checkpackages.setMargin(new Insets(0, 0, 0, 120));
        bookpackage.setMargin(new Insets(0, 0, 0, 120));
        viewpackage.setMargin(new Insets(0, 0, 0, 120));
        viewhotels.setMargin(new Insets(0, 0, 0, 130));
        bookhotel.setMargin(new Insets(0, 0, 0, 140));
        viewbookedhotel.setMargin(new Insets(0, 0, 0, 80));
        destinations.setMargin(new Insets(0, 0, 0, 125));
        payments.setMargin(new Insets(0, 0, 0, 155));
        calculator.setMargin(new Insets(0, 0, 0, 145));
        notepad.setMargin(new Insets(0, 0, 0, 155));
        about.setMargin(new Insets(0, 0, 0, 175));
        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image ii2 = ii1.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        image2.setIcon(ii3);
        JLabel text = new JLabel("Travel and Tourism Management  System");
        text.setBounds(300, 30, 1200, 70);
        text.setForeground(Color.white);
        text.setFont(new Font("Raleway", Font.PLAIN, 55));
        image2.add(text);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p1 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        addpersonaldetail = new javax.swing.JButton();
        deletepersonaldetail = new javax.swing.JButton();
        updatepersonaldetail = new javax.swing.JButton();
        checkpackages = new javax.swing.JButton();
        viewpersonaldetail = new javax.swing.JButton();
        viewhotels = new javax.swing.JButton();
        bookpackage = new javax.swing.JButton();
        bookhotel = new javax.swing.JButton();
        payments = new javax.swing.JButton();
        viewpackage = new javax.swing.JButton();
        calculator = new javax.swing.JButton();
        viewbookedhotel = new javax.swing.JButton();
        notepad = new javax.swing.JButton();
        about = new javax.swing.JButton();
        destinations = new javax.swing.JButton();
        image2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        p1.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Dashboard");

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        addpersonaldetail.setBackground(new java.awt.Color(0, 0, 102));
        addpersonaldetail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addpersonaldetail.setForeground(new java.awt.Color(255, 255, 255));
        addpersonaldetail.setText("Add Personal Details");
        addpersonaldetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addpersonaldetailActionPerformed(evt);
            }
        });

        deletepersonaldetail.setBackground(new java.awt.Color(0, 0, 102));
        deletepersonaldetail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        deletepersonaldetail.setForeground(new java.awt.Color(255, 255, 255));
        deletepersonaldetail.setText("Delete Personal Details");

        updatepersonaldetail.setBackground(new java.awt.Color(0, 0, 102));
        updatepersonaldetail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        updatepersonaldetail.setForeground(new java.awt.Color(255, 255, 255));
        updatepersonaldetail.setText(" Update Personal Details");
        updatepersonaldetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatepersonaldetailActionPerformed(evt);
            }
        });

        checkpackages.setBackground(new java.awt.Color(0, 0, 102));
        checkpackages.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        checkpackages.setForeground(new java.awt.Color(255, 255, 255));
        checkpackages.setText("Check Package");
        checkpackages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkpackagesActionPerformed(evt);
            }
        });

        viewpersonaldetail.setBackground(new java.awt.Color(0, 0, 102));
        viewpersonaldetail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewpersonaldetail.setForeground(new java.awt.Color(255, 255, 255));
        viewpersonaldetail.setText("View Details");
        viewpersonaldetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewpersonaldetailActionPerformed(evt);
            }
        });

        viewhotels.setBackground(new java.awt.Color(0, 0, 102));
        viewhotels.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewhotels.setForeground(new java.awt.Color(255, 255, 255));
        viewhotels.setText("View Hotels");
        viewhotels.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewhotelsActionPerformed(evt);
            }
        });

        bookpackage.setBackground(new java.awt.Color(0, 0, 102));
        bookpackage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bookpackage.setForeground(new java.awt.Color(255, 255, 255));
        bookpackage.setText("Book Package");
        bookpackage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookpackageActionPerformed(evt);
            }
        });

        bookhotel.setBackground(new java.awt.Color(0, 0, 102));
        bookhotel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bookhotel.setForeground(new java.awt.Color(255, 255, 255));
        bookhotel.setText("Book Hotel");
        bookhotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookhotelActionPerformed(evt);
            }
        });

        payments.setBackground(new java.awt.Color(0, 0, 102));
        payments.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        payments.setForeground(new java.awt.Color(255, 255, 255));
        payments.setText("Payments");
        payments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentsActionPerformed(evt);
            }
        });

        viewpackage.setBackground(new java.awt.Color(0, 0, 102));
        viewpackage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewpackage.setForeground(new java.awt.Color(255, 255, 255));
        viewpackage.setText("View Package");
        viewpackage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewpackageActionPerformed(evt);
            }
        });

        calculator.setBackground(new java.awt.Color(0, 0, 102));
        calculator.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        calculator.setForeground(new java.awt.Color(255, 255, 255));
        calculator.setText("Calculator");
        calculator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorActionPerformed(evt);
            }
        });

        viewbookedhotel.setBackground(new java.awt.Color(0, 0, 102));
        viewbookedhotel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewbookedhotel.setForeground(new java.awt.Color(255, 255, 255));
        viewbookedhotel.setText("View Booked Hotel");
        viewbookedhotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbookedhotelActionPerformed(evt);
            }
        });

        notepad.setBackground(new java.awt.Color(0, 0, 102));
        notepad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        notepad.setForeground(new java.awt.Color(255, 255, 255));
        notepad.setText("Notepad");
        notepad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notepadActionPerformed(evt);
            }
        });

        about.setBackground(new java.awt.Color(0, 0, 102));
        about.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        about.setForeground(new java.awt.Color(255, 255, 255));
        about.setText("About");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });

        destinations.setBackground(new java.awt.Color(0, 0, 102));
        destinations.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        destinations.setForeground(new java.awt.Color(255, 255, 255));
        destinations.setText("Destinations");
        destinations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addpersonaldetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(updatepersonaldetail, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
            .addComponent(viewpersonaldetail, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
            .addComponent(deletepersonaldetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(checkpackages, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
            .addComponent(bookpackage, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
            .addComponent(viewpackage, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
            .addComponent(viewhotels, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
            .addComponent(bookhotel, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
            .addComponent(viewbookedhotel, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
            .addComponent(payments, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
            .addComponent(calculator, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
            .addComponent(notepad, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
            .addComponent(about, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
            .addComponent(destinations, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(addpersonaldetail, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(updatepersonaldetail, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(viewpersonaldetail, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(deletepersonaldetail, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(checkpackages, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bookpackage, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewpackage, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewhotels, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookhotel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewbookedhotel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(destinations, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(payments, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calculator, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notepad, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(about, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(image2, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(image2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void destinationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationsActionPerformed
        new Destinations().setVisible(true);
    }//GEN-LAST:event_destinationsActionPerformed

    private void paymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentsActionPerformed
        new Payment().setVisible(true);
    }//GEN-LAST:event_paymentsActionPerformed

    private void addpersonaldetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addpersonaldetailActionPerformed
        this.setVisible(false);
        AddCustomer ac = new AddCustomer(username);
        ac.setVisible(true);
    }//GEN-LAST:event_addpersonaldetailActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        new About().setVisible(true);
    }//GEN-LAST:event_aboutActionPerformed

    private void bookpackageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookpackageActionPerformed
        new BookPackage(username).setVisible(true);
    }//GEN-LAST:event_bookpackageActionPerformed

    private void viewpersonaldetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewpersonaldetailActionPerformed
        new ViewCustomer(username).setVisible(true);
    }//GEN-LAST:event_viewpersonaldetailActionPerformed

    private void updatepersonaldetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatepersonaldetailActionPerformed
        new UpdateCustomer(username).setVisible(true);

    }//GEN-LAST:event_updatepersonaldetailActionPerformed

    private void checkpackagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkpackagesActionPerformed
        new CheckPackage().setVisible(true);
    }//GEN-LAST:event_checkpackagesActionPerformed

    private void viewpackageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewpackageActionPerformed
        new ViewPackage(username).setVisible(true);
    }//GEN-LAST:event_viewpackageActionPerformed

    private void viewhotelsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewhotelsActionPerformed
        new CheckHotels().setVisible(true);
    }//GEN-LAST:event_viewhotelsActionPerformed

    private void bookhotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookhotelActionPerformed
        new BookHotel(username).setVisible(true);
    }//GEN-LAST:event_bookhotelActionPerformed

    private void viewbookedhotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbookedhotelActionPerformed
        new ViewBookedHotel(username).setVisible(true);
    }//GEN-LAST:event_viewbookedhotelActionPerformed

    private void calculatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculatorActionPerformed
        try {
            Runtime.getRuntime().exec("calc.exe");
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_calculatorActionPerformed

    private void notepadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notepadActionPerformed
        try {
            Runtime.getRuntime().exec("notepad.exe");
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_notepadActionPerformed
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton about;
    private javax.swing.JButton addpersonaldetail;
    private javax.swing.JButton bookhotel;
    private javax.swing.JButton bookpackage;
    private javax.swing.JButton calculator;
    private javax.swing.JButton checkpackages;
    private javax.swing.JButton deletepersonaldetail;
    private javax.swing.JButton destinations;
    private javax.swing.JLabel image;
    private javax.swing.JLabel image2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton notepad;
    private javax.swing.JPanel p1;
    private javax.swing.JButton payments;
    private javax.swing.JButton updatepersonaldetail;
    private javax.swing.JButton viewbookedhotel;
    private javax.swing.JButton viewhotels;
    private javax.swing.JButton viewpackage;
    private javax.swing.JButton viewpersonaldetail;
    // End of variables declaration//GEN-END:variables
}
