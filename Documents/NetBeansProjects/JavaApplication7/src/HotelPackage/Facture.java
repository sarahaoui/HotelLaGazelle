package HotelPackage;

import static HotelPackage.dbConnection.con;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class Facture extends javax.swing.JFrame {
            
   Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
    public Facture() {
        setUndecorated(true);
        setResizable(false);
        Connection con = null;
         PreparedStatement pst = null;
        ResultSet rs = null;
        initComponents();
        updatecombox();
        showTableData();
        showTableDataa();
        this.dd.setVisible(false);
        this.ID.setVisible(false);
        this.fact.setVisible(false);
        
    }
    
    void ShowDate(){
    Date d = new Date();
    SimpleDateFormat s = new SimpleDateFormat ("dd-MM-yyyy");
    date.setText(s.format(d)); }
    
    
    private void deplace(int i){
       try {     //i represente les ligne 
     
       
       fact.setText(table1.getValueAt (i, 0).toString());
       ID.setText(table1.getValueAt (i, 1).toString());
       dd.setText(table1.getValueAt (i, 2).toString());
      
       
       }catch (Exception e){ JOptionPane.showMessageDialog(null,"erreur de deplacement de message !!!!! "+e.getMessage());}
      }
    
    private void deplacee(int i){
       try {     //i represente les ligne 
       
       fact.setText(table2.getValueAt (i, 0).toString());
       ID.setText(table2.getValueAt (i, 1).toString());
       dd.setText(table2.getValueAt (i, 2).toString());
      
       
       }catch (Exception e){ JOptionPane.showMessageDialog(null,"erreur de deplacement de message !!!!! "+e.getMessage());}
      }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        BNouveau = new javax.swing.JButton();
        Bsupprimer = new javax.swing.JButton();
        BFiche = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        Nom = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        Prenom = new javax.swing.JLabel();
        clt = new javax.swing.JComboBox<>();
        BCllient1 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        BNouveau1 = new javax.swing.JButton();
        Bsupprimer1 = new javax.swing.JButton();
        BFiche1 = new javax.swing.JButton();
        ID = new javax.swing.JLabel();
        dd = new javax.swing.JLabel();
        fact = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(2, 5, 8));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 236, 228));
        jLabel1.setText("Facture");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 14, 93, 32);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Crash.AMOULA-PC\\Desktop\\HotelLaGazelle\\Documents\\NetBeansProjects\\JavaApplication7\\src\\HotelPackage\\exitpng.png")); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1325, 14, 24, 25);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, 60));

        jPanel2.setBackground(new java.awt.Color(244, 240, 235));
        jPanel2.setLayout(null);

        jPanel8.setBackground(new java.awt.Color(250, 249, 248));
        jPanel8.setPreferredSize(new java.awt.Dimension(744, 35));
        jPanel8.setLayout(null);

        BNouveau.setBackground(new java.awt.Color(250, 249, 248));
        BNouveau.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        BNouveau.setForeground(new java.awt.Color(2, 5, 8));
        BNouveau.setIcon(new javax.swing.ImageIcon("C:\\Users\\Crash.AMOULA-PC\\Desktop\\HotelLaGazelle\\Documents\\NetBeansProjects\\JavaApplication7\\src\\HotelPackage\\plus.png")); // NOI18N
        BNouveau.setText("Ajouter");
        BNouveau.setPreferredSize(new java.awt.Dimension(150, 52));
        BNouveau.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BNouveauFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                BNouveauFocusLost(evt);
            }
        });
        BNouveau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BNouveauMousePressed(evt);
            }
        });
        BNouveau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNouveauActionPerformed(evt);
            }
        });
        jPanel8.add(BNouveau);
        BNouveau.setBounds(20, 0, 150, 43);

        Bsupprimer.setBackground(new java.awt.Color(250, 249, 248));
        Bsupprimer.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        Bsupprimer.setForeground(new java.awt.Color(2, 5, 8));
        Bsupprimer.setIcon(new javax.swing.ImageIcon("C:\\Users\\Crash.AMOULA-PC\\Desktop\\HotelLaGazelle\\Documents\\NetBeansProjects\\JavaApplication7\\src\\HotelPackage\\deleteclient.png")); // NOI18N
        Bsupprimer.setText(" Supprimer");
        Bsupprimer.setPreferredSize(new java.awt.Dimension(150, 52));
        Bsupprimer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BsupprimerFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                BsupprimerFocusLost(evt);
            }
        });
        Bsupprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BsupprimerMousePressed(evt);
            }
        });
        Bsupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsupprimerActionPerformed(evt);
            }
        });
        jPanel8.add(Bsupprimer);
        Bsupprimer.setBounds(210, 0, 170, 43);

        BFiche.setBackground(new java.awt.Color(250, 249, 248));
        BFiche.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        BFiche.setForeground(new java.awt.Color(2, 5, 8));
        BFiche.setText(" Modifier");
        BFiche.setPreferredSize(new java.awt.Dimension(150, 52));
        BFiche.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BFicheFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                BFicheFocusLost(evt);
            }
        });
        BFiche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BFicheMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BFicheMouseClicked(evt);
            }
        });
        BFiche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFicheActionPerformed(evt);
            }
        });
        jPanel8.add(BFiche);
        BFiche.setBounds(420, 0, 160, 43);

        jPanel2.add(jPanel8);
        jPanel8.setBounds(660, 450, 601, 45);

        jPanel18.setBackground(new java.awt.Color(250, 249, 248));
        jPanel18.setLayout(null);

        table2.setBackground(new java.awt.Color(255, 255, 255));
        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Facture", "IDAppel", "Duree", "Prix"
            }
        ));
        table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table2);

        jPanel18.add(jScrollPane3);
        jScrollPane3.setBounds(10, 30, 580, 150);

        jPanel2.add(jPanel18);
        jPanel18.setBounds(660, 230, 600, 210);

        jPanel9.setBackground(new java.awt.Color(250, 249, 248));
        jPanel9.setLayout(null);

        table1.setBackground(new java.awt.Color(255, 255, 255));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Facture", "IDProduit", "Quantite", "Prix"
            }
        ));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table1);

        jPanel9.add(jScrollPane2);
        jScrollPane2.setBounds(10, 30, 577, 149);

        jPanel2.add(jPanel9);
        jPanel9.setBounds(50, 230, 601, 210);

        jPanel5.setBackground(new java.awt.Color(250, 249, 248));
        jPanel5.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Bell MT", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(2, 5, 8));
        jLabel8.setText("ID Client");
        jPanel5.add(jLabel8);
        jLabel8.setBounds(30, 10, 83, 30);

        date.setBackground(java.awt.Color.white);
        date.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        date.setOpaque(true);
        jPanel5.add(date);
        date.setBounds(960, 60, 160, 30);

        Nom.setBackground(java.awt.Color.white);
        Nom.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        Nom.setOpaque(true);
        jPanel5.add(Nom);
        Nom.setBounds(150, 60, 170, 30);

        jPanel12.setBackground(new java.awt.Color(244, 240, 235));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel12);
        jPanel12.setBounds(20, 10, 110, 30);

        jPanel14.setBackground(new java.awt.Color(244, 240, 235));

        jLabel18.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(2, 5, 8));

        jLabel9.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(2, 5, 8));
        jLabel9.setText("Date de facturation");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel5.add(jPanel14);
        jPanel14.setBounds(750, 60, 200, 30);

        jLabel17.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(2, 5, 8));
        jLabel17.setText("Nom");
        jPanel5.add(jLabel17);
        jLabel17.setBounds(30, 60, 56, 30);

        jPanel16.setBackground(new java.awt.Color(244, 240, 235));

        jLabel19.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(2, 5, 8));
        jLabel19.setText(" Prénom");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.add(jPanel16);
        jPanel16.setBounds(400, 60, 110, 30);

        jPanel15.setBackground(new java.awt.Color(244, 240, 235));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel15);
        jPanel15.setBounds(20, 60, 110, 30);

        Prenom.setBackground(java.awt.Color.white);
        Prenom.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        Prenom.setOpaque(true);
        jPanel5.add(Prenom);
        Prenom.setBounds(520, 60, 170, 30);

        clt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OPEN" }));
        clt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cltActionPerformed(evt);
            }
        });
        jPanel5.add(clt);
        clt.setBounds(200, 10, 211, 30);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(72, 19, 1130, 110);

        BCllient1.setBackground(new java.awt.Color(0, 0, 0));
        BCllient1.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        BCllient1.setForeground(new java.awt.Color(250, 249, 248));
        BCllient1.setText("Afficher Facture");
        BCllient1.setPreferredSize(new java.awt.Dimension(150, 52));
        BCllient1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BCllient1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                BCllient1FocusLost(evt);
            }
        });
        BCllient1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BCllient1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BCllient1MousePressed(evt);
            }
        });
        BCllient1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCllient1ActionPerformed(evt);
            }
        });
        jPanel2.add(BCllient1);
        BCllient1.setBounds(1120, 640, 210, 43);

        jPanel11.setBackground(new java.awt.Color(250, 249, 248));
        jPanel11.setLayout(null);
        jPanel2.add(jPanel11);
        jPanel11.setBounds(660, 230, 0, 210);

        jPanel10.setBackground(new java.awt.Color(250, 249, 248));
        jPanel10.setPreferredSize(new java.awt.Dimension(744, 35));
        jPanel10.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Bell MT", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(2, 5, 8));
        jLabel5.setText("Consommation Appel");
        jPanel10.add(jLabel5);
        jLabel5.setBounds(28, 12, 189, 23);

        jPanel2.add(jPanel10);
        jPanel10.setBounds(660, 180, 601, 45);

        jPanel13.setBackground(new java.awt.Color(250, 249, 248));
        jPanel13.setPreferredSize(new java.awt.Dimension(744, 35));
        jPanel13.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Bell MT", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(2, 5, 8));
        jLabel6.setText("Consommation Produit");
        jPanel13.add(jLabel6);
        jLabel6.setBounds(28, 12, 205, 23);

        jPanel2.add(jPanel13);
        jPanel13.setBounds(50, 180, 601, 45);

        jPanel17.setBackground(new java.awt.Color(250, 249, 248));
        jPanel17.setPreferredSize(new java.awt.Dimension(744, 35));
        jPanel17.setLayout(null);

        BNouveau1.setBackground(new java.awt.Color(250, 249, 248));
        BNouveau1.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        BNouveau1.setForeground(new java.awt.Color(2, 5, 8));
        BNouveau1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Crash.AMOULA-PC\\Desktop\\HotelLaGazelle\\Documents\\NetBeansProjects\\JavaApplication7\\src\\HotelPackage\\plus.png")); // NOI18N
        BNouveau1.setText("Ajouter");
        BNouveau1.setPreferredSize(new java.awt.Dimension(150, 52));
        BNouveau1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BNouveau1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                BNouveau1FocusLost(evt);
            }
        });
        BNouveau1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BNouveau1MousePressed(evt);
            }
        });
        BNouveau1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNouveau1ActionPerformed(evt);
            }
        });
        jPanel17.add(BNouveau1);
        BNouveau1.setBounds(20, 0, 150, 43);

        Bsupprimer1.setBackground(new java.awt.Color(250, 249, 248));
        Bsupprimer1.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        Bsupprimer1.setForeground(new java.awt.Color(2, 5, 8));
        Bsupprimer1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Crash.AMOULA-PC\\Desktop\\HotelLaGazelle\\Documents\\NetBeansProjects\\JavaApplication7\\src\\HotelPackage\\deleteclient.png")); // NOI18N
        Bsupprimer1.setText(" Supprimer");
        Bsupprimer1.setPreferredSize(new java.awt.Dimension(150, 52));
        Bsupprimer1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Bsupprimer1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Bsupprimer1FocusLost(evt);
            }
        });
        Bsupprimer1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Bsupprimer1MousePressed(evt);
            }
        });
        Bsupprimer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bsupprimer1ActionPerformed(evt);
            }
        });
        jPanel17.add(Bsupprimer1);
        Bsupprimer1.setBounds(210, 0, 170, 43);

        BFiche1.setBackground(new java.awt.Color(250, 249, 248));
        BFiche1.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        BFiche1.setForeground(new java.awt.Color(2, 5, 8));
        BFiche1.setText(" Modifier");
        BFiche1.setPreferredSize(new java.awt.Dimension(150, 52));
        BFiche1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BFiche1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                BFiche1FocusLost(evt);
            }
        });
        BFiche1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BFiche1MousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BFiche1MouseClicked(evt);
            }
        });
        BFiche1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFiche1ActionPerformed(evt);
            }
        });
        jPanel17.add(BFiche1);
        BFiche1.setBounds(420, 0, 160, 43);

        ID.setBackground(java.awt.Color.white);
        ID.setOpaque(true);
        jPanel17.add(ID);
        ID.setBounds(100, 130, 160, 40);

        jPanel2.add(jPanel17);
        jPanel17.setBounds(50, 450, 601, 45);

        dd.setText("jLabel2");
        jPanel2.add(dd);
        dd.setBounds(70, 590, 80, 15);
        jPanel2.add(fact);
        fact.setBounds(130, 550, 34, 15);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1460, 960));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed

        this.dispose();
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

    private void BCllient1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCllient1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BCllient1ActionPerformed

    private void BCllient1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BCllient1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BCllient1MouseClicked

    private void BCllient1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BCllient1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BCllient1MousePressed

    private void BCllient1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BCllient1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_BCllient1FocusLost

    private void BCllient1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BCllient1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_BCllient1FocusGained

    private void BsupprimerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BsupprimerFocusGained

    }//GEN-LAST:event_BsupprimerFocusGained

    private void BsupprimerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BsupprimerFocusLost

    }//GEN-LAST:event_BsupprimerFocusLost

    private void BsupprimerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BsupprimerMousePressed

    }//GEN-LAST:event_BsupprimerMousePressed

    private void BsupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsupprimerActionPerformed
try{
            String sql = " DELETE FROM `consommationappels` WHERE IDAppel = ? AND IDFacture=? AND duree=?";

            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost/hotellagazelle","root","");
            pst =con.prepareStatement(sql);
            pst.setString(1,fact.getText());
            pst.setString(2,ID.getText());
            pst.setString(3,dd.getText());
           
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Supprimer avec succès");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        } showTableDataa();

    }//GEN-LAST:event_BsupprimerActionPerformed

    private void BNouveauFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BNouveauFocusGained

    }//GEN-LAST:event_BNouveauFocusGained

    private void BNouveauFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BNouveauFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_BNouveauFocusLost

    private void BNouveauMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BNouveauMousePressed

    }//GEN-LAST:event_BNouveauMousePressed

    private void BNouveauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNouveauActionPerformed
        AddConsoProduit p = new AddConsoProduit();
        p.setVisible(true);
        this.dispose();   
    }//GEN-LAST:event_BNouveauActionPerformed

    private void BFicheFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BFicheFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_BFicheFocusGained

    private void BFicheFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BFicheFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_BFicheFocusLost

    private void BFicheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BFicheMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BFicheMouseClicked

    private void BFicheMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BFicheMousePressed

        
    }//GEN-LAST:event_BFicheMousePressed

    private void BFicheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFicheActionPerformed
        ModifierConsoProduit p = new ModifierConsoProduit();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BFicheActionPerformed

    private void BNouveau1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BNouveau1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_BNouveau1FocusGained

    private void BNouveau1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BNouveau1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_BNouveau1FocusLost

    private void BNouveau1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BNouveau1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BNouveau1MousePressed

    private void BNouveau1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNouveau1ActionPerformed
        AddConsoProduit p = new AddConsoProduit();
        p.setVisible(true);
        this.dispose();         
    }//GEN-LAST:event_BNouveau1ActionPerformed

    private void Bsupprimer1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Bsupprimer1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_Bsupprimer1FocusGained

    private void Bsupprimer1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Bsupprimer1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_Bsupprimer1FocusLost

    private void Bsupprimer1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bsupprimer1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bsupprimer1MousePressed

    private void Bsupprimer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bsupprimer1ActionPerformed
        try{
            String sql = " DELETE FROM `consommationproduits` WHERE  IDFacture=?  AND IDproduit = ? AND quantite= ?";

            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost/hotellagazelle","root","");
            pst =con.prepareStatement(sql);
            pst.setString(1,fact.getText());
            pst.setString(2,ID.getText());
            pst.setString(3,dd.getText());  
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Supprimer avec succès");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        } showTableData();
    }//GEN-LAST:event_Bsupprimer1ActionPerformed

    private void BFiche1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BFiche1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_BFiche1FocusGained

    private void BFiche1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BFiche1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_BFiche1FocusLost

    private void BFiche1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BFiche1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BFiche1MouseClicked

    private void BFiche1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BFiche1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BFiche1MousePressed

    private void BFiche1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFiche1ActionPerformed
        ModifierConsoProduit p = new ModifierConsoProduit();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BFiche1ActionPerformed

    private void cltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cltActionPerformed
       String Client= clt.getSelectedItem().toString();
        try{
      

                Class.forName("com.mysql.jdbc.Driver");
            System.err.println("connected");
            Connection cnx =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotellagazelle","root","");
            Statement st =cnx.createStatement();
            String SQL = "SELECT `Nom`, `Prenom` FROM `clientt` WHERE Id_client ="+Client+ "";
             ResultSet rs= st.executeQuery(SQL);
            while(rs.next()){
                String NomClient = String.valueOf(rs.getString("Nom"));
                String PrenomClient = String.valueOf(rs.getString("Prenom"));
                
                Nom.setText(NomClient);
                Prenom.setText(PrenomClient);
                ShowDate();
                

             

         }}
            catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex);
            }
        
    }//GEN-LAST:event_cltActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        try {  int i=table1.getSelectedRow();
            deplace(i);
            //sa si quant on choisir un nom dans le tableau il va afficher sur les fieldtext
        }
        catch (Exception e){JOptionPane.showMessageDialog(null,"erreur selectionne\n"+e.getMessage());  }
    }//GEN-LAST:event_table1MouseClicked

    private void table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table2MouseClicked
 try {  int i=table2.getSelectedRow();
            deplacee(i);
            //sa si quant on choisir un nom dans le tableau il va afficher sur les fieldtext
        }
        catch (Exception e){JOptionPane.showMessageDialog(null,"erreur selectionne\n"+e.getMessage());  }         
    }//GEN-LAST:event_table2MouseClicked

      public void updatecombox(){
    
    try{
           Class.forName("com.mysql.jdbc.Driver");
            System.err.println("connected");
            Connection cnx =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotellagazelle","root","");
            Statement st =cnx.createStatement();
            //requete
            String SQL="select Id_client from clientt;";
            ResultSet rs= st.executeQuery(SQL);
            while(rs.next()){
                //add data until finish
              clt.addItem(rs.getString("Id_client"));
            }
            cnx.close();
            
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);}
    }
    
    /////////////////////////////////
      
        
      public void showTableData(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/hotellagazelle","root",""); 
       
      String sql =   "SELECT IDFacture,IDproduit,quantite,prixTotal FROM  consommationproduits ";
  
          pst =con.prepareStatement(sql);
          rs= pst.executeQuery();
          table1.setModel(DbUtils.resultSetToTableModel(rs));
       }
    catch(Exception ex){
        JOptionPane.showMessageDialog(null,ex);
     }
     }
      
      public void showTableDataa(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/hotellagazelle","root",""); 
      
      String sql =   "SELECT 	IDFacture,IDAppel, duree,prixTotal FROM  consommationappels ";
  
          pst =con.prepareStatement(sql);
          rs= pst.executeQuery();
          table2.setModel(DbUtils.resultSetToTableModel(rs));
       }
    catch(Exception ex){
        JOptionPane.showMessageDialog(null,ex);
     }
     }
      
      
      
    
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
            java.util.logging.Logger.getLogger(Facture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Facture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Facture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Facture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Facture().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCllient1;
    private javax.swing.JButton BFiche;
    private javax.swing.JButton BFiche1;
    private javax.swing.JButton BNouveau;
    private javax.swing.JButton BNouveau1;
    private javax.swing.JButton Bsupprimer;
    private javax.swing.JButton Bsupprimer1;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel Nom;
    private javax.swing.JLabel Prenom;
    private javax.swing.JComboBox<String> clt;
    private javax.swing.JLabel date;
    private javax.swing.JLabel dd;
    private javax.swing.JLabel fact;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable table1;
    private javax.swing.JTable table2;
    // End of variables declaration//GEN-END:variables
}
