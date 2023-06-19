package com.blackflower.curriculumcreator.instructorpages;

import com.blackflower.curriculumcreator.MainFrame;
import com.blackflower.curriculumcreator.core.IPage;
import com.blackflower.curriculumcreator.core.NotificationManager;
import com.blackflower.curriculumcreator.jpa.model.*;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emirs
 */
public class ManageSessionsPanel extends javax.swing.JPanel implements IPage{

    private Instructor account;
    private final DefaultTableModel tableModel = new DefaultTableModel();
    private final String[] columnNames = {"ID", "Date", "Lesson", "Class", "Length(Hours)"};
    
    public ManageSessionsPanel() {
        initComponents();
        
        tableModel.setColumnIdentifiers(columnNames);
        sessionsTable.setModel(tableModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        welcomeLabel = new javax.swing.JLabel();
        homeBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        classRadioBtn = new javax.swing.JRadioButton();
        lessonRadioBtn = new javax.swing.JRadioButton();
        dateRadioBtn = new javax.swing.JRadioButton();
        filterBtn = new javax.swing.JButton();
        filterComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        sessionsTable = new javax.swing.JTable();
        addSessionBtn = new javax.swing.JButton();
        removeSessionBtn = new javax.swing.JButton();
        clearFilterTextBtn = new javax.swing.JLabel();

        welcomeLabel.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setText("Manage Sessions");

        homeBtn.setText("Home");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Filter By:");

        buttonGroup1.add(classRadioBtn);
        classRadioBtn.setSelected(true);
        classRadioBtn.setText("Class");
        classRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classRadioBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(lessonRadioBtn);
        lessonRadioBtn.setText("Lesson");
        lessonRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lessonRadioBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(dateRadioBtn);
        dateRadioBtn.setText("Date");
        dateRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateRadioBtnActionPerformed(evt);
            }
        });

        filterBtn.setText("Filter");
        filterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterBtnActionPerformed(evt);
            }
        });

        filterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Software Eng." }));

        sessionsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(sessionsTable);

        addSessionBtn.setText("Add Session");
        addSessionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSessionBtnActionPerformed(evt);
            }
        });

        removeSessionBtn.setText("Remove Session");
        removeSessionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeSessionBtnActionPerformed(evt);
            }
        });

        clearFilterTextBtn.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        clearFilterTextBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clearFilterTextBtn.setText("Clear Filter");
        clearFilterTextBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearFilterTextBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(welcomeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                .addGap(96, 96, 96)
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lessonRadioBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dateRadioBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(classRadioBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(filterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(filterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clearFilterTextBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addSessionBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(removeSessionBtn))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(classRadioBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lessonRadioBtn)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dateRadioBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(filterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(filterBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clearFilterTextBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addSessionBtn)
                    .addComponent(removeSessionBtn))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        // TODO add your handling code here:
        MainFrame.instance.setPage(MainFrame.instance.getInstructorHomePage());
    }//GEN-LAST:event_homeBtnActionPerformed

    private void lessonRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lessonRadioBtnActionPerformed
        // TODO add your handling code here:
        refreshLessonsComboBox();
    }//GEN-LAST:event_lessonRadioBtnActionPerformed

    private void filterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterBtnActionPerformed
        // TODO add your handling code here:
        if (filterComboBox.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Please Select A Lesson!", "Lesson Selectin is Null", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (buttonGroup1.isSelected(lessonRadioBtn.getModel())) {
            Lesson selectedLesson = (Lesson)filterComboBox.getSelectedItem();
            refreshTableData(account.getResponsibleSessions(account, selectedLesson));
        }else if(buttonGroup1.isSelected(classRadioBtn.getModel())){
            StudentClass selectedClass = (StudentClass)filterComboBox.getSelectedItem();
            refreshTableData(account.getResponsibleSessions(account, selectedClass));
        }
    }//GEN-LAST:event_filterBtnActionPerformed

    private void addSessionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSessionBtnActionPerformed
        // TODO add your handling code here:
         MainFrame.instance.setPage(MainFrame.instance.getaddSessionPage());
    }//GEN-LAST:event_addSessionBtnActionPerformed

    private void removeSessionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeSessionBtnActionPerformed
        // TODO add your handling code here:
        if (sessionsTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Please Select A Session!", "Session Selectin is Null", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int sessionID = (Integer)sessionsTable.getValueAt(sessionsTable.getSelectedRow(), 0);
        account.removeSession(sessionID);
        
        for (InstructorLesson instructorLesson : account.getLessons()) {
            for (CourseSession session : instructorLesson.getLessonId().getCoursesessionList()) {
                if (session.getId() == sessionID) {
                    instructorLesson.getLessonId().getCoursesessionList().remove(session);
                    session.getClassId().getCoursesessionList().remove(session);
                }
            }
        }
        
        refreshTableData(account.getResponsibleSessions(account));
        
        NotificationManager.createNotification("C:\\Users\\emirs\\Desktop\\pics\\appIcons\\bell-ring.png",
                "Session Deleted!", 
                "The session id \""+ sessionID + "\" deleted by: " + account.toString());
    }//GEN-LAST:event_removeSessionBtnActionPerformed

    private void classRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classRadioBtnActionPerformed
        // TODO add your handling code here:
        refreshClassesComboBox();
    }//GEN-LAST:event_classRadioBtnActionPerformed

    private void dateRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateRadioBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateRadioBtnActionPerformed

    private void clearFilterTextBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearFilterTextBtnMouseClicked
        // TODO add your handling code here:
        refreshTableData(account.getResponsibleSessions(account));
    }//GEN-LAST:event_clearFilterTextBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSessionBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton classRadioBtn;
    private javax.swing.JLabel clearFilterTextBtn;
    private javax.swing.JRadioButton dateRadioBtn;
    private javax.swing.JButton filterBtn;
    private javax.swing.JComboBox<Object> filterComboBox;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton lessonRadioBtn;
    private javax.swing.JButton removeSessionBtn;
    private javax.swing.JTable sessionsTable;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onPageSetted() {
        Database.initDatabase("LMS_PE");
        account = (Instructor)MainFrame.instance.getAccount();
        
        refreshClassesComboBox();
        refreshTableData(account.getResponsibleSessions(account));
    }
    
    private void refreshLessonsComboBox(){
        filterComboBox.removeAllItems();
        
        account.getLessons().forEach((instructorLesson) -> {
            filterComboBox.addItem(instructorLesson.getLessonId());
        });
    }
    
    private void refreshClassesComboBox(){
        filterComboBox.removeAllItems();
        
        for (InstructorLesson instructorLesson : account.getLessons()) {
            
            instructorLesson.getLessonId().getStudentClasses().forEach((studentClass) -> {
                filterComboBox.addItem(studentClass);
            });
        }
    }
    
    private void refreshTableData(ArrayList<CourseSession> dataArray){
        tableModel.setRowCount(0);
        
        for (CourseSession session : dataArray) {
            Vector newData = new Vector();
            newData.add(session.getId());
            newData.add(session.getStartDate().toString());
            newData.add(session.getLessonId());
            newData.add(session.getClassId());
            newData.add(session.getSessionLength());
            
            tableModel.addRow(newData);
        }
    }
    
}
