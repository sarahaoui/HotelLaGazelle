
package HotelPackage;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc-click
 */
public class ModifierReservationSalle extends javax.swing.JFrame {
  String selectvalue;
  String selectvaluee;
   Connection con = null;
            PreparedStatement pst = null;
            ResultSet rs = null;
    
    public ModifierReservationSalle() {
        setUndecorated(true);
        setResizable(false);
        initComponents();
        updatecombox();
        
      
     
    }
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        BModifier = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cltt = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        salle = new javax.swing.JComboBox<>();
        datef = new javax.swing.JTextField();
        numsalle = new javax.swing.JTextField();
        prix = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        dated = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(2, 5, 8));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 236, 228));
        jLabel1.setText("Modifier Réservation Salle");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(21, 14, 430, 32);

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

        jPanel2.setBackground(new java.awt.Color(250, 249, 248));
        jPanel2.setLayout(null);

        BModifier.setBackground(new java.awt.Color(0, 0, 0));
        BModifier.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        BModifier.setForeground(new java.awt.Color(250, 249, 248));
        BModifier.setText(" Modifier");
        BModifier.setPreferredSize(new java.awt.Dimension(150, 52));
        BModifier.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BModifierFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                BModifierFocusLost(evt);
            }
        });
        BModifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BModifierMousePressed(evt);
            }
        });
        BModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BModifierActionPerformed(evt);
            }
        });
        jPanel2.add(BModifier);
        BModifier.setBounds(1137, 521, 158, 43);

        jLabel20.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(2, 5, 8));
        jLabel20.setText("ID Salle");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(32, 81, 180, 25);

        jLabel17.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(2, 5, 8));
        jLabel17.setText("Date Début");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(119, 207, 220, 30);

        cltt.setBackground(new java.awt.Color(250, 249, 248));
        cltt.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        cltt.setForeground(new java.awt.Color(2, 5, 8));
        cltt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clttActionPerformed(evt);
            }
        });
        jPanel2.add(cltt);
        cltt.setBounds(340, 270, 270, 38);

        jLabel19.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(2, 5, 8));
        jLabel19.setText("N° de salle");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(700, 260, 220, 40);

        jLabel21.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(2, 5, 8));
        jLabel21.setText("Date Fin");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(700, 207, 130, 25);

        jLabel23.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(2, 5, 8));
        jLabel23.setText("Client liée");
        jPanel2.add(jLabel23);
        jLabel23.setBounds(120, 280, 140, 25);

        salle.setBackground(new java.awt.Color(153, 153, 153));
        salle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        salle.setForeground(new java.awt.Color(2, 5, 8));
        salle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salleMouseClicked(evt);
            }
        });
        salle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salleActionPerformed(evt);
            }
        });
        jPanel2.add(salle);
        salle.setBounds(247, 76, 258, 36);

        datef.setBackground(new java.awt.Color(250, 249, 248));
        datef.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        datef.setForeground(new java.awt.Color(2, 5, 8));
        jPanel2.add(datef);
        datef.setBounds(918, 202, 280, 38);

        numsalle.setBackground(new java.awt.Color(250, 249, 248));
        numsalle.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        numsalle.setForeground(new java.awt.Color(2, 5, 8));
        jPanel2.add(numsalle);
        numsalle.setBounds(920, 260, 280, 38);

        prix.setBackground(new java.awt.Color(250, 249, 248));
        prix.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        prix.setForeground(new java.awt.Color(2, 5, 8));
        prix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prixActionPerformed(evt);
            }
        });
        jPanel2.add(prix);
        prix.setBounds(340, 370, 280, 38);

        jLabel18.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(2, 5, 8));
        jLabel18.setText("Prix Total");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(130, 370, 220, 30);

        dated.setBackground(new java.awt.Color(250, 249, 248));
        dated.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        dated.setForeground(new java.awt.Color(2, 5, 8));
        dated.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datedActionPerformed(evt);
            }
        });
        jPanel2.add(dated);
        dated.setBounds(339, 202, 270, 38);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1460, 960));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
     new ReservationCham().setVisible(true);
     this.dispose();
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BModifierFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BModifierFocusGained
        BModifier.setBackground(new java.awt.Color(250,249,248));
        BModifier.setForeground(new java.awt.Color(2, 5, 8));
    }//GEN-LAST:event_BModifierFocusGained

    private void BModifierFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BModifierFocusLost
        BModifier.setBackground(new java.awt.Color(0,0,0));
        BModifier.setForeground(new java.awt.Color(250,249,248));
    }//GEN-LAST:event_BModifierFocusLost

    private void BModifierMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BModifierMousePressed
        
    }//GEN-LAST:event_BModifierMousePressed

    private void BModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BModifierActionPerformed
      
      // conditions sur les champs 
      int k=0;
      Integer.parseInt(numsalle.getText());
      try{
        Integer.parseInt(cltt.getText());
        k++;
    }catch(Exception e){JOptionPane.showMessageDialog(null, "la N° de client doit etre un nombre entier !!");;} 
        try{ 
        String dateD= dated.getText().toString(); 
        k++;
    }catch(Exception e){JOptionPane.showMessageDialog(null, "saisir une date valide  !!");} 
       try{
        String dateF= datef.getText().toString();
        k++;
    }catch(Exception e){JOptionPane.showMessageDialog(null, "saisir une date valide !!");}  
       try{
        Double.parseDouble(prix.getText());
        k++;
    }catch(Exception e){JOptionPane.showMessageDialog(null, "le prix de chambre doit etre un nombre !!");} 
     
         
      //remplir BD 
      selectvalue = salle.getSelectedItem().toString();
     
      if(k==4){
             try{
                 Class.forName("com.mysql.jdbc.Driver");
             con= DriverManager.getConnection("jdbc:mysql://localhost:3306/hotellagazelle","root","");
       
           
  String sql ="UPDATE `reservationsalle` SET `IDClient`=?,`IDSalle`=?,`DateD`=?,`DateF`=?,`prixTotal`=? WHERE `IDSalle` = "+selectvalue+"";
             
            pst =con.prepareStatement(sql);
            pst.setString(1,cltt.getText());
            pst.setString(2,numsalle.getText());
            pst.setString(3,dated.getText());
            pst.setString(4,datef.getText());
            pst.setString(5,prix.getText());
            pst.executeUpdate();
                    
            
            JOptionPane.showMessageDialog(null,"Mettre à jour avec succès");
             new ReservationSalle().setVisible(true);
             this.dispose();
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
      }
   
    }//GEN-LAST:event_BModifierActionPerformed

    private void salleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salleActionPerformed
 selectvalue= salle.getSelectedItem().toString();
 
      try{
           Class.forName("com.mysql.jdbc.Driver");
            System.err.println("connected");
            Connection cnx =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotellagazelle","root","");
            Statement st =cnx.createStatement();
            //requete
            String SQL="select * from reservationsalle where IDSalle="+selectvalue+";";
            ResultSet rs= st.executeQuery(SQL);
            while(rs.next()){
                //add data until finish
               
                String NumClient=String.valueOf(rs.getInt("IDClient"));
                String DateD=String.valueOf(rs.getDate("DateD"));
                String DateF=String.valueOf(rs.getDate("DateF"));
                String Prix=String.valueOf(rs.getDouble("prixTotal"));
                cltt.setText(NumClient);
                numsalle.setText(selectvalue);
                dated.setText(DateD);
                datef.setText(DateF);
                prix.setText(Prix);
                
                
            }
            cnx.close();
            
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);}
        
    }//GEN-LAST:event_salleActionPerformed

    private void salleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salleMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_salleMouseClicked

    private void clttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clttActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clttActionPerformed

    private void prixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prixActionPerformed

    private void datedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datedActionPerformed
    public void updatecombox(){
    
    try{
           Class.forName("com.mysql.jdbc.Driver");
            System.err.println("connected");
            Connection cnx =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotellagazelle","root","");
            Statement st =cnx.createStatement();
            //requete
            String SQL="select IDSalle from reservationsalle";
            ResultSet rs= st.executeQuery(SQL);
            while(rs.next()){
                //add data until finish
              salle.addItem(rs.getString("IDSalle"));
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
            java.util.logging.Logger.getLogger(ModifierReservationSalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifierReservationSalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifierReservationSalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifierReservationSalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ModifierReservationSalle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BModifier;
    private javax.swing.JTextField cltt;
    private javax.swing.JTextField dated;
    private javax.swing.JTextField datef;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField numsalle;
    private javax.swing.JTextField prix;
    private javax.swing.JComboBox<String> salle;
    // End of variables declaration//GEN-END:variables
}
