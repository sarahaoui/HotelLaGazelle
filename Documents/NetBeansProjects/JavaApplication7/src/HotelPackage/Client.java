/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelPackage;

/**
 *
 * @author pc-click
 */
public class Client extends javax.swing.JFrame {

    /**
     * Creates new form Client
     */
    public Client() {
        setUndecorated(true);
        setResizable(false);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Bsupprimer = new javax.swing.JButton();
        BNouveau = new javax.swing.JButton();
        BFiche = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(2, 5, 8));

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 236, 228));
        jLabel1.setText("Client");

        jButton1.setBackground(new java.awt.Color(2, 5, 8,0));
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1230, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, 60));

        jPanel2.setBackground(new java.awt.Color(250, 249, 248));

        Bsupprimer.setBackground(new java.awt.Color(250, 249, 248));
        Bsupprimer.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        Bsupprimer.setForeground(new java.awt.Color(2, 5, 8));
        Bsupprimer.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc-click\\Documents\\NetBeansProjects\\HotelLaGazellee\\Documents\\NetBeansProjects\\JavaApplication7\\src\\HotelPackage\\deleteclient.png")); // NOI18N
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

        BNouveau.setBackground(new java.awt.Color(250, 249, 248));
        BNouveau.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        BNouveau.setForeground(new java.awt.Color(2, 5, 8));
        BNouveau.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc-click\\Documents\\NetBeansProjects\\HotelLaGazellee\\Documents\\NetBeansProjects\\JavaApplication7\\src\\HotelPackage\\add-friend.png")); // NOI18N
        BNouveau.setText(" Nouveau");
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

        BFiche.setBackground(new java.awt.Color(250, 249, 248));
        BFiche.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        BFiche.setForeground(new java.awt.Color(2, 5, 8));
        BFiche.setText("Modifier");
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
        });
        BFiche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFicheActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(818, Short.MAX_VALUE)
                .addComponent(BNouveau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bsupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BFiche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bsupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BFiche, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BNouveau, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(865, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1460, 960));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
      
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        new Accueil().setVisible(true);
         this.dispose();
       
    }//GEN-LAST:event_jButton1MousePressed

    private void BsupprimerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BsupprimerFocusGained
       

    }//GEN-LAST:event_BsupprimerFocusGained

    private void BsupprimerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BsupprimerFocusLost
       

    }//GEN-LAST:event_BsupprimerFocusLost

    private void BsupprimerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BsupprimerMousePressed

    }//GEN-LAST:event_BsupprimerMousePressed

    private void BsupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsupprimerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BsupprimerActionPerformed

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

    private void BFicheFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BFicheFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_BFicheFocusGained

    private void BFicheFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BFicheFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_BFicheFocusLost

    private void BFicheMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BFicheMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BFicheMousePressed

    private void BFicheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFicheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BFicheActionPerformed

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
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BFiche;
    private javax.swing.JButton BNouveau;
    private javax.swing.JButton Bsupprimer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
