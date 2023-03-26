package com.blackflower.curriculumcreator;

import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emirs
 */
public class AddClassPanel extends javax.swing.JPanel implements IPage{

    DefaultTableModel tableModel = new DefaultTableModel();
    private final String[] columnNames = {"Class Name", "Students", "Lesson Count"};
    
    
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
        jButton1 = new javax.swing.JButton();

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

        jButton1.setText("HomePage");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                                .addGap(54, 54, 54)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(refreshToggleBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(removeClassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(232, 232, 232))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(ClassLessonLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClassNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addClassBtn)
                    .addComponent(jButton1))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeClassBtn)
                    .addComponent(refreshToggleBtn))
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
    }//GEN-LAST:event_addClassBtnActionPerformed

    private void removeClassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeClassBtnActionPerformed
        // TODO add your handling code here:
        if (ClassTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Please Select A Class!", "Class Selectin is Null", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String className = (String)tableModel.getValueAt(ClassTable.getSelectedRow(), 0);
        Class selectedClass = null;
        
        for (Class classe : Database.getClasses()) {
            if (classe.getClassName().equals(className)) {
                selectedClass = classe;
                break;
            }
        }
        if (selectedClass == null) { 
            JOptionPane.showMessageDialog(this, "This Class Does Not Exists!", "Class Does Not Exists", JOptionPane.ERROR_MESSAGE);
        }else if(!selectedClass.getStudents().isEmpty()){
            JOptionPane.showMessageDialog(this, "Selected class contains students! Please trensfer them before removeing!", "Class Contains Students", JOptionPane.ERROR_MESSAGE);
        }else{
            Database.removeClass(selectedClass);
            refreshTableData();
        }
        
    }//GEN-LAST:event_removeClassBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MainFrame.instance.setPage(MainFrame.instance.getHomePage());
    }//GEN-LAST:event_jButton1ActionPerformed

    public void refreshTableData(){
        tableModel.setRowCount(0);
        
        for (Class classe : Database.getClasses()) {
            Vector newData = new Vector();
            newData.add(classe.getClassName());
            newData.add(classe.getStudents().size());
            newData.add(classe.getLessons().size());
            
            tableModel.addRow(newData);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ClassLessonLabel;
    private javax.swing.JTextField ClassNameField;
    private javax.swing.JTable ClassTable;
    private javax.swing.JButton addClassBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToggleButton refreshToggleBtn;
    private javax.swing.JButton removeClassBtn;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onPageSetted() {
        refreshTableData();
        System.out.println("Data refreshed");
    }
}
