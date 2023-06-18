package com.blackflower.curriculumcreator.instructorpages;

import com.blackflower.curriculumcreator.MainFrame;
import com.blackflower.curriculumcreator.core.IPage;
import com.blackflower.curriculumcreator.jpa.model.*;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emirs
 */
public class ManageLessons_InstructorPanel extends javax.swing.JPanel implements IPage {

    private Instructor account;
    private DefaultTableModel tableModel = new DefaultTableModel();
    private final String[] columnNames = {"Topic", "Week"};

    public ManageLessons_InstructorPanel() {
        initComponents();
        tableModel.setColumnIdentifiers(columnNames);
        topicsTable.setModel(tableModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeLabel = new javax.swing.JLabel();
        homeBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        topicsTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        topicTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lessonComboBox = new javax.swing.JComboBox<>();
        addTopicBtn = new javax.swing.JButton();
        removeTopicBtn = new javax.swing.JButton();
        findTopicTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        findTopicBtn = new javax.swing.JButton();
        weekComboBox = new javax.swing.JComboBox<>();
        clearFilterBtn = new javax.swing.JButton();

        welcomeLabel.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setText("Manage Lessons");

        homeBtn.setText("Home");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        topicsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(topicsTable);

        jLabel1.setText("Topic:");

        jLabel2.setText("Lesson");

        lessonComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CP-2" }));
        lessonComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lessonComboBoxActionPerformed(evt);
            }
        });

        addTopicBtn.setText("Add Topic");
        addTopicBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTopicBtnActionPerformed(evt);
            }
        });

        removeTopicBtn.setText("Remove Selected Topic");
        removeTopicBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeTopicBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Topic Name:");

        findTopicBtn.setText("Find Topic");
        findTopicBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findTopicBtnActionPerformed(evt);
            }
        });

        weekComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Week-1" }));

        clearFilterBtn.setText("Clear Filter");
        clearFilterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearFilterBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(welcomeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(findTopicTextField)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(findTopicBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clearFilterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(removeTopicBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lessonComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(topicTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(weekComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(addTopicBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(73, 73, 73)
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lessonComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topicTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weekComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addTopicBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(findTopicTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(findTopicBtn)
                    .addComponent(removeTopicBtn)
                    .addComponent(clearFilterBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        // TODO add your handling code here:
        MainFrame.instance.setPage(MainFrame.instance.getInstructorHomePage());
    }//GEN-LAST:event_homeBtnActionPerformed

    private void addTopicBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTopicBtnActionPerformed
        // TODO add your handling code here:
        if (lessonComboBox.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Please Select A Lesson!", "Lesson Selectin is Null", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Lesson selectedLesson = (Lesson) lessonComboBox.getSelectedItem();
        int index = 1;
        try {
            String str_index = (String) weekComboBox.getSelectedItem();
            index = Integer.parseInt(str_index.split("-")[1]);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Something went wrong! Please try again", "UPPS!", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "No more week left! Please try remove some topics to add new one!", "Weeks Full!", JOptionPane.ERROR_MESSAGE);
            addTopicBtn.setEnabled(false);
            return;
        }

        Database.addTopicToLesson(selectedLesson, index, topicTextField.getText());

        refreshTableData();
        refreshWeekComboBox();
    }//GEN-LAST:event_addTopicBtnActionPerformed

    private void removeTopicBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeTopicBtnActionPerformed
        // TODO add your handling code here:
        if (topicsTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Please Select A Topic!", "Topic Selectin is Null", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Lesson selectedLesson = (Lesson) lessonComboBox.getSelectedItem();
        int index = 0;
        try {
            String str_index = (String) tableModel.getValueAt(topicsTable.getSelectedRow(), 1);
            index = Integer.parseInt(str_index.split("-")[1]);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Something went wrong! Please try again", "UPPS!", JOptionPane.ERROR_MESSAGE);
        }
        
        Database.deleteTopicFromLesson(selectedLesson, index);
        addTopicBtn.setEnabled(true);
        refreshTableData();
        refreshWeekComboBox();
    }//GEN-LAST:event_removeTopicBtnActionPerformed

    private void lessonComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lessonComboBoxActionPerformed
        // TODO add your handling code here:
        refreshWeekComboBox();
        refreshTableData();
    }//GEN-LAST:event_lessonComboBoxActionPerformed

    private void findTopicBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findTopicBtnActionPerformed
        // TODO add your handling code here:
        findText();
    }//GEN-LAST:event_findTopicBtnActionPerformed

    private void clearFilterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearFilterBtnActionPerformed
        // TODO add your handling code here:
        refreshTableData();
    }//GEN-LAST:event_clearFilterBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTopicBtn;
    private javax.swing.JButton clearFilterBtn;
    private javax.swing.JButton findTopicBtn;
    private javax.swing.JTextField findTopicTextField;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Object> lessonComboBox;
    private javax.swing.JButton removeTopicBtn;
    private javax.swing.JTextField topicTextField;
    private javax.swing.JTable topicsTable;
    private javax.swing.JComboBox<String> weekComboBox;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onPageSetted() {
        Database.initDatabase("LMS_PE");
        account = (Instructor) MainFrame.instance.getAccount();
        refreshLessonsComboBox();
        refreshTableData();
    }

    private void refreshLessonsComboBox() {
        lessonComboBox.removeAllItems();

        account.getLessons().forEach((instructorLesson) -> {
            lessonComboBox.addItem(instructorLesson.getLessonId());
        });
        lessonComboBox.setSelectedIndex(0);
    }

    private void refreshWeekComboBox() {
        if (lessonComboBox.getSelectedIndex() == -1) {
            //JOptionPane.showMessageDialog(this, "Please Select A Lesson!", "Lesson Selectin is Null", JOptionPane.ERROR_MESSAGE);
            return;
        }

        weekComboBox.removeAllItems();

        Lesson selectedLesson = (Lesson) lessonComboBox.getSelectedItem();
        for (int i = 0; i < 15; i++) {
            
            boolean isConsist = false;
            for (LessonTopic lessonTopic : selectedLesson.getLessonTopicList()) {
                if (lessonTopic.getWeek() == (i+1)) {
                    isConsist = true;
                }
            }
            
            if (!isConsist) {
                weekComboBox.addItem("Week-" + (i+1));
            }
        }
    }

    private void refreshTableData() {
        if (lessonComboBox.getSelectedIndex() == -1) {
            return;
        }

        tableModel.setRowCount(0);
        Lesson selectedLesson = (Lesson) lessonComboBox.getSelectedItem();
        
        ArrayList<Integer> weeks = new ArrayList<>();
        selectedLesson.getLessonTopicList().forEach((topic) -> {
            weeks.add(topic.getWeek());
        });
        
        for (int i = 1; i < 16; i++) {
            Vector newData = new Vector();
            
            boolean isConsist = false;
            for (LessonTopic lessonTopic : selectedLesson.getLessonTopicList()) {
                if (lessonTopic.getWeek() == i) {
                    newData.add(lessonTopic.getTopic());
                    newData.add("Week-" + lessonTopic.getWeek());
                    isConsist = true;
                }
            }
            
            if (!isConsist) {
                newData.add("");
                newData.add("Week-" + i);
            }
            
            tableModel.addRow(newData);
        }
    }
    
    private void findText(){
        if (lessonComboBox.getSelectedIndex() == -1) {
            //JOptionPane.showMessageDialog(this, "Please Select A Lesson!", "Lesson Selectin is Null", JOptionPane.ERROR_MESSAGE);
            return;
        }

        tableModel.setRowCount(0);
        Lesson selectedLesson = (Lesson) lessonComboBox.getSelectedItem();
        
        Pattern pattern = Pattern.compile(findTopicTextField.getText().toLowerCase());
        for (LessonTopic topic : selectedLesson.getLessonTopicList()) {
            Matcher matcher = pattern.matcher(topic.getTopic().toLowerCase());
            
            if (matcher.find()) {
                Vector newData = new Vector();
                
                newData.add(topic.getTopic());
                newData.add("Week-" + topic.getWeek());
                
                tableModel.addRow(newData);
            }
        }
    }
}
