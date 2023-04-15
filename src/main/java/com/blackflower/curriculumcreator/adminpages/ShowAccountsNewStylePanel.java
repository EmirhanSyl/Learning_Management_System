package com.blackflower.curriculumcreator.adminpages;

import com.blackflower.curriculumcreator.MainFrame;
import com.blackflower.curriculumcreator.customComponents.CCUserDetails;
import com.blackflower.curriculumcreator.core.*;
import java.awt.GridLayout;
import javax.swing.JPanel;

/**
 *
 * @author emirs
 */
public class ShowAccountsNewStylePanel extends javax.swing.JPanel implements IPage{

    Admin account;
    
    public ShowAccountsNewStylePanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onPageSetted() {
         account = (Admin)MainFrame.instance.getAccount();
         createAccountList();
    }
    
    private void createAccountList(){ 
        
        int studentCount = 1;
        for (Person user : Database.getUsers()) {
            if (user instanceof Student) { studentCount++; }
        }
        
        JPanel resultConteiner = new JPanel();
        resultConteiner.setSize(800, 100 * studentCount);
        GridLayout gridLayout = new GridLayout(Database.getUsers().size(), 1);
        gridLayout.setVgap(10);
        resultConteiner.setLayout(gridLayout);
        
        for (Person user : Database.getUsers()) {
            if (user instanceof Student student) {
                
                String avatarImagePath =  student.getImagePath();
                String nameText = student.toString();
                String classText = student.getStudentClass().toString();
                String usernameText = student.getUserName();
                
                CCUserDetails userListElement = new CCUserDetails(avatarImagePath, nameText, classText, usernameText);
                userListElement.setSize(800, 100);
                resultConteiner.add(userListElement);
                studentCount++;
            }
        }
        
        jScrollPane1.setViewportView(resultConteiner);
    }
}
