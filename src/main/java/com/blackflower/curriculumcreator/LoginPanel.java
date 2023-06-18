package com.blackflower.curriculumcreator;

import com.blackflower.curriculumcreator.jpa.model.*;
import com.blackflower.curriculumcreator.core.IPage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author emirs
 */
public class LoginPanel extends javax.swing.JPanel implements IPage {

    public LoginPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cCRoundedButton1 = new com.blackflower.curriculumcreator.customComponents.CCRoundedButton();
        cCGradientPanel1 = new com.blackflower.curriculumcreator.customComponents.CCGradientPanel();
        rememberMeCheckBox = new javax.swing.JCheckBox();
        loginbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(240, 248, 255));

        cCGradientPanel1.setGradientEndd(new java.awt.Color(204, 204, 204));
        cCGradientPanel1.setGradientStart(new java.awt.Color(204, 204, 204));

        rememberMeCheckBox.setText("Remember me");

        loginbtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loginbtn.setText("Login");
        loginbtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        loginbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        javax.swing.GroupLayout cCGradientPanel1Layout = new javax.swing.GroupLayout(cCGradientPanel1);
        cCGradientPanel1.setLayout(cCGradientPanel1Layout);
        cCGradientPanel1Layout.setHorizontalGroup(
            cCGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cCGradientPanel1Layout.createSequentialGroup()
                .addGap(359, 359, 359)
                .addGroup(cCGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cCGradientPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cCGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(rememberMeCheckBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(passwordField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(usernameField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(360, Short.MAX_VALUE))
        );
        cCGradientPanel1Layout.setVerticalGroup(
            cCGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cCGradientPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addGap(9, 9, 9)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rememberMeCheckBox)
                .addGap(32, 32, 32)
                .addComponent(loginbtn)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(cCGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cCGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        // TODO add your handling code here:
        String pwd = String.valueOf(passwordField.getPassword());
        Person account = Login.loginValidation(usernameField.getText(), pwd);

        if (account == null) {
            JOptionPane.showMessageDialog(this, "This user does not exist!", "User Not Found", JOptionPane.ERROR_MESSAGE);
        } else if (account instanceof Admin) {
            rememberMe();
            MainFrame.instance.setAccount(account);
            MainFrame.instance.setPage(MainFrame.instance.getAdminHomePage());
            MainFrame.instance.login();
        } else if (account instanceof Instructor) {
            rememberMe();
            MainFrame.instance.setAccount(account);
            MainFrame.instance.setPage(MainFrame.instance.getInstructorHomePage());
            MainFrame.instance.login();
        } else if (account instanceof Student) {
            rememberMe();
            MainFrame.instance.setAccount(account);
            MainFrame.instance.setPage(MainFrame.instance.getStudentHomePage());
            MainFrame.instance.login();
        } else {
            JOptionPane.showMessageDialog(this, "Something went wrong!", "Unclassified Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_loginbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.blackflower.curriculumcreator.customComponents.CCGradientPanel cCGradientPanel1;
    private com.blackflower.curriculumcreator.customComponents.CCRoundedButton cCRoundedButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginbtn;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JCheckBox rememberMeCheckBox;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onPageSetted() {
        Database.initDatabase("LMS_PE");
        //checkRememberMe();
    }

    public void checkRememberMe() {
        String filename = "C:\\Users\\emirs\\Documents\\NetBeansProjects\\CurriculumCreator\\settings\\rememberMe.txt";

        ArrayList<String> lines = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
        
        if (lines.size() == 2) {
            validation(lines.get(0), lines.get(1));
        }
    }

    public void validation(String username, String pwd) {
        Person account = Login.loginValidation(username, pwd);

        if (account == null) {
            JOptionPane.showMessageDialog(this, "Corrupted Remember Me File!!!", "Corrupted File", JOptionPane.ERROR_MESSAGE);
        } else if (account instanceof Admin) {
            MainFrame.instance.setAccount(account);
            MainFrame.instance.setPage(MainFrame.instance.getAdminHomePage());
            MainFrame.instance.login();
        } else if (account instanceof Instructor) {
            MainFrame.instance.setAccount(account);
            MainFrame.instance.setPage(MainFrame.instance.getInstructorHomePage());
            MainFrame.instance.login();
        } else if (account instanceof Student) {
            MainFrame.instance.setAccount(account);
            MainFrame.instance.setPage(MainFrame.instance.getStudentHomePage());
            MainFrame.instance.login();
        } else {
            JOptionPane.showMessageDialog(this, "Something went wrong!", "Unclassified Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void rememberMe() {
        if (!rememberMeCheckBox.isSelected()) {
            return;
        }

        String filename = "C:\\Users\\emirs\\Documents\\NetBeansProjects\\CurriculumCreator\\settings\\rememberMe.txt";
        String[] lines = {
            usernameField.getText(),
            String.valueOf(passwordField.getPassword())
        };

        try {
            FileWriter fileWriter = new FileWriter(filename);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (String line : lines) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            System.out.println("Content written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    public void forgetMe() {
        String filename = "C:\\Users\\emirs\\Documents\\NetBeansProjects\\CurriculumCreator\\settings\\rememberMe.txt";
        try {
            FileWriter fileWriter = new FileWriter(filename);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("");

            bufferedWriter.close();
            System.out.println("Content written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
