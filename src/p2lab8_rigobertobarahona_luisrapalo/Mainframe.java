package p2lab8_rigobertobarahona_luisrapalo;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.util.Random;

public class Mainframe extends javax.swing.JFrame {

    public Mainframe() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Barbaro_Panel = new javax.swing.JPanel();
        B_Background = new javax.swing.JPanel();
        B_Header = new javax.swing.JLabel();
        B_Crear = new javax.swing.JButton();
        Mago_Panel = new javax.swing.JPanel();
        Clerigo_Panel = new javax.swing.JPanel();
        Picaro_Panel = new javax.swing.JPanel();
        Combate_Panel = new javax.swing.JPanel();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Barbaro_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        B_Background.setBackground(new java.awt.Color(153, 0, 0));

        B_Header.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        B_Header.setForeground(new java.awt.Color(255, 204, 0));
        B_Header.setText("Barbaro");

        B_Crear.setBackground(new java.awt.Color(255, 204, 0));
        B_Crear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B_Crear.setText("Crear");
        B_Crear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_Crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_CrearMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout B_BackgroundLayout = new javax.swing.GroupLayout(B_Background);
        B_Background.setLayout(B_BackgroundLayout);
        B_BackgroundLayout.setHorizontalGroup(
            B_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(B_BackgroundLayout.createSequentialGroup()
                .addGroup(B_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(B_BackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(B_Header, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(B_BackgroundLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(B_Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(590, Short.MAX_VALUE))
        );
        B_BackgroundLayout.setVerticalGroup(
            B_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(B_BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(B_Header)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 310, Short.MAX_VALUE)
                .addComponent(B_Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        Barbaro_Panel.add(B_Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 460));

        jTabbedPane1.addTab("Crear Barbaro", Barbaro_Panel);

        Mago_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Crear Mago", Mago_Panel);

        Clerigo_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Crear Clerigo", Clerigo_Panel);

        Picaro_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Crear Picaro", Picaro_Panel);

        Combate_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Combate", Combate_Panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_CrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_CrearMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_B_CrearMouseClicked

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
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel B_Background;
    private javax.swing.JButton B_Crear;
    private javax.swing.JLabel B_Header;
    private javax.swing.JPanel Barbaro_Panel;
    private javax.swing.JPanel Clerigo_Panel;
    private javax.swing.JPanel Combate_Panel;
    private javax.swing.JPanel Mago_Panel;
    private javax.swing.JPanel Picaro_Panel;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
