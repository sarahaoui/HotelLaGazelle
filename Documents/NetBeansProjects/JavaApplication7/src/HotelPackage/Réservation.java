
package HotelPackage;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Réservation extends javax.swing.JFrame {
         double prixsalle;
         double prixchambreeee;
         double prixtotale;
            String DateDS;
            String DateFS;  
                
    public Réservation() {
       setUndecorated(true);
        setResizable(false); 
        initComponents();
        
        NSalle.setVisible(false);
        NSalles.setVisible(false);
        Nchambre.setVisible(false);
        Nchambres.setVisible(false);
        
        CatégorieChambre.setVisible(false);
        ctgSalle.setVisible(false);
        catégorieSalle.setVisible(false);
        CtgCh.setVisible(false);
        
        prixchambre.setVisible(false);
        prixsallee.setVisible(false);
        prixsc.setVisible(false);
        
        prix1.setEditable(false);
        duree.setEditable(false);
        prixsc.setEditable(false);
        updatecombox();
        
       
        
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Nsalle = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        confirmer = new javax.swing.JButton();
        annuler = new javax.swing.JButton();
        DateD = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        nom = new javax.swing.JTextField();
        prenom = new javax.swing.JTextField();
        clt = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        DateF = new com.toedter.calendar.JDateChooser();
        jLabel19 = new javax.swing.JLabel();
        duree = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        CatégorieChambre = new javax.swing.JLabel();
        catégorieSalle = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
        ctgSalle = new javax.swing.JComboBox<>();
        CtgCh = new javax.swing.JComboBox<>();
        Nchambre = new javax.swing.JLabel();
        NSalle = new javax.swing.JLabel();
        NSalles = new javax.swing.JComboBox<>();
        Nchambres = new javax.swing.JComboBox<>();
        prixchambre = new javax.swing.JLabel();
        prixsallee = new javax.swing.JLabel();
        prix1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        prixsc = new javax.swing.JTextField();
        ReservationS = new javax.swing.JButton();
        ReservationC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(2, 5, 8));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 236, 228));
        jLabel1.setText("Réservation");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(21, 14, 145, 32);

        jButton1.setBackground(new java.awt.Color(0, 0, 0,0));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc-click\\Documents\\NetBeansProjects\\HotelLaGazellee\\Documents\\NetBeansProjects\\JavaApplication7\\src\\HotelPackage\\exitpng.png")); // NOI18N
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

        Nsalle.setBackground(new java.awt.Color(244, 240, 235));
        Nsalle.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(2, 5, 8));
        jLabel17.setText("Date de début");
        Nsalle.add(jLabel17);
        jLabel17.setBounds(90, 130, 126, 40);

        confirmer.setBackground(new java.awt.Color(0, 0, 0));
        confirmer.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        confirmer.setForeground(new java.awt.Color(250, 249, 248));
        confirmer.setText("Confirmer");
        confirmer.setPreferredSize(new java.awt.Dimension(150, 52));
        confirmer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confirmerFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                confirmerFocusLost(evt);
            }
        });
        confirmer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmerMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                confirmerMousePressed(evt);
            }
        });
        confirmer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmerActionPerformed(evt);
            }
        });
        Nsalle.add(confirmer);
        confirmer.setBounds(1030, 540, 133, 43);

        annuler.setBackground(new java.awt.Color(0, 0, 0));
        annuler.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        annuler.setForeground(new java.awt.Color(250, 249, 248));
        annuler.setText("Annuler");
        annuler.setPreferredSize(new java.awt.Dimension(150, 52));
        annuler.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                annulerFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                annulerFocusLost(evt);
            }
        });
        annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerActionPerformed(evt);
            }
        });
        Nsalle.add(annuler);
        annuler.setBounds(1170, 540, 120, 43);

        DateD.setBackground(new java.awt.Color(250, 249, 248));
        DateD.setForeground(new java.awt.Color(2, 5, 8));
        DateD.setDateFormatString("yyyy-MM-dd");
        DateD.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        DateD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DateDMousePressed(evt);
            }
        });
        Nsalle.add(DateD);
        DateD.setBounds(320, 130, 260, 38);

        jPanel2.setBackground(new java.awt.Color(250, 249, 248));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nom.setBackground(new java.awt.Color(250, 250, 250));
        nom.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        nom.setForeground(new java.awt.Color(2, 5, 8));
        nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomActionPerformed(evt);
            }
        });
        jPanel2.add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 260, 38));

        prenom.setBackground(new java.awt.Color(250, 250, 250));
        prenom.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        prenom.setForeground(new java.awt.Color(2, 5, 8));
        prenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prenomActionPerformed(evt);
            }
        });
        jPanel2.add(prenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 260, 38));

        clt.setBackground(new java.awt.Color(250, 249, 248));
        clt.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        clt.setForeground(new java.awt.Color(2, 5, 8));
        clt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cltActionPerformed(evt);
            }
        });
        jPanel2.add(clt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 260, 40));

        jLabel27.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(2, 5, 8));
        jLabel27.setText("Nom");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, 40));

        jLabel26.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(2, 5, 8));
        jLabel26.setText("Client liée");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, 40));

        jLabel25.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(2, 5, 8));
        jLabel25.setText("Prénom");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 91, 40));

        Nsalle.add(jPanel2);
        jPanel2.setBounds(50, 350, 620, 210);

        jPanel3.setBackground(new java.awt.Color(250, 249, 248));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(2, 5, 8));
        jLabel18.setText("La durée de réservation");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 230, 40));

        DateF.setBackground(new java.awt.Color(250, 249, 248));
        DateF.setForeground(new java.awt.Color(2, 5, 8));
        DateF.setDateFormatString("yyyy-MM-dd");
        DateF.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        jPanel3.add(DateF, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 260, 38));

        jLabel19.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(2, 5, 8));
        jLabel19.setText("Date de fin");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 110, -1));

        duree.setBackground(new java.awt.Color(250, 250, 250));
        duree.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        duree.setForeground(new java.awt.Color(2, 5, 8));
        jPanel3.add(duree, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 260, 38));

        Nsalle.add(jPanel3);
        jPanel3.setBounds(50, 110, 620, 230);

        jPanel4.setBackground(new java.awt.Color(250, 249, 248));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CatégorieChambre.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        CatégorieChambre.setForeground(new java.awt.Color(2, 5, 8));
        CatégorieChambre.setText("Catégorie de chambre");
        jPanel4.add(CatégorieChambre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, 40));

        catégorieSalle.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        catégorieSalle.setForeground(new java.awt.Color(2, 5, 8));
        catégorieSalle.setText("Catégorie de salle");
        jPanel4.add(catégorieSalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 210, 40));

        jLabel20.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(2, 5, 8));
        jLabel20.setText("Type de réservation");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 40));

        type.setBackground(new java.awt.Color(250, 249, 248));
        type.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        type.setForeground(new java.awt.Color(2, 5, 8));
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chambre", "Salle", " " }));
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        jPanel4.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 260, 40));

        ctgSalle.setBackground(new java.awt.Color(250, 249, 248));
        ctgSalle.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        ctgSalle.setForeground(new java.awt.Color(2, 5, 8));
        ctgSalle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Salle de formation", "Salle d audition", "Salle de conference", "Salle de reunion", "Salle de seminaire", " ", " " }));
        ctgSalle.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ctgSalleItemStateChanged(evt);
            }
        });
        ctgSalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctgSalleActionPerformed(evt);
            }
        });
        jPanel4.add(ctgSalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 260, 40));

        CtgCh.setBackground(new java.awt.Color(250, 249, 248));
        CtgCh.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        CtgCh.setForeground(new java.awt.Color(2, 5, 8));
        CtgCh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Standard ", "Standard vue Mer", "Luxe vue Jardin", "Luxe vue Mer", " " }));
        CtgCh.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CtgChItemStateChanged(evt);
            }
        });
        CtgCh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CtgChActionPerformed(evt);
            }
        });
        jPanel4.add(CtgCh, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 260, 40));

        Nchambre.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        Nchambre.setForeground(new java.awt.Color(2, 5, 8));
        Nchambre.setText("N° de chambre");
        jPanel4.add(Nchambre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 190, 40));

        NSalle.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        NSalle.setForeground(new java.awt.Color(2, 5, 8));
        NSalle.setText("N° de Salle");
        jPanel4.add(NSalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 190, 40));

        NSalles.setBackground(new java.awt.Color(250, 249, 248));
        NSalles.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        NSalles.setForeground(new java.awt.Color(2, 5, 8));
        NSalles.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                NSallesItemStateChanged(evt);
            }
        });
        NSalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NSallesActionPerformed(evt);
            }
        });
        jPanel4.add(NSalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 260, 38));

        Nchambres.setBackground(new java.awt.Color(250, 249, 248));
        Nchambres.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        Nchambres.setForeground(new java.awt.Color(2, 5, 8));
        Nchambres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        Nchambres.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                NchambresItemStateChanged(evt);
            }
        });
        Nchambres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NchambresActionPerformed(evt);
            }
        });
        jPanel4.add(Nchambres, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 260, 38));

        prixchambre.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        prixchambre.setForeground(new java.awt.Color(2, 5, 8));
        prixchambre.setText("Prix de chambre");
        jPanel4.add(prixchambre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 150, 50));

        prixsallee.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        prixsallee.setForeground(new java.awt.Color(2, 5, 8));
        prixsallee.setText("Prix de salle");
        jPanel4.add(prixsallee, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 150, 50));

        prix1.setBackground(new java.awt.Color(250, 250, 250));
        prix1.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        prix1.setForeground(new java.awt.Color(2, 5, 8));
        jPanel4.add(prix1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 260, 38));

        jLabel21.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(2, 5, 8));
        jLabel21.setText("Prix total");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 150, 50));

        prixsc.setBackground(new java.awt.Color(250, 250, 250));
        prixsc.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        prixsc.setForeground(new java.awt.Color(2, 5, 8));
        prixsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prixscActionPerformed(evt);
            }
        });
        jPanel4.add(prixsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 260, 38));

        Nsalle.add(jPanel4);
        jPanel4.setBounds(680, 110, 630, 320);

        ReservationS.setBackground(new java.awt.Color(0, 0, 0));
        ReservationS.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        ReservationS.setForeground(new java.awt.Color(250, 249, 248));
        ReservationS.setText("Reservation salle");
        ReservationS.setPreferredSize(new java.awt.Dimension(150, 52));
        ReservationS.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ReservationSFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ReservationSFocusLost(evt);
            }
        });
        ReservationS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReservationSMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ReservationSMousePressed(evt);
            }
        });
        ReservationS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservationSActionPerformed(evt);
            }
        });
        Nsalle.add(ReservationS);
        ReservationS.setBounds(850, 40, 200, 43);

        ReservationC.setBackground(new java.awt.Color(0, 0, 0));
        ReservationC.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        ReservationC.setForeground(new java.awt.Color(250, 249, 248));
        ReservationC.setText("Reservation chambre");
        ReservationC.setPreferredSize(new java.awt.Dimension(150, 52));
        ReservationC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ReservationCFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ReservationCFocusLost(evt);
            }
        });
        ReservationC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservationCActionPerformed(evt);
            }
        });
        Nsalle.add(ReservationC);
        ReservationC.setBounds(1060, 40, 230, 43);

        getContentPane().add(Nsalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1460, 960));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
       

    }//GEN-LAST:event_jButton1MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Accueil().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
         DateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
         DateDS=sdf.format(DateD.getDate());
         DateFS=sdf.format(DateF.getDate());
        if(type.getSelectedItem().equals("Chambre")){
        NSalle.setVisible(false);
        NSalles.setVisible(false);
        Nchambre.setVisible(true);
        Nchambres.setVisible(true);
        
        CatégorieChambre.setVisible(true);
        ctgSalle.setVisible(false);
        catégorieSalle.setVisible(false);
        CtgCh.setVisible(true);
        
        prixchambre.setVisible(true);
        prixsallee.setVisible(false);
        prixsc.setVisible(true);
          

        }
        else {
        NSalle.setVisible(true);
        NSalles.setVisible(true);
        Nchambre.setVisible(false);
        Nchambres.setVisible(false);
        
        CatégorieChambre.setVisible(false);
        ctgSalle.setVisible(true);
        catégorieSalle.setVisible(true);
        CtgCh.setVisible(false);
        
        prixchambre.setVisible(false);
        prixsallee.setVisible(true);
        prixsc.setVisible(true);
           
        }
    }//GEN-LAST:event_typeActionPerformed

    private void cltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cltActionPerformed
   try{
           Class.forName("com.mysql.jdbc.Driver");
            System.err.println("connected");
            Connection cnx =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotellagazelle","root","");
            Statement st =cnx.createStatement();
            //requete
            String SQL="SELECT Nom,Prenom FROM `clientt` WHERE Id_client ='"+clt.getSelectedItem().toString()+"'";
            ResultSet rs= st.executeQuery(SQL);
            while(rs.next()){
               nom.setText(rs.getString("Nom"));
               prenom.setText(rs.getString("Prenom"));
            }
            cnx.close();
            
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);} 
    }//GEN-LAST:event_cltActionPerformed

    private void annulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerActionPerformed
        new Accueil().setVisible(false);
        this.dispose();
    }//GEN-LAST:event_annulerActionPerformed

    private void annulerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_annulerFocusLost
        annuler.setBackground(new java.awt.Color(0,0,0));
        annuler.setForeground(new java.awt.Color(250,249,248));
    }//GEN-LAST:event_annulerFocusLost

    private void annulerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_annulerFocusGained
        annuler.setBackground(new java.awt.Color(250,249,248));
        annuler.setForeground(new java.awt.Color(2, 5, 8));
    }//GEN-LAST:event_annulerFocusGained

    private void confirmerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmerActionPerformed
        DateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
         String DateDS=sdf.format(DateD.getDate());
         String DateFS=sdf.format(DateF.getDate());
         Double prixx = Double.parseDouble(prix1.getText().toString());
        if(type.getSelectedItem().equals("Chambre")){
            
            try{
                Class.forName("com.mysql.jdbc.Driver");
                System.err.println("connected");
                 Connection cnx =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotellagazelle","root","");
                 String sql = "INSERT INTO reservationchambre(IDChambre,"
                + " IDClient,DateD,DateF,prixTotal) "
                + "VALUES (?,?,?,?,?)";
                PreparedStatement pst =cnx.prepareStatement(sql);
                pst.setString(1,Nchambres.getSelectedItem().toString());
                pst.setString(2,clt.getSelectedItem().toString());
                pst.setString(3,DateDS);
                pst.setString(4,DateFS);
                pst.setDouble(5,prixx);
              
                pst.executeUpdate();
                
                JOptionPane.showMessageDialog(this,"Inséré avec succès","info",JOptionPane.INFORMATION_MESSAGE);
                ReservationCham p = new ReservationCham();
                p.setVisible(true);
                this.dispose();
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex);
            }
        }
        else {
            try{
               

                 Class.forName("com.mysql.jdbc.Driver");
                System.err.println("connected");
                 Connection cnx =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotellagazelle","root","");
                  String sql = "INSERT INTO `reservationsalle`(IDSalle, "
                + "IDClient, DateD, DateF, prixTotal) "
                + "VALUES (?,?,?,?,?)";
               PreparedStatement pst =cnx.prepareStatement(sql);
                pst.setString(1,NSalles.getSelectedItem().toString());
                pst.setString(2,clt.getSelectedItem().toString());
                pst.setString(3,DateDS);
                pst.setString(4,DateFS);
                pst.setDouble(5,prixx);
                pst.executeUpdate();

                JOptionPane.showMessageDialog(this,"Inséré avec succès","info",JOptionPane.INFORMATION_MESSAGE);
                ReservationSalle p = new ReservationSalle();
                p.setVisible(true);
                this.dispose();
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex);
            }
        }
    }//GEN-LAST:event_confirmerActionPerformed

    private void confirmerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmerMousePressed

    }//GEN-LAST:event_confirmerMousePressed

    private void confirmerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmerMouseClicked
        new Client().setVisible(true);
        //this.setVisible(false);
        //this.dispose();
    }//GEN-LAST:event_confirmerMouseClicked

    private void confirmerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmerFocusLost
        confirmer.setBackground(new java.awt.Color(0,0,0));
        confirmer.setForeground(new java.awt.Color(250,249,248));
    }//GEN-LAST:event_confirmerFocusLost

    private void confirmerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmerFocusGained
        confirmer.setBackground(new java.awt.Color(250,249,248));
        confirmer.setForeground(new java.awt.Color(2, 5, 8));
    }//GEN-LAST:event_confirmerFocusGained

    private void NchambresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NchambresActionPerformed
       //calculer le prix Total
     /*  duree.setText("");
       prix1.setText("");
       long duration= ChronoUnit.DAYS.between(DateD.getDate().toInstant(), DateF.getDate().toInstant());
       if(!(Nchambres.getSelectedItem().toString().isEmpty())){
       try{
           Class.forName("com.mysql.jdbc.Driver");
            System.err.println("connected");
            Connection cnx =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotellagazelle","root","");
            //requete
            String SQL="SELECT PrixChambre FROM `chambre` WHERE NumChambre = '"+ Nchambres.getSelectedItem().toString()+"'" ;
            Statement st =cnx.createStatement();
            ResultSet rs= st.executeQuery(SQL);
             while(rs.next()){
               prixchambreeee= rs.getDouble("PrixChambre"); 
               prixsc.setText(String.valueOf(prixchambreeee));
                
            }
            cnx.close();
            
            
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);} 
            duree.setText(String.valueOf(duration)+" jours");
            prixtotale= duration * prixchambreeee;
            prix1.setText(String.valueOf(prixtotale));}*/
      
       
    }//GEN-LAST:event_NchambresActionPerformed

    private void DateDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DateDMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateDMousePressed

    private void CtgChActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CtgChActionPerformed
      /*  Nchambres.removeAllItems();
        prixsc.setText("");
        duree.setText("");
        prix1.setText("");
        try{
           Class.forName("com.mysql.jdbc.Driver");
            System.err.println("connected");
            Connection cnx =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotellagazelle","root","");
            Statement st =cnx.createStatement();
            //requete
            String SQL="SELECT NumChambre FROM `chambre` WHERE NumChambre not IN(SELECT IDChambre FROM reservationchambre WHERE DateD <= '"+DateFS+"' \n" + " AND  DateF >= '" +DateDS+"') AND chambre.Categorie='"+CtgCh.getSelectedItem().toString()+"'";
            ResultSet rs= st.executeQuery(SQL);
            if(!rs.isBeforeFirst()){}
            else{
            while(rs.next()){
                //add data until finish
              Nchambres.addItem(rs.getString("NumChambre"));}
            }
            cnx.close();
            
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);        }*/
    }//GEN-LAST:event_CtgChActionPerformed

    private void ctgSalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctgSalleActionPerformed
          /* NSalles.removeAllItems();
           prixsc.setText(""); 
           duree.setText("");
            prix1.setText("");
        try{
           Class.forName("com.mysql.jdbc.Driver");
            System.err.println("connected");
            Connection cnx =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotellagazelle","root","");
            Statement st =cnx.createStatement();
            //requete
            String SQL="SELECT NumSalle FROM `salle` WHERE NumSalle not IN(SELECT IDSalle FROM reservationsalle WHERE DateD <= '"+DateFS+"' \n" + " AND  DateF >= '" +DateDS+"') AND salle.CategorieSalle='"+ctgSalle.getSelectedItem().toString()+"'";
            ResultSet rs= st.executeQuery(SQL);
            if(!rs.isBeforeFirst()){
                
            }else{
            while(rs.next()){
                //add data until finish
              NSalles.addItem(rs.getString("NumSalle"));} 
            }

            cnx.close();
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);} */
    }//GEN-LAST:event_ctgSalleActionPerformed

    private void NSallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NSallesActionPerformed
       //calculer le prix Total
          /*  duree.setText("");
            prix1.setText("");
            prixsc.setText(""); 
       long duration= ChronoUnit.DAYS.between(DateD.getDate().toInstant(), DateF.getDate().toInstant());
        if(!(NSalles.getSelectedItem().toString().isEmpty())){
       try{
           Class.forName("com.mysql.jdbc.Driver");
            System.err.println("connected");
            Connection cnx =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotellagazelle","root","");
            //requete
            String SQL="SELECT PrixSalle FROM `salle` WHERE NumSalle = '"+ NSalles.getSelectedItem().toString()+"'" ;
            Statement st =cnx.createStatement();
            ResultSet rs= st.executeQuery(SQL);
             while(rs.next()){
               prixsalle= rs.getDouble("PrixSalle"); 
               prixsc.setText(String.valueOf(prixsalle));
            }
            cnx.close();
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);} 
      
       duree.setText(String.valueOf(duration)+" jours");
       prixtotale= duration * prixsalle;
       prix1.setText(String.valueOf(prixtotale));}*/
       
    }//GEN-LAST:event_NSallesActionPerformed

    private void prenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prenomActionPerformed

    private void nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomActionPerformed

    private void ReservationSFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ReservationSFocusGained
       ReservationS.setBackground(new java.awt.Color(250,249,248));
        ReservationS.setForeground(new java.awt.Color(2, 5, 8));
    }//GEN-LAST:event_ReservationSFocusGained

    private void ReservationSFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ReservationSFocusLost
        ReservationS.setBackground(new java.awt.Color(0,0,0));
        ReservationS.setForeground(new java.awt.Color(250,249,248));
    }//GEN-LAST:event_ReservationSFocusLost

    private void ReservationSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReservationSMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ReservationSMouseClicked

    private void ReservationSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReservationSMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReservationSMousePressed

    private void ReservationSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservationSActionPerformed
        new ReservationSalle().setVisible(true);
      
    }//GEN-LAST:event_ReservationSActionPerformed

    private void ReservationCFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ReservationCFocusGained
        ReservationC.setBackground(new java.awt.Color(250,249,248));
        ReservationC.setForeground(new java.awt.Color(2, 5, 8));
    }//GEN-LAST:event_ReservationCFocusGained

    private void ReservationCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ReservationCFocusLost
         ReservationC.setBackground(new java.awt.Color(0,0,0));
        ReservationC.setForeground(new java.awt.Color(250,249,248));
    }//GEN-LAST:event_ReservationCFocusLost

    private void ReservationCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservationCActionPerformed
        new ReservationCham().setVisible(true);
        
    }//GEN-LAST:event_ReservationCActionPerformed

    private void prixscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prixscActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prixscActionPerformed

    private void NSallesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_NSallesItemStateChanged
        

       if (evt.getStateChange() == evt.SELECTED) {
          Object item = evt.getItem();
          duree.setText("");
            prix1.setText("");
            prixsc.setText(""); 
       long duration= ChronoUnit.DAYS.between(DateD.getDate().toInstant(), DateF.getDate().toInstant());
        if(!(NSalles.getSelectedItem().toString().isEmpty())){
       try{
           Class.forName("com.mysql.jdbc.Driver");
            System.err.println("connected");
            Connection cnx =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotellagazelle","root","");
            //requete
            String SQL="SELECT PrixSalle FROM `salle` WHERE NumSalle = '"+ item.toString()+"'" ;
            Statement st =cnx.createStatement();
            ResultSet rs= st.executeQuery(SQL);
             while(rs.next()){
               prixsalle= rs.getDouble("PrixSalle"); 
               prixsc.setText(String.valueOf(prixsalle));
            }
            cnx.close();
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);} 
      
       duree.setText(String.valueOf(duration)+" jours");
       prixtotale= duration * prixsalle;
       prix1.setText(String.valueOf(prixtotale));}
       }
    }//GEN-LAST:event_NSallesItemStateChanged

    private void NchambresItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_NchambresItemStateChanged
       if (evt.getStateChange() == evt.SELECTED) {
          Object item = evt.getItem();
       duree.setText("");
       prix1.setText("");
       prixsc.setText("");
       long duration= ChronoUnit.DAYS.between(DateD.getDate().toInstant(), DateF.getDate().toInstant());
       if(!(Nchambres.getSelectedItem().toString().isEmpty())){
       try{
           Class.forName("com.mysql.jdbc.Driver");
            System.err.println("connected");
            Connection cnx =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotellagazelle","root","");
            //requete
            String SQL="SELECT PrixChambre FROM `chambre` WHERE NumChambre = '"+ item.toString()+"'" ;
            Statement st =cnx.createStatement();
            ResultSet rs= st.executeQuery(SQL);
             while(rs.next()){
               prixchambreeee= rs.getDouble("PrixChambre"); 
               prixsc.setText(String.valueOf(prixchambreeee));
                
            }
            cnx.close();
            
            
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);} 
            duree.setText(String.valueOf(duration)+" jours");
            prixtotale= duration * prixchambreeee;
            prix1.setText(String.valueOf(prixtotale));}
       
       }
    }//GEN-LAST:event_NchambresItemStateChanged

    private void ctgSalleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ctgSalleItemStateChanged
         if (evt.getStateChange() == evt.SELECTED) {
          Object item = evt.getItem();
        NSalles.removeAllItems();
           prixsc.setText(""); 
           duree.setText("");
            prix1.setText("");
        try{
           Class.forName("com.mysql.jdbc.Driver");
            System.err.println("connected");
            Connection cnx =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotellagazelle","root","");
            Statement st =cnx.createStatement();
            //requete
            String SQL="SELECT NumSalle FROM `salle` WHERE NumSalle not IN(SELECT IDSalle FROM reservationsalle WHERE DateD <= '"+DateFS+"' \n" + " AND  DateF >= '" +DateDS+"') AND salle.CategorieSalle='"+item.toString()+"'";
            ResultSet rs= st.executeQuery(SQL);
            if(!rs.isBeforeFirst()){
                
            }else{
            while(rs.next()){
                //add data until finish
              NSalles.addItem(rs.getString("NumSalle"));} 
            }

            cnx.close();
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);} }
    }//GEN-LAST:event_ctgSalleItemStateChanged

    private void CtgChItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CtgChItemStateChanged
        if (evt.getStateChange() == evt.SELECTED) {
          Object item = evt.getItem();
           Nchambres.removeAllItems();
        prixsc.setText("");
        duree.setText("");
        prix1.setText("");
        try{
           Class.forName("com.mysql.jdbc.Driver");
            System.err.println("connected");
            Connection cnx =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotellagazelle","root","");
            Statement st =cnx.createStatement();
            //requete
            String SQL="SELECT NumChambre FROM `chambre` WHERE NumChambre not IN(SELECT IDChambre FROM reservationchambre WHERE DateD <= '"+DateFS+"' \n" + " AND  DateF >= '" +DateDS+"') AND chambre.Categorie='"+item.toString()+"'";
            ResultSet rs= st.executeQuery(SQL);
            if(!rs.isBeforeFirst()){}
            else{
            while(rs.next()){
                //add data until finish
              Nchambres.addItem(rs.getString("NumChambre"));}
            }
            cnx.close();
            
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);        }
        
        }
    }//GEN-LAST:event_CtgChItemStateChanged

    
    
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
  
   
     
  
      
    
     
      ///////////////////////////////
      
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
            java.util.logging.Logger.getLogger(Réservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Réservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Réservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Réservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Réservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CatégorieChambre;
    private javax.swing.JComboBox<String> CtgCh;
    private com.toedter.calendar.JDateChooser DateD;
    private com.toedter.calendar.JDateChooser DateF;
    private javax.swing.JLabel NSalle;
    private javax.swing.JComboBox<String> NSalles;
    private javax.swing.JLabel Nchambre;
    private javax.swing.JComboBox<String> Nchambres;
    private javax.swing.JPanel Nsalle;
    private javax.swing.JButton ReservationC;
    private javax.swing.JButton ReservationS;
    private javax.swing.JButton annuler;
    private javax.swing.JLabel catégorieSalle;
    private javax.swing.JComboBox<String> clt;
    private javax.swing.JButton confirmer;
    private javax.swing.JComboBox<String> ctgSalle;
    private javax.swing.JTextField duree;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField prenom;
    private javax.swing.JTextField prix1;
    private javax.swing.JLabel prixchambre;
    private javax.swing.JLabel prixsallee;
    private javax.swing.JTextField prixsc;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables
}
