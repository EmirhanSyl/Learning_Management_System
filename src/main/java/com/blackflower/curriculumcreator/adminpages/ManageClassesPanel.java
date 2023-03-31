package com.blackflower.curriculumcreator.adminpages;

import com.blackflower.curriculumcreator.MainFrame;
import com.blackflower.curriculumcreator.core.Lesson;
import com.blackflower.curriculumcreator.core.IPage;
import com.blackflower.curriculumcreator.core.Database;
import com.blackflower.curriculumcreator.core.Class;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author emirs
 */
public class ManageClassesPanel extends javax.swing.JPanel implements IPage {

    DefaultListModel<Object> classListModel = new DefaultListModel<>();
    DefaultListModel<Object> lessonListModel = new DefaultListModel<>();

    private Class selectedClass;

    public ManageClassesPanel() {
        initComponents();
        refreshComboBox();

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

        classesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1" }));
        classesComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                classesComboBoxİtemStateChanged(evt);
            }
        });

        jLabel1.setText("Class:");

        lessonsList.setModel(new javax.swing.AbstractListModel<Object>() {
            String[] strings = { "Item 1" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lessonsList);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Lessons");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Class' Lessons");

        classLessonsList.setModel(new javax.swing.AbstractListModel<Object>() {
            String[] strings = { "Item 1" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(classLessonsList);

        classToLessonAllBtn.setText(">>");
        classToLessonAllBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classToLessonAllBtnActionPerformed(evt);
            }
        });

        classToLessonBtn.setText(">");
        classToLessonBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classToLessonBtnActionPerformed(evt);
            }
        });

        lessonToClassBtn.setText("<");
        lessonToClassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lessonToClassBtnActionPerformed(evt);
            }
        });

        lessonToClassAllBtn.setText("<<");
        lessonToClassAllBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lessonToClassAllBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Lesson Add/Drop");

        manageClassPageBtn.setText("Manage Class");
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
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(classToLessonBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lessonToClassBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lessonToClassAllBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(classToLessonAllBtn))
                                .addGap(83, 83, 83))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(manageClassPageBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(classesComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)))
                        .addGap(83, 83, 83)))
                .addGap(232, 232, 232))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(homeBtn))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(homeBtn)
                .addGap(13, 13, 13)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(classesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(classToLessonAllBtn)
                        .addGap(20, 20, 20)
                        .addComponent(classToLessonBtn)
                        .addGap(20, 20, 20)
                        .addComponent(lessonToClassBtn)
                        .addGap(20, 20, 20)
                        .addComponent(lessonToClassAllBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(manageClassPageBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(95, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void classToLessonAllBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classToLessonAllBtnActionPerformed
        // TODO add your handling code here:
        selectedClass.removeAllLesson();
        refreshLists();
    }//GEN-LAST:event_classToLessonAllBtnActionPerformed

    private void classToLessonBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classToLessonBtnActionPerformed
        // TODO add your handling code here:
        if (classLessonsList.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Please Select A Class' Lesson!", "Class' Lesson Selectin is Null", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        selectedClass.removeLesson((Lesson)classListModel.getElementAt(classLessonsList.getSelectedIndex()));
        refreshLists();
    }//GEN-LAST:event_classToLessonBtnActionPerformed

    private void lessonToClassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lessonToClassBtnActionPerformed
        // TODO add your handling code here:
        if (lessonsList.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Please Select A Lesson!", "Lesson Selectin is Null", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        selectedClass.addLesson((Lesson) lessonListModel.getElementAt(lessonsList.getSelectedIndex()));
        refreshLists();
    }//GEN-LAST:event_lessonToClassBtnActionPerformed

    private void lessonToClassAllBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lessonToClassAllBtnActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < lessonListModel.getSize(); i++) {
            selectedClass.addLesson((Lesson) lessonListModel.getElementAt(i));
        }
        refreshLists();
    }//GEN-LAST:event_lessonToClassAllBtnActionPerformed

    private void manageClassPageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageClassPageBtnActionPerformed
        // TODO add your handling code here:
        MainFrame.instance.setPage(MainFrame.instance.getAddClassPage());
    }//GEN-LAST:event_manageClassPageBtnActionPerformed

    private void classesComboBoxİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_classesComboBoxİtemStateChanged
        // TODO add your handling code here:
        refreshLists();
    }//GEN-LAST:event_classesComboBoxİtemStateChanged

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        // TODO add your handling code here:
        MainFrame.instance.setPage(MainFrame.instance.getAdminHomePage());
    }//GEN-LAST:event_homeBtnActionPerformed

    @Override
    public void onPageSetted() {
        refreshLists();
        refreshComboBox();
    }

    public final void refreshLists() {
        classListModel.removeAllElements();
        lessonListModel.removeAllElements();

        if (classesComboBox.getSelectedIndex() != -1) {
            selectedClass = (Class) classesComboBox.getSelectedItem();
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
        for (Class classe : Database.getClasses()) {
            classesComboBox.addItem(classe);
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
