package com.blackflower.curriculumcreator.instructorpages;

import com.blackflower.curriculumcreator.MainFrame;
import com.blackflower.curriculumcreator.jpa.model.*;
import com.blackflower.curriculumcreator.core.Class;
import com.blackflower.curriculumcreator.core.IPage;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emirs
 */
public class ShowClassDeteails_InstructorPanel extends javax.swing.JPanel implements IPage{

    private Instructor account;
    DefaultTableModel tableModel = new DefaultTableModel();
    private String[] columnNames = {"ID", "First Name", "Last Name", };
    
    public ShowClassDeteails_InstructorPanel() {
        initComponents();
        tableModel.setColumnIdentifiers(columnNames);
        classDetailsTable.setModel(tableModel);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        classDetailsTable = new javax.swing.JTable();
        classSelectionComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        homeBtn = new javax.swing.JButton();
        welcomeLabel = new javax.swing.JLabel();

        classDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(classDetailsTable);

        classSelectionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CP1" }));
        classSelectionComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classSelectionComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Class:");

        homeBtn.setText("Home");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        welcomeLabel.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setText("Show Class Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(welcomeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(86, 86, 86)
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(classSelectionComboBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 25, Short.MAX_VALUE)
                        .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(classSelectionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void classSelectionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classSelectionComboBoxActionPerformed
        // TODO add your handling code here:
        refreshTableData();
    }//GEN-LAST:event_classSelectionComboBoxActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        // TODO add your handling code here:
        MainFrame.instance.setPage(MainFrame.instance.getInstructorHomePage());
    }//GEN-LAST:event_homeBtnActionPerformed

    
    private void refreshComboBox(){
        classSelectionComboBox.removeAllItems();
        
        account.lessonsClasses(account).forEach((studentClass) -> {classSelectionComboBox.addItem(studentClass);});
    }
    
    private void refreshTableData(){
        tableModel.setRowCount(0);
        
        if (classSelectionComboBox.getSelectedIndex() == -1) {
            //JOptionPane.showMessageDialog(this, "Please Select A Class!", "Class Selectin is Null", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        StudentClass selectedClass = (StudentClass)classSelectionComboBox.getSelectedItem();
        
        for (Student student : Database.getClassStudents(selectedClass)) {
            Vector newData = new Vector();
            newData.add(student.getId());
            newData.add(student.getFirstName());
            newData.add(student.getLastName());
            
            tableModel.addRow(newData);
        }
    }

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable classDetailsTable;
    private javax.swing.JComboBox<Object> classSelectionComboBox;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onPageSetted() {
        Database.initDatabase("LMS_PE");
        account = (Instructor)MainFrame.instance.getAccount();
        refreshComboBox();
        refreshTableData();
    }
}
