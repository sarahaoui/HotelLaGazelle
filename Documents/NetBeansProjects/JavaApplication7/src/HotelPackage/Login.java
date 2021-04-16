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
import net.proteanit.sql.DbUtils;


public class Login extends javax.swing.JFrame {
            
   Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
    public Login() {
        setUndecorated(true);
        setResizable(false);
        Connection con = null;
         PreparedStatement pst = null;
        ResultSet rs = null;
        initComponents();
      
       
        
    }
    
    
    
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        Check = new javax.swing.JCheckBox();
        password = new javax.swing.JPasswordField();
        username = new javax.swing.JTextField();
        BCllient1 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        a3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(244, 240, 235));
        jPanel2.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(250, 249, 248));
        jPanel5.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(2, 5, 8));
        jLabel8.setText("User_Name");
        jPanel5.add(jLabel8);
        jLabel8.setBounds(30, 40, 99, 30);

        jPanel12.setBackground(new java.awt.Color(244, 240, 235));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel12);
        jPanel12.setBounds(20, 40, 130, 30);

        jPanel15.setBackground(new java.awt.Color(244, 240, 235));

        jLabel17.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(2, 5, 8));
        jLabel17.setText("Password");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel17)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.add(jPanel15);
        jPanel15.setBounds(20, 110, 130, 30);

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
        Check.setBounds(190, 140, 162, 27);

        password.setBackground(java.awt.Color.white);
        password.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel5.add(password);
        password.setBounds(170, 110, 220, 30);

        username.setBackground(java.awt.Color.white);
        username.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel5.add(username);
        username.setBounds(170, 40, 220, 30);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(470, 290, 430, 190);

        BCllient1.setBackground(new java.awt.Color(0, 0, 0));
        BCllient1.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        BCllient1.setForeground(new java.awt.Color(250, 249, 248));
        BCllient1.setText("Connexion");
        BCllient1.setPreferredSize(new java.awt.Dimension(150, 52));
        BCllient1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BCllient1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                BCllient1FocusLost(evt);
            }
        });
        BCllient1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BCllient1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BCllient1MousePressed(evt);
            }
        });
        BCllient1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCllient1ActionPerformed(evt);
            }
        });
        jPanel2.add(BCllient1);
        BCllient1.setBounds(590, 500, 210, 43);

        jPanel11.setBackground(new java.awt.Color(250, 249, 248));
        jPanel11.setLayout(null);
        jPanel2.add(jPanel11);
        jPanel11.setBounds(660, 230, 0, 210);

        a3.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        a3.setForeground(java.awt.Color.black);
        a3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a3.setText("Informations de compte oubliées ?");
        a3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        a3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a3MouseClicked(evt);
            }
        });
        jPanel2.add(a3);
        a3.setBounds(590, 550, 223, 20);

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

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel1.setForeground(java.awt.Color.black);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(480, 240, 410, 26);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, 1020));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BCllient1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCllient1ActionPerformed
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
    }//GEN-LAST:event_BCllient1ActionPerformed

    private void BCllient1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BCllient1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BCllient1MouseClicked

    private void BCllient1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BCllient1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BCllient1MousePressed

    private void BCllient1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BCllient1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_BCllient1FocusLost

    private void BCllient1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BCllient1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_BCllient1FocusGained

    private void CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckActionPerformed
if (Check.isSelected()){
            password.setEchoChar((char)0);
            
        }
        else {
            password.setEchoChar('*');
            
        }        
    }//GEN-LAST:event_CheckActionPerformed

    private void a3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a3MouseClicked
       
    }//GEN-LAST:event_a3MouseClicked

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed

    }//GEN-LAST:event_passwordActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

        System.exit(0);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        //this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

      
      
        
      
      
      
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCllient1;
    private javax.swing.JCheckBox Check;
    private javax.swing.JLabel a3;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
