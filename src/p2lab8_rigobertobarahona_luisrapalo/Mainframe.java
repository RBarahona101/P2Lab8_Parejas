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
        // Mago Magias
        Mago_Magias.add("Negra");
        Mago_Magias.add("Blanca");
        Mago_Magias.add("Sanador");
        DefaultComboBoxModel P_Sub = (DefaultComboBoxModel) P_Subclases.getModel();
        P_Sub = new DefaultComboBoxModel(Picaro_Instrumentos.toArray() );
        P_Subclases.setModel(P_Sub);
        // Picaro INstrumentos
        Picaro_Instrumentos.add("Arma");
        Picaro_Instrumentos.add("Amuleto");
        Picaro_Instrumentos.add("Piedra Antigua");
        DefaultComboBoxModel Instru = (DefaultComboBoxModel) Instrumentos.getModel();
        Instru = new DefaultComboBoxModel(Picaro_Instrumentos.toArray() );
        Instrumentos.setModel(Instru);
        // Picaro Subclases
        Picaro_Subclases.add("Spammer");
        Picaro_Subclases.add("Tank");
        // Ciudad ComboBoxes
        DefaultComboBoxModel Ciudades = (DefaultComboBoxModel) Barbaro_Ciudad.getModel();
        Ciudades = new DefaultComboBoxModel(ciudades.toArray() );
        Barbaro_Ciudad.setModel(Ciudades);
        Mago_Ciudades.setModel(Ciudades);
        Clerigo_Ciudad.setModel(Ciudades);
        Picaro_Ciudad.setModel(Ciudades);
        // Raza ComboBoxes
        DefaultComboBoxModel Razas = (DefaultComboBoxModel) Barbaro_Raza.getModel();
        Razas = new DefaultComboBoxModel(razas.toArray() );
        Barbaro_Raza.setModel(Razas);
        Mago_Razas.setModel(Razas);
        Clerigo_Raza.setModel(Razas);
        Picaro_Raza.setModel(Razas);
        // Barbaro Subclases CB
        DefaultComboBoxModel B_Subclases = (DefaultComboBoxModel) Barbaro_SubclaseCB.getModel();
        B_Subclases = new DefaultComboBoxModel(Barbaro_Subclases.toArray() );
        Barbaro_SubclaseCB.setModel(B_Subclases);
        // Barbaro Armas CB
        DefaultComboBoxModel Armas = (DefaultComboBoxModel) Barbaro_ArmaCB.getModel();
        Armas = new DefaultComboBoxModel(Barbaro_Armas.toArray() );
        Barbaro_ArmaCB.setModel(Armas);
        // Mago Magias
        DefaultComboBoxModel Magia = (DefaultComboBoxModel) Mago_Magia.getModel();
        Magia = new DefaultComboBoxModel (Mago_Magias.toArray() );
        Mago_Magia.setModel(Magia);
        // Mago Subclases
        DefaultComboBoxModel M_Subclases = (DefaultComboBoxModel) Mago_Subclase.getModel();
        M_Subclases = new DefaultComboBoxModel(Mago_Subclases.toArray() );
        Mago_Subclase.setModel(M_Subclases);
        // Combo Box de Usuarios
        personajes.add( new Picaro( 18, "Liliana", "Elfo", "Maridia", 192, 35.8, "La Roja", 50,80, 70, "Spammer", "Arma", 999) );
        personajes.add( new Barbaro( 30, "Conan", "Humano", "Zebes", 238, 80.8, "El Barbaro", 65, 93, 75, "Offensive", "Pesada", 999 ) );
        DefaultComboBoxModel Lista = (DefaultComboBoxModel) Combate_CB1.getModel();
        DefaultComboBoxModel Lista2 = (DefaultComboBoxModel) Combate_CB2.getModel();
        Lista = new DefaultComboBoxModel(personajes.toArray() );
        Lista2 = new DefaultComboBoxModel(personajes.toArray() );
        Combate_CB1.setModel(Lista);
        Combate_CB2.setModel(Lista2);
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
    //Valores Universales de Combate
    ArrayList<Personaje> Combatants = new ArrayList();
    double cCS1, cCS2, cHP1, cHP2, cAC1, cAC2, Crit1, Crit2, AC1, AC2, SupportAC1, SupportAC2, SPMac1, SPMac2, TankHP1, TankHP2;
    int turno = 1;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        CombatDialog = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        Turn_Label = new javax.swing.JLabel();
        Active_Player = new javax.swing.JLabel();
        P1_Class = new javax.swing.JLabel();
        P2_Subclass = new javax.swing.JLabel();
        P1_AC = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        P2_Class = new javax.swing.JLabel();
        P1_Subclass = new javax.swing.JLabel();
        P2_AC = new javax.swing.JLabel();
        P2_HP = new javax.swing.JLabel();
        P2_CS = new javax.swing.JLabel();
        P1_Attack = new javax.swing.JButton();
        P1_Defend = new javax.swing.JButton();
        P2_Attack = new javax.swing.JButton();
        P2_Defend = new javax.swing.JButton();
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
        jLabel16 = new javax.swing.JLabel();
        Mago_Panel = new javax.swing.JPanel();
        M_Background = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Mago_Razas = new javax.swing.JComboBox<>();
        Mago_Ciudades = new javax.swing.JComboBox<>();
        Mago_Magia = new javax.swing.JComboBox<>();
        Mago_Subclase = new javax.swing.JComboBox<>();
        M_Crear = new javax.swing.JButton();
        Mago_Nombre = new javax.swing.JTextField();
        Mago_Edad = new javax.swing.JSpinner();
        Mago_Peso = new javax.swing.JSpinner();
        Mago_Height = new javax.swing.JSpinner();
        Mago_Descripcion = new javax.swing.JFormattedTextField();
        jLabel42 = new javax.swing.JLabel();
        Clerigo_Panel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        Clerigo_Edad = new javax.swing.JSpinner();
        Clerigo_Ciudad = new javax.swing.JComboBox<>();
        Clerigo_Nombre = new javax.swing.JTextField();
        Clerigo_Height = new javax.swing.JSpinner();
        Clerigo_Peso = new javax.swing.JSpinner();
        Clerigo_Raza = new javax.swing.JComboBox<>();
        Clerigo_Descripcion = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        Clerigo_Dios = new javax.swing.JTextField();
        Clerigo_Invocacion = new javax.swing.JTextField();
        C_Crear = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        Picaro_Panel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        Picaro_Nombre = new javax.swing.JTextField();
        Picaro_Edad = new javax.swing.JSpinner();
        Picaro_Ciudad = new javax.swing.JComboBox<>();
        Picaro_Raza = new javax.swing.JComboBox<>();
        Picaro_Peso = new javax.swing.JSpinner();
        Picaro_Height = new javax.swing.JSpinner();
        Picaro_Descripcion = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        Picaro_Heists = new javax.swing.JSpinner();
        P_Crear = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        Instrumentos = new javax.swing.JComboBox<>();
        jLabel45 = new javax.swing.JLabel();
        P_Subclases = new javax.swing.JComboBox<>();
        Combate_Panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Combate_CB1 = new javax.swing.JComboBox<>();
        Combate_CB2 = new javax.swing.JComboBox<>();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        PvP = new javax.swing.JButton();
        PvE_T = new javax.swing.JButton();
        PvE_A = new javax.swing.JButton();

        jToolBar1.setRollover(true);

        CombatDialog.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 0, 0));
        jLabel49.setText("Player 1");

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(0, 0, 204));
        jLabel50.setText("Player 2");

        Turn_Label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Turn_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Turn_Label.setText("Turn");

        Active_Player.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Active_Player.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Active_Player.setText("Active Player:");

        P1_Class.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        P1_Class.setText("P1 Class: ");

        P2_Subclass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        P2_Subclass.setText("P2 Subclass: ");

        P1_AC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        P1_AC.setText("P1 AC:");

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel51.setText("P1 HP: ");

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel52.setText("P1 CS: ");

        P2_Class.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        P2_Class.setText("P2 Class: ");

        P1_Subclass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        P1_Subclass.setText("P1 Subclass: ");

        P2_AC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        P2_AC.setText("P2 AC: ");

        P2_HP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        P2_HP.setText("P2 HP: ");

        P2_CS.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        P2_CS.setText("P2_CS");

        P1_Attack.setBackground(new java.awt.Color(204, 0, 0));
        P1_Attack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        P1_Attack.setText("Attack");
        P1_Attack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P1_Defend.setBackground(new java.awt.Color(255, 0, 0));
        P1_Defend.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        P1_Defend.setText("Defend");
        P1_Defend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P2_Attack.setBackground(new java.awt.Color(0, 0, 153));
        P2_Attack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        P2_Attack.setForeground(new java.awt.Color(255, 255, 255));
        P2_Attack.setText("Attack");
        P2_Attack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P2_Defend.setBackground(new java.awt.Color(51, 51, 255));
        P2_Defend.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        P2_Defend.setForeground(new java.awt.Color(255, 255, 255));
        P2_Defend.setText("Defend");
        P2_Defend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(P1_Class, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(P1_Subclass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Turn_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Active_Player, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)))
                            .addComponent(P1_AC, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(P1_Defend, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(P1_Attack, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(385, 385, 385)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P2_Class, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P2_Subclass, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P2_AC, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P2_HP, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P2_CS, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(P2_Defend, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(P2_Attack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(134, 134, 134))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Turn_Label))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(P1_Class, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P2_Class, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Active_Player)
                    .addComponent(P1_Subclass)
                    .addComponent(P2_Subclass))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P1_AC)
                    .addComponent(P2_AC))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(P2_HP))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(P2_CS))
                .addGap(55, 55, 55)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P1_Attack, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P2_Attack, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P1_Defend, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P2_Defend, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        CombatDialog.getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 540));

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

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1.1.jpg"))); // NOI18N

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
                                    .addComponent(Barbaro_Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(391, 391, 391))
                            .addGroup(B_BackgroundLayout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addGroup(B_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Barbaro_Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(B_BackgroundLayout.createSequentialGroup()
                                        .addGroup(B_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(Barbaro_Exp, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                                        .addGap(80, 80, 80)
                                        .addGroup(B_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Barbaro_SubclaseCB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(B_BackgroundLayout.createSequentialGroup()
                        .addGroup(B_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(B_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                .addComponent(Barbaro_ArmaCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Barbaro_Raza, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B_Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B_Header, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        B_BackgroundLayout.setVerticalGroup(
            B_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(B_BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(B_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(B_BackgroundLayout.createSequentialGroup()
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
                        .addGap(0, 75, Short.MAX_VALUE)))
                .addContainerGap())
        );

        Barbaro_Panel.add(B_Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 460));

        jTabbedPane1.addTab("Crear Barbaro", Barbaro_Panel);

        Mago_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        M_Background.setBackground(new java.awt.Color(0, 0, 0));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 204, 204));
        jLabel11.setText("Mago");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 204, 204));
        jLabel12.setText("Nombre");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 204, 204));
        jLabel13.setText("Edad");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 204, 204));
        jLabel14.setText("Peso");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 204, 204));
        jLabel15.setText("Height");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 204, 204));
        jLabel17.setText("Descripcion");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 204, 204));
        jLabel18.setText("Raza");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 204, 204));
        jLabel19.setText("Ciudad");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 204, 204));
        jLabel20.setText("Magia");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 204, 204));
        jLabel21.setText("Subclase");

        Mago_Razas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        Mago_Magia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        Mago_Subclase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        M_Crear.setBackground(new java.awt.Color(0, 204, 204));
        M_Crear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        M_Crear.setText("Crear");
        M_Crear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        M_Crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                M_CrearMouseClicked(evt);
            }
        });

        Mago_Edad.setModel(new javax.swing.SpinnerNumberModel());

        Mago_Peso.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 1.0d));

        Mago_Height.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 1.0d));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/2.2.jpg"))); // NOI18N

        javax.swing.GroupLayout M_BackgroundLayout = new javax.swing.GroupLayout(M_Background);
        M_Background.setLayout(M_BackgroundLayout);
        M_BackgroundLayout.setHorizontalGroup(
            M_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(M_BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(M_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(M_BackgroundLayout.createSequentialGroup()
                        .addGroup(M_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(M_Crear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(Mago_Magia, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Mago_Razas, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(M_BackgroundLayout.createSequentialGroup()
                        .addGroup(M_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(M_BackgroundLayout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE))
                            .addGroup(M_BackgroundLayout.createSequentialGroup()
                                .addComponent(Mago_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Mago_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Mago_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Mago_Height, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addGroup(M_BackgroundLayout.createSequentialGroup()
                                .addGroup(M_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(M_BackgroundLayout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(M_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(M_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(M_BackgroundLayout.createSequentialGroup()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(M_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(M_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                                        .addComponent(Mago_Ciudades, 0, 125, Short.MAX_VALUE)
                                        .addComponent(Mago_Subclase, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGroup(M_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mago_Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)))
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        M_BackgroundLayout.setVerticalGroup(
            M_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(M_BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(M_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(M_BackgroundLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addGroup(M_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(M_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Mago_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mago_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mago_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mago_Height, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mago_Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(M_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(M_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Mago_Razas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mago_Ciudades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(M_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addGap(18, 18, 18)
                        .addGroup(M_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Mago_Magia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mago_Subclase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)
                        .addComponent(M_Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        Mago_Panel.add(M_Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 470));

        jTabbedPane1.addTab("Crear Mago", Mago_Panel);

        Clerigo_Panel.setForeground(new java.awt.Color(204, 204, 255));
        Clerigo_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel22.setText("Clerigo");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("Edad");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("Descripcion");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("Peso");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("Raza");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("Ciudad");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("Height");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText("Nombre");

        Clerigo_Edad.setModel(new javax.swing.SpinnerNumberModel());

        Clerigo_Height.setModel(new javax.swing.SpinnerNumberModel());

        Clerigo_Peso.setModel(new javax.swing.SpinnerNumberModel());

        Clerigo_Raza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setText("Invocacion");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setText("Dios");

        C_Crear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        C_Crear.setText("Crear");
        C_Crear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C_Crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C_CrearMouseClicked(evt);
            }
        });

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/3.3.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Clerigo_Height, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Clerigo_Raza, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Clerigo_Nombre))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Clerigo_Descripcion, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Clerigo_Peso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Clerigo_Edad, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Clerigo_Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Clerigo_Dios, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Clerigo_Invocacion, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(C_Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Clerigo_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Clerigo_Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Clerigo_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Clerigo_Height, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Clerigo_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Clerigo_Dios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Clerigo_Raza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clerigo_Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clerigo_Invocacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(C_Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        Clerigo_Panel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 470));

        jTabbedPane1.addTab("Crear Clerigo", Clerigo_Panel);

        Picaro_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 153, 0));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel32.setText("Picaro");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel33.setText("Nombre");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel34.setText("Ciudad");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel35.setText("Instrumentos");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel36.setText("Raza");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel37.setText("Edad");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel38.setText("Peso");

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel39.setText("Descripcion");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel40.setText("Height");

        Picaro_Edad.setModel(new javax.swing.SpinnerNumberModel());

        Picaro_Peso.setModel(new javax.swing.SpinnerNumberModel());

        Picaro_Height.setModel(new javax.swing.SpinnerNumberModel());

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel41.setText("Heists");

        Picaro_Heists.setModel(new javax.swing.SpinnerNumberModel());

        P_Crear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        P_Crear.setText("Crear");
        P_Crear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P_Crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_CrearMouseClicked(evt);
            }
        });

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/4.4.jpg"))); // NOI18N

        Instrumentos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel45.setText("Subclase");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(P_Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(P_Subclases, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(88, 88, 88))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(Picaro_Nombre)
                                            .addGap(36, 36, 36)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(Picaro_Raza, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Picaro_Descripcion, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Picaro_Edad, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Picaro_Peso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Picaro_Height, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Picaro_Ciudad, 0, 104, Short.MAX_VALUE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Picaro_Heists)
                            .addComponent(Instrumentos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(Picaro_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(108, 108, 108))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(Picaro_Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(Instrumentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Picaro_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(Picaro_Height, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Picaro_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Picaro_Raza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Picaro_Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Picaro_Heists, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(P_Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel45)
                                .addComponent(P_Subclases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        Picaro_Panel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 470));

        jTabbedPane1.addTab("Crear Picaro", Picaro_Panel);

        Combate_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        Combate_CB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel46.setText("Mortal Kombat");

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel47.setText("Player 1");

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel48.setText("Player 2 / Computer");

        PvP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PvP.setText("P v P ");
        PvP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PvP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PvPMouseClicked(evt);
            }
        });

        PvE_T.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PvE_T.setText("P v E Turn");
        PvE_T.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        PvE_A.setText("P v E Automatic");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(Combate_CB1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Combate_CB2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(307, 307, 307)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PvP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PvE_T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PvE_A, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 26, Short.MAX_VALUE)
                            .addComponent(jLabel48))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Combate_CB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Combate_CB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(PvP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(PvE_T, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(PvE_A, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
        );

        Combate_Panel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 470));

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
        DefaultComboBoxModel Lista = (DefaultComboBoxModel) Combate_CB1.getModel();
        int edad = (Integer) Barbaro_Edad.getValue();
        String nombre = Barbaro_Nombre.getText();
        String raza = razas.get(Barbaro_Raza.getSelectedIndex() ) ;
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
        Lista = new DefaultComboBoxModel(personajes.toArray() );
        Combate_CB1.setModel(Lista);
        Combate_CB2.setModel(Lista);
    }//GEN-LAST:event_B_CrearMouseClicked

    private void M_CrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M_CrearMouseClicked
        DefaultComboBoxModel Lista = (DefaultComboBoxModel) Combate_CB1.getModel();
        int edad = (Integer) Mago_Edad.getValue();
        String nombre = Mago_Nombre.getText();
        String raza = razas.get(Mago_Razas.getSelectedIndex() ) ;
        String nacionalidad = ciudades.get(Mago_Ciudades.getSelectedIndex() );
        Double height = (Double) Mago_Height.getValue();
        Double peso = (Double) Mago_Peso.getValue();
        String description = Mago_Descripcion.getText();
        int AC = 20;
        int CS = 101;
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
        String Pclass = Mago_Subclases.get(Mago_Subclase.getSelectedIndex() );
        String magia = Mago_Magias.get(Mago_Magia.getSelectedIndex() );
        personajes.add(new Mago(edad, nombre, raza, nacionalidad, height, peso, description, AC, CS, HP,Pclass, magia) );
        JOptionPane.showMessageDialog(this, "Mago Creado Exitosamente");
        
        Mago_Nombre.setText("");
        Mago_Descripcion.setText("");
        
        Lista = new DefaultComboBoxModel(personajes.toArray() );
        Combate_CB1.setModel(Lista);
        Combate_CB2.setModel(Lista);
    }//GEN-LAST:event_M_CrearMouseClicked

    private void C_CrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C_CrearMouseClicked
          DefaultComboBoxModel Lista = (DefaultComboBoxModel) Combate_CB1.getModel();
        int edad = (Integer) Clerigo_Edad.getValue();
        String nombre = Clerigo_Nombre.getText();
        String raza = razas.get(Clerigo_Raza.getSelectedIndex() ) ;
        String nacionalidad = ciudades.get(Clerigo_Ciudad.getSelectedIndex() );
        Double height = (Double) Clerigo_Height.getValue();
        Double peso = (Double) Clerigo_Peso.getValue();
        String description = Clerigo_Descripcion.getText();
        int AC = 40;
        int CS = 97;
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
        String Pclass = "Lead";
        String deity = Clerigo_Dios.getText();
        String invocation = Clerigo_Invocacion.getText();
        personajes.add(new Clerigo(edad, nombre, raza, nacionalidad, height, peso, description, AC, CS, HP,Pclass, deity, invocation) );
        JOptionPane.showMessageDialog(this, "Clerigo Creado Exitosamente");
        
        Clerigo_Nombre.setText("");
        Clerigo_Descripcion.setText("");
        Clerigo_Dios.setText("");
        Clerigo_Invocacion.setText("");
        Lista = new DefaultComboBoxModel(personajes.toArray() );
        Combate_CB1.setModel(Lista);
        Combate_CB2.setModel(Lista);
        
    }//GEN-LAST:event_C_CrearMouseClicked

    private void P_CrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_CrearMouseClicked
        DefaultComboBoxModel Lista = (DefaultComboBoxModel) Combate_CB1.getModel();
        int edad = (Integer) Picaro_Edad.getValue();
        String nombre = Picaro_Nombre.getText();
        String raza = razas.get(Picaro_Raza.getSelectedIndex() ) ;
        String nacionalidad = ciudades.get(Picaro_Ciudad.getSelectedIndex() );
        Double height = (Double) Picaro_Height.getValue();
        Double peso = (Double) Picaro_Peso.getValue();
        String description = Picaro_Descripcion.getText();
        int AC = 50;
        int CS = 80;
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
        String Pclass = Picaro_Subclases.get(P_Subclases.getSelectedIndex() );
        String instrumento = Picaro_Instrumentos.get(P_Subclases.getSelectedIndex() );
        int heists = (Integer) Picaro_Heists.getValue();
        personajes.add(new Picaro(edad, nombre, raza, nacionalidad, height, peso, description, AC, CS, HP, Pclass, instrumento, heists) );
        JOptionPane.showMessageDialog(this, "Picaro Creado Exitosamente");
        
        Clerigo_Nombre.setText("");
        Clerigo_Descripcion.setText("");
        Clerigo_Dios.setText("");
        Clerigo_Invocacion.setText("");
        Lista = new DefaultComboBoxModel(personajes.toArray() );
        Combate_CB1.setModel(Lista);
        Combate_CB2.setModel(Lista);
    }//GEN-LAST:event_P_CrearMouseClicked

    private void PvPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PvPMouseClicked
        if (Combate_CB1.getSelectedIndex() == Combate_CB2.getSelectedIndex() ){
            JOptionPane.showMessageDialog(this, "No se permiten mirror matches");
        }else{
            showCombatDialog();
        }
    }//GEN-LAST:event_PvPMouseClicked

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
    public void showCombatDialog() {
        CombatDialog.setModal(true);
        CombatDialog.pack();
        CombatDialog.setLocationRelativeTo(this);
        CombatDialog.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Active_Player;
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
    private javax.swing.JButton C_Crear;
    private javax.swing.JComboBox<String> Clerigo_Ciudad;
    private javax.swing.JTextField Clerigo_Descripcion;
    private javax.swing.JTextField Clerigo_Dios;
    private javax.swing.JSpinner Clerigo_Edad;
    private javax.swing.JSpinner Clerigo_Height;
    private javax.swing.JTextField Clerigo_Invocacion;
    private javax.swing.JTextField Clerigo_Nombre;
    private javax.swing.JPanel Clerigo_Panel;
    private javax.swing.JSpinner Clerigo_Peso;
    private javax.swing.JComboBox<String> Clerigo_Raza;
    private javax.swing.JDialog CombatDialog;
    private javax.swing.JComboBox<String> Combate_CB1;
    private javax.swing.JComboBox<String> Combate_CB2;
    private javax.swing.JPanel Combate_Panel;
    private javax.swing.JComboBox<String> Instrumentos;
    private javax.swing.JPanel M_Background;
    private javax.swing.JButton M_Crear;
    private javax.swing.JComboBox<String> Mago_Ciudades;
    private javax.swing.JFormattedTextField Mago_Descripcion;
    private javax.swing.JSpinner Mago_Edad;
    private javax.swing.JSpinner Mago_Height;
    private javax.swing.JComboBox<String> Mago_Magia;
    private javax.swing.JTextField Mago_Nombre;
    private javax.swing.JPanel Mago_Panel;
    private javax.swing.JSpinner Mago_Peso;
    private javax.swing.JComboBox<String> Mago_Razas;
    private javax.swing.JComboBox<String> Mago_Subclase;
    private javax.swing.JLabel P1_AC;
    private javax.swing.JButton P1_Attack;
    private javax.swing.JLabel P1_Class;
    private javax.swing.JButton P1_Defend;
    private javax.swing.JLabel P1_Subclass;
    private javax.swing.JLabel P2_AC;
    private javax.swing.JButton P2_Attack;
    private javax.swing.JLabel P2_CS;
    private javax.swing.JLabel P2_Class;
    private javax.swing.JButton P2_Defend;
    private javax.swing.JLabel P2_HP;
    private javax.swing.JLabel P2_Subclass;
    private javax.swing.JButton P_Crear;
    private javax.swing.JComboBox<String> P_Subclases;
    private javax.swing.JComboBox<String> Picaro_Ciudad;
    private javax.swing.JTextField Picaro_Descripcion;
    private javax.swing.JSpinner Picaro_Edad;
    private javax.swing.JSpinner Picaro_Height;
    private javax.swing.JSpinner Picaro_Heists;
    private javax.swing.JTextField Picaro_Nombre;
    private javax.swing.JPanel Picaro_Panel;
    private javax.swing.JSpinner Picaro_Peso;
    private javax.swing.JComboBox<String> Picaro_Raza;
    private javax.swing.JButton PvE_A;
    private javax.swing.JButton PvE_T;
    private javax.swing.JButton PvP;
    private javax.swing.JLabel Turn_Label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
