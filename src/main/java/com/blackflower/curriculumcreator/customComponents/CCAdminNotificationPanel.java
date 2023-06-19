package com.blackflower.curriculumcreator.customComponents;

import java.awt.Image;
import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author emirs
 */
public class CCAdminNotificationPanel extends javax.swing.JPanel {

    public CCAdminNotificationPanel() {
        initComponents();

        ImageIcon icon = new ImageIcon("C:\\Users\\emirs\\Desktop\\pics\\appIcons\\bell-ring.png");
        Image imgFit = icon.getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING);
        icon.setImage(imgFit);

        notifIconLabel.setIcon(icon);
    }

    public CCAdminNotificationPanel(String notificationPath, String notifTitle, String notifContent, String notifDate) {
        initComponents();

        ImageIcon icon = new ImageIcon(notificationPath);
        Image imgFit = icon.getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING);
        icon.setImage(imgFit);
        notifIconLabel.setIcon(icon);
        
        titleLabel.setText(notifTitle);
        contentLabel.setText(notifContent);
        dateLabel.setText(notifDate);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        notifIconLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        contentLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        titleLabel.setText("New Lesson Added!");

        contentLabel.setText("New lesson \"CALCULUS-I\" created. Lesson hours: 15, Lesson's instructor: NAZLI DOĞAN");

        dateLabel.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        dateLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        dateLabel.setText("20.06.2023");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(notifIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                    .addComponent(titleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(notifIconLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dateLabel))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contentLabel;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel notifIconLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
