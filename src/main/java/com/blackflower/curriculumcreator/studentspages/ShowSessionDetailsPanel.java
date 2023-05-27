package com.blackflower.curriculumcreator.studentspages;

import com.blackflower.curriculumcreator.MainFrame;
import com.blackflower.curriculumcreator.core.IPage;
import com.blackflower.curriculumcreator.jpa.model.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emirs
 */
public class ShowSessionDetailsPanel extends javax.swing.JPanel implements IPage{

    private Student account;
    private DefaultTableModel tableModel = new DefaultTableModel();
    private String[] columnNames = {"ID", "Date", "Lesson", "Length(Hours)"};
    
    public ShowSessionDetailsPanel() {
        initComponents();
        
        tableModel.setColumnIdentifiers(columnNames);
        sessionsTable.setModel(tableModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        sessionsTable = new javax.swing.JTable();
        welcomeLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lessonsComboBox = new javax.swing.JComboBox<>();
        filterBtn = new javax.swing.JButton();
        clearFilterLink = new javax.swing.JLabel();
        downloadSessionsBtn = new javax.swing.JButton();

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

        welcomeLabel.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setText("Sessions Details");

        jLabel1.setText("Lesson:");

        lessonsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CP2" }));

        filterBtn.setText("Filter");
        filterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterBtnActionPerformed(evt);
            }
        });

        clearFilterLink.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        clearFilterLink.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clearFilterLink.setText("Clear Filter");
        clearFilterLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearFilterLinkMouseClicked(evt);
            }
        });

        downloadSessionsBtn.setText("Download Sessions");
        downloadSessionsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downloadSessionsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lessonsComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 182, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(filterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearFilterLink, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(welcomeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE))
                    .addComponent(downloadSessionsBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(174, 174, 174))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lessonsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filterBtn)
                    .addComponent(clearFilterLink, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(downloadSessionsBtn)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void filterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterBtnActionPerformed
        // TODO add your handling code here:
        if (lessonsComboBox.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Please Select A Lesson!", "Lesson Selectin is Null", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Lesson selectedLesson = (Lesson) lessonsComboBox.getSelectedItem();
        
        List<CourseSession> filteredSessions = new ArrayList<>();
        for (CourseSession courseSession : selectedLesson.getCoursesessionList()) {
            if (courseSession.getClassId().equals(account.getStudentClass())) {
                filteredSessions.add(courseSession);
            }
        }
        
        refreshTableData(filteredSessions);
    }//GEN-LAST:event_filterBtnActionPerformed

    private void clearFilterLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearFilterLinkMouseClicked
        // TODO add your handling code here:
        refreshTableData(account.getStudentClass().getCoursesessionList());
    }//GEN-LAST:event_clearFilterLinkMouseClicked

    private void downloadSessionsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downloadSessionsBtnActionPerformed
        // TODO add your handling code here:
        downloadSessions();
    }//GEN-LAST:event_downloadSessionsBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel clearFilterLink;
    private javax.swing.JButton downloadSessionsBtn;
    private javax.swing.JButton filterBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Object> lessonsComboBox;
    private javax.swing.JTable sessionsTable;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onPageSetted() {
        Database.initDatabase("LMS_PE");
        account = (Student)MainFrame.instance.getAccount();
        
        refreshLessonsComboBox();
        refreshTableData(account.getStudentClass().getCoursesessionList());
    }
    
    private void refreshLessonsComboBox() {
        lessonsComboBox.removeAllItems();

        account.getStudentClass().getLessons().forEach((lesson) -> {
            lessonsComboBox.addItem(lesson);
        });
        lessonsComboBox.setSelectedIndex(0);
    }
    
    private void refreshTableData(List<CourseSession> dataArray){
        tableModel.setRowCount(0);
        
        for (CourseSession session : dataArray) {
            Vector newData = new Vector();
            newData.add(session.getId());
            newData.add(session.getStartDate().toString());
            newData.add(session.getLessonId());
            newData.add(session.getSessionLength());
            
            tableModel.addRow(newData);
        }
    }
    
    public void downloadSessions(){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int userChoice = fileChooser.showSaveDialog(null);

        if (userChoice == JFileChooser.APPROVE_OPTION) {
            String directoryPath = fileChooser.getSelectedFile().getPath();
            String filename = getFormattedFilename(directoryPath, "CourseSession_", ".txt");
            
            ArrayList<String> lines = new ArrayList<>();
            for (CourseSession session : account.getStudentClass().getCoursesessionList()) {
                lines.add(session.toString());
            }

            try {
                FileWriter fileWriter = new FileWriter(filename, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                for (String line : lines) {
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();
                }

                bufferedWriter.close();
                System.out.println("Content written to the file.");
                JOptionPane.showMessageDialog(this, "All sessions downloaded successfuly!", "Sessions Downloaded", JOptionPane.INFORMATION_MESSAGE);
                
            } catch (IOException e) {
                System.out.println("An error occurred while writing to the file: " + e.getMessage());
            }
        } else if (userChoice == JFileChooser.CANCEL_OPTION) {
            System.out.println("Operation canceled by the user.");
        }
    }
    
    private static String getFormattedFilename(String directoryPath, String prefix, String extension) {
        LocalDate currentDate = LocalDate.now();
        String formattedDate = currentDate.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        return directoryPath + "/" + prefix + "_" + formattedDate + extension;
    }
    
}
