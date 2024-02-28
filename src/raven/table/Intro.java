package raven.table;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.io.IOException;
import java.net.ServerSocket;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
/**
 *
 * @author HP
 */
public class Intro extends javax.swing.JPanel {

    /**
     * Creates new form Annuaire
     */
    public Intro() {
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

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jPanel1.setBackground(new java.awt.Color(120, 67, 144));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(255, 0, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("DEMARRER LE SERVEUR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 600, 440, 44));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/raven/table/images/Jokko.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, -110, 670, 770));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            startServer();
            // Rediriger vers une nouvelle page si le serveur est actif
            // Vous pouvez utiliser SwingUtilities.invokeLater pour rediriger vers une nouvelle page
            // Par exemple : SwingUtilities.invokeLater(() -> new NewPage().setVisible(true));
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this); // Assuming 'this' refers to the Annuaire panel

            // Close the top-level container
            if (frame != null) {
                frame.dispose();
            }

            // Create a new JFrame for AjoutEtudiant
            JFrame AnnuaireFrame = new JFrame("AnnuaireTelephonique");

            // Create AjoutEtudiant panel
            AnnuaireTelephonique AnnuairePanel = new AnnuaireTelephonique();

            // Set up the new JFrame
            AnnuaireFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            AnnuaireFrame.add(AnnuairePanel);
            AnnuaireFrame.pack();
            AnnuaireFrame.setLocationRelativeTo(null);
            AnnuaireFrame.setVisible(true);
        } catch (IOException e) {
            showExceptionDialog(e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void startServer() throws IOException {
        int port = 8080; // Choisissez un port approprié
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("Serveur démarré sur le port " + port);
        // Vous pouvez ajouter  ici la logique pour accepter les connexions entrantes
        // Par exemple : Socket clientSocket = serverSocket.accept();
        // Fermer le socket après utilisation
        // serverSocket.close();
        JOptionPane.showMessageDialog(this, "Serveur démarré sur le port " + port, "Connexion reuissit", JOptionPane.INFORMATION_MESSAGE);
    }
    
    

    private void showExceptionDialog(Exception e) {
        JOptionPane.showMessageDialog(this, "Le serveur est occupé", "Erreur de connexion", JOptionPane.ERROR_MESSAGE);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
public static void main(String args[]) {
        FlatLaf.registerCustomDefaultsSource("raven.table");
        FlatMacDarkLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Intro Page"); // Create a JFrame
                Intro intro = new Intro(); // Create your panel
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensure the application exits when the window is closed
                frame.add(intro); // Add your panel to the JFrame
                frame.pack(); // Adjust the window size to fit the content
                frame.setLocationRelativeTo(null); // Center the window on the screen
                frame.setVisible(true); // Make the window visible
            }
        });
    }
}
