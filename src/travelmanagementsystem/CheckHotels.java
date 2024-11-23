package travelmanagementsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class CheckHotels extends javax.swing.JFrame implements Runnable {

    private JLabel[] labels;
    private ImageIcon[] images;
    private Thread t1;
    JLabel caption;

    public CheckHotels() {
        initComponents();
        caption = new JLabel();
        caption.setBounds(50, 500, 1000, 70);
        caption.setFont(new Font("Tahoma", Font.BOLD, 40));
        caption.setForeground(Color.white);
        image1.add(caption);
        labels = new JLabel[]{image1};

        // Initialize the images array
        images = new ImageIcon[10];
        for (int i = 0; i < 10; i++) {
            images[i] = new ImageIcon(ClassLoader.getSystemResource("icons/hotel" + (i + 1) + ".jpg"));
            // Scale the image to fit the label size
            Image scaledImage = images[i].getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
            images[i] = new ImageIcon(scaledImage);
        }

        // Start the slideshow thread
        t1 = new Thread(this);
        t1.start();

    }

    public void run() {
    String[] text = new String[]{
        "JW Marriott Hotel", "Taj Hotel", "Madarin Oriental Hotel", 
        "Four Seasons Hotel", "Raddisson Hotel", "Classio Hotel", 
        "The Bay Club Hotel", "Breeze Blow Hotel", 
        "Happy Morning Motel", "River View Hotel"
    };

    try {
        int index = 0;
        while (true) {
            // Display the current image
            labels[0].setIcon(images[index]);
            // Set the corresponding text for the caption
            caption.setText(text[index]);
            // Wait for 2 seconds
            Thread.sleep(2000);
            // Move to the next image and caption
            index = (index + 1) % images.length; // Loop back to the first after the last
        }
    } catch (Exception e) {
        System.out.println("Error in slideshow: " + e);
    }
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
            .addComponent(image1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckHotels().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel image1;
    // End of variables declaration//GEN-END:variables
}
