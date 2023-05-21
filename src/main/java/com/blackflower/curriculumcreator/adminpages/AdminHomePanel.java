package com.blackflower.curriculumcreator.adminpages;

import com.blackflower.curriculumcreator.core.IPage;
import com.blackflower.curriculumcreator.MainFrame;
import com.blackflower.curriculumcreator.core.Admin;

/**
 *
 * @author emirs
 */
public class AdminHomePanel extends javax.swing.JPanel implements IPage{

    Admin account;
    public AdminHomePanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageClassBtn = new javax.swing.JButton();
        manageClassStudentsBtn = new javax.swing.JButton();
        manageClassLessonsBtn = new javax.swing.JButton();
        createAccpuntBtn = new javax.swing.JButton();
        manageLessonsBtn = new javax.swing.JButton();
        manageAccountsBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();
        newStyleAccBtn = new javax.swing.JButton();

        manageClassBtn.setText("Manage Class");
        manageClassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageClassBtnActionPerformed(evt);
            }
        });

        manageClassStudentsBtn.setText("Manage Class' Students");
        manageClassStudentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageClassStudentsBtnActionPerformed(evt);
            }
        });

        manageClassLessonsBtn.setText("Manage Class' Lessons");
        manageClassLessonsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageClassLessonsBtnActionPerformed(evt);
            }
        });

        createAccpuntBtn.setText("Create new Account");
        createAccpuntBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccpuntBtnActionPerformed(evt);
            }
        });

        manageLessonsBtn.setText("Manage Lessons");
        manageLessonsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageLessonsBtnActionPerformed(evt);
            }
        });

        manageAccountsBtn.setText("Manage Accounts");
        manageAccountsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAccountsBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setText("Lesson");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setText("Class");

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel3.setText("Account");

        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        newStyleAccBtn.setText("New Style Accounts");
        newStyleAccBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newStyleAccBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(manageClassStudentsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageClassLessonsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageClassBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(manageAccountsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createAccpuntBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(manageLessonsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newStyleAccBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                .addGap(174, 174, 174))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(183, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(manageLessonsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(newStyleAccBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(manageClassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(manageClassStudentsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(manageAccountsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(createAccpuntBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manageClassLessonsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(194, 194, 194))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageClassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageClassBtnActionPerformed
        // TODO add your handling code here:
        MainFrame.instance.setPage(MainFrame.instance.getAddClassPage());
    }//GEN-LAST:event_manageClassBtnActionPerformed

    private void manageClassStudentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageClassStudentsBtnActionPerformed
        // TODO add your handling code here:
        MainFrame.instance.setPage(MainFrame.instance.getManageClassesStudentsPage());
    }//GEN-LAST:event_manageClassStudentsBtnActionPerformed

    private void manageClassLessonsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageClassLessonsBtnActionPerformed
        // TODO add your handling code here:
        MainFrame.instance.setPage(MainFrame.instance.getManageClassesPage());
    }//GEN-LAST:event_manageClassLessonsBtnActionPerformed

    private void manageAccountsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAccountsBtnActionPerformed
        // TODO add your handling code here:
        MainFrame.instance.setPage(MainFrame.instance.getAccountManagementPage());
    }//GEN-LAST:event_manageAccountsBtnActionPerformed

    private void createAccpuntBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccpuntBtnActionPerformed
        // TODO add your handling code here:
        MainFrame.instance.setPage(MainFrame.instance.getRegisterPage());
    }//GEN-LAST:event_createAccpuntBtnActionPerformed

    private void manageLessonsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageLessonsBtnActionPerformed
        // TODO add your handling code here:
        MainFrame.instance.setPage(MainFrame.instance.getAddLessonPage());
    }//GEN-LAST:event_manageLessonsBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        MainFrame.instance.logout();
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void newStyleAccBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newStyleAccBtnActionPerformed
        // TODO add your handling code here:
         MainFrame.instance.setPage(MainFrame.instance.getShowAccountsNewStylePage());
    }//GEN-LAST:event_newStyleAccBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createAccpuntBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton manageAccountsBtn;
    private javax.swing.JButton manageClassBtn;
    private javax.swing.JButton manageClassLessonsBtn;
    private javax.swing.JButton manageClassStudentsBtn;
    private javax.swing.JButton manageLessonsBtn;
    private javax.swing.JButton newStyleAccBtn;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onPageSetted() {
         account = (Admin)MainFrame.instance.getAccount();
    }
}
