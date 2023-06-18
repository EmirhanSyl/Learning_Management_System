package com.blackflower.curriculumcreator.adminpages;

import com.blackflower.curriculumcreator.MainFrame;
import com.blackflower.curriculumcreator.jpa.model.*;
import com.blackflower.curriculumcreator.core.IPage;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author emirs
 */
public class ManageClassesPanel extends javax.swing.JPanel implements IPage {

    DefaultListModel<Object> classListModel = new DefaultListModel<>();
    DefaultListModel<Object> lessonListModel = new DefaultListModel<>();

    private StudentClass selectedClass;

    public ManageClassesPanel() {
        initComponents();

        classLessonsList.setModel(classListModel);
        lessonsList.setModel(lessonListModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        classesComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lessonsList = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        classLessonsList = new javax.swing.JList<>();
        classToLessonAllBtn = new javax.swing.JButton();
        classToLessonBtn = new javax.swing.JButton();
        lessonToClassBtn = new javax.swing.JButton();
        lessonToClassAllBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        manageClassPageBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        classesComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                classesComboBoxİtemStateChanged(evt);
            }
        });
        add(classesComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 124, 178, -1));

        jLabel1.setText("Class:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 101, 178, -1));

        lessonsList.setModel(new javax.swing.AbstractListModel<Object>() {
            String[] strings = { "Item 1" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lessonsList);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 160, 290));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Lessons");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 160, 29));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Class' Lessons");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 160, 30));

        classLessonsList.setModel(new javax.swing.AbstractListModel<Object>() {
            String[] strings = { "Item 1" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(classLessonsList);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 160, 290));

        classToLessonAllBtn.setText("<<");
        classToLessonAllBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classToLessonAllBtnActionPerformed(evt);
            }
        });
        add(classToLessonAllBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 243, -1, -1));

        classToLessonBtn.setText("<");
        classToLessonBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classToLessonBtnActionPerformed(evt);
            }
        });
        add(classToLessonBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 286, 72, -1));

        lessonToClassBtn.setText(">");
        lessonToClassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lessonToClassBtnActionPerformed(evt);
            }
        });
        add(lessonToClassBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 329, 72, -1));

        lessonToClassAllBtn.setText(">>");
        lessonToClassAllBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lessonToClassAllBtnActionPerformed(evt);
            }
        });
        add(lessonToClassAllBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 372, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Lesson Add/Drop");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 36, 305, 47));

        manageClassPageBtn.setText("Manage Class");
        manageClassPageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageClassPageBtnActionPerformed(evt);
            }
        });
        add(manageClassPageBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, -1));

        homeBtn.setText("Home");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(856, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void classToLessonAllBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classToLessonAllBtnActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < selectedClass.getLessons().size(); i++) {
            Database.removeLessonFromClass(selectedClass, selectedClass.getLessons().get(i));
        }
        refreshLists();
    }//GEN-LAST:event_classToLessonAllBtnActionPerformed

    private void classToLessonBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classToLessonBtnActionPerformed
        // TODO add your handling code here:
        if (classLessonsList.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Please Select A Class' Lesson!", "Class' Lesson Selectin is Null", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Database.removeLessonFromClass(selectedClass, (Lesson)classListModel.getElementAt(classLessonsList.getSelectedIndex()));
        refreshLists();
    }//GEN-LAST:event_classToLessonBtnActionPerformed

    private void lessonToClassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lessonToClassBtnActionPerformed
        // TODO add your handling code here:
        if (lessonsList.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Please Select A Lesson!", "Lesson Selectin is Null", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        selectedClass.getLessons().add((Lesson) lessonListModel.getElementAt(lessonsList.getSelectedIndex()));
        Database.updateClass(selectedClass);
        refreshLists();
    }//GEN-LAST:event_lessonToClassBtnActionPerformed

    private void lessonToClassAllBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lessonToClassAllBtnActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < lessonListModel.getSize(); i++) {
            selectedClass.getLessons().add((Lesson) lessonListModel.getElementAt(i));
        }
        Database.updateClass(selectedClass);
        refreshLists();
    }//GEN-LAST:event_lessonToClassAllBtnActionPerformed

    private void classesComboBoxİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_classesComboBoxİtemStateChanged
        // TODO add your handling code here:
        refreshLists();
    }//GEN-LAST:event_classesComboBoxİtemStateChanged

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        // TODO add your handling code here:
        
        MainFrame.instance.setPage(MainFrame.instance.getAdminHomePage());
    }//GEN-LAST:event_homeBtnActionPerformed

    private void manageClassPageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageClassPageBtnActionPerformed
        // TODO add your handling code here:
        MainFrame.instance.setPage(MainFrame.instance.getAddClassPage());
    }//GEN-LAST:event_manageClassPageBtnActionPerformed

    @Override
    public void onPageSetted() {
        Database.initDatabase("LMS_PE");
        refreshLists();
        refreshComboBox();
    }

    public final void refreshLists() {
        classListModel.removeAllElements();
        lessonListModel.removeAllElements();

        if (classesComboBox.getSelectedIndex() != -1) {
            selectedClass = (StudentClass) classesComboBox.getSelectedItem();
            classListModel.addAll(selectedClass.getLessons());

            for (Lesson lesson : Database.getLessons()) {
                if (!selectedClass.getLessons().contains(lesson)) {
                    lessonListModel.addElement(lesson);
                }
            }
        }

    }

    public final void refreshComboBox() {
        classesComboBox.removeAllItems();
        for (StudentClass studentClass : Database.getClasses()) {
            classesComboBox.addItem(studentClass);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<Object> classLessonsList;
    private javax.swing.JButton classToLessonAllBtn;
    private javax.swing.JButton classToLessonBtn;
    private javax.swing.JComboBox<Object> classesComboBox;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton lessonToClassAllBtn;
    private javax.swing.JButton lessonToClassBtn;
    private javax.swing.JList<Object> lessonsList;
    private javax.swing.JButton manageClassPageBtn;
    // End of variables declaration//GEN-END:variables
}
