package com.blackflower.curriculumcreator.instructorpages;

import com.blackflower.curriculumcreator.jpa.model.*;
import com.blackflower.curriculumcreator.core.IPage;
import com.blackflower.curriculumcreator.MainFrame;
import com.blackflower.curriculumcreator.core.NotificationManager;
import java.text.DecimalFormat;
import java.text.Format;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author emirs
 */
public class AddSessionPanel extends javax.swing.JPanel implements IPage{

    private Instructor account;
    
    public AddSessionPanel() {
        initComponents();
        //setDateComboBoxes();
        stateText.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        homeBtn = new javax.swing.JButton();
        hourComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        minuteComboBox = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();

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

        homeBtn.setText("Home");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        hourComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                hourComboBoxİtemStateChanged(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Hour");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Minute");

        minuteComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                minuteComboBoxİtemStateChanged(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText(":");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(stateText, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(addSessionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(363, 363, 363))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lessonComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(56, 56, 56)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(hourComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(42, 42, 42)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(minuteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(65, 65, 65)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(sessionDateText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(classComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sessionsLeftText, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                                .addComponent(sessionHoursSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sessionHoursText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(326, 326, 326)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
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
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hourComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minuteComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        if (monthComboBox.getSelectedIndex() == -1) { return; }
        setDayComboBox((Integer)monthComboBox.getSelectedItem());
        setDateText();
    }//GEN-LAST:event_monthComboBoxİtemStateChanged

    private void yearComboBoxİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_yearComboBoxİtemStateChanged
        // TODO add your handling code here:
        if (monthComboBox.getSelectedIndex() == -1) { return; }
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
        StudentClass sessionClass = (StudentClass)classComboBox.getSelectedItem();
        
        int day = Integer.parseInt(dayComboBox.getSelectedItem().toString());
        int month = (Integer)monthComboBox.getSelectedItem();
        int year = (Integer)yearComboBox.getSelectedItem();
        int hour = Integer.parseInt(hourComboBox.getSelectedItem().toString());
        int minute = Integer.parseInt(minuteComboBox.getSelectedItem().toString());
        int sessionHours = sessionHoursSlider.getValue();
        
        LocalDateTime timestamp = LocalDateTime.of(year, month, day, hour, minute, 0);
        Date startDate = Date.from(timestamp.atZone(ZoneId.systemDefault()).toInstant());
        
        Database.createSession(selectedLesson, sessionClass, startDate, sessionHours);
        stateText.setText("'" + sessionHours + "' hour(s) '" + selectedLesson 
                + "' lesson's session added to '" + sessionClass + "' class on " 
                + startDate.toString());
        
        refreshSlider(sessionClass, selectedLesson);
        
        NotificationManager.createNotification("C:\\Users\\emirs\\Desktop\\pics\\appIcons\\bell-ring.png",
                "New Session Added!", 
                "New Session \"Lesson:" + selectedLesson.getName() + " Class: " + sessionClass.toString() + " Session Length: " + sessionHours + " Session date: " + startDate.toString() + "\" created by: " + account.toString());
    }//GEN-LAST:event_addSessionBtnActionPerformed

    private void classComboBoxİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_classComboBoxİtemStateChanged
        // TODO add your handling code here:
        Lesson selectedLesson = (Lesson)lessonComboBox.getSelectedItem();
        StudentClass selectedClass = (StudentClass)classComboBox.getSelectedItem();
        
        if (selectedClass == null || selectedLesson == null) { return; }
        
        refreshSlider(selectedClass, selectedLesson);
    }//GEN-LAST:event_classComboBoxİtemStateChanged

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        // TODO add your handling code here:
        MainFrame.instance.setPage(MainFrame.instance.getInstructorHomePage());
    }//GEN-LAST:event_homeBtnActionPerformed

    private void hourComboBoxİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_hourComboBoxİtemStateChanged
        // TODO add your handling code here:
        setDateText();
    }//GEN-LAST:event_hourComboBoxİtemStateChanged

    private void minuteComboBoxİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_minuteComboBoxİtemStateChanged
        // TODO add your handling code here:
        setDateText();
    }//GEN-LAST:event_minuteComboBoxİtemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSessionBtn;
    private javax.swing.JComboBox<Object> classComboBox;
    private javax.swing.JComboBox<String> dayComboBox;
    private javax.swing.JButton homeBtn;
    private javax.swing.JComboBox<String> hourComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<Object> lessonComboBox;
    private javax.swing.JComboBox<String> minuteComboBox;
    private javax.swing.JComboBox<Integer> monthComboBox;
    private javax.swing.JLabel sessionDateText;
    private javax.swing.JSlider sessionHoursSlider;
    private javax.swing.JLabel sessionHoursText;
    private javax.swing.JLabel sessionsLeftText;
    private javax.swing.JLabel stateText;
    private javax.swing.JComboBox<Integer> yearComboBox;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onPageSetted() {
        Database.initDatabase("LMS_PE");
        Person user = MainFrame.instance.getAccount();
        if (user != null && user instanceof Instructor instructor) {
            account = instructor;
        }
        
        setDateComboBoxes();
        refreshHourComboBoxes();
        refreshLessonsComboBox();
        refreshClassesComboBox();
    }
    
    public final void setDateComboBoxes(){
        dayComboBox.removeAllItems();
        monthComboBox.removeAllItems();
        yearComboBox.removeAllItems();
        
        int year = 2023;
        for (int i = 0; i < 30; i++) {
            String output = String.format("%02d", i+1);
            dayComboBox.addItem(output);
            if (i <= 12) {
                monthComboBox.addItem(i+1);
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
            String output = String.format("%02d", (i+1));
            dayComboBox.addItem(output);
        }
        if (selectedIndex <= 28) {
            dayComboBox.setSelectedIndex(selectedIndex);
        }
    }
    public void refreshHourComboBoxes(){
        for (int i = 0; i < 24; i++) {
            String output = String.format("%02d", i);
            hourComboBox.addItem(output);
        }
        
        for (int i = 0; i < 60; i++) {
            String output = String.format("%02d", i);
            minuteComboBox.addItem(output);
        }
        
        hourComboBox.setSelectedIndex(2);
        minuteComboBox.setSelectedIndex(30);
    }
    
    private void refreshLessonsComboBox(){
        lessonComboBox.removeAllItems();
        account.getLessons().forEach((instructorLesson) -> {lessonComboBox.addItem(instructorLesson.getLessonId());});
        lessonComboBox.setSelectedIndex(0);
    }
    
    private void refreshClassesComboBox(){
        classComboBox.removeAllItems();
        if (lessonComboBox.getSelectedIndex() != -1) {
            Lesson selectedLesson = (Lesson)lessonComboBox.getSelectedItem();
            selectedLesson.getStudentClasses().forEach((studentClass) -> {classComboBox.addItem(studentClass);});
        }
    }
    
    public void refreshSlider(StudentClass selectedClass, Lesson selectedLesson){
        int remainedSessions = Database.remainedSessions(selectedClass, selectedLesson);
        sessionHoursText.setText("'" + remainedSessions + "' hour(s) sessions left from this lesson");
        if (remainedSessions > 0) {
            sessionHoursSlider.setMaximum(remainedSessions);
            addSessionBtn.setEnabled(true);
        }else{
            addSessionBtn.setEnabled(false);
        }
    }
    
    private void setDateText(){
        if (dayComboBox.getSelectedIndex() != -1 && monthComboBox.getSelectedIndex() != -1 && yearComboBox.getSelectedIndex() != -1 ) {
            sessionDateText.setText(
                    "Session Date: "
                    + dayComboBox.getSelectedItem() + "."
                    + monthComboBox.getSelectedItem().toString() + "."
                    + yearComboBox.getSelectedItem().toString() + " / "
                    + hourComboBox.getSelectedItem() + ":"
                    + minuteComboBox.getSelectedItem()
            );
        }
    }
}
