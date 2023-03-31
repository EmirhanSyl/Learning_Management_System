package com.blackflower.curriculumcreator.instructorpages;

import com.blackflower.curriculumcreator.core.Class;
import com.blackflower.curriculumcreator.core.IPage;
import com.blackflower.curriculumcreator.core.Instructor;
import com.blackflower.curriculumcreator.core.Lesson;
import com.blackflower.curriculumcreator.MainFrame;
import com.blackflower.curriculumcreator.core.Person;

/**
 *
 * @author emirs
 */
public class AddSessionPanel extends javax.swing.JPanel implements IPage{

    private Instructor account;
    
    public AddSessionPanel() {
        initComponents();
        //setDateComboBoxes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeLabel = new javax.swing.JLabel();
        lessonComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        dayComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        monthComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        yearComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sessionDateText = new javax.swing.JLabel();
        classComboBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        sessionsLeftText = new javax.swing.JLabel();
        sessionHoursSlider = new javax.swing.JSlider();
        sessionHoursText = new javax.swing.JLabel();
        addSessionBtn = new javax.swing.JButton();
        stateText = new javax.swing.JLabel();

        welcomeLabel.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setText("Add Lesson Session");

        lessonComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CP1" }));
        lessonComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                lessonComboBoxİtemStateChanged(evt);
            }
        });

        jLabel1.setText("Lesson:");

        dayComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                dayComboBoxİtemStateChanged(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Day");

        monthComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                monthComboBoxİtemStateChanged(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Month");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Year");

        yearComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                yearComboBoxİtemStateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText(".");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(".");

        sessionDateText.setText("Session Date: 02.03.2023");

        classComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Software Eng." }));
        classComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                classComboBoxİtemStateChanged(evt);
            }
        });

        jLabel8.setText("Class:");

        sessionsLeftText.setText("*5 hour(s) sessions left from this lesson");

        sessionHoursSlider.setPaintLabels(true);
        sessionHoursSlider.setPaintTicks(true);
        sessionHoursSlider.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                sessionHoursSliderPropertyChange(evt);
            }
        });

        sessionHoursText.setText("Session hours: 5");

        addSessionBtn.setText("Add Session");
        addSessionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSessionBtnActionPerformed(evt);
            }
        });

        stateText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stateText.setText("'5' hour(s) 'CP1' lesson's session added to 'Software Eng.' class on 02.03.2023");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(welcomeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
                .addGap(169, 169, 169))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(addSessionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(363, 363, 363))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lessonComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(sessionDateText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(classComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sessionsLeftText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sessionHoursSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sessionHoursText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(326, 326, 326))))
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(stateText, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lessonComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dayComboBox)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(yearComboBox)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sessionDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(classComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sessionsLeftText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(sessionHoursText)
                .addGap(2, 2, 2)
                .addComponent(sessionHoursSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addSessionBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(stateText)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lessonComboBoxİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_lessonComboBoxİtemStateChanged
        // TODO add your handling code here:
        refreshClassesComboBox();
    }//GEN-LAST:event_lessonComboBoxİtemStateChanged

    private void monthComboBoxİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_monthComboBoxİtemStateChanged
        // TODO add your handling code here:
        setDayComboBox((Integer)monthComboBox.getSelectedItem());
        setDateText();
    }//GEN-LAST:event_monthComboBoxİtemStateChanged

    private void yearComboBoxİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_yearComboBoxİtemStateChanged
        // TODO add your handling code here:
        setDayComboBox((Integer)monthComboBox.getSelectedItem());
        setDateText(); 
    }//GEN-LAST:event_yearComboBoxİtemStateChanged

    private void dayComboBoxİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_dayComboBoxİtemStateChanged
        // TODO add your handling code here:
        setDateText();
    }//GEN-LAST:event_dayComboBoxİtemStateChanged

    private void sessionHoursSliderPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_sessionHoursSliderPropertyChange
        // TODO add your handling code here:
        sessionHoursText.setText("Session hours: " + sessionHoursSlider.getValue());
    }//GEN-LAST:event_sessionHoursSliderPropertyChange

    private void addSessionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSessionBtnActionPerformed
        // TODO add your handling code here:
        Lesson selectedLesson = (Lesson)lessonComboBox.getSelectedItem();
        Class sessionClass = (Class)classComboBox.getSelectedItem();
        int day = (Integer)dayComboBox.getSelectedItem();
        int month = (Integer)monthComboBox.getSelectedItem();
        int year = (Integer)yearComboBox.getSelectedItem();
        int sessionHours = sessionHoursSlider.getValue();
        
        account.createSession(selectedLesson, sessionClass, day, month, year, sessionHours);
    }//GEN-LAST:event_addSessionBtnActionPerformed

    private void classComboBoxİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_classComboBoxİtemStateChanged
        // TODO add your handling code here:
        Lesson selectedLesson = (Lesson)lessonComboBox.getSelectedItem();
        Class selectedClass = (Class)classComboBox.getSelectedItem();
        int remainedSessions = selectedClass.remainedSessions(selectedLesson);
        sessionHoursText.setText("'" + remainedSessions + "' hour(s) sessions left from this lesson");
        if (remainedSessions != 0) {
            sessionHoursSlider.setMaximum(remainedSessions);
            addSessionBtn.setEnabled(true);
        }else{
            addSessionBtn.setEnabled(false);
        }
    }//GEN-LAST:event_classComboBoxİtemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSessionBtn;
    private javax.swing.JComboBox<Object> classComboBox;
    private javax.swing.JComboBox<Integer> dayComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<Object> lessonComboBox;
    private javax.swing.JComboBox<Integer> monthComboBox;
    private javax.swing.JLabel sessionDateText;
    private javax.swing.JSlider sessionHoursSlider;
    private javax.swing.JLabel sessionHoursText;
    private javax.swing.JLabel sessionsLeftText;
    private javax.swing.JLabel stateText;
    private javax.swing.JLabel welcomeLabel;
    private javax.swing.JComboBox<Integer> yearComboBox;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onPageSetted() {
        Person user = MainFrame.instance.getAccount();
        if (user != null && user instanceof Instructor instructor) {
            account = instructor;
        }
        
        refreshLessonsComboBox();
        refreshClassesComboBox();
    }
    
    public final void setDateComboBoxes(){
        dayComboBox.removeAllItems();
        monthComboBox.removeAllItems();
        yearComboBox.removeAllItems();
        
        int year = 2022;
        for (int i = 1; i < 31; i++) {
            dayComboBox.addItem(i);
            if (i <= 12) {
                monthComboBox.addItem(i);
                yearComboBox.addItem(year + i);
            }
            
        }
        dayComboBox.setSelectedIndex(1);
        monthComboBox.setSelectedIndex(2);
    }
    
    public void setDayComboBox(int month) {
        int dayCount = 30;
        if (month != 2 && month < 8) {
            dayCount = (month % 2 == 0) ? 30 : 31;
        } else if (month >= 8) {
            dayCount = (month % 2 == 0) ? 31 : 30;
        } else if (month == 2) {
            dayCount = ((Integer) yearComboBox.getSelectedItem() % 4 == 0) ? 29 : 28; 
        }
        
        int selectedIndex = dayComboBox.getSelectedIndex();
        dayComboBox.removeAllItems();
        for (int i = 0; i < dayCount; i++) {
            dayComboBox.addItem(i + 1);
        }
        if (selectedIndex <= 28) {
            dayComboBox.setSelectedIndex(selectedIndex);
        }
    }
    
    private void refreshLessonsComboBox(){
        lessonComboBox.removeAllItems();
        account.getLessons().forEach((lesson) -> {lessonComboBox.addItem(lesson);});
        lessonComboBox.setSelectedIndex(0);
    }
    
    private void refreshClassesComboBox(){
        classComboBox.removeAllItems();
        if (lessonComboBox.getSelectedIndex() != -1) {
            Lesson selectedLesson = (Lesson)lessonComboBox.getSelectedItem();
            selectedLesson.lessonClasses().forEach((classe) -> {classComboBox.addItem(classe);});
        }
    }
    
    private void setDateText(){
        sessionDateText.setText(
                "Session Date: "
                + dayComboBox.getSelectedItem().toString() + "."
                + monthComboBox.getSelectedItem().toString() + "."
                + yearComboBox.getSelectedItem().toString()
        );
    }
}
