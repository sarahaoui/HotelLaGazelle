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

public class AddConsoProduit extends javax.swing.JFrame {
            Connection con = null;
            PreparedStatement pst = null;
            ResultSet rs = null;
   
    public AddConsoProduit() {
        setUndecorated(true);
        setResizable(false);
        initComponents();
        updatecombox();
        updatecomboxx();
        updatecomboxxx();
        
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
        jPanel9 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        qte = new javax.swing.JTextField();
        prix = new javax.swing.JTextField();
        produit = new javax.swing.JComboBox<>();
        BCllient = new javax.swing.JButton();
        fact = new javax.swing.JComboBox<>();
        jPanel11 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        qte1 = new javax.swing.JTextField();
        prix1 = new javax.swing.JTextField();
        appel = new javax.swing.JComboBox<>();
        BCllient2 = new javax.swing.JButton();
        facture = new javax.swing.JComboBox<>();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        prixx = new javax.swing.JLabel();
        prixx1 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(2, 5, 8));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 236, 228));
        jLabel1.setText("Consommation Produit/Appel");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 14, 370, 32);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Crash.AMOULA-PC\\Desktop\\HotelLaGazelle\\Documents\\NetBeansProjects\\JavaApplication7\\src\\HotelPackage\\exitpng.png")); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
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

        jPanel9.setBackground(new java.awt.Color(250, 249, 248));

        jPanel20.setBackground(new java.awt.Color(244, 240, 235));

        jLabel43.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(2, 5, 8));
        jLabel43.setText("Prix");

        jLabel44.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(2, 5, 8));
        jLabel44.setText("Quantité");

        jLabel45.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(2, 5, 8));
        jLabel45.setText("Produit");

        jLabel49.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(2, 5, 8));
        jLabel49.setText("ID Facture");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49)
                    .addComponent(jLabel44)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel49)
                .addGap(21, 21, 21)
                .addComponent(jLabel45)
                .addGap(18, 18, 18)
                .addComponent(jLabel44)
                .addGap(18, 18, 18)
                .addComponent(jLabel43)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        qte.setBackground(new java.awt.Color(250, 249, 248));
        qte.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        qte.setForeground(new java.awt.Color(2, 5, 8));
        qte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qteActionPerformed(evt);
            }
        });

        prix.setBackground(new java.awt.Color(250, 249, 248));
        prix.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        prix.setForeground(new java.awt.Color(2, 5, 8));
        prix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prixMouseClicked(evt);
            }
        });
        prix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prixActionPerformed(evt);
            }
        });

        produit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OPEN" }));
        produit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produitActionPerformed(evt);
            }
        });

        BCllient.setBackground(new java.awt.Color(0, 0, 0));
        BCllient.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        BCllient.setForeground(new java.awt.Color(250, 249, 248));
        BCllient.setText("Ajouter");
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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BCllientMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BCllientMouseClicked(evt);
            }
        });
        BCllient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCllientActionPerformed(evt);
            }
        });

        fact.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OPEN" }));
        fact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(prix, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(qte, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(produit, javax.swing.GroupLayout.Alignment.LEADING, 0, 346, Short.MAX_VALUE)
                    .addComponent(fact, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BCllient, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(fact, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(produit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qte, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prix, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(BCllient, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel9);
        jPanel9.setBounds(50, 230, 601, 270);

        jPanel11.setBackground(new java.awt.Color(250, 249, 248));

        jPanel21.setBackground(new java.awt.Color(244, 240, 235));

        jLabel46.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(2, 5, 8));
        jLabel46.setText("Prix");

        jLabel47.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(2, 5, 8));
        jLabel47.setText("Durée");

        jLabel48.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(2, 5, 8));
        jLabel48.setText("Appel");

        jLabel50.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(2, 5, 8));
        jLabel50.setText("ID Facture");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel50)
                    .addComponent(jLabel48)
                    .addComponent(jLabel47)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel50)
                .addGap(18, 18, 18)
                .addComponent(jLabel48)
                .addGap(18, 18, 18)
                .addComponent(jLabel47)
                .addGap(18, 18, 18)
                .addComponent(jLabel46)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        qte1.setBackground(new java.awt.Color(250, 249, 248));
        qte1.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        qte1.setForeground(new java.awt.Color(2, 5, 8));

        prix1.setBackground(new java.awt.Color(250, 249, 248));
        prix1.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        prix1.setForeground(new java.awt.Color(2, 5, 8));
        prix1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prix1MouseClicked(evt);
            }
        });

        appel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OPEN" }));
        appel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appelActionPerformed(evt);
            }
        });

        BCllient2.setBackground(new java.awt.Color(0, 0, 0));
        BCllient2.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        BCllient2.setForeground(new java.awt.Color(250, 249, 248));
        BCllient2.setText("Ajouter");
        BCllient2.setPreferredSize(new java.awt.Dimension(150, 52));
        BCllient2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BCllient2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                BCllient2FocusLost(evt);
            }
        });
        BCllient2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BCllient2MousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BCllient2MouseClicked(evt);
            }
        });
        BCllient2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCllient2ActionPerformed(evt);
            }
        });

        facture.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OPEN" }));
        facture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factureActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(prix1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(qte1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(appel, javax.swing.GroupLayout.Alignment.LEADING, 0, 346, Short.MAX_VALUE)
                    .addComponent(facture, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BCllient2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(facture, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(appel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qte1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prix1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(BCllient2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel11);
        jPanel11.setBounds(660, 230, 601, 270);

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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1460, 960));

        prixx.setText("jLabel2");
        getContentPane().add(prixx, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        prixx1.setText("jLabel2");
        getContentPane().add(prixx1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Facture p = new Facture();
        p.setVisible(true);
        this.dispose();        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed

    }//GEN-LAST:event_jButton1MousePressed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void BCllientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCllientActionPerformed
       
        try{
                String sql = "INSERT INTO consommationproduits(IDFacture,IDproduit,"
                + " quantite,prixTotal) "
                + "VALUES (?,?,?,?)";
                Class.forName("com.mysql.jdbc.Driver");
                con= DriverManager.getConnection("jdbc:mysql://localhost/hotellagazelle","root","");
                pst =con.prepareStatement(sql);
                pst.setString(1,fact.getSelectedItem().toString());
                pst.setString(2,produit.getSelectedItem().toString());
                pst.setString(3,qte.getText());
                pst.setString(4,prix.getText());
                            
                pst.executeUpdate();

                JOptionPane.showMessageDialog(null,"Inséré avec succès");}
            catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex);
            }
    }//GEN-LAST:event_BCllientActionPerformed

    private void BCllientMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BCllientMousePressed

    }//GEN-LAST:event_BCllientMousePressed

    private void BCllientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BCllientMouseClicked
        
    }//GEN-LAST:event_BCllientMouseClicked

    private void BCllientFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BCllientFocusLost
        BCllient.setBackground(new java.awt.Color(2,5,8,0));
        BCllient.setForeground(new java.awt.Color(250,249,248));
    }//GEN-LAST:event_BCllientFocusLost

    private void BCllientFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BCllientFocusGained
        BCllient.setBackground(new java.awt.Color(250,249,248));
        BCllient.setForeground(new java.awt.Color(2, 5, 8));
    }//GEN-LAST:event_BCllientFocusGained

    private void BCllient2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BCllient2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_BCllient2FocusGained

    private void BCllient2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BCllient2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_BCllient2FocusLost

    private void BCllient2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BCllient2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BCllient2MouseClicked

    private void BCllient2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BCllient2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BCllient2MousePressed

    private void BCllient2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCllient2ActionPerformed
try{
          String sql = "INSERT INTO consommationappels(IDFacture,IDAppel,duree,prixTotal) VALUES (?,?,?,?)";
                Class.forName("com.mysql.jdbc.Driver");
                con= DriverManager.getConnection("jdbc:mysql://localhost/hotellagazelle","root","");
                pst =con.prepareStatement(sql);
                pst.setString(1,facture.getSelectedItem().toString());
                pst.setString(2,appel.getSelectedItem().toString());
                pst.setString(3,qte1.getText());
                pst.setString(4,prix1.getText());
                            
                pst.executeUpdate();

                JOptionPane.showMessageDialog(null,"Inséré avec succès");}
            catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex);
            }        
    }//GEN-LAST:event_BCllient2ActionPerformed

    private void produitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produitActionPerformed
 String Produit= produit.getSelectedItem().toString();
 
        try{
      

                Class.forName("com.mysql.jdbc.Driver");
            System.err.println("connected");
            Connection cnx =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotellagazelle","root","");
            Statement st =cnx.createStatement();
            String SQL = "SELECT prix FROM `produit` WHERE IDproduit ="+Produit+"";
             ResultSet rs= st.executeQuery(SQL);
            while(rs.next()){
             String Price=String.valueOf(rs.getDouble("prix"));
               // double Price = rs.getDouble("prix");
            prixx.setText(Price);
      
            } 
        }
       
            catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex);
            }
    }//GEN-LAST:event_produitActionPerformed

    private void prixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prixActionPerformed
             
    }//GEN-LAST:event_prixActionPerformed

    private void qteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qteActionPerformed
         Integer R=Integer.parseInt(qte.getText());
        double X=Double.parseDouble(prixx.getText());
        
       double Z = R*X;
       prix.setText(""+Z);
        
    }//GEN-LAST:event_qteActionPerformed

    private void appelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appelActionPerformed
        String Appel= appel.getSelectedItem().toString();
        try{
      

                Class.forName("com.mysql.jdbc.Driver");
            System.err.println("connected");
            Connection cnx =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotellagazelle","root","");
            Statement st =cnx.createStatement();
            String SQL = "SELECT PrixAppel FROM `appel` WHERE IDAppel ="+Appel+"";
             ResultSet rs= st.executeQuery(SQL);
            while(rs.next()){
             String prixAppel=String.valueOf(rs.getDouble("PrixAppel"));
            
            prixx1.setText(prixAppel);
      
            } 
        }
       
            catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex);
            }
    }//GEN-LAST:event_appelActionPerformed

    private void prixMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prixMouseClicked
        Integer R=Integer.parseInt(qte.getText());
        double X=Double.parseDouble(prixx.getText());
        
       double Z = R*X;
       prix.setText(""+Z);
    }//GEN-LAST:event_prixMouseClicked

    private void prix1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prix1MouseClicked
        Integer R=Integer.parseInt(qte1.getText());
        double X=Double.parseDouble(prixx1.getText());
        
       double Z = R*X;
       prix1.setText(""+Z);
    }//GEN-LAST:event_prix1MouseClicked

    private void factActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_factActionPerformed

    private void factureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_factureActionPerformed

    
    /////////////////////////////////
      
       public void updatecombox(){
    
    try{
           Class.forName("com.mysql.jdbc.Driver");
            System.err.println("connected");
            Connection cnx =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotellagazelle","root","");
            Statement st =cnx.createStatement();
            //requete
            String SQL="select IDAppel from appel;";
            ResultSet rs= st.executeQuery(SQL);
            while(rs.next()){
                //add data until finish
              appel.addItem(rs.getString("IDAppel"));
            }
            cnx.close();
            
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);}
    }
      
     ///////////////////////////
       
       public void updatecomboxx(){
    
    try{
           Class.forName("com.mysql.jdbc.Driver");
            System.err.println("connected");
            Connection cnx =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotellagazelle","root","");
            Statement st =cnx.createStatement();
            //requete
            String SQL="select IDproduit from produit;";
            ResultSet rs= st.executeQuery(SQL);
            while(rs.next()){
                //add data until finish
              produit.addItem(rs.getString("IDproduit"));
            }
            cnx.close();
            
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);}
    }
      
    ////////////////////////////////////  
       
       
       public void updatecomboxxx(){
    
    try{
           Class.forName("com.mysql.jdbc.Driver");
            System.err.println("connected");
            Connection cnx =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotellagazelle","root","");
            Statement st =cnx.createStatement();
            //requete
            String SQL="select IDFacture from facture;";
            ResultSet rs= st.executeQuery(SQL);
            while(rs.next()){
                //add data until finish
             fact.addItem(rs.getString("IDFacture"));
             facture.addItem(rs.getString("IDFacture"));
            }
            cnx.close();
            
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);}
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
            java.util.logging.Logger.getLogger(AddConsoProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddConsoProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddConsoProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddConsoProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddConsoProduit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCllient;
    private javax.swing.JButton BCllient2;
    private javax.swing.JComboBox<String> appel;
    private javax.swing.JComboBox<String> fact;
    private javax.swing.JComboBox<String> facture;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField prix;
    private javax.swing.JTextField prix1;
    private javax.swing.JLabel prixx;
    private javax.swing.JLabel prixx1;
    private javax.swing.JComboBox<String> produit;
    private javax.swing.JTextField qte;
    private javax.swing.JTextField qte1;
    // End of variables declaration//GEN-END:variables
}
