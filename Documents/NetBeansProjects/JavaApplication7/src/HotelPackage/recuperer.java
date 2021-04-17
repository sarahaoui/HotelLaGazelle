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


public class recuperer extends javax.swing.JFrame {
            
   Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
    public recuperer() {
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        mail = new javax.swing.JTextField();
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
        jPanel5.add(jSeparator1);
        jSeparator1.setBounds(0, 40, 0, 20);

        jLabel3.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.black);
        jLabel3.setText("Veuillez saisir votre adresse e-mail pour rechercher votre compte.");
        jPanel5.add(jLabel3);
        jLabel3.setBounds(10, 20, 500, 40);

        jLabel5.setBackground(new java.awt.Color(204, 255, 255));
        jPanel5.add(jLabel5);
        jLabel5.setBounds(0, 40, 0, 20);
        jPanel5.add(jSeparator2);
        jSeparator2.setBounds(0, 0, 510, 2);

        mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailActionPerformed(evt);
            }
        });
        jPanel5.add(mail);
        mail.setBounds(60, 90, 220, 30);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(470, 290, 510, 190);

        jPanel11.setBackground(new java.awt.Color(250, 249, 248));
        jPanel11.setLayout(null);
        jPanel2.add(jPanel11);
        jPanel11.setBounds(660, 230, 0, 210);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc-click\\Documents\\NetBeansProjects\\HotelLaGazellee\\Documents\\NetBeansProjects\\JavaApplication7\\src\\HotelPackage\\exitpng.png")); // NOI18N
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
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 1370, 170);
        jPanel2.add(jSeparator5);
        jSeparator5.setBounds(470, 480, 510, 2);

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
        confirmer.setText("Confirmer");
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

    private void mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailActionPerformed

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
            //requete
            String sql="SELECT password FROM login WHERE email=?";
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotellagazelle","root","");
        
          pst =con.prepareStatement(sql);
          pst.setString(1,mail.getText());
          rs= pst.executeQuery();
          table.setModel(DbUtils.resultSetToTableModel(rs));
          
          int i=0; 
          dd.setText(table.getValueAt (i, 0).toString());
          dd.setVisible(false);
       String  ww = dd.getText();
       String  t = mail.getText();

       Email email = new Email ("aouinasara77@gmail.com","sarasara");
       email.setFrom("aouinasara77@gmail.com","Hotel La Gazelle");
       email.setSubject("E-mail pour récupérer le mot de passe");
       email.setContent("Votre mot de passe est: <h1> "+ww+"</h1>","text/html");
       email.addRecipient(t);
       email.send(); 
       JOptionPane.showMessageDialog(null," Envoyer avec succès "); 
        Code s = new Code();
        s.setVisible(true);
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
     }
       catch (Exception e){
       JOptionPane.showMessageDialog(null," SVP !! Vérifier votre adresse mail ");
       }
    
    }//GEN-LAST:event_confirmerActionPerformed
 
    
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
            java.util.logging.Logger.getLogger(recuperer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(recuperer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(recuperer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(recuperer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new recuperer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton annuler;
    private javax.swing.JButton confirmer;
    private javax.swing.JLabel dd;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField mail;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
