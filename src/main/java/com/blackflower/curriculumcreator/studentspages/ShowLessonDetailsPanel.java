package com.blackflower.curriculumcreator.studentspages;

import com.blackflower.curriculumcreator.MainFrame;
import com.blackflower.curriculumcreator.core.IPage;
import com.blackflower.curriculumcreator.jpa.model.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emirs
 */
public class ShowLessonDetailsPanel extends javax.swing.JPanel implements IPage{

    private Student account;
    private DefaultTableModel tableModel = new DefaultTableModel();
    private String[] columnNames = {"Topic", "Week"};
    
    public ShowLessonDetailsPanel() {
        initComponents();
        
        tableModel.setColumnIdentifiers(columnNames);
        topicTable.setModel(tableModel);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        topicTable = new javax.swing.JTable();
        lessonComboBox = new javax.swing.JComboBox<>();

        topicTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(topicTable);

        lessonComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lessonComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(344, 344, 344)
                        .addComponent(lessonComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(lessonComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lessonComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lessonComboBoxActionPerformed
        // TODO add your handling code here:
        refreshTableData();
    }//GEN-LAST:event_lessonComboBoxActionPerformed

    private void refreshLessonsComboBox() {
        lessonComboBox.removeAllItems();

        account.getStudentClass().getLessons().forEach((lesson) -> {
            lessonComboBox.addItem(lesson);
        });
        lessonComboBox.setSelectedIndex(0);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Object> lessonComboBox;
    private javax.swing.JTable topicTable;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onPageSetted() {
        Database.initDatabase("LMS_PE");
        account = (Student)MainFrame.instance.getAccount();
        
        
        refreshLessonsComboBox();
        refreshTableData();
    }
}
