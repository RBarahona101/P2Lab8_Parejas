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
    Random r = new Random();
    public Mainframe() {
        initComponents();
        // Ciudades
        ciudades.add("Norfair");
        ciudades.add("Brinstar");
        ciudades.add("Maridia");
        ciudades.add("Zebes");
        ciudades.add("Crateria");
        // Razas
        razas.add("Mediano");
        razas.add("Enano");
        razas.add("Elfo");
        razas.add("Humano");
        // Barbaro Subclases
        Barbaro_Subclases.add("Lead");
        Barbaro_Subclases.add("Support");
        Barbaro_Subclases.add("Offensive");
        // Mago Subclases
        Mago_Subclases.add("Support");
        Mago_Subclases.add("Tank");
        // Picaro Subclases
        Picaro_Subclases.add("Spammer");
        Picaro_Subclases.add("Tank");
        //Barbaro Armas
        Barbaro_Armas.add("Pesada");
        Barbaro_Armas.add("Ligera");
        Barbaro_Armas.add("Escudo");
        // Ciudad ComboBoxes
        DefaultComboBoxModel Ciudades = (DefaultComboBoxModel) Barbaro_Ciudad.getModel();
        Ciudades = new DefaultComboBoxModel(ciudades.toArray() );
        Barbaro_Ciudad.setModel(Ciudades);
        // Raza ComboBoxes
        DefaultComboBoxModel Razas = (DefaultComboBoxModel) Barbaro_Raza.getModel();
        Razas = new DefaultComboBoxModel(razas.toArray() );
        Barbaro_Raza.setModel(Razas);
        // Barbaro Subclases CB
        DefaultComboBoxModel B_Subclases = (DefaultComboBoxModel) Barbaro_SubclaseCB.getModel();
        B_Subclases = new DefaultComboBoxModel(Barbaro_Subclases.toArray() );
        Barbaro_SubclaseCB.setModel(B_Subclases);
        // Barbaro Armas CB
        DefaultComboBoxModel Armas = (DefaultComboBoxModel) Barbaro_ArmaCB.getModel();
        Armas = new DefaultComboBoxModel(Barbaro_Armas.toArray() );
        Barbaro_ArmaCB.setModel(Armas);
    }
    ArrayList<Personaje> personajes = new ArrayList();
    ArrayList<String> ciudades = new ArrayList();
    ArrayList<String> razas = new ArrayList();
    ArrayList<String> Barbaro_Subclases = new ArrayList();
    ArrayList <String> Mago_Subclases = new ArrayList();
    ArrayList <String> Picaro_Subclases = new ArrayList();
    ArrayList <String> Barbaro_Armas = new ArrayList();
    ArrayList <String> Mago_Magias = new ArrayList();
    ArrayList <String> Picaro_Instrumentos = new ArrayList();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Barbaro_Panel = new javax.swing.JPanel();
        B_Background = new javax.swing.JPanel();
        B_Header = new javax.swing.JLabel();
        B_Crear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Barbaro_Nombre = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        Barbaro_Edad = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        Barbaro_Peso = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        Barbaro_Height = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        Barbaro_Descripcion = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        Barbaro_Raza = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        Barbaro_Ciudad = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        Barbaro_ArmaCB = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        Barbaro_Exp = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        Barbaro_SubclaseCB = new javax.swing.JComboBox<>();
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("Edad");

        Barbaro_Edad.setModel(new javax.swing.SpinnerNumberModel());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("Peso");

        Barbaro_Peso.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 1.0d));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("Height");

        Barbaro_Height.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 1.0d));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("Descripcion");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 0));
        jLabel6.setText("Raza");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 0));
        jLabel7.setText("Ciudad");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 0));
        jLabel8.setText("Arma");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 204, 0));
        jLabel9.setText("Experiencia");

        Barbaro_Exp.setModel(new javax.swing.SpinnerNumberModel());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 204, 0));
        jLabel10.setText("Subclase");

        Barbaro_SubclaseCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        javax.swing.GroupLayout B_BackgroundLayout = new javax.swing.GroupLayout(B_Background);
        B_Background.setLayout(B_BackgroundLayout);
        B_BackgroundLayout.setHorizontalGroup(
            B_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(B_BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(B_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(B_BackgroundLayout.createSequentialGroup()
                        .addGroup(B_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Barbaro_Nombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                        .addGroup(B_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(B_BackgroundLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addGroup(B_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Barbaro_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(B_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Barbaro_Peso, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                                .addGap(29, 29, 29)
                                .addGroup(B_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                                    .addComponent(Barbaro_Height))
                                .addGap(18, 18, 18)
                                .addGroup(B_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Barbaro_Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(366, 366, 366))
                            .addGroup(B_BackgroundLayout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addGroup(B_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(B_BackgroundLayout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(562, Short.MAX_VALUE))
                                    .addGroup(B_BackgroundLayout.createSequentialGroup()
                                        .addComponent(Barbaro_Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(B_BackgroundLayout.createSequentialGroup()
                                        .addGroup(B_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(Barbaro_Exp, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                                        .addGap(80, 80, 80)
                                        .addGroup(B_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(B_BackgroundLayout.createSequentialGroup()
                                                .addComponent(Barbaro_SubclaseCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(366, 366, 366))))))))
                    .addGroup(B_BackgroundLayout.createSequentialGroup()
                        .addGroup(B_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B_Header, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(B_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                .addComponent(Barbaro_ArmaCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(B_BackgroundLayout.createSequentialGroup()
                        .addGroup(B_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Barbaro_Raza, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B_Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        B_BackgroundLayout.setVerticalGroup(
            B_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(B_BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(B_Header, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(B_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(B_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Barbaro_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Barbaro_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Barbaro_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Barbaro_Height, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Barbaro_Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(B_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(B_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Barbaro_Raza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Barbaro_Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(B_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(B_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Barbaro_ArmaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Barbaro_Exp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Barbaro_SubclaseCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(B_Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
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
        int edad = (Integer) Barbaro_Edad.getValue();
        String nombre = Barbaro_Nombre.getText();
        String raza = razas.get(Barbaro_Raza.getMaximumRowCount() ) ;
        String nacionalidad = ciudades.get(Barbaro_Ciudad.getSelectedIndex() );
        Double height = (Double) Barbaro_Height.getValue();
        Double peso = (Double) Barbaro_Peso.getValue();
        String description = Barbaro_Descripcion.getText();
        int AC = 65;
        int CS = 93;
        int HP = 0;
        switch(raza){
            case "Mediano": {
                HP = 50 + r.nextInt(10);
                break;
            }
            case "Enano":{
                HP = 80 + r.nextInt(20);
                break;
            }
            case "Elfo":{
                HP = 50 + r.nextInt(20);
                break;
            }
            case "Humano": {
                HP = 40 + r.nextInt(35);
                break;
            }
        }
        String Pclass = Barbaro_Subclases.get(Barbaro_SubclaseCB.getSelectedIndex() );
        String arma = Barbaro_Armas.get(Barbaro_ArmaCB.getSelectedIndex() );
        int exp = (Integer) Barbaro_Exp.getValue();
        personajes.add(new Barbaro(edad, nombre, raza, nacionalidad, height, peso, description, AC, CS, HP,Pclass, arma, exp) );
        JOptionPane.showMessageDialog(this, "Barbaro Creado Exitosamente");
        Barbaro_Nombre.setText("");
        Barbaro_Descripcion.setText("");
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
    private javax.swing.JComboBox<String> Barbaro_ArmaCB;
    private javax.swing.JComboBox<String> Barbaro_Ciudad;
    private javax.swing.JFormattedTextField Barbaro_Descripcion;
    private javax.swing.JSpinner Barbaro_Edad;
    private javax.swing.JSpinner Barbaro_Exp;
    private javax.swing.JSpinner Barbaro_Height;
    private javax.swing.JFormattedTextField Barbaro_Nombre;
    private javax.swing.JPanel Barbaro_Panel;
    private javax.swing.JSpinner Barbaro_Peso;
    private javax.swing.JComboBox<String> Barbaro_Raza;
    private javax.swing.JComboBox<String> Barbaro_SubclaseCB;
    private javax.swing.JPanel Clerigo_Panel;
    private javax.swing.JPanel Combate_Panel;
    private javax.swing.JPanel Mago_Panel;
    private javax.swing.JPanel Picaro_Panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
