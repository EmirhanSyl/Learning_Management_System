package com.blackflower.curriculumcreator.adminpages;

import com.blackflower.curriculumcreator.jpa.model.*;
import com.blackflower.curriculumcreator.core.IPage;
import com.blackflower.curriculumcreator.MainFrame;
import com.blackflower.curriculumcreator.core.NotificationManager;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emirs
 */
public class AccountManagementPanel extends javax.swing.JPanel implements IPage{

    DefaultTableModel tableModel = new DefaultTableModel();
    String[] columnNames = {"ID", "First Name", "Last Name", "Account Type"};
    
    public AccountManagementPanel() {
        initComponents();
        
        tableModel.setColumnIdentifiers(columnNames);
        usersTable.setModel(tableModel);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();
        ClassLessonLabel = new javax.swing.JLabel();
        findUserBtn = new javax.swing.JButton();
        removeUserBtn = new javax.swing.JButton();
        nameField = new javax.swing.JTextField();
        refreshTableBtn = new javax.swing.JToggleButton();
        createAccountBtn = new javax.swing.JButton();
        addClassBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();

        usersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Last Name", "Account Type"
            }
        ));
        jScrollPane1.setViewportView(usersTable);

        ClassLessonLabel.setText("Name:");

        findUserBtn.setText("Find User");
        findUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findUserBtnActionPerformed(evt);
            }
        });

        removeUserBtn.setText("Remove Selected User");
        removeUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeUserBtnActionPerformed(evt);
            }
        });

        refreshTableBtn.setText("Refresh Table");
        refreshTableBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTableBtnActionPerformed(evt);
            }
        });

        createAccountBtn.setText("Create New Account");
        createAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountBtnActionPerformed(evt);
            }
        });

        addClassBtn.setText("Add Class");
        addClassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClassBtnActionPerformed(evt);
            }
        });

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
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ClassLessonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(findUserBtn)
                        .addGap(18, 18, 18)
                        .addComponent(removeUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(refreshTableBtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addClassBtn)
                            .addGap(18, 18, 18)
                            .addComponent(createAccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(194, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(ClassLessonLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(findUserBtn)
                    .addComponent(removeUserBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshTableBtn)
                    .addComponent(createAccountBtn)
                    .addComponent(addClassBtn))
                .addContainerGap(67, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void findUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findUserBtnActionPerformed
        // TODO add your handling code here:
        ArrayList<Person> users = Database.findPersonByName(nameField.getText());
        if (users != null) {
            refreshTableData(users);
        }else{
            JOptionPane.showMessageDialog(this, "This user cannot found!", "User Not Found", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_findUserBtnActionPerformed

    private void removeUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeUserBtnActionPerformed
        // TODO add your handling code here:
       if (usersTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Please Select An User!", "User Selectin is Null", JOptionPane.ERROR_MESSAGE);
            return;
        }
       
       int selectedUserId = (Integer)tableModel.getValueAt(usersTable.getSelectedRow(), 0);
       Person deletedPerson = Database.findPersonById(selectedUserId);
       Database.removeUser(deletedPerson);
       
       refreshTableData();
       
       NotificationManager.createNotification("C:\\Users\\emirs\\Desktop\\pics\\appIcons\\bell-ring.png",
                "The User Deleted!", 
                "The User \""+ deletedPerson.toString() + "\" deleted.");
    }//GEN-LAST:event_removeUserBtnActionPerformed

    private void refreshTableBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTableBtnActionPerformed
        // TODO add your handling code here:
        refreshTableData();
    }//GEN-LAST:event_refreshTableBtnActionPerformed

    private void createAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountBtnActionPerformed
        // TODO add your handling code here:
        Database.close();
        MainFrame.instance.setPage(MainFrame.instance.getRegisterPage());
    }//GEN-LAST:event_createAccountBtnActionPerformed

    private void addClassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClassBtnActionPerformed
        // TODO add your handling code here:
        Database.close();
        MainFrame.instance.setPage(MainFrame.instance.getAddClassPage());
    }//GEN-LAST:event_addClassBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        // TODO add your handling code here:
        Database.close();
        MainFrame.instance.setPage(MainFrame.instance.getAdminHomePage());
    }//GEN-LAST:event_homeBtnActionPerformed

    public final void refreshTableData(){
        tableModel.setRowCount(0);
        
        for (Person user : Database.getUsers()) {
            if (user instanceof Admin || user == null) {
                continue;
            }
            Vector newData = new Vector();
            
            newData.add(user.getId());
            newData.add(user.getFirstName());
            newData.add(user.getLastName());
            newData.add(user.getType());
            
            tableModel.addRow(newData);
        }
    }
    public void refreshTableData(ArrayList<Person> users) {
        tableModel.setRowCount(0);

        for (Person user : users) {
            if (user instanceof Admin || user == null) {
                continue;
            }
            Vector newData = new Vector();
            
            newData.add(user.getId());
            newData.add(user.getFirstName());
            newData.add(user.getLastName());
            newData.add(user.getType());
            
            tableModel.addRow(newData);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ClassLessonLabel;
    private javax.swing.JButton addClassBtn;
    private javax.swing.JButton createAccountBtn;
    private javax.swing.JButton findUserBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameField;
    private javax.swing.JToggleButton refreshTableBtn;
    private javax.swing.JButton removeUserBtn;
    private javax.swing.JTable usersTable;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onPageSetted() {
        Database.initDatabase("LMS_PE");
        refreshTableData();
    }
}
