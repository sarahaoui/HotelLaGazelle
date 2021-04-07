/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelPackage;

import javax.swing.BorderFactory;

/**
 *
 * @author pc-click
 */
public class Accueil extends javax.swing.JFrame {

    /**
     * Creates new form Accueil
     */
    public Accueil() {
        setUndecorated(true);
        setResizable(false);
       initComponents();
       //jPanel1.setOpaque(false);
        
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
        Bstatistiques = new javax.swing.JButton();
        BCllient = new javax.swing.JButton();
        Bcaisse = new javax.swing.JButton();
        Breservation = new javax.swing.JButton();
        Bsalle = new javax.swing.JButton();
        BChambre = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(2, 5, 8,255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1469, 180));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelPackage/Group 26.png"))); // NOI18N

        Bstatistiques.setBackground(new java.awt.Color(2, 5, 8,0));
        Bstatistiques.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        Bstatistiques.setForeground(new java.awt.Color(250, 249, 248));
        Bstatistiques.setText("Statistiques");
        Bstatistiques.setPreferredSize(new java.awt.Dimension(150, 52));
        Bstatistiques.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BstatistiquesFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                BstatistiquesFocusLost(evt);
            }
        });

        BCllient.setBackground(new java.awt.Color(2, 5, 8,0));
        BCllient.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        BCllient.setForeground(new java.awt.Color(250, 249, 248));
        BCllient.setText("Client");
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

        Bcaisse.setBackground(new java.awt.Color(2, 5, 8,0));
        Bcaisse.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        Bcaisse.setForeground(new java.awt.Color(250, 249, 248));
        Bcaisse.setText("Caisse");
        Bcaisse.setPreferredSize(new java.awt.Dimension(150, 52));
        Bcaisse.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BcaisseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                BcaisseFocusLost(evt);
            }
        });

        Breservation.setBackground(new java.awt.Color(2, 5, 8,0));
        Breservation.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        Breservation.setForeground(new java.awt.Color(250, 249, 248));
        Breservation.setText("Réservation");
        Breservation.setPreferredSize(new java.awt.Dimension(150, 52));
        Breservation.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BreservationFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                BreservationFocusLost(evt);
            }
        });
        Breservation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BreservationMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BreservationMousePressed(evt);
            }
        });

        Bsalle.setBackground(new java.awt.Color(2, 5, 8,0));
        Bsalle.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        Bsalle.setForeground(new java.awt.Color(250, 249, 248));
        Bsalle.setText("Salle");
        Bsalle.setPreferredSize(new java.awt.Dimension(150, 52));
        Bsalle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BsalleFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                BsalleFocusLost(evt);
            }
        });
        Bsalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BsalleMouseClicked(evt);
            }
        });

        BChambre.setBackground(new java.awt.Color(2, 5, 8,0));
        BChambre.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        BChambre.setForeground(new java.awt.Color(250, 249, 248));
        BChambre.setText("Chambre");
        BChambre.setPreferredSize(new java.awt.Dimension(150, 52));
        BChambre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BChambreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                BChambreFocusLost(evt);
            }
        });
        BChambre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BChambreMouseClicked(evt);
            }
        });
        BChambre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BChambreActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(2, 5, 8,0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelPackage/exitpng.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BCllient, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BChambre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bsalle, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Breservation, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bcaisse, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bstatistiques, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 522, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bstatistiques, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BCllient, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bcaisse, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Breservation, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bsalle, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BChambre, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, 190));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelPackage/hotel8 1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1020));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BChambreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BChambreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BChambreActionPerformed

    private void BCllientFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BCllientFocusGained
        BCllient.setBackground(new java.awt.Color(250,249,248));
        BCllient.setForeground(new java.awt.Color(2, 5, 8));
        
       
    }//GEN-LAST:event_BCllientFocusGained

    private void BCllientMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BCllientMousePressed
    
    }//GEN-LAST:event_BCllientMousePressed

    private void BCllientFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BCllientFocusLost
        BCllient.setBackground(new java.awt.Color(2,5,8,0));
        BCllient.setForeground(new java.awt.Color(250,249,248));
       
    }//GEN-LAST:event_BCllientFocusLost

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

    private void BsalleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BsalleFocusGained
        Bsalle.setBackground(new java.awt.Color(250,249,248));
         Bsalle.setForeground(new java.awt.Color(2, 5, 8));
    }//GEN-LAST:event_BsalleFocusGained

    private void BsalleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BsalleFocusLost
        Bsalle.setBackground(new java.awt.Color(2,5,8,0));
        Bsalle.setForeground(new java.awt.Color(250,249,248));
    }//GEN-LAST:event_BsalleFocusLost

    private void BreservationFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BreservationFocusGained
        Breservation.setBackground(new java.awt.Color(250,249,248));
         Breservation.setForeground(new java.awt.Color(2, 5, 8));
    }//GEN-LAST:event_BreservationFocusGained

    private void BreservationFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BreservationFocusLost
        Breservation.setBackground(new java.awt.Color(2,5,8,0));
        Breservation.setForeground(new java.awt.Color(250,249,248));
    }//GEN-LAST:event_BreservationFocusLost

    private void BcaisseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BcaisseFocusGained
        Bcaisse.setBackground(new java.awt.Color(250,249,248));
         Bcaisse.setForeground(new java.awt.Color(2, 5, 8));
    }//GEN-LAST:event_BcaisseFocusGained

    private void BcaisseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BcaisseFocusLost
        Bcaisse.setBackground(new java.awt.Color(2,5,8,0));
        Bcaisse.setForeground(new java.awt.Color(250,249,248));
    }//GEN-LAST:event_BcaisseFocusLost

    private void BstatistiquesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BstatistiquesFocusGained
       Bstatistiques.setBackground(new java.awt.Color(250,249,248));
         Bstatistiques.setForeground(new java.awt.Color(2, 5, 8));
    }//GEN-LAST:event_BstatistiquesFocusGained

    private void BstatistiquesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BstatistiquesFocusLost
       Bstatistiques.setBackground(new java.awt.Color(2,5,8,0));
        Bstatistiques.setForeground(new java.awt.Color(250,249,248));
    }//GEN-LAST:event_BstatistiquesFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                 //this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                 //this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

                 System.exit(0);
    }//GEN-LAST:event_jButton1MouseClicked

    private void BCllientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BCllientMouseClicked
        new Client().setVisible(true);
        //this.setVisible(false);
        //this.dispose();
        
    }//GEN-LAST:event_BCllientMouseClicked

    private void BreservationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BreservationMousePressed
       
    }//GEN-LAST:event_BreservationMousePressed

    private void BreservationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BreservationMouseClicked
        new Réservation().setVisible(true);
    }//GEN-LAST:event_BreservationMouseClicked

    private void BChambreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BChambreMouseClicked
      new Chambre().setVisible(true);  
    }//GEN-LAST:event_BChambreMouseClicked

    private void BsalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BsalleMouseClicked
        new Salle().setVisible(true);
    }//GEN-LAST:event_BsalleMouseClicked

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
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Accueil().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BChambre;
    private javax.swing.JButton BCllient;
    private javax.swing.JButton Bcaisse;
    private javax.swing.JButton Breservation;
    private javax.swing.JButton Bsalle;
    private javax.swing.JButton Bstatistiques;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
