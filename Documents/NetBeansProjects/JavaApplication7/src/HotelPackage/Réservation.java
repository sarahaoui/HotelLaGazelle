
package HotelPackage;


public class Réservation extends javax.swing.JFrame {

    
    public Réservation() {
       setUndecorated(true);
        setResizable(false); 
        initComponents();
        this.NSalle.setVisible(false);
        this.Nchambre.setVisible(false); 
        this.NumSalle.setVisible(false);
        this.NumCham.setVisible(false);
        
        this.CatégorieCham.setVisible(false);
        this.CtgCh.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Nsalle = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        Nchambre = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        BNouveau = new javax.swing.JButton();
        BNouveau1 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        BCllient = new javax.swing.JButton();
        BChambre = new javax.swing.JButton();
        CatégorieCham = new javax.swing.JLabel();
        CtgCh = new javax.swing.JComboBox<>();
        NumSalle = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        NSalle = new javax.swing.JLabel();
        NumCham = new javax.swing.JComboBox<>();

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

        jTextField5.setBackground(new java.awt.Color(250, 249, 248));
        jTextField5.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(2, 5, 8));
        Nsalle.add(jTextField5);
        jTextField5.setBounds(317, 51, 270, 38);

        jLabel19.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(2, 5, 8));
        jLabel19.setText("Nombre de nuits");
        Nsalle.add(jLabel19);
        jLabel19.setBounds(93, 112, 151, 25);

        jTextField7.setBackground(new java.awt.Color(250, 249, 248));
        jTextField7.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(2, 5, 8));
        Nsalle.add(jTextField7);
        jTextField7.setBounds(317, 107, 270, 38);

        jLabel20.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(2, 5, 8));
        jLabel20.setText("Type de réservation");
        Nsalle.add(jLabel20);
        jLabel20.setBounds(93, 168, 182, 25);

        jLabel18.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(2, 5, 8));
        jLabel18.setText("Date de fin");
        Nsalle.add(jLabel18);
        jLabel18.setBounds(760, 56, 100, 25);

        jTextField6.setBackground(new java.awt.Color(250, 249, 248));
        jTextField6.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(2, 5, 8));
        Nsalle.add(jTextField6);
        jTextField6.setBounds(977, 51, 270, 38);

        jLabel21.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(2, 5, 8));
        jLabel21.setText("Etat de réservation");
        Nsalle.add(jLabel21);
        jLabel21.setBounds(760, 112, 175, 25);

        jTextField9.setBackground(new java.awt.Color(250, 249, 248));
        jTextField9.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(2, 5, 8));
        Nsalle.add(jTextField9);
        jTextField9.setBounds(977, 107, 270, 38);

        jLabel22.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(2, 5, 8));
        jLabel22.setText("N° de réservation");
        Nsalle.add(jLabel22);
        jLabel22.setBounds(760, 168, 160, 25);

        jTextField10.setBackground(new java.awt.Color(250, 249, 248));
        jTextField10.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(2, 5, 8));
        Nsalle.add(jTextField10);
        jTextField10.setBounds(977, 163, 270, 38);

        Nchambre.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        Nchambre.setForeground(new java.awt.Color(2, 5, 8));
        Nchambre.setText("N° de chambre");
        Nsalle.add(Nchambre);
        Nchambre.setBounds(100, 310, 190, 40);

        jLabel24.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(2, 5, 8));
        jLabel24.setText("Lier la réservation a un client ");
        Nsalle.add(jLabel24);
        jLabel24.setBounds(90, 409, 276, 25);

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
        BNouveau.setBounds(821, 400, 183, 43);

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
        BNouveau1.setBounds(461, 400, 289, 43);

        jLabel25.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(2, 5, 8));
        jLabel25.setText("Client liée");
        Nsalle.add(jLabel25);
        jLabel25.setBounds(191, 497, 91, 25);

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
        Nsalle.add(BCllient);
        BCllient.setBounds(1030, 634, 133, 43);

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
        BChambre.setBounds(1168, 634, 120, 43);

        CatégorieCham.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        CatégorieCham.setForeground(new java.awt.Color(2, 5, 8));
        CatégorieCham.setText("Catégorie de chambre");
        Nsalle.add(CatégorieCham);
        CatégorieCham.setBounds(760, 310, 197, 40);

        CtgCh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OPEN", "Standard", "Standard vue Mer", "Deluxe vue Jardin", "Deluxe vue Mer", "Suite" }));
        CtgCh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CtgChActionPerformed(evt);
            }
        });
        Nsalle.add(CtgCh);
        CtgCh.setBounds(980, 310, 278, 38);

        NumSalle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OPEN", "A", "B", "C", "D" }));
        Nsalle.add(NumSalle);
        NumSalle.setBounds(310, 310, 278, 38);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OPEN", "Aouina Sarah", "Amrouni Yasmine", "saraaaah", "ysmn" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        Nsalle.add(jComboBox3);
        jComboBox3.setBounds(403, 494, 527, 35);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OPEN", "Chambre", "Salle" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        Nsalle.add(jComboBox4);
        jComboBox4.setBounds(320, 160, 270, 40);

        NSalle.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        NSalle.setForeground(new java.awt.Color(2, 5, 8));
        NSalle.setText("N° de salle");
        Nsalle.add(NSalle);
        NSalle.setBounds(100, 310, 210, 40);

        NumCham.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OPEN", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16" }));
        Nsalle.add(NumCham);
        NumCham.setBounds(309, 308, 278, 38);

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

    private void BNouveauFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BNouveauFocusGained

    }//GEN-LAST:event_BNouveauFocusGained

    private void BNouveauFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BNouveauFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_BNouveauFocusLost

    private void BNouveauMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BNouveauMousePressed
        new FicheClient().setVisible(true);

    }//GEN-LAST:event_BNouveauMousePressed

    private void BNouveauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNouveauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BNouveauActionPerformed

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
        // TODO add your handling code here:
    }//GEN-LAST:event_BNouveau1ActionPerformed

    private void BCllientFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BCllientFocusGained
        BCllient.setBackground(new java.awt.Color(250,249,248));
        BCllient.setForeground(new java.awt.Color(2, 5, 8));
    }//GEN-LAST:event_BCllientFocusGained

    private void BCllientFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BCllientFocusLost
        BCllient.setBackground(new java.awt.Color(2,5,8,0));
        BCllient.setForeground(new java.awt.Color(250,249,248));
    }//GEN-LAST:event_BCllientFocusLost

    private void BCllientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BCllientMouseClicked
        new Client().setVisible(true);
        //this.setVisible(false);
        //this.dispose();
    }//GEN-LAST:event_BCllientMouseClicked

    private void BCllientMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BCllientMousePressed

    }//GEN-LAST:event_BCllientMousePressed

    private void BCllientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCllientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BCllientActionPerformed

    private void BChambreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BChambreFocusGained
        BChambre.setBackground(new java.awt.Color(250,249,248));
        BChambre.setForeground(new java.awt.Color(2, 5, 8));
    }//GEN-LAST:event_BChambreFocusGained

    private void BChambreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BChambreFocusLost
        BChambre.setBackground(new java.awt.Color(2,5,8,0));
        BChambre.setForeground(new java.awt.Color(250,249,248));
    }//GEN-LAST:event_BChambreFocusLost

    private void BChambreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BChambreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BChambreActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        if(jComboBox4.getSelectedItem().equals("Chambre")){
          this.NSalle.setVisible(false);
          this.Nchambre.setVisible(true);
          this.NumSalle.setVisible(false);
          this.NumCham.setVisible(true);
          this.CatégorieCham.setVisible(true);
          this.CtgCh.setVisible(true);
        }
        else {
          this.NSalle.setVisible(true);
          this.Nchambre.setVisible(false);
          this.NumSalle.setVisible(true);
          this.NumCham.setVisible(false);
          this.CatégorieCham.setVisible(false);
          this.CtgCh.setVisible(false);}
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void CtgChActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CtgChActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CtgChActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
       
    }//GEN-LAST:event_jComboBox3ActionPerformed

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
    private javax.swing.JLabel NSalle;
    private javax.swing.JLabel Nchambre;
    private javax.swing.JPanel Nsalle;
    private javax.swing.JComboBox<String> NumCham;
    private javax.swing.JComboBox<String> NumSalle;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
