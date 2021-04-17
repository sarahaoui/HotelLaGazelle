
package HotelPackage;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc-click
 */
public class ModifierReservationChambre extends javax.swing.JFrame {
  String selectvalue;
  String selectvaluee;
   Connection con = null;
            PreparedStatement pst = null;
            ResultSet rs = null;
    
    public ModifierReservationChambre() {
        setUndecorated(true);
        setResizable(false);
        initComponents();
        updatecombox();
        updatecomboxx();
        numch.removeAllItems();
        prix.setEditable(false);
      
     
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
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        chambre = new javax.swing.JComboBox<>();
        prix = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        cltt = new javax.swing.JComboBox<>();
        numch = new javax.swing.JComboBox<>();
        DateD = new com.toedter.calendar.JDateChooser();
        DateF = new com.toedter.calendar.JDateChooser();
        CatégorieChambre = new javax.swing.JLabel();
        CtgCh = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(2, 5, 8));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 236, 228));
        jLabel1.setText("Modifier Réservation Chambre");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(21, 14, 430, 32);

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

        jPanel2.setBackground(new java.awt.Color(250, 249, 248));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel2.add(BModifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(1137, 521, 158, 43));

        jLabel20.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(2, 5, 8));
        jLabel20.setText("ID Chambre");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 180, -1));

        jLabel17.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(2, 5, 8));
        jLabel17.setText("Date Début");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 207, 220, 30));

        jLabel19.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(2, 5, 8));
        jLabel19.setText("N° de chambre");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 270, 220, 40));

        jLabel21.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(2, 5, 8));
        jLabel21.setText("Date Fin");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 130, -1));

        jLabel23.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(2, 5, 8));
        jLabel23.setText("Client liée");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 140, -1));

        chambre.setBackground(new java.awt.Color(250, 249, 248));
        chambre.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        chambre.setForeground(new java.awt.Color(2, 5, 8));
        chambre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chambreMouseClicked(evt);
            }
        });
        chambre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chambreActionPerformed(evt);
            }
        });
        jPanel2.add(chambre, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 76, 258, 40));

        prix.setBackground(new java.awt.Color(250, 249, 248));
        prix.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        prix.setForeground(new java.awt.Color(2, 5, 8));
        prix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prixActionPerformed(evt);
            }
        });
        jPanel2.add(prix, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 340, 270, 38));

        jLabel18.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(2, 5, 8));
        jLabel18.setText("Prix Total");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, 220, 30));

        cltt.setBackground(new java.awt.Color(250, 249, 248));
        cltt.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        cltt.setForeground(new java.awt.Color(2, 5, 8));
        cltt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clttActionPerformed(evt);
            }
        });
        jPanel2.add(cltt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 270, 40));

        numch.setBackground(new java.awt.Color(250, 249, 248));
        numch.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        numch.setForeground(new java.awt.Color(2, 5, 8));
        numch.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                numchItemStateChanged(evt);
            }
        });
        numch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numchActionPerformed(evt);
            }
        });
        jPanel2.add(numch, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 270, 260, 40));

        DateD.setBackground(new java.awt.Color(250, 249, 248));
        DateD.setForeground(new java.awt.Color(2, 5, 8));
        DateD.setDateFormatString("yyyy-MM-dd");
        DateD.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        DateD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DateDMousePressed(evt);
            }
        });
        jPanel2.add(DateD, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 270, 38));

        DateF.setBackground(new java.awt.Color(250, 249, 248));
        DateF.setForeground(new java.awt.Color(2, 5, 8));
        DateF.setDateFormatString("yyyy-MM-dd");
        DateF.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        jPanel2.add(DateF, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 270, 40));

        CatégorieChambre.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        CatégorieChambre.setForeground(new java.awt.Color(2, 5, 8));
        CatégorieChambre.setText("Catégorie de chambre");
        jPanel2.add(CatégorieChambre, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, -1, 40));

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
        jPanel2.add(CtgCh, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 190, 260, 40));

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
       DateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
       String DateDS=sdf.format(DateD.getDate());
       String DateFS=sdf.format(DateF.getDate());
      // conditions sur les champs 
      int k=0;
      Integer.parseInt(numch.getSelectedItem().toString());
      try{
        Integer.parseInt(cltt.getSelectedItem().toString());
        k++;
    }catch(Exception e){JOptionPane.showMessageDialog(null, "la N° de client doit etre un nombre entier !!");;} 
        try{ //String catégorie= Categorie1.getText().toString(); 
        
        k++;
    }catch(Exception e){JOptionPane.showMessageDialog(null, "saisir une date valide  !!");} 
       try{  k++;
    }catch(Exception e){JOptionPane.showMessageDialog(null, "saisir une date valide !!");}  
       try{
        Double.parseDouble(prix.getText());
        k++;
    }catch(Exception e){JOptionPane.showMessageDialog(null, "le prix de chambre doit etre un nombre !!");} 
     
         
      //remplir BD 
      selectvalue=chambre.getSelectedItem().toString();
      if(k==4){
             try{
                 Class.forName("com.mysql.jdbc.Driver");
             con= DriverManager.getConnection("jdbc:mysql://localhost:3306/hotellagazelle","root","");
       
          
  String sql ="UPDATE `reservationchambre` SET `IDChambre`=?,`IDClient`=?,`DateD`=?,`DateF`=?,`prixTotal`=? WHERE `IDChambre` = "+selectvalue+"";
             
            pst =con.prepareStatement(sql);
            pst.setString(1,numch.getSelectedItem().toString());
            pst.setString(2,cltt.getSelectedItem().toString());
            pst.setString(3,DateDS);
            pst.setString(4,DateFS);
            pst.setString(5,prix.getText());
            pst.executeUpdate();
                    
            
            JOptionPane.showMessageDialog(null,"Mettre à jour avec succès");
             new ReservationCham().setVisible(true);
             this.dispose();
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
      }
   
    }//GEN-LAST:event_BModifierActionPerformed

    private void chambreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chambreActionPerformed
 selectvalue= chambre.getSelectedItem().toString();
  numch.removeAllItems();
  prix.setText("");
 
      try{
           Class.forName("com.mysql.jdbc.Driver");
            System.err.println("connected");
            Connection cnx =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotellagazelle","root","");
             Connection cnx2 =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotellagazelle","root","");
            Statement st =cnx.createStatement();
            Statement st2 =cnx2.createStatement();
            //requete
            String SQL="select * from reservationchambre where IDChambre="+selectvalue+";";   
            String SQL2="select Categorie from chambre where NumChambre="+selectvalue+";";
            ResultSet rs= st.executeQuery(SQL);
            ResultSet rs2= st2.executeQuery(SQL2);
            while(rs.next()){
                //add data until finish
               
                String NumClient=String.valueOf(rs.getInt("IDClient"));
                Date Dated=rs.getDate("DateD");
                Date Datef=rs.getDate("DateF");
                String Prix=String.valueOf(rs.getDouble("prixTotal"));
                DateD.setDate(Dated);
                DateF.setDate(Datef);
                prix.setText(Prix);
                cltt.setSelectedItem(NumClient);
                
            }
            cnx.close();
            while(rs2.next()){
                CtgCh.setSelectedItem(rs2.getString("Categorie"));
            }
            cnx2.close();
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);}
        
    }//GEN-LAST:event_chambreActionPerformed

    private void chambreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chambreMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_chambreMouseClicked

    private void prixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prixActionPerformed

    private void clttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clttActionPerformed

    }//GEN-LAST:event_clttActionPerformed

    private void numchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numchActionPerformed
       
    }//GEN-LAST:event_numchActionPerformed

    private void DateDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DateDMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateDMousePressed

    private void CtgChItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CtgChItemStateChanged
         numch.removeAllItems();
          DateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
         String DateDS=sdf.format(DateD.getDate());
         String DateFS=sdf.format(DateF.getDate());
        if (evt.getStateChange() == evt.SELECTED) {
            Object item = evt.getItem();
            
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
                        numch.addItem(rs.getString("NumChambre"));}
                }
                cnx.close();

            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);        }

        }
    }//GEN-LAST:event_CtgChItemStateChanged

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

    private void numchItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_numchItemStateChanged
        prix.setText("");
        if (evt.getStateChange() == evt.SELECTED) {
            Object item = evt.getItem();
             long duration= ChronoUnit.DAYS.between(DateD.getDate().toInstant(), DateF.getDate().toInstant());
         try{
           Class.forName("com.mysql.jdbc.Driver");
            System.err.println("connected");
            Connection cnx =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotellagazelle","root","");
            Statement st =cnx.createStatement();
            //requete
           String SQL="SELECT PrixChambre FROM `chambre` WHERE NumChambre = '"+ item.toString()+"'" ;
            ResultSet rs= st.executeQuery(SQL);
            while(rs.next()){
                //add data until finish
  
               Double Prix=rs.getDouble("PrixChambre");
                double prixx= Prix * duration;
                prix.setText(String.valueOf(prixx));
                
                
            }
            cnx.close();
            
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);}
        
        }
    }//GEN-LAST:event_numchItemStateChanged
    public void updatecombox(){
    
    try{
           Class.forName("com.mysql.jdbc.Driver");
            System.err.println("connected");
            Connection cnx =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotellagazelle","root","");
            Statement st =cnx.createStatement();
            //requete
            String SQL="select  IDChambre from reservationchambre";
            ResultSet rs= st.executeQuery(SQL);
            while(rs.next()){
                //add data until finish
              chambre.addItem(rs.getString("IDChambre"));
              numch.addItem(rs.getString("IDChambre"));
            }
            cnx.close();
            
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);}
    }
  ///////////////////////////////////
    public void updatecomboxx(){
    
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
              cltt.addItem(rs.getString("Id_client"));
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
            java.util.logging.Logger.getLogger(ModifierReservationChambre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifierReservationChambre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifierReservationChambre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifierReservationChambre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new ModifierReservationChambre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BModifier;
    private javax.swing.JLabel CatégorieChambre;
    private javax.swing.JComboBox<String> CtgCh;
    private com.toedter.calendar.JDateChooser DateD;
    private com.toedter.calendar.JDateChooser DateF;
    private javax.swing.JComboBox<String> chambre;
    private javax.swing.JComboBox<String> cltt;
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
    private javax.swing.JComboBox<String> numch;
    private javax.swing.JTextField prix;
    // End of variables declaration//GEN-END:variables
}
