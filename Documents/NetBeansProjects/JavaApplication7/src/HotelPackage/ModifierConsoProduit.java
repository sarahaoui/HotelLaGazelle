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

public class ModifierConsoProduit extends javax.swing.JFrame {
            Connection con = null;
            PreparedStatement pst = null;
            ResultSet rs = null;
            String selectvalue;
            String selectvalue1;
   
    public ModifierConsoProduit() {
        setUndecorated(true);
        setResizable(false);
        initComponents();
        updatecombox();
        updatecomboxx();
       
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
        jLabel45 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        idproduit = new javax.swing.JTextField();
        quantité = new javax.swing.JTextField();
        produit = new javax.swing.JComboBox<>();
        BtnProduit = new javax.swing.JButton();
        prix = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        idappel = new javax.swing.JTextField();
        duree = new javax.swing.JTextField();
        appel = new javax.swing.JComboBox<>();
        BtnAppel = new javax.swing.JButton();
        priiix = new javax.swing.JTextField();
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
        jLabel1.setText("Modifier Consommation Produit/Appel");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 14, 500, 32);

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

        jLabel45.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(2, 5, 8));
        jLabel45.setText("Produit");

        jLabel51.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(2, 5, 8));
        jLabel51.setText("Quantité");

        jLabel49.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(2, 5, 8));
        jLabel49.setText("ID Produit");

        jLabel52.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(2, 5, 8));
        jLabel52.setText("Prix");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel45)
                    .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45)
                .addGap(18, 18, 18)
                .addComponent(jLabel49)
                .addGap(18, 18, 18)
                .addComponent(jLabel51)
                .addGap(18, 18, 18)
                .addComponent(jLabel52)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        idproduit.setBackground(new java.awt.Color(250, 249, 248));
        idproduit.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        idproduit.setForeground(new java.awt.Color(2, 5, 8));
        idproduit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                idproduitMouseClicked(evt);
            }
        });
        idproduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idproduitActionPerformed(evt);
            }
        });

        quantité.setBackground(new java.awt.Color(250, 249, 248));
        quantité.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        quantité.setForeground(new java.awt.Color(2, 5, 8));
        quantité.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quantitéMouseClicked(evt);
            }
        });
        quantité.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantitéActionPerformed(evt);
            }
        });

        produit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OPEN" }));
        produit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produitActionPerformed(evt);
            }
        });

        BtnProduit.setBackground(new java.awt.Color(0, 0, 0));
        BtnProduit.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        BtnProduit.setForeground(new java.awt.Color(250, 249, 248));
        BtnProduit.setText("Modifier");
        BtnProduit.setPreferredSize(new java.awt.Dimension(150, 52));
        BtnProduit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BtnProduitFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                BtnProduitFocusLost(evt);
            }
        });
        BtnProduit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnProduitMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnProduitMouseClicked(evt);
            }
        });
        BtnProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnProduitActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(quantité, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idproduit, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(produit, javax.swing.GroupLayout.Alignment.LEADING, 0, 346, Short.MAX_VALUE)
                    .addComponent(prix, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(produit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idproduit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantité, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prix, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(BtnProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel9);
        jPanel9.setBounds(50, 230, 601, 260);

        jPanel11.setBackground(new java.awt.Color(250, 249, 248));

        jPanel21.setBackground(new java.awt.Color(244, 240, 235));

        jLabel46.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(2, 5, 8));
        jLabel46.setText("Durée");

        jLabel47.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(2, 5, 8));
        jLabel47.setText("ID Appel");

        jLabel48.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(2, 5, 8));
        jLabel48.setText("Appel");

        jLabel50.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(2, 5, 8));
        jLabel50.setText("Prix");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel48)
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel48)
                .addGap(18, 18, 18)
                .addComponent(jLabel47)
                .addGap(18, 18, 18)
                .addComponent(jLabel46)
                .addGap(18, 18, 18)
                .addComponent(jLabel50)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        idappel.setBackground(new java.awt.Color(250, 249, 248));
        idappel.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        idappel.setForeground(new java.awt.Color(2, 5, 8));

        duree.setBackground(new java.awt.Color(250, 249, 248));
        duree.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        duree.setForeground(new java.awt.Color(2, 5, 8));
        duree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dureeMouseClicked(evt);
            }
        });

        appel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OPEN" }));
        appel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appelActionPerformed(evt);
            }
        });

        BtnAppel.setBackground(new java.awt.Color(0, 0, 0));
        BtnAppel.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        BtnAppel.setForeground(new java.awt.Color(250, 249, 248));
        BtnAppel.setText("Modifier");
        BtnAppel.setPreferredSize(new java.awt.Dimension(150, 52));
        BtnAppel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BtnAppelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                BtnAppelFocusLost(evt);
            }
        });
        BtnAppel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnAppelMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAppelMouseClicked(evt);
            }
        });
        BtnAppel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAppelActionPerformed(evt);
            }
        });

        priiix.setBackground(new java.awt.Color(250, 249, 248));
        priiix.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        priiix.setForeground(new java.awt.Color(2, 5, 8));
        priiix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                priiixMouseClicked(evt);
            }
        });
        priiix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priiixActionPerformed(evt);
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
                    .addComponent(duree, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idappel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(appel, javax.swing.GroupLayout.Alignment.LEADING, 0, 346, Short.MAX_VALUE)
                    .addComponent(priiix))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnAppel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(appel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idappel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(duree, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(priiix, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(BtnAppel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel11);
        jPanel11.setBounds(660, 230, 601, 260);

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

    private void BtnProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnProduitActionPerformed
  selectvalue = produit.getSelectedItem().toString();
             try{
                 Class.forName("com.mysql.jdbc.Driver");
             con= DriverManager.getConnection("jdbc:mysql://localhost:3306/hotellagazelle","root","");
 
  String sql ="UPDATE `consommationproduits` SET `IDproduit`=?,`quantite`=?,`prixTotal`=? "
          + "WHERE `IDproduit` = "+selectvalue+"";
             
            pst =con.prepareStatement(sql);
            pst.setString(1,idproduit.getText());
            pst.setString(2,quantité.getText());
            pst.setString(3,prix.getText());
            pst.executeUpdate();             
            JOptionPane.showMessageDialog(null,"Mettre à jour avec succès");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
             
    }//GEN-LAST:event_BtnProduitActionPerformed

    private void BtnProduitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnProduitMousePressed

    }//GEN-LAST:event_BtnProduitMousePressed

    private void BtnProduitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnProduitMouseClicked
       
    }//GEN-LAST:event_BtnProduitMouseClicked

    private void BtnProduitFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BtnProduitFocusLost
        BtnProduit.setBackground(new java.awt.Color(2,5,8,0));
        BtnProduit.setForeground(new java.awt.Color(250,249,248));
    }//GEN-LAST:event_BtnProduitFocusLost

    private void BtnProduitFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BtnProduitFocusGained
        BtnProduit.setBackground(new java.awt.Color(250,249,248));
        BtnProduit.setForeground(new java.awt.Color(2, 5, 8));
    }//GEN-LAST:event_BtnProduitFocusGained

    private void BtnAppelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BtnAppelFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAppelFocusGained

    private void BtnAppelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BtnAppelFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAppelFocusLost

    private void BtnAppelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAppelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAppelMouseClicked

    private void BtnAppelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAppelMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAppelMousePressed

    private void BtnAppelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAppelActionPerformed
selectvalue1 = appel.getSelectedItem().toString();
   try{
       Class.forName("com.mysql.jdbc.Driver");
       con= DriverManager.getConnection("jdbc:mysql://localhost:3306/hotellagazelle","root","");
           
  String sql ="UPDATE `consommationappels` SET `IDAppel`=?,`duree`=?,`prixTotal`=?"
          + " WHERE `IDAppel` = "+selectvalue1+"";
             
            pst =con.prepareStatement(sql);
            pst.setString(1,idappel.getText());
            pst.setString(2,duree.getText());
            pst.setString(3,priiix.getText());
            pst.executeUpdate();   
            JOptionPane.showMessageDialog(null,"Mettre à jour avec succès");
          
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }      
    }//GEN-LAST:event_BtnAppelActionPerformed

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
        
        
/////////////////////////////////////////////////////
        selectvalue= produit.getSelectedItem().toString();
        try{
           Class.forName("com.mysql.jdbc.Driver");
            System.err.println("connected");
            Connection cnx =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotellagazelle","root","");
            Statement st =cnx.createStatement();
            //requete
            String SQL="select IDproduit,quantite,prixTotal from consommationproduits "
                    + "where IDproduit="+selectvalue+"";
            ResultSet rs= st.executeQuery(SQL);
            while(rs.next()){
                //add data until finish
                String qte = String.valueOf(rs.getInt("quantite"));
                String prixtotal=String.valueOf(rs.getDouble("prixTotal"));               
                idproduit.setText(selectvalue);
                quantité.setText(qte);
                prix.setText(prixtotal);
      
            }
            cnx.close();
            
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_produitActionPerformed

    private void quantitéActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantitéActionPerformed
             
    }//GEN-LAST:event_quantitéActionPerformed

    private void idproduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idproduitActionPerformed
         
        
    }//GEN-LAST:event_idproduitActionPerformed

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

//////////////////////////////////////////////////////
        selectvalue= appel.getSelectedItem().toString();
        try{
           Class.forName("com.mysql.jdbc.Driver");
            System.err.println("connected");
            Connection cnx =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotellagazelle","root","");
            Statement st =cnx.createStatement();
            //requete
            String SQL="select * from consommationappels where IDAppel="+selectvalue+";";
            ResultSet rs= st.executeQuery(SQL);
            while(rs.next()){
                //add data until finish
                String qte = String.valueOf(rs.getInt("duree"));
                String prixtotal=String.valueOf(rs.getDouble("prixTotal"));
                
                idappel.setText(selectvalue);
                duree.setText(qte);
                priiix.setText(prixtotal);
                
                
            }
            cnx.close();
            
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_appelActionPerformed

    private void quantitéMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quantitéMouseClicked
        
    }//GEN-LAST:event_quantitéMouseClicked

    private void dureeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dureeMouseClicked
        
    }//GEN-LAST:event_dureeMouseClicked

    private void prixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prixActionPerformed

    private void priiixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priiixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priiixActionPerformed

    private void prixMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prixMouseClicked
        Integer R=Integer.parseInt(quantité.getText());
        double X=Double.parseDouble(prixx.getText());
        double Z = R*X;
       prix.setText(""+Z);
    }//GEN-LAST:event_prixMouseClicked

    private void priiixMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_priiixMouseClicked
        Integer R=Integer.parseInt(duree.getText());
        double X=Double.parseDouble(prixx.getText());
        
       double Z = R*X;
       priiix.setText(""+Z);       
    }//GEN-LAST:event_priiixMouseClicked

    private void idproduitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idproduitMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_idproduitMouseClicked

    
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
            java.util.logging.Logger.getLogger(ModifierConsoProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifierConsoProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifierConsoProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifierConsoProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifierConsoProduit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAppel;
    private javax.swing.JButton BtnProduit;
    private javax.swing.JComboBox<String> appel;
    private javax.swing.JTextField duree;
    private javax.swing.JTextField idappel;
    private javax.swing.JTextField idproduit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTextField priiix;
    private javax.swing.JTextField prix;
    private javax.swing.JLabel prixx;
    private javax.swing.JLabel prixx1;
    private javax.swing.JComboBox<String> produit;
    private javax.swing.JTextField quantité;
    // End of variables declaration//GEN-END:variables
}
