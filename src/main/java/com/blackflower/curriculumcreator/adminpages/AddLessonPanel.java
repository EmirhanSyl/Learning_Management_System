package com.blackflower.curriculumcreator.adminpages;

import com.blackflower.curriculumcreator.jpa.model.*;
import com.blackflower.curriculumcreator.MainFrame;
import com.blackflower.curriculumcreator.core.IPage;
import com.blackflower.curriculumcreator.core.NotificationManager;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emirs
 */
public class AddLessonPanel extends javax.swing.JPanel implements IPage {

    DefaultTableModel tableModel = new DefaultTableModel();
    String[] columnNames = {"Lesson ID", "Lesson Name", "Instructor", "Lesson Count"};

    public AddLessonPanel() {
        initComponents();

        tableModel.setColumnIdentifiers(columnNames);
        lessonTable.setModel(tableModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lessonTable = new javax.swing.JTable();
        lessonCountSlider = new javax.swing.JSlider();
        lessonNameField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lessonCountLabel = new javax.swing.JLabel();
        instructorComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        addLessonBtn = new javax.swing.JButton();
        removeLessonBtn = new javax.swing.JButton();
        updateLessonBtn = new javax.swing.JButton();
        goClassManagementBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Add Lesson");

        lessonTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Lesson Name", "Instructor", "Lesson Count"
            }
        ));
        jScrollPane1.setViewportView(lessonTable);

        lessonCountSlider.setMaximum(15);
        lessonCountSlider.setMinimum(1);
        lessonCountSlider.setPaintLabels(true);
        lessonCountSlider.setPaintTicks(true);
        lessonCountSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                lessonCountSliderStateChanged(evt);
            }
        });

        jLabel1.setText("Lesson Name");

        lessonCountLabel.setText("Lesson Count Per Week");

        instructorComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1" }));

        jLabel3.setText("Instructor:");

        addLessonBtn.setText("Add New Lesson");
        addLessonBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLessonBtnActionPerformed(evt);
            }
        });

        removeLessonBtn.setText("Remove Selected Lesson");
        removeLessonBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeLessonBtnActionPerformed(evt);
            }
        });

        updateLessonBtn.setText("Update Selected Lesson");
        updateLessonBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateLessonBtnActionPerformed(evt);
            }
        });

        goClassManagementBtn.setText("Go To Class Management");
        goClassManagementBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goClassManagementBtnActionPerformed(evt);
            }
        });

        refreshBtn.setText("Refresh Table");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
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
                .addGap(186, 186, 186)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(goClassManagementBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lessonNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(instructorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(addLessonBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lessonCountLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lessonCountSlider, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(removeLessonBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(updateLessonBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(113, 113, 113)
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lessonNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(instructorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addLessonBtn))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lessonCountLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lessonCountSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(updateLessonBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeLessonBtn)))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goClassManagementBtn)
                    .addComponent(refreshBtn))
                .addGap(38, 38, 38))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addLessonBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLessonBtnActionPerformed
        // TODO add your handling code here:
        if (instructorComboBox.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Please Select An Instructor!", "Instructor Selectin is Null", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (lessonNameField.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Lesson Name Cannot Be Empty!", "Lesson Name is Null", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Instructor instructor = (Instructor) instructorComboBox.getSelectedItem();
        Database.addLesson(lessonNameField.getText(), instructor, lessonCountSlider.getValue());
        refreshTableData();
        
        NotificationManager.createNotification("C:\\Users\\emirs\\Desktop\\pics\\appIcons\\bell-ring.png",
                "New Lesson Added!", 
                "New Lesson \""+ lessonNameField.getText() + "\" created. Instructor: " + instructor.toString() + " Lesson Hours: " + lessonCountSlider.getValue() );
    }//GEN-LAST:event_addLessonBtnActionPerformed

    private void updateLessonBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateLessonBtnActionPerformed
        // TODO add your handling code here:
        if (instructorComboBox.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Please Select An Instructor!", "Instructor Selectin is Null", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (lessonTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Please Select An Lesson!", "Lesson Selectin is Null", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int lessonID = (Integer) tableModel.getValueAt(lessonTable.getSelectedRow(), 0);
        //Lesson lesson = Database.findLessonByID(lessonID);

        Instructor newInstructor = (Instructor) instructorComboBox.getSelectedItem();
        Database.updateLessonData(lessonID, newInstructor, lessonCountSlider.getValue());
        refreshTableData();
        
        NotificationManager.createNotification("C:\\Users\\emirs\\Desktop\\pics\\appIcons\\bell-ring.png",
                "Lesson Updated!", 
                "The Lesson \""+ Database.findLessonByID(lessonID).getName() + "\" updated. Instructor: " + newInstructor.toString() + " Lesson Hours: " + lessonCountSlider.getValue() );
    }//GEN-LAST:event_updateLessonBtnActionPerformed

    private void removeLessonBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeLessonBtnActionPerformed
        // TODO add your handling code here:
        if (lessonTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Please Select An Lesson!", "Lesson Selectin is Null", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (instructorComboBox.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Please Select An Instructor!", "Instructor Selectin is Null", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int lessonID = (Integer) tableModel.getValueAt(lessonTable.getSelectedRow(), 0);
        Lesson lesson = Database.findLessonByID(lessonID);
        Database.removeLesson(lesson);

        refreshTableData();
        
        NotificationManager.createNotification("C:\\Users\\emirs\\Desktop\\pics\\appIcons\\bell-ring.png",
                "Lesson Removed!", 
                "The Lesson \""+ lesson.getName() + "\" removed.");
    }//GEN-LAST:event_removeLessonBtnActionPerformed

    private void goClassManagementBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goClassManagementBtnActionPerformed
        // TODO add your handling code here:
        Database.close();
        MainFrame.instance.setPage(MainFrame.instance.getAddClassPage());
    }//GEN-LAST:event_goClassManagementBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        // TODO add your handling code here:
        refreshTableData();
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        // TODO add your handling code here:
        Database.close();
        MainFrame.instance.setPage(MainFrame.instance.getAdminHomePage());
    }//GEN-LAST:event_homeBtnActionPerformed

    private void lessonCountSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_lessonCountSliderStateChanged
        // TODO add your handling code here:
        lessonCountLabel.setText("Lesson Count Per Week: " + lessonCountSlider.getValue());
    }//GEN-LAST:event_lessonCountSliderStateChanged

    public final void refreshTableData() {
        tableModel.setRowCount(0);

        for (Lesson lesson : Database.getLessons()) {
            Vector newData = new Vector();
            newData.add(lesson.getId());
            newData.add(lesson.getName());
            if (!lesson.getInstructorLessonList().isEmpty()) {
                newData.add(lesson.getInstructorLessonList().get(0).getInstructorId().toString());
                newData.add(lesson.getInstructorLessonList().get(0).getLessonCount());
            }
            else{
                newData.add("Null");
                newData.add(0);
            }
            tableModel.addRow(newData);
        }
    }

    public final void refreshComboBox() {
        instructorComboBox.removeAllItems();

        Database.getUsers().forEach((user) -> {
            if (user instanceof Instructor) {
                Instructor instructor = (Instructor) user;
                instructorComboBox.addItem(instructor);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addLessonBtn;
    private javax.swing.JButton goClassManagementBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JComboBox<Object> instructorComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lessonCountLabel;
    private javax.swing.JSlider lessonCountSlider;
    private javax.swing.JTextField lessonNameField;
    private javax.swing.JTable lessonTable;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton removeLessonBtn;
    private javax.swing.JButton updateLessonBtn;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onPageSetted() {
        Database.initDatabase("LMS_PE");
        refreshTableData();
        refreshComboBox();
    }
}
