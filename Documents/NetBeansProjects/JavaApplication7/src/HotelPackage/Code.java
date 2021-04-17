package HotelPackage;
import com.email.durgesh.Email;
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
import net.proteanit.sql.DbUtils;


public class Code extends javax.swing.JFrame {
            
   Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
    public Code() {
        setUndecorated(true);
        setResizable(false);

        initComponents();
      
       
        
    }
    
    
    
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        rr = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        Check = new javax.swing.JCheckBox();
        jPanel11 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        annuler = new javax.swing.JButton();
        confirmer = new javax.swing.JButton();
        dd = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(244, 240, 235));
        jPanel2.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(250, 249, 248));
        jPanel5.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(2, 5, 8));
        jLabel17.setText("Password");
        jPanel5.add(jLabel17);
        jLabel17.setBounds(30, 140, 89, 25);

        jLabel8.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(2, 5, 8));
        jLabel8.setText("User_Name");
        jPanel5.add(jLabel8);
        jLabel8.setBounds(30, 90, 99, 30);
        jPanel5.add(jSeparator1);
        jSeparator1.setBounds(0, 40, 0, 20);

        jLabel3.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.black);
        jLabel3.setText("Merci de vérifier que vous avez reçu un e-mail avec votre mot de passe.");
        jPanel5.add(jLabel3);
        jLabel3.setBounds(10, 20, 550, 40);

        jLabel5.setBackground(new java.awt.Color(204, 255, 255));
        jPanel5.add(jLabel5);
        jLabel5.setBounds(0, 40, 0, 20);
        jPanel5.add(jSeparator2);
        jSeparator2.setBounds(0, 0, 690, 2);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel4.setForeground(java.awt.Color.black);
        jLabel4.setText("Nous avons envoyé votre mot de passe à :");
        jPanel5.add(jLabel4);
        jLabel4.setBounds(390, 90, 266, 18);

        rr.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        rr.setForeground(java.awt.Color.black);
        rr.setText(" ********@gmail.com");
        rr.setToolTipText("");
        jPanel5.add(rr);
        rr.setBounds(460, 120, 140, 18);

        username.setBackground(java.awt.Color.white);
        username.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel5.add(username);
        username.setBounds(150, 90, 220, 30);

        password.setBackground(java.awt.Color.white);
        password.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel5.add(password);
        password.setBounds(150, 140, 220, 30);

        Check.setBackground(java.awt.Color.white);
        Check.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Check.setForeground(new java.awt.Color(0, 51, 51));
        Check.setText("Afficher mot de passe");
        Check.setOpaque(false);
        Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckActionPerformed(evt);
            }
        });
        jPanel5.add(Check);
        Check.setBounds(180, 170, 162, 27);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(370, 290, 690, 210);

        jPanel11.setBackground(new java.awt.Color(250, 249, 248));
        jPanel11.setLayout(null);
        jPanel2.add(jPanel11);
        jPanel11.setBounds(660, 230, 0, 210);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Crash.AMOULA-PC\\Desktop\\HotelLaGazelle\\Documents\\NetBeansProjects\\JavaApplication7\\src\\HotelPackage\\exitpng.png")); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(1317, 18, 24, 25);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Crash.AMOULA-PC\\Desktop\\HotelLaGazelle\\Documents\\NetBeansProjects\\JavaApplication7\\src\\HotelPackage\\Group .png")); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 1370, 170);
        jPanel2.add(jSeparator5);
        jSeparator5.setBounds(370, 500, 690, 10);

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
        jPanel2.add(annuler);
        annuler.setBounds(990, 520, 120, 43);

        confirmer.setBackground(new java.awt.Color(0, 0, 0));
        confirmer.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        confirmer.setForeground(new java.awt.Color(250, 249, 248));
        confirmer.setText("Connexion");
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
        jPanel2.add(confirmer);
        confirmer.setBounds(850, 520, 133, 43);
        jPanel2.add(dd);
        dd.setBounds(430, 200, 0, 0);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(table);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(410, 140, 453, 10);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, 1020));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

        System.exit(0);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        //this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void annulerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_annulerFocusGained
        annuler.setBackground(new java.awt.Color(250,249,248));
        annuler.setForeground(new java.awt.Color(2, 5, 8));
    }//GEN-LAST:event_annulerFocusGained

    private void annulerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_annulerFocusLost
        annuler.setBackground(new java.awt.Color(0,0,0));
        annuler.setForeground(new java.awt.Color(250,249,248));
    }//GEN-LAST:event_annulerFocusLost

    private void annulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_annulerActionPerformed

    private void confirmerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmerFocusGained
        confirmer.setBackground(new java.awt.Color(250,249,248));
        confirmer.setForeground(new java.awt.Color(2, 5, 8));
    }//GEN-LAST:event_confirmerFocusGained

    private void confirmerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmerFocusLost
        confirmer.setBackground(new java.awt.Color(0,0,0));
        confirmer.setForeground(new java.awt.Color(250,249,248));
    }//GEN-LAST:event_confirmerFocusLost

    private void confirmerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmerMouseClicked

    }//GEN-LAST:event_confirmerMouseClicked

    private void confirmerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmerMousePressed

    }//GEN-LAST:event_confirmerMousePressed

    private void confirmerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmerActionPerformed
 
       try{
            Class.forName("com.mysql.jdbc.Driver");
            System.err.println("connected");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotellagazelle","root","");
            String sql ="SELECT * FROM `login` WHERE username=? and password=?";
           
            pst =con.prepareStatement(sql);
            pst.setString(1,username.getText());
            pst.setString(2,password.getText());
            ResultSet rs =pst.executeQuery();

        if(rs.next()){
          JOptionPane.showMessageDialog(null,"Nom d'utilisateur et mot de passe correct");
                Accueil s = new Accueil();
                s.setVisible(true);
                // s.pack();
                s.setLocationRelativeTo(null);
                s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
            }
            else { JOptionPane.showMessageDialog(null,"Nom d'utilisateur ou mot de passe incorrect"); }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Username and Password do not Marched");
        }
    
    }//GEN-LAST:event_confirmerActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed

    }//GEN-LAST:event_passwordActionPerformed

    private void CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckActionPerformed
        if (Check.isSelected()){
            password.setEchoChar((char)0);

        }
        else {
            password.setEchoChar('*');

        }
    }//GEN-LAST:event_CheckActionPerformed
 
    
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
            java.util.logging.Logger.getLogger(Code.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Code.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Code.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Code.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Code().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Check;
    private javax.swing.JButton annuler;
    private javax.swing.JButton confirmer;
    private javax.swing.JLabel dd;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel rr;
    private javax.swing.JTable table;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
