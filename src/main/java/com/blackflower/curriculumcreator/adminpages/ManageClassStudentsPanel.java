package com.blackflower.curriculumcreator.adminpages;

import com.blackflower.curriculumcreator.MainFrame;
import com.blackflower.curriculumcreator.jpa.model.*;
import com.blackflower.curriculumcreator.core.IPage;
import com.blackflower.curriculumcreator.core.NotificationManager;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emirs
 */
public class ManageClassStudentsPanel extends javax.swing.JPanel implements IPage {

    DefaultTableModel tableModel = new DefaultTableModel();
    private String[] columnNames = {"ID", "First Name", "Last Name", "Class", "Class' Students"};

    private StudentClass selectedClass;

    public ManageClassStudentsPanel() {
        initComponents();

        tableModel.setColumnIdentifiers(columnNames);
        studentsTable.setModel(tableModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        studentsTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        searchByNameBtn = new javax.swing.JButton();
        classComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        searchByClassBtn = new javax.swing.JButton();
        changeClassButton = new javax.swing.JButton();
        manageClassPageBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();

        studentsTable.setAutoCreateRowSorter(true);
        studentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Surname", "Class", "ClassStudents"
            }
        ));
        studentsTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        studentsTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(studentsTable);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Manage Students");

        jLabel1.setText("Student Name:");

        searchByNameBtn.setText("Search By Name");
        searchByNameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByNameBtnActionPerformed(evt);
            }
        });

        classComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        classComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Student Class:");

        searchByClassBtn.setText("Search By Class");
        searchByClassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByClassBtnActionPerformed(evt);
            }
        });

        changeClassButton.setText("Change Student's Class");
        changeClassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeClassButtonActionPerformed(evt);
            }
        });

        manageClassPageBtn.setText("Back To Manage Class");
        manageClassPageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageClassPageBtnActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(homeBtn))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(230, 230, 230))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(classComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(searchByClassBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchByNameBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(changeClassButton, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(manageClassPageBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(197, 197, 197))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(homeBtn)
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchByNameBtn)
                    .addComponent(manageClassPageBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchByClassBtn)
                    .addComponent(changeClassButton))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchByNameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByNameBtnActionPerformed
        // TODO add your handling code here:
        
        
        ArrayList<Student> students = Database.findStudentsByName(nameTextField.getText());
        
        if (students.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Student not found!", "No Matches!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        refreshTableData(students);
    }//GEN-LAST:event_searchByNameBtnActionPerformed

    private void searchByClassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByClassBtnActionPerformed
        // TODO add your handling code here:
        if (classComboBox.getSelectedIndex() != -1) {
            selectedClass = (StudentClass)classComboBox.getSelectedItem();
        }
        refreshTableData();
    }//GEN-LAST:event_searchByClassBtnActionPerformed

    private void changeClassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeClassButtonActionPerformed
        // TODO add your handling code here:
        if (studentsTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Please Select A Student!", "Student Selectin is Null", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int studentID = (Integer)tableModel.getValueAt(studentsTable.getSelectedRow(), 0);
        Student selectedStudent = (Student)Database.findPersonById(studentID);
        selectedStudent.setStudentClass(selectedClass);
        Database.updateUser(selectedStudent);
        refreshTableData();
        
        NotificationManager.createNotification("C:\\Users\\emirs\\Desktop\\pics\\appIcons\\bell-ring.png",
                "Student Class Changed!", 
                "The Student \""+ selectedStudent.toString() + "\" class changed. New Class: " + selectedClass.toString());
    }//GEN-LAST:event_changeClassButtonActionPerformed

    private void manageClassPageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageClassPageBtnActionPerformed
        // TODO add your handling code here:
        Database.close();
        MainFrame.instance.setPage(MainFrame.instance.getAddClassPage());
    }//GEN-LAST:event_manageClassPageBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        // TODO add your handling code here:
        Database.close();
        MainFrame.instance.setPage(MainFrame.instance.getAdminHomePage());
    }//GEN-LAST:event_homeBtnActionPerformed

    private void classComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classComboBoxActionPerformed
        // TODO add your handling code here:
        if (classComboBox.getSelectedIndex() != -1) {
            selectedClass = (StudentClass)classComboBox.getSelectedItem();
        }
    }//GEN-LAST:event_classComboBoxActionPerformed

    public void refreshTableData() {
        if (selectedClass == null) {
            return;
        }

        tableModel.setRowCount(0);
        for (Student student : Database.getClassStudents(selectedClass)) {
            Vector newData = new Vector();
            newData.add(student.getId());
            newData.add(student.getFirstName());
            newData.add(student.getLastName());
            newData.add(student.getStudentClass());
            newData.add(Database.getClassStudents(student.getStudentClass()).size());
            tableModel.addRow(newData);
        }
    }

    public void refreshTableData(ArrayList<Student> students) {
        tableModel.setRowCount(0);
        for (Student student : students) {
            Vector newData = new Vector();
            newData.add(student.getId());
            newData.add(student.getFirstName());
            newData.add(student.getLastName());
            newData.add(student.getStudentClass());
            newData.add(Database.getClassStudents(student.getStudentClass()).size());
            tableModel.addRow(newData);
        }

    }

    public final void refreshComboBox() {
        classComboBox.removeAllItems();
        for (StudentClass studentClass : Database.getClasses()) {
            classComboBox.addItem(studentClass);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changeClassButton;
    private javax.swing.JComboBox<Object> classComboBox;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton manageClassPageBtn;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton searchByClassBtn;
    private javax.swing.JButton searchByNameBtn;
    private javax.swing.JTable studentsTable;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onPageSetted() {
        Database.initDatabase("LMS_PE");
        refreshTableData();
        refreshComboBox();
    }
}
