package travelmanagementsystem;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Destinations extends javax.swing.JFrame implements Runnable {

    private JLabel[] labels;
    private ImageIcon[] images;
    private Thread t1;

    public Destinations() {
        initComponents();

        labels = new JLabel[]{image1};

        // Initialize the images array
        images = new ImageIcon[10]; // Size 10 to hold all images
        for (int i = 0; i < 10; i++) { // Correct iteration to match array size
            images[i] = new ImageIcon(ClassLoader.getSystemResource("icons/dest" + (i + 1) + ".jpg"));
            // Scale the image to fit the label size
            Image scaledImage = images[i].getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
            images[i] = new ImageIcon(scaledImage);
        }

        // Start the slideshow thread
        t1 = new Thread(this);
        t1.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        image1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        image1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(image1, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public void run() {
        try {
            int index = 0;
            while (true) {
                // Display the current image
                labels[0].setIcon(images[index]);
                // Wait for 2 seconds
                Thread.sleep(2000);
                // Move to the next image
                index = (index + 1) % images.length; // Loop back to the first after the last
            }
        } catch (Exception e) {
            System.out.println("Error in slideshow: " + e);
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Destinations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel image1;
    // End of variables declaration//GEN-END:variables
}
