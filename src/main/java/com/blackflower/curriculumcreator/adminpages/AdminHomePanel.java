package com.blackflower.curriculumcreator.adminpages;

import com.blackflower.curriculumcreator.core.IPage;
import com.blackflower.curriculumcreator.MainFrame;
import com.blackflower.curriculumcreator.core.NotificationManager;
import com.blackflower.curriculumcreator.customComponents.CCAdminNotificationPanel;
import com.blackflower.curriculumcreator.customComponents.CCScrollBar;
import com.blackflower.curriculumcreator.customComponents.CCUserDetails;
import com.blackflower.curriculumcreator.jpa.model.*;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

/**
 *
 * @author emirs
 */
public class AdminHomePanel extends javax.swing.JPanel implements IPage {

    Admin account;

    public AdminHomePanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminNotifPanel = new javax.swing.JPanel();
        adminNotificationScrollPane = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        clearNotifsBtn = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(942, 554));

        adminNotificationScrollPane.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout adminNotifPanelLayout = new javax.swing.GroupLayout(adminNotifPanel);
        adminNotifPanel.setLayout(adminNotifPanelLayout);
        adminNotifPanelLayout.setHorizontalGroup(
            adminNotifPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminNotifPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminNotificationScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE)
                .addContainerGap())
        );
        adminNotifPanelLayout.setVerticalGroup(
            adminNotifPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminNotifPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminNotificationScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel1.setText("NOTIFICATION CENTER");

        clearNotifsBtn.setText("Clear Notifications");
        clearNotifsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearNotifsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(clearNotifsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(664, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(clearNotifsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adminNotifPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(adminNotifPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void clearNotifsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearNotifsBtnActionPerformed
        // TODO add your handling code here:
        NotificationManager.ClearNotifications();
        createAdminNotifs();
    }//GEN-LAST:event_clearNotifsBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adminNotifPanel;
    private javax.swing.JScrollPane adminNotificationScrollPane;
    private javax.swing.JButton clearNotifsBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onPageSetted() {
        Database.initDatabase("LMS_PE");
        account = (Admin) MainFrame.instance.getAccount();
        createAdminNotifs();
    }

    private void createAdminNotifs() {

        NotificationManager.refreshAllNotifications();
        JPanel resultConteiner = new JPanel();
        resultConteiner.setSize(612, 100 * 5);
        GridLayout gridLayout = new GridLayout(Database.getUsers().size(), 1);
        gridLayout.setVgap(5);
        resultConteiner.setLayout(gridLayout);

        for (CCAdminNotificationPanel notificationPanel : NotificationManager.notifications) {
            CCAdminNotificationPanel notification = notificationPanel;
            notification.setSize(600, 80);
            resultConteiner.add(notificationPanel, 0);
        }

        adminNotificationScrollPane.setViewportView(resultConteiner);

        adminNotificationScrollPane.setVerticalScrollBar(new CCScrollBar());
        CCScrollBar sp = new CCScrollBar();
        sp.setOrientation(JScrollBar.HORIZONTAL);
        adminNotificationScrollPane.setHorizontalScrollBar(sp);
    }
}
