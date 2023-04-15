package com.blackflower.curriculumcreator.adminpages;

import com.blackflower.curriculumcreator.MainFrame;
import com.blackflower.curriculumcreator.customComponents.CCUserDetails;
import com.blackflower.curriculumcreator.core.*;
import com.blackflower.curriculumcreator.customComponents.CCScrollBar;
import com.blackflower.curriculumcreator.customComponents.EventSwitchSelected;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

/**
 *
 * @author emirs
 */
public class ShowAccountsNewStylePanel extends javax.swing.JPanel implements IPage{

    Admin account;
    int filterCount = 111;
    
    public ShowAccountsNewStylePanel() {
        initComponents();
        studentSwitchButton.addEventSelected((boolean selected) -> {
            if (selected) {
                filterCount += 1;
            } else {
                filterCount -= 1;
            }
            createAccountList();
        });
        instructorSwitchButton.addEventSelected((boolean selected) -> {
            if (selected) {
                filterCount += 10;
            } else {
                filterCount -= 10;
            }
            createAccountList();
        });
        managerSwitchButton.addEventSelected((boolean selected) -> {
            if (selected) {
                filterCount += 100;
            } else {
                filterCount -= 100;
            }
            createAccountList();
        });
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        welcomeLabel = new javax.swing.JLabel();
        studentSwitchButton = new com.blackflower.curriculumcreator.customComponents.CCSwitchButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        instructorSwitchButton = new com.blackflower.curriculumcreator.customComponents.CCSwitchButton();
        jLabel3 = new javax.swing.JLabel();
        managerSwitchButton = new com.blackflower.curriculumcreator.customComponents.CCSwitchButton();

        jScrollPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        welcomeLabel.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setText("Manage Accounts");

        studentSwitchButton.setSelected(true);

        jLabel1.setText("Students");

        jLabel2.setText("Instructors");

        instructorSwitchButton.setSelected(true);

        jLabel3.setText("Manager");

        managerSwitchButton.setSelected(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(managerSwitchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(instructorSwitchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(studentSwitchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(managerSwitchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(instructorSwitchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentSwitchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(224, 224, 224))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(55, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.blackflower.curriculumcreator.customComponents.CCSwitchButton instructorSwitchButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private com.blackflower.curriculumcreator.customComponents.CCSwitchButton managerSwitchButton;
    private com.blackflower.curriculumcreator.customComponents.CCSwitchButton studentSwitchButton;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onPageSetted() {
         account = (Admin)MainFrame.instance.getAccount();
         createAccountList();
    }
    
    private void createAccountList(){ 
        
        int studentCount = 1;
        for (Person user : Database.getUsers()) {
            if (user instanceof Student) { studentCount++; }
        }
        
        JPanel resultConteiner = new JPanel();
        resultConteiner.setSize(800, 100 * Database.getUsers().size());
        GridLayout gridLayout = new GridLayout(Database.getUsers().size(), 1);
        gridLayout.setVgap(10);
        resultConteiner.setLayout(gridLayout);
        
        for (Person user : Database.getUsers()) {
            if (filterCount % 2 == 1 && user instanceof Student student) {
                String avatarImagePath =  student.getImagePath();
                String nameText = student.toString();
                String classText = student.getStudentClass().toString();
                String usernameText = student.getUserName();
                
                CCUserDetails userListElement = new CCUserDetails(avatarImagePath, nameText, classText, usernameText);
                userListElement.setSize(800, 100);
                resultConteiner.add(userListElement);
                studentCount++;
            }
            if ((filterCount / 10) % 2 == 1 && user instanceof Instructor instructor) {
                String avatarImagePath =  instructor.getImagePath();
                String nameText = instructor.toString();
                String classText = Integer.toString(instructor.getId());
                String usernameText = instructor.getUserName();
                
                CCUserDetails userListElement = new CCUserDetails(avatarImagePath, nameText, "Lectorer", usernameText);
                userListElement.setSize(800, 100);
                resultConteiner.add(userListElement);
                studentCount++;
            }
            if (filterCount >= 100 && user instanceof Admin admin) {
                String avatarImagePath =  admin.getImagePath();
                String nameText = admin.toString();
                String classText = Integer.toString(admin.getId());
                String usernameText = admin.getUserName();
                
                CCUserDetails userListElement = new CCUserDetails(avatarImagePath, nameText, "Manager", usernameText);
                userListElement.setSize(800, 100);
                resultConteiner.add(userListElement);
                studentCount++;
            }
        }
        
        jScrollPane1.setViewportView(resultConteiner);
        
        jScrollPane1.setVerticalScrollBar(new CCScrollBar());
        CCScrollBar sp = new CCScrollBar();
        sp.setOrientation(JScrollBar.HORIZONTAL);
        jScrollPane1.setHorizontalScrollBar(sp);
    }
}
