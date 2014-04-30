package work.out.application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import work.out.application.loginFrame;

/**
 *
 * @author luisluna
 */
public class newuser extends javax.swing.JFrame {
    
    private static String CONN_STRING ="jdbc:mysql://localhost/workoutApp";
    
    /**
     * Creates new form newuser
     */
    public newuser() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        firstnameLabel = new javax.swing.JLabel();
        firstnameText = new javax.swing.JTextField();
        lastnameLabel = new javax.swing.JLabel();
        lastnameText = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordLabel1 = new javax.swing.JLabel();
        passwordText1 = new javax.swing.JTextField();
        passwordText2 = new javax.swing.JTextField();
        FrameLabel = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        resultText = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        firstnameLabel.setText("First Name:");

        firstnameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameTextActionPerformed(evt);
            }
        });

        lastnameLabel.setText("Last Name: ");

        lastnameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameTextActionPerformed(evt);
            }
        });

        passwordLabel.setText("Password:");

        passwordLabel1.setText("Re-type Password:");

        passwordText2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordText2ActionPerformed(evt);
            }
        });

        FrameLabel.setText("New User");

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Back");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        resultText.setText("Complete the Form");

        usernameLabel.setText("Username:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordLabel1)
                            .addComponent(passwordLabel)
                            .addComponent(lastnameLabel)
                            .addComponent(firstnameLabel)
                            .addComponent(usernameLabel)))
                    .addComponent(submitButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordText2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordText1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(FrameLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(resultText)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastnameText, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(firstnameText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {firstnameText, lastnameText, usernameText});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FrameLabel)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstnameLabel)
                    .addComponent(firstnameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastnameLabel)
                    .addComponent(lastnameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel1)
                    .addComponent(passwordText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submitButton)
                    .addComponent(cancelButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lastnameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameTextActionPerformed

    private void firstnameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameTextActionPerformed
       
    }//GEN-LAST:event_firstnameTextActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
            new loginFrame().setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void passwordText2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordText2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordText2ActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        Statement stm = null;
        Connection conn = null;
        ArrayList<String> list = new ArrayList<String>();
        String query = "";
        String pw = "";
        String first="";
        String last="";
        String username = "";
        boolean usernameExist = false;
        boolean personExist = false;
        
        /*Check if the passwords match*/
        if(passwordText1.getText().equals(passwordText2.getText())){
            
            try {
                /*Establish connection with the database*/
                conn = DriverManager.getConnection(CONN_STRING, "root", "paco021589");
                
                /*Check if the new user is in the database*/
                query ="select firstname, lastname, username from users";
                ResultSet rs = conn.createStatement().executeQuery(query);
                while(rs.next()){
                    first=rs.getString("firstname");
                    last =rs.getString("lastname");
                    username = rs.getString("username");
                    //System.out.println(first + " " + last + " " + username);
                    
                    /*Checks if the new user exists already*/
                    if(firstnameText.getText().equals(first) &&
                            lastnameText.getText().equals(last))
                        personExist=true;
                    else if(usernameText.getText().equals(username))
                        usernameExist = true;
                }//End while-loop
                
                /*Creates a new user in the application if it does not exist*/
                if(!personExist && !usernameExist){
                    query = "insert into `users` (`id`, `firstname`, `lastname`"
                            + ", `username`, `password`) VALUES " +
                            "(NULL, \"" + firstnameText.getText() + "\" , \""+
                            lastnameText.getText()+"\", \""+ usernameText.getText()
                            + "\", "
                            + "\""+passwordText1.getText()+"\")";
                    System.out.println(query);
                    conn.createStatement().execute(query);
                    resultText.setText("Welcome " + firstnameText.getText()+"!");
                }
                else if(personExist){
                    resultText.setText(firstnameText.getText()+ 
                             lastnameText.getText()+ " already exist!");
                }
                else if(usernameExist)
                    resultText.setText(usernameText.getText()+ " already exist!");
            } catch (SQLException ex) {
                Logger.getLogger(newuser.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        else
            resultText.setText("Passwords do not match!");
    }//GEN-LAST:event_submitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(newuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newuser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FrameLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel firstnameLabel;
    private javax.swing.JTextField firstnameText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lastnameLabel;
    private javax.swing.JTextField lastnameText;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel passwordLabel1;
    private javax.swing.JTextField passwordText1;
    private javax.swing.JTextField passwordText2;
    private javax.swing.JLabel resultText;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables
}
