/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelPackage;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc-click
 */
public class Chambre extends javax.swing.JFrame {
Connection cnx=null;
 public String SelectNumChambre;
 public int click=0;
    /**
     * Creates new form Chambre
     */
    public Chambre() {
        setUndecorated(true);
        setResizable(false);
        initComponents();
        jTable1.getTableHeader().setFont(new Font ("Bell MT",Font.BOLD,16));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new Color(250,249,248));
        jTable1.getTableHeader().setForeground(new Color(2,5,8));
        jTable1.setRowHeight(25);
        
        //remplir la table 
        updatetable();
        
       
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(2, 5, 8));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 236, 228));
        jLabel1.setText("Chambre");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(21, 14, 109, 32);

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

        Bsupprimer.setBackground(new java.awt.Color(250, 249, 248));
        Bsupprimer.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        Bsupprimer.setForeground(new java.awt.Color(2, 5, 8));
        Bsupprimer.setIcon(new javax.swing.ImageIcon("C:\\Users\\Crash.AMOULA-PC\\Desktop\\HotelLaGazelle\\Documents\\NetBeansProjects\\JavaApplication7\\src\\HotelPackage\\deleteclient.png")); // NOI18N
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
        Bsupprimer.setBounds(975, 52, 170, 43);

        BNouveau.setBackground(new java.awt.Color(250, 249, 248));
        BNouveau.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        BNouveau.setForeground(new java.awt.Color(2, 5, 8));
        BNouveau.setIcon(new javax.swing.ImageIcon("C:\\Users\\Crash.AMOULA-PC\\Desktop\\HotelLaGazelle\\Documents\\NetBeansProjects\\JavaApplication7\\src\\HotelPackage\\plus.png")); // NOI18N
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
        jPanel2.add(BNouveau);
        BNouveau.setBounds(820, 52, 150, 43);

        BFiche.setBackground(new java.awt.Color(250, 249, 248));
        BFiche.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        BFiche.setForeground(new java.awt.Color(2, 5, 8));
        BFiche.setText(" Modifier");
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
        BFiche.setBounds(1148, 52, 160, 43);

        jTable1.setBackground(new java.awt.Color(250, 249, 248));
        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 186, 162), new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable1.setForeground(new java.awt.Color(2, 5, 8));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°Chambre", "N°Bloc", "N°Etage", "Catégorie", "Nbr Lits", "Prix", "Disponible"
            }
        ));
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(2, 5, 8));
        jTable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(2, 5, 8));
        jTable1.setSelectionForeground(new java.awt.Color(250, 249, 248));
        jTable1.setShowVerticalLines(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(120, 169, 1131, 333);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1460, 960));

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

    private void BsupprimerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BsupprimerFocusGained

    }//GEN-LAST:event_BsupprimerFocusGained

    private void BsupprimerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BsupprimerFocusLost

    }//GEN-LAST:event_BsupprimerFocusLost

    private void BsupprimerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BsupprimerMousePressed

    }//GEN-LAST:event_BsupprimerMousePressed

    private void BsupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsupprimerActionPerformed

        int ligne =0;
        ligne=jTable1.getSelectedRow();
        // recupere les elements
        String NumChambre =jTable1.getValueAt(ligne,0).toString();
     
           try{
           Class.forName("com.mysql.jdbc.Driver");
            System.err.println("connected");
            Connection cnx =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotellagazelle","root","");
            Statement st =cnx.createStatement();
            //requete
            String SQL="delete from chambre where NumChambre="+NumChambre+";";
            st.executeUpdate(SQL); 
            JOptionPane.showMessageDialog(null, "Oprération réussie");
            this.dispose();
            new Chambre().setVisible(true);
           
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);}
          
        
        
        
    }//GEN-LAST:event_BsupprimerActionPerformed

    private void BNouveauFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BNouveauFocusGained

    }//GEN-LAST:event_BNouveauFocusGained

    private void BNouveauFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BNouveauFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_BNouveauFocusLost

    private void BNouveauMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BNouveauMousePressed
       

    }//GEN-LAST:event_BNouveauMousePressed

    private void BNouveauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNouveauActionPerformed
     // add new chambre       
       new FicheChambres().setVisible(true);
    }//GEN-LAST:event_BNouveauActionPerformed

    private void BFicheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFicheActionPerformed

    }//GEN-LAST:event_BFicheActionPerformed

    private void BFicheMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BFicheMousePressed

        new Modifierchambre().setVisible(true);
    }//GEN-LAST:event_BFicheMousePressed

    private void BFicheFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BFicheFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_BFicheFocusLost

    private void BFicheFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BFicheFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_BFicheFocusGained

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
            java.util.logging.Logger.getLogger(Chambre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chambre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chambre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chambre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chambre().setVisible(true);
            }
        });
    }
    public void updatetable(){
        try{
           Class.forName("com.mysql.jdbc.Driver");
            System.err.println("connected");
            Connection cnx =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotellagazelle","root","");
            Statement st =cnx.createStatement();
            //requete
            String SQL="select * from chambre";
            ResultSet rs= st.executeQuery(SQL);
            while(rs.next()){
                //add data until finish
                String Numchambre=String.valueOf(rs.getInt("NumChambre"));
                String Numbloc=String.valueOf(rs.getInt("NumBloc"));
                String Numetage=String.valueOf(rs.getInt("NumEtage"));
                String catégorie=String.valueOf(rs.getString("Categorie"));
                String Nbrlits=String.valueOf(rs.getInt("NbrLits"));
                String prix=String.valueOf(rs.getDouble("PrixChambre"));
                String Dispo=String.valueOf(rs.getBoolean("Disponible"));
                
                //store in table
                
                String Table[]={Numchambre,Numbloc,Numetage,catégorie,Nbrlits,prix,Dispo};
                DefaultTableModel tbModel= (DefaultTableModel)jTable1.getModel();
               
                tbModel.addRow(Table);
            }
            cnx.close();
            
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BFiche;
    private javax.swing.JButton BNouveau;
    private javax.swing.JButton Bsupprimer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
