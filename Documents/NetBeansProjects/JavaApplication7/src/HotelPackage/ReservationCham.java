
package HotelPackage;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class ReservationCham extends javax.swing.JFrame {

    Connection con = null;
            PreparedStatement pst = null;
            ResultSet rs = null;
     
    public ReservationCham() {
        setUndecorated(true);
        setResizable(false);
        initComponents();
    
        table.getTableHeader().setFont(new Font ("Bell MT",Font.BOLD,16));
        table.getTableHeader().setOpaque(false);
        table.getTableHeader().setBackground(new Color(250,249,248));
        table.getTableHeader().setForeground(new Color(2,5,8));
        table.setRowHeight(25);
        
        this.ID.setVisible(false);
        
        //remplir la table
        showTableData();
        
    }

 private void deplace(int i){
       try {     //i represente les ligne 
     
       ID.setText(table.getValueAt (i, 0).toString());
      
       
       }catch (Exception e){ JOptionPane.showMessageDialog(null,"erreur de deplacement de message !!!!! "+e.getMessage());}
      }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ID = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        Bsupprimer = new javax.swing.JButton();
        BNouveau = new javax.swing.JButton();
        BFiche = new javax.swing.JButton();
        refresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(2, 5, 8));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 236, 228));
        jLabel1.setText("Reservation Chambre");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(21, 14, 280, 32);

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

        ID.setOpaque(true);
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(250, 249, 248));
        jPanel2.setLayout(null);

        table.setBackground(new java.awt.Color(250, 249, 248));
        table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        table.setForeground(new java.awt.Color(2, 5, 8));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Chambre", "ID Client", "Date D", "Date F", "PrixTotal"
            }
        ));
        table.setSelectionBackground(new java.awt.Color(2, 5, 8));
        table.setSelectionForeground(new java.awt.Color(250, 249, 248));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(20, 260, 1330, 340);

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
        jPanel2.add(Bsupprimer);
        Bsupprimer.setBounds(1000, 210, 170, 43);

        BNouveau.setBackground(new java.awt.Color(250, 249, 248));
        BNouveau.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        BNouveau.setForeground(new java.awt.Color(2, 5, 8));
        BNouveau.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc-click\\Documents\\NetBeansProjects\\HotelLaGazellee\\Documents\\NetBeansProjects\\JavaApplication7\\src\\HotelPackage\\plus.png")); // NOI18N
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
        jPanel2.add(BNouveau);
        BNouveau.setBounds(850, 210, 150, 43);

        BFiche.setBackground(new java.awt.Color(250, 249, 248));
        BFiche.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        BFiche.setForeground(new java.awt.Color(2, 5, 8));
        BFiche.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc-click\\Documents\\NetBeansProjects\\HotelLaGazellee\\Documents\\NetBeansProjects\\JavaApplication7\\src\\HotelPackage\\stylo.png")); // NOI18N
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
        jPanel2.add(BFiche);
        BFiche.setBounds(1170, 210, 160, 43);

        refresh.setBackground(new java.awt.Color(250, 249, 248));
        refresh.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        refresh.setForeground(new java.awt.Color(2, 5, 8));
        refresh.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc-click\\Documents\\NetBeansProjects\\HotelLaGazellee\\Documents\\NetBeansProjects\\JavaApplication7\\src\\HotelPackage\\update.png")); // NOI18N
        refresh.setText("refresh");
        refresh.setPreferredSize(new java.awt.Dimension(150, 52));
        refresh.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                refreshFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                refreshFocusLost(evt);
            }
        });
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                refreshMousePressed(evt);
            }
        });
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel2.add(refresh);
        refresh.setBounds(700, 210, 150, 43);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1460, 960));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
      
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        new Réservation().setVisible(true);
         this.dispose();
       
    }//GEN-LAST:event_jButton1MousePressed

    private void BsupprimerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BsupprimerFocusGained
       

    }//GEN-LAST:event_BsupprimerFocusGained

    private void BsupprimerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BsupprimerFocusLost
       

    }//GEN-LAST:event_BsupprimerFocusLost

    private void BsupprimerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BsupprimerMousePressed

    }//GEN-LAST:event_BsupprimerMousePressed

    private void BsupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsupprimerActionPerformed
         int ligne =0;
        ligne=table.getSelectedRow();
        // recupere les elements
        String IDClient =table.getValueAt(ligne,1).toString();
        String DateD =table.getValueAt(ligne,2).toString();
        try{
            String sql = " DELETE FROM `reservationchambre` WHERE IDChambre=? AND IDClient =? AND DateD =? ";

            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost/hotellagazelle","root","");
            pst =con.prepareStatement(sql);
            pst.setString(1,ID.getText());
            pst.setString(2,IDClient);
            pst.setString(3,DateD);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Supprimer avec succès");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        } showTableData();
    }//GEN-LAST:event_BsupprimerActionPerformed

    private void BNouveauFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BNouveauFocusGained
    Réservation r = new Réservation();
    }//GEN-LAST:event_BNouveauFocusGained

    private void BNouveauFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BNouveauFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_BNouveauFocusLost

    private void BNouveauMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BNouveauMousePressed
       Réservation r = new Réservation();
        
    }//GEN-LAST:event_BNouveauMousePressed

    private void BNouveauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNouveauActionPerformed
        Réservation p = new Réservation();
        p.setVisible(true);
       // p.pack();
        p.setLocationRelativeTo(null);
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
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
        ModifierReservationChambre p = new ModifierReservationChambre();
        p.setVisible(true);
       // p.pack();
        p.setLocationRelativeTo(null);
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_BFicheActionPerformed

    private void BNouveauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BNouveauMouseClicked
        Réservation r = new Réservation();
    }//GEN-LAST:event_BNouveauMouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        try {  int i=table.getSelectedRow();
            deplace(i);
            //sa si quant on choisir un nom dans le tableau il va afficher sur les fieldtext
        }
        catch (Exception e){JOptionPane.showMessageDialog(null,"erreur selectionne\n"+e.getMessage());  }  
    }//GEN-LAST:event_tableMouseClicked

    private void refreshFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_refreshFocusGained

    }//GEN-LAST:event_refreshFocusGained

    private void refreshFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_refreshFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshFocusLost

    private void refreshMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMousePressed

    }//GEN-LAST:event_refreshMousePressed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        new ReservationCham().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_refreshActionPerformed

    
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
            java.util.logging.Logger.getLogger(ReservationCham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservationCham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservationCham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservationCham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservationCham().setVisible(true);
            }
        });
    }
     public void showTableData(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/hotellagazelle","root",""); 
        // String sql = "SELECT * FROM reservationchambre";
      String sql =   "SELECT IDChambre,"
    + " IDClient,DateD,DateF,prixTotal FROM  reservationchambre ";
  
          pst =con.prepareStatement(sql);
          rs= pst.executeQuery();
          table.setModel(DbUtils.resultSetToTableModel(rs));
       }
    catch(Exception ex){
        JOptionPane.showMessageDialog(null,ex);
     }
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BFiche;
    private javax.swing.JButton BNouveau;
    private javax.swing.JButton Bsupprimer;
    private javax.swing.JLabel ID;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refresh;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
