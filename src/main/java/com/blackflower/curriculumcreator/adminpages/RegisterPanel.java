package com.blackflower.curriculumcreator.adminpages;

import com.blackflower.curriculumcreator.MainFrame;
import com.blackflower.curriculumcreator.core.IPage;
import com.blackflower.curriculumcreator.core.NotificationManager;
import com.blackflower.curriculumcreator.jpa.model.*;
import com.blackflower.curriculumcreator.jpa.repository.LessonRepository;
import com.blackflower.curriculumcreator.jpa.repository.StudentClassRepository;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author emirs
 */
public class RegisterPanel extends javax.swing.JPanel implements IPage{

    Admin account;
    List<StudentClass> studentClasses;
    List<Lesson> lessons;
    
    public RegisterPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        termsCheckBox = new javax.swing.JCheckBox();
        registerButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        surnameField = new javax.swing.JTextField();
        instructorRadioBtn = new javax.swing.JRadioButton();
        studentRadioBtn = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        stuLecComboBox = new javax.swing.JComboBox<>();
        stulecLabel = new javax.swing.JLabel();
        homeBtn = new javax.swing.JButton();

        termsCheckBox.setText("I agree with the terms and conditions");

        registerButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        registerButton.setText("Create Account");
        registerButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        registerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Create An Account");

        jLabel9.setText("First Name");

        jLabel10.setText("Last Name");

        buttonGroup1.add(instructorRadioBtn);
        instructorRadioBtn.setText("Instructor");
        instructorRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instructorRadioBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(studentRadioBtn);
        studentRadioBtn.setSelected(true);
        studentRadioBtn.setText("Student");
        studentRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentRadioBtnActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Choose Account Type:");

        stuLecComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Class1" }));

        stulecLabel.setText("Student Class:");

        homeBtn.setText("Home");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(studentRadioBtn)
                                    .addGap(66, 66, 66)
                                    .addComponent(instructorRadioBtn))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(nameField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(surnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(stulecLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                        .addComponent(stuLecComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(termsCheckBox)
                                            .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(10, 10, 10)))))))
                .addGap(344, 344, 344))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(surnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(studentRadioBtn)
                            .addComponent(instructorRadioBtn))))
                .addGap(18, 18, 18)
                .addComponent(stulecLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stuLecComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(termsCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerButton)
                .addContainerGap(126, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
        if (studentRadioBtn.isSelected() && stuLecComboBox.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Please Select A Class/Lesson!", "Class/Lesson Selectin is Null", JOptionPane.ERROR_MESSAGE);
            return;
        }else if(!termsCheckBox.isSelected()){
            JOptionPane.showMessageDialog(this, "Please Accept Terms And Conditions!", "Terms And Conditions", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if (nameField.getText().isBlank() || surnameField.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Please fill All Fields!", "Field(s) are empty", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Person createdPerson = null;
        
        if (buttonGroup1.isSelected(studentRadioBtn.getModel())) {
            StudentClass studentClass = (StudentClass)stuLecComboBox.getSelectedItem(); 
            createdPerson = Database.addStudent(nameField.getText(), surnameField.getText(), studentClass);
        }
        else if(buttonGroup1.isSelected(instructorRadioBtn.getModel())){
            Lesson lesson = (Lesson)stuLecComboBox.getSelectedItem(); 
            createdPerson = Database.addInstructor(nameField.getText(), surnameField.getText(), lesson);
        }
        
        nameField.setText("");
        surnameField.setText("");
        
        JOptionPane.showMessageDialog(this, "Account Created Succesfuly! Username: " + createdPerson.getUsername() + " Password: 123", "Account Created", JOptionPane.INFORMATION_MESSAGE);
        
        NotificationManager.createNotification("C:\\Users\\emirs\\Desktop\\pics\\appIcons\\bell-ring.png",
                "New User Added!", 
                "New User \""+ nameField.getText() + "\" created.");
    }//GEN-LAST:event_registerButtonActionPerformed

    private void studentRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentRadioBtnActionPerformed
        // TODO add your handling code here:
        refreshComboBox("Student Class:", studentClasses);
    }//GEN-LAST:event_studentRadioBtnActionPerformed

    private void instructorRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instructorRadioBtnActionPerformed
        // TODO add your handling code here: 
        refreshComboBox("Instructor Lesson:", lessons);
    }//GEN-LAST:event_instructorRadioBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        // TODO add your handling code here:
        MainFrame.instance.setPage(MainFrame.instance.getAdminHomePage());
    }//GEN-LAST:event_homeBtnActionPerformed

    public final void refreshComboBox(String labelText, List list){
        stulecLabel.setText(labelText);
        stuLecComboBox.removeAllItems();
        
        if (labelText.equals("Instructor Lesson:")) {
            stuLecComboBox.addItem(null);
        }
        
        for (Object item : list) {
            stuLecComboBox.addItem(item);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton homeBtn;
    private javax.swing.JRadioButton instructorRadioBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton registerButton;
    private javax.swing.JComboBox<Object> stuLecComboBox;
    private javax.swing.JRadioButton studentRadioBtn;
    private javax.swing.JLabel stulecLabel;
    private javax.swing.JTextField surnameField;
    private javax.swing.JCheckBox termsCheckBox;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onPageSetted() {
        account = (Admin)MainFrame.instance.getAccount();
        
        Database.initDatabase("LMS_PE");
        
        lessons = Database.findAllLessons();
        studentClasses = Database.findAllClasses();
        
        if (buttonGroup1.isSelected(studentRadioBtn.getModel())) {
            refreshComboBox("Student Class:", studentClasses);
        }
        else if(buttonGroup1.isSelected(instructorRadioBtn.getModel())){
            refreshComboBox("Instructor Lesson:", lessons);
        }
        
    }
}
