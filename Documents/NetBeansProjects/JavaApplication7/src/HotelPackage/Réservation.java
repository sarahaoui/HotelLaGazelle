
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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Réservation extends javax.swing.JFrame {
    Connection con = null;
            PreparedStatement pst = null;
            ResultSet rs = null;
                
    public Réservation() {
       setUndecorated(true);
        setResizable(false); 
        initComponents();
     
         
        this.catégorieSalle.setVisible(false);
        this.Nchambre.setVisible(false); 
        this.ctgSalle.setVisible(false);
        this.numero.setVisible(false);
        
        this.CatégorieCham.setVisible(false);
        this.CtgCh.setVisible(false);
        this.numero.setVisible(false);
        this.Mer.setVisible(false);
        
        this.NSalles.setVisible(false);
        this.NumS.setVisible(false);
        this.catégorieSalle.setVisible(false);
        this.ctgSalle.setVisible(false);
        
        updatecombox();
        updatecomboxx();
        updatecomboxxx();
        
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Nsalle = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        DateD = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        DateF = new javax.swing.JTextField();
        Nchambre = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        BNouveau = new javax.swing.JButton();
        BNouveau1 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        BCllient = new javax.swing.JButton();
        BChambre = new javax.swing.JButton();
        CatégorieCham = new javax.swing.JLabel();
        CtgCh = new javax.swing.JComboBox<>();
        ctgSalle = new javax.swing.JComboBox<>();
        clt = new javax.swing.JComboBox<>();
        type = new javax.swing.JComboBox<>();
        catégorieSalle = new javax.swing.JLabel();
        numero = new javax.swing.JComboBox<>();
        Mer = new javax.swing.JComboBox<>();
        prix = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        NumS = new javax.swing.JLabel();
        NSalles = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(2, 5, 8));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 236, 228));
        jLabel1.setText("Réservation");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(21, 14, 145, 32);

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

        Nsalle.setBackground(new java.awt.Color(250, 249, 248));
        Nsalle.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(2, 5, 8));
        jLabel17.setText("Date de début");
        Nsalle.add(jLabel17);
        jLabel17.setBounds(93, 56, 126, 25);

        DateD.setBackground(new java.awt.Color(250, 249, 248));
        DateD.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        DateD.setForeground(new java.awt.Color(2, 5, 8));
        Nsalle.add(DateD);
        DateD.setBounds(317, 51, 270, 38);

        jLabel20.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(2, 5, 8));
        jLabel20.setText("Type de réservation");
        Nsalle.add(jLabel20);
        jLabel20.setBounds(90, 140, 182, 50);

        jLabel18.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(2, 5, 8));
        jLabel18.setText("Date de fin");
        Nsalle.add(jLabel18);
        jLabel18.setBounds(750, 56, 110, 25);

        DateF.setBackground(new java.awt.Color(250, 249, 248));
        DateF.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        DateF.setForeground(new java.awt.Color(2, 5, 8));
        Nsalle.add(DateF);
        DateF.setBounds(977, 51, 270, 38);

        Nchambre.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        Nchambre.setForeground(new java.awt.Color(2, 5, 8));
        Nchambre.setText("N° de chambre");
        Nsalle.add(Nchambre);
        Nchambre.setBounds(750, 200, 190, 40);

        jLabel24.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(2, 5, 8));
        jLabel24.setText("Lier la réservation a un client ");
        Nsalle.add(jLabel24);
        jLabel24.setBounds(90, 360, 276, 25);

        BNouveau.setBackground(new java.awt.Color(250, 249, 248));
        BNouveau.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        BNouveau.setForeground(new java.awt.Color(2, 5, 8));
        BNouveau.setIcon(new javax.swing.ImageIcon("C:\\Users\\Crash.AMOULA-PC\\Desktop\\HotelLaGazelle\\Documents\\NetBeansProjects\\JavaApplication7\\src\\HotelPackage\\chercher.png")); // NOI18N
        BNouveau.setText(" Chercher");
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BNouveauMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BNouveauMousePressed(evt);
            }
        });
        BNouveau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNouveauActionPerformed(evt);
            }
        });
        Nsalle.add(BNouveau);
        BNouveau.setBounds(820, 350, 183, 43);

        BNouveau1.setBackground(new java.awt.Color(250, 249, 248));
        BNouveau1.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        BNouveau1.setForeground(new java.awt.Color(2, 5, 8));
        BNouveau1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Crash.AMOULA-PC\\Desktop\\HotelLaGazelle\\Documents\\NetBeansProjects\\JavaApplication7\\src\\HotelPackage\\add-friend.png")); // NOI18N
        BNouveau1.setText(" Créer un nouveau client");
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BNouveau1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BNouveau1MousePressed(evt);
            }
        });
        BNouveau1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNouveau1ActionPerformed(evt);
            }
        });
        Nsalle.add(BNouveau1);
        BNouveau1.setBounds(460, 350, 289, 43);

        jLabel25.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(2, 5, 8));
        jLabel25.setText("Client liée");
        Nsalle.add(jLabel25);
        jLabel25.setBounds(200, 440, 91, 25);

        BCllient.setBackground(new java.awt.Color(0, 0, 0));
        BCllient.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        BCllient.setForeground(new java.awt.Color(250, 249, 248));
        BCllient.setText("Confirmer");
        BCllient.setPreferredSize(new java.awt.Dimension(150, 52));
        BCllient.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BCllientFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                BCllientFocusLost(evt);
            }
        });
        BCllient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BCllientMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BCllientMousePressed(evt);
            }
        });
        BCllient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCllientActionPerformed(evt);
            }
        });
        Nsalle.add(BCllient);
        BCllient.setBounds(1080, 640, 133, 43);

        BChambre.setBackground(new java.awt.Color(0, 0, 0));
        BChambre.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        BChambre.setForeground(new java.awt.Color(250, 249, 248));
        BChambre.setText("Annuler");
        BChambre.setPreferredSize(new java.awt.Dimension(150, 52));
        BChambre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BChambreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                BChambreFocusLost(evt);
            }
        });
        BChambre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BChambreActionPerformed(evt);
            }
        });
        Nsalle.add(BChambre);
        BChambre.setBounds(1240, 640, 120, 43);

        CatégorieCham.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        CatégorieCham.setForeground(new java.awt.Color(2, 5, 8));
        CatégorieCham.setText("Catégorie de chambre");
        Nsalle.add(CatégorieCham);
        CatégorieCham.setBounds(760, 130, 197, 40);

        CtgCh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OPEN", "Standard vue Mer", "Suite" }));
        CtgCh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CtgChActionPerformed(evt);
            }
        });
        Nsalle.add(CtgCh);
        CtgCh.setBounds(970, 130, 278, 38);

        ctgSalle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OPEN" }));
        ctgSalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctgSalleActionPerformed(evt);
            }
        });
        Nsalle.add(ctgSalle);
        ctgSalle.setBounds(970, 130, 278, 38);

        clt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OPEN" }));
        clt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cltActionPerformed(evt);
            }
        });
        Nsalle.add(clt);
        clt.setBounds(410, 440, 527, 35);

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OPEN", "Chambre", "Salle" }));
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        Nsalle.add(type);
        type.setBounds(320, 140, 270, 40);

        catégorieSalle.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        catégorieSalle.setForeground(new java.awt.Color(2, 5, 8));
        catégorieSalle.setText("Catégorie de salle");
        Nsalle.add(catégorieSalle);
        catégorieSalle.setBounds(760, 130, 210, 40);

        numero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OPEN", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16" }));
        Nsalle.add(numero);
        numero.setBounds(970, 200, 280, 38);

        Mer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OPEN", "40", "41", "42", "70", "77", "90", " " }));
        Mer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MerActionPerformed(evt);
            }
        });
        Nsalle.add(Mer);
        Mer.setBounds(970, 200, 278, 38);

        prix.setBackground(new java.awt.Color(250, 249, 248));
        prix.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        prix.setForeground(new java.awt.Color(2, 5, 8));
        Nsalle.add(prix);
        prix.setBounds(320, 210, 270, 38);

        jLabel19.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(2, 5, 8));
        jLabel19.setText("PrixTotal");
        Nsalle.add(jLabel19);
        jLabel19.setBounds(96, 220, 150, 25);

        NumS.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        NumS.setForeground(new java.awt.Color(2, 5, 8));
        NumS.setText("N° de Salle");
        Nsalle.add(NumS);
        NumS.setBounds(750, 200, 190, 40);

        NSalles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OPEN" }));
        Nsalle.add(NSalles);
        NSalles.setBounds(970, 200, 280, 38);

        getContentPane().add(Nsalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1460, 960));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        new Accueil().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton1MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void MerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MerActionPerformed

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        if(type.getSelectedItem().equals("Chambre")){
            this.catégorieSalle.setVisible(false);
            this.Nchambre.setVisible(false);
            this.ctgSalle.setVisible(false);
            this.numero.setVisible(false);
            this.CatégorieCham.setVisible(true);
            this.CtgCh.setVisible(true);
            this.NSalles.setVisible(false); 
            this.NumS.setVisible(false); 
            this.catégorieSalle.setVisible(false);
            this.ctgSalle.setVisible(false);
            

        }
        else {
            this.catégorieSalle.setVisible(true);
            this.Nchambre.setVisible(false);
            this.ctgSalle.setVisible(true);
            this.numero.setVisible(false);
            this.CatégorieCham.setVisible(false);
            this.CtgCh.setVisible(false);
            this.Mer.setVisible(false);
        }
    }//GEN-LAST:event_typeActionPerformed

    private void cltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cltActionPerformed

    }//GEN-LAST:event_cltActionPerformed

    private void ctgSalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctgSalleActionPerformed
        if(type.getSelectedItem().equals("Salle de conférence")){
            this.catégorieSalle.setVisible(true);
            this.ctgSalle.setVisible(true);
           this.Mer.setVisible(false);
           
        }
        else {
            this.NSalles.setVisible(true); 
            this.NumS.setVisible(true); 
            this.catégorieSalle.setVisible(true);
            this.ctgSalle.setVisible(true);
            this.Mer.setVisible(false);
            
        }
    }//GEN-LAST:event_ctgSalleActionPerformed

    private void CtgChActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CtgChActionPerformed
        if(CtgCh.getSelectedItem().equals("Standard vue Mer")){
            this.numero.setVisible(false);
            this.Mer.setVisible(true);
            this.Nchambre.setVisible(true);

        }
        else if(CtgCh.getSelectedItem().equals("Suite")){
            this.numero.setVisible(true);
            this.Mer.setVisible(false);
            this.Nchambre.setVisible(true);}
    }//GEN-LAST:event_CtgChActionPerformed

    private void BChambreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BChambreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BChambreActionPerformed

    private void BChambreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BChambreFocusLost
        BChambre.setBackground(new java.awt.Color(2,5,8,0));
        BChambre.setForeground(new java.awt.Color(250,249,248));
    }//GEN-LAST:event_BChambreFocusLost

    private void BChambreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BChambreFocusGained
        BChambre.setBackground(new java.awt.Color(250,249,248));
        BChambre.setForeground(new java.awt.Color(2, 5, 8));
    }//GEN-LAST:event_BChambreFocusGained

    private void BCllientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCllientActionPerformed
        if(type.getSelectedItem().equals("Chambre")){
            try{
                String sql = "INSERT INTO reservationchambre(IDChambre,"
                + " IDClient,DateD,DateF,prixTotal) "
                + "VALUES (?,?,?,?,?)";

                Class.forName("com.mysql.jdbc.Driver");
                con= DriverManager.getConnection("jdbc:mysql://localhost/hotellagazelle","root","");
                pst =con.prepareStatement(sql);
                pst.setString(1,numero.getSelectedItem().toString());
                pst.setString(2,clt.getSelectedItem().toString());
                pst.setString(3,DateD.getText());
                pst.setString(4,DateF.getText());
                pst.setString(5,prix.getText());
              
                pst.executeUpdate();

                JOptionPane.showMessageDialog(null,"Inséré avec succès");
                ReservationCham p = new ReservationCham();
                p.setVisible(true);
                p.setLocationRelativeTo(null);
                p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex);
            }
        }
        else {
            try{
                String sql = "INSERT INTO `reservationsalle`(IDSalle, "
                + "IDClient, DateD, DateF, prixTotal) "
                + "VALUES (?,?,?,?,?)";

                Class.forName("com.mysql.jdbc.Driver");
                con= DriverManager.getConnection("jdbc:mysql://localhost/hotellagazelle","root","");
                pst =con.prepareStatement(sql);
                pst.setString(1,NSalles.getSelectedItem().toString());
                pst.setString(2,clt.getSelectedItem().toString());
                pst.setString(3,DateD.getText());
                pst.setString(4,DateF.getText());
                pst.setString(5,prix.getText());
                pst.executeUpdate();

                JOptionPane.showMessageDialog(null,"Inséré avec succès");
                ReservationSalle p = new ReservationSalle();
                p.setVisible(true);
                p.setLocationRelativeTo(null);
                p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex);
            }
        }
    }//GEN-LAST:event_BCllientActionPerformed

    private void BCllientMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BCllientMousePressed

    }//GEN-LAST:event_BCllientMousePressed

    private void BCllientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BCllientMouseClicked
        new Client().setVisible(true);
        //this.setVisible(false);
        //this.dispose();
    }//GEN-LAST:event_BCllientMouseClicked

    private void BCllientFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BCllientFocusLost
        BCllient.setBackground(new java.awt.Color(2,5,8,0));
        BCllient.setForeground(new java.awt.Color(250,249,248));
    }//GEN-LAST:event_BCllientFocusLost

    private void BCllientFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BCllientFocusGained
        BCllient.setBackground(new java.awt.Color(250,249,248));
        BCllient.setForeground(new java.awt.Color(2, 5, 8));
    }//GEN-LAST:event_BCllientFocusGained

    private void BNouveau1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNouveau1ActionPerformed
        FicheClient p = new FicheClient();
        p.setVisible(true);
        //  p.pack();
        p.setLocationRelativeTo(null);
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_BNouveau1ActionPerformed

    private void BNouveau1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BNouveau1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BNouveau1MousePressed

    private void BNouveau1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BNouveau1MouseClicked

    }//GEN-LAST:event_BNouveau1MouseClicked

    private void BNouveau1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BNouveau1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_BNouveau1FocusLost

    private void BNouveau1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BNouveau1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_BNouveau1FocusGained

    private void BNouveauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNouveauActionPerformed
        Client p = new Client();
        p.setVisible(true);
        //  p.pack();
        p.setLocationRelativeTo(null);
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_BNouveauActionPerformed

    private void BNouveauMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BNouveauMousePressed
        new FicheClient().setVisible(true);
    }//GEN-LAST:event_BNouveauMousePressed

    private void BNouveauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BNouveauMouseClicked

    }//GEN-LAST:event_BNouveauMouseClicked

    private void BNouveauFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BNouveauFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_BNouveauFocusLost

    private void BNouveauFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BNouveauFocusGained

    }//GEN-LAST:event_BNouveauFocusGained

    
    
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
  
   
      public void updatecomboxx(){
    
    try{
           Class.forName("com.mysql.jdbc.Driver");
            System.err.println("connected");
            Connection cnx =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotellagazelle","root","");
            Statement st =cnx.createStatement();
            //requete
            String SQL="select NumSalle from salle";
            ResultSet rs= st.executeQuery(SQL);
            while(rs.next()){
                //add data until finish
              NSalles.addItem(rs.getString("NumSalle"));
            }
            cnx.close();
            
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);}
    }
  
      
      public void updatecomboxxx(){
    
    try{
           Class.forName("com.mysql.jdbc.Driver");
            System.err.println("connected");
            Connection cnx =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotellagazelle","root","");
            Statement st =cnx.createStatement();
            //requete
            String SQL="SELECT `CategorieSalle` FROM `salle` GROUP BY CategorieSalle";
            ResultSet rs= st.executeQuery(SQL);
            while(rs.next()){
                //add data until finish
              ctgSalle.addItem(rs.getString("CategorieSalle"));
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Réservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BChambre;
    private javax.swing.JButton BCllient;
    private javax.swing.JButton BNouveau;
    private javax.swing.JButton BNouveau1;
    private javax.swing.JLabel CatégorieCham;
    private javax.swing.JComboBox<String> CtgCh;
    private javax.swing.JTextField DateD;
    private javax.swing.JTextField DateF;
    private javax.swing.JComboBox<String> Mer;
    private javax.swing.JComboBox<String> NSalles;
    private javax.swing.JLabel Nchambre;
    private javax.swing.JPanel Nsalle;
    private javax.swing.JLabel NumS;
    private javax.swing.JLabel catégorieSalle;
    private javax.swing.JComboBox<String> clt;
    private javax.swing.JComboBox<String> ctgSalle;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> numero;
    private javax.swing.JTextField prix;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables
}
