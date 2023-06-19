package com.blackflower.curriculumcreator.adminpages;

import com.blackflower.curriculumcreator.jpa.model.*;
import com.blackflower.curriculumcreator.core.IPage;
import com.blackflower.curriculumcreator.MainFrame;
import com.blackflower.curriculumcreator.core.NotificationManager;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emirs
 */
public class AddClassPanel extends javax.swing.JPanel implements IPage {

    DefaultTableModel tableModel = new DefaultTableModel();
    private final String[] columnNames = {"Class ID", "Class Name", "Students", "Lesson Count"};

    public AddClassPanel() {
        initComponents();
        tableModel.setColumnIdentifiers(columnNames);
        ClassTable.setModel(tableModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ClassNameField = new javax.swing.JTextField();
        ClassLessonLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ClassTable = new javax.swing.JTable();
        addClassBtn = new javax.swing.JButton();
        removeClassBtn = new javax.swing.JButton();
        refreshToggleBtn = new javax.swing.JToggleButton();
        addDropLessonBtn = new javax.swing.JButton();
        addRemoveStudentBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();

        ClassLessonLabel.setText("Class Name:");

        ClassTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Class Name", "Students", "Lesson Count"
            }
        ));
        jScrollPane3.setViewportView(ClassTable);

        addClassBtn.setText("Add new Class");
        addClassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClassBtnActionPerformed(evt);
            }
        });

        removeClassBtn.setText("Remove Selected Class");
        removeClassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeClassBtnActionPerformed(evt);
            }
        });

        refreshToggleBtn.setText("Refresh Table");
        refreshToggleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshToggleBtnActionPerformed(evt);
            }
        });

        addDropLessonBtn.setText("Add&Drop Lesson");
        addDropLessonBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDropLessonBtnActionPerformed(evt);
            }
        });

        addRemoveStudentBtn.setText("Add&Remove Student");
        addRemoveStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRemoveStudentBtnActionPerformed(evt);
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
                .addGap(244, 244, 244)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ClassLessonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ClassNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addClassBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(removeClassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(refreshToggleBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(addRemoveStudentBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(addDropLessonBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(232, 232, 232))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(homeBtn))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(homeBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(ClassLessonLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClassNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addClassBtn)
                    .addComponent(removeClassBtn))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshToggleBtn)
                    .addComponent(addDropLessonBtn)
                    .addComponent(addRemoveStudentBtn))
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshToggleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshToggleBtnActionPerformed
        // TODO add your handling code here:
        refreshTableData();
    }//GEN-LAST:event_refreshToggleBtnActionPerformed

    private void addClassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClassBtnActionPerformed
        // TODO add your handling code here:
        Database.addClass(ClassNameField.getText());
        refreshTableData();
        
        NotificationManager.createNotification("C:\\Users\\emirs\\Desktop\\pics\\appIcons\\bell-ring.png",
                "New Class Added!", 
                "New Class \""+ ClassNameField.getText() + "\" created.");
    }//GEN-LAST:event_addClassBtnActionPerformed

    private void removeClassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeClassBtnActionPerformed

        if (ClassTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Please Select A Class!", "Class Selectin is Null", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int classId = (Integer) tableModel.getValueAt(ClassTable.getSelectedRow(), 0);
        StudentClass studentClass = Database.getStudentClass(classId);

        if (studentClass == null) {
            JOptionPane.showMessageDialog(this, "This Class Does Not Exists!", "Class Does Not Exists", JOptionPane.ERROR_MESSAGE);
        } else if (!Database.getClassStudents(studentClass).isEmpty()) {
            JOptionPane.showMessageDialog(this, "Selected class contains students! Please trensfer them before removeing!", "Class Contains Students", JOptionPane.ERROR_MESSAGE);
        } else {
            String className = Database.getStudentClass(classId).toString();
            Database.removeClass(classId);
            refreshTableData();
            
            NotificationManager.createNotification("C:\\Users\\emirs\\Desktop\\pics\\appIcons\\bell-ring.png",
                "Class Removed!", 
                "The Class \""+ className + "\" removed.");
        }

    }//GEN-LAST:event_removeClassBtnActionPerformed

    private void addDropLessonBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDropLessonBtnActionPerformed
        // TODO add your handling code here:
        Database.close();
        MainFrame.instance.setPage(MainFrame.instance.getManageClassesPage());
    }//GEN-LAST:event_addDropLessonBtnActionPerformed

    private void addRemoveStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRemoveStudentBtnActionPerformed
        // TODO add your handling code here:
        Database.close();
        MainFrame.instance.setPage(MainFrame.instance.getManageClassesStudentsPage());
    }//GEN-LAST:event_addRemoveStudentBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        Database.close();
        MainFrame.instance.setPage(MainFrame.instance.getAdminHomePage());
    }//GEN-LAST:event_homeBtnActionPerformed

    public void refreshTableData() {
        tableModel.setRowCount(0);
        for (StudentClass studentClass : Database.getClasses()) {
            Vector newData = new Vector();
            newData.add(studentClass.getId());
            newData.add(studentClass.getName());
            newData.add(Database.getClassStudents(studentClass).size());
            if (studentClass.getLessons() != null) {
                newData.add(studentClass.getLessons().size());
            }else{
                newData.add(0);
            }

            tableModel.addRow(newData);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ClassLessonLabel;
    private javax.swing.JTextField ClassNameField;
    private javax.swing.JTable ClassTable;
    private javax.swing.JButton addClassBtn;
    private javax.swing.JButton addDropLessonBtn;
    private javax.swing.JButton addRemoveStudentBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToggleButton refreshToggleBtn;
    private javax.swing.JButton removeClassBtn;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onPageSetted() {
        Database.initDatabase("LMS_PE");
        refreshTableData();
        System.out.println("Data refreshed");
    }
}
