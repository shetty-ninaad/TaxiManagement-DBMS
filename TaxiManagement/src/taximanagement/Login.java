/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taximanagement;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author MAHE
 */
public class Login extends javax.swing.JFrame {

    
  Connection conn=null;
  ResultSet rs=null;
  PreparedStatement pst=null;
  
    public Login() {
        initComponents();
        conn=JavaConnectDB.ConnecrDb();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label2 = new java.awt.Label();
        label1 = new java.awt.Label();
        LOGIN = new javax.swing.JButton();
        ComboBox_UserType = new javax.swing.JComboBox<>();
        PasswordField_ID = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SIGN_UP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 0));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "SIGN IN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Felix Titling", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel1.setToolTipText("LOGIN");
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.setName("LOGIN"); // NOI18N
        jPanel1.setOpaque(false);

        label2.setText("USER TYPE");

        label1.setText("ID");

        LOGIN.setBackground(new java.awt.Color(102, 102, 102));
        LOGIN.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LOGIN.setForeground(new java.awt.Color(255, 255, 255));
        LOGIN.setText("LOGIN");
        LOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGINActionPerformed(evt);
            }
        });

        ComboBox_UserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "CLIENT", "DRIVER" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ComboBox_UserType, 0, 109, Short.MAX_VALUE)
                    .addComponent(PasswordField_ID))
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LOGIN)
                .addGap(91, 91, 91))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {label1, label2});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBox_UserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(LOGIN)
                .addContainerGap())
        );

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\MAHE\\Desktop\\Capture.JPG")); // NOI18N

        jLabel2.setText("NEW USER? ");

        SIGN_UP.setText("SIGN UP");
        SIGN_UP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIGN_UPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(SIGN_UP))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SIGN_UP)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void close()
    {
     WindowEvent winClosingEvent= new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
     Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    
    private void LOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGINActionPerformed
        close();
        Object temp=ComboBox_UserType.getSelectedItem();
        String user=temp.toString();
        String pass=PasswordField_ID.getText();
        if(user.equals("ADMIN")&&pass.equals("ADMIN"))
        {
        Admin_Module adm = new Admin_Module();
        adm.setVisible(true);
        }
        else if(user.equals("CLIENT"))
        {
            try {
                String qry="select * from CUSTOMER where customer_id= '"+pass+"'";
                pst=conn.prepareStatement(qry);
                rs=pst.executeQuery();
            
             if(rs.next())
                {
                   CUSTOMER_MODULE cm =new CUSTOMER_MODULE();
                   cm.setVisible(true);
                }
             else
                {
                   JOptionPane.showMessageDialog(null,"INVALID CUSTOMER ID : "+pass);  
                }
            }
            catch(Exception e){
                  JOptionPane.showMessageDialog(null,e);  
            }
            
            
        }
        else if(user.equals("DRIVER"))
        {
            try {
                String qry="select * from DRIVER where driver_id= '"+pass+"'";
                pst=conn.prepareStatement(qry);
                rs=pst.executeQuery();
            
             if(rs.next())
                {
                   DRIVER_MODULE cm =new DRIVER_MODULE();
                   cm.setVisible(true);
                }
             else
                {
                   JOptionPane.showMessageDialog(null,"INVALID CUSTOMER ID : "+pass);  
                }
            }
            catch(Exception e){
                  JOptionPane.showMessageDialog(null,e);  
            }
        }
        else
            JOptionPane.showMessageDialog(null,"INVALID ID");
        
    }//GEN-LAST:event_LOGINActionPerformed

    private void SIGN_UPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIGN_UPActionPerformed
        // TODO add your handling code here:
        close();
        Sign_Up su =new Sign_Up();
        su.setVisible(true);
    }//GEN-LAST:event_SIGN_UPActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox_UserType;
    private javax.swing.JButton LOGIN;
    private javax.swing.JPasswordField PasswordField_ID;
    private javax.swing.JButton SIGN_UP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    // End of variables declaration//GEN-END:variables
}
