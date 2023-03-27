package com.blackflower.curriculumcreator;

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

    private Class selectedClass;

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(248, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nameTextField)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                                .addComponent(classComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(11, 11, 11)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(searchByClassBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchByNameBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(changeClassButton, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                .addComponent(manageClassPageBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(230, 230, 230))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
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
        Person user = Database.findPersonByName(nameTextField.getText());
        if (user != null) {
            System.out.println("Not null");
            if (user instanceof Student) {
                Student student = (Student) user;
                refreshTableData(student);
            }
        }
    }//GEN-LAST:event_searchByNameBtnActionPerformed

    private void searchByClassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByClassBtnActionPerformed
        // TODO add your handling code here:
        if (classComboBox.getSelectedIndex() != -1) {
            selectedClass = (Class) classComboBox.getSelectedItem();
        }
        refreshTableData();
    }//GEN-LAST:event_searchByClassBtnActionPerformed

    private void changeClassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeClassButtonActionPerformed
        // TODO add your handling code here:
        if (studentsTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Please Select A Student!", "Student Selectin is Null", JOptionPane.ERROR_MESSAGE);
            return;
        }

        for (Student student : selectedClass.getStudents()) {
            if (student.getId() == (Integer) tableModel.getValueAt(studentsTable.getSelectedRow(), 0)) {
                student.changeStudentClass((Class) classComboBox.getSelectedItem());
                break;
            }
        }

        refreshTableData();
    }//GEN-LAST:event_changeClassButtonActionPerformed

    private void manageClassPageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageClassPageBtnActionPerformed
        // TODO add your handling code here:
        MainFrame.instance.setPage(MainFrame.instance.getAddClassPage());
    }//GEN-LAST:event_manageClassPageBtnActionPerformed

    public void refreshTableData() {
        if (selectedClass == null) {
            return;
        }

        tableModel.setRowCount(0);
        for (Student student : selectedClass.getStudents()) {
            Vector newData = new Vector();
            newData.add(student.getId());
            newData.add(student.getFirstName());
            newData.add(student.getLastName());
            newData.add(student.getStudentClass());
            newData.add(selectedClass.getStudents().size());
            tableModel.addRow(newData);
        }
    }

    public void refreshTableData(Student student) {
        tableModel.setRowCount(0);

        Vector newData = new Vector();
        newData.add(student.getId());
        newData.add(student.getFirstName());
        newData.add(student.getLastName());
        newData.add(student.getStudentClass());
        newData.add(student.getStudentClass().getStudents().size());
        tableModel.addRow(newData);

    }

    public final void refreshComboBox() {
        classComboBox.removeAllItems();
        for (Class classe : Database.getClasses()) {
            classComboBox.addItem(classe);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changeClassButton;
    private javax.swing.JComboBox<Object> classComboBox;
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
        refreshTableData();
        refreshComboBox();
    }
}
