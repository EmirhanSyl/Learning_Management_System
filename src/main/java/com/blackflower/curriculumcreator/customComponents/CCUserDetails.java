package com.blackflower.curriculumcreator.customComponents;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author emirs
 */
public class CCUserDetails extends javax.swing.JPanel {

    private final String avatarImagePath; 
    private final String nameText; 
    private final String classText; 
    private final String usernameText; 

    public CCUserDetails(String avatarImagePath, String nameText, String classText, String usernameText) {
        initComponents();
        
        this.avatarImagePath = avatarImagePath;
        this.nameText = nameText;
        this.classText = classText;
        this.usernameText = usernameText;
        
        //ImageIcon icon = new ImageIcon("C:\\Users\\emirs\\Desktop\\pics\\user.png");
        ImageIcon icon = new ImageIcon(avatarImagePath);
        avatarLabel.setIcon(icon);
        Image imFit = icon.getImage();
        Image imgFit = imFit.getScaledInstance(75, 75, Image.SCALE_AREA_AVERAGING);
        icon.setImage(imgFit);
        System.out.println("00");
        
        nameLabel.setText(nameText);
        classField.setText(classText);
        usernameLabel.setText(usernameText);
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        avatarLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        classField = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        UpperBtn = new javax.swing.JButton();
        BottomBtn = new javax.swing.JButton();

        nameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nameLabel.setText("Zahid Esad Baltacı");

        classField.setText("Software Enginaaring");

        usernameLabel.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        usernameLabel.setText("ZahidEsadBaltaci");

        UpperBtn.setText("Show Class");
        UpperBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpperBtnActionPerformed(evt);
            }
        });

        BottomBtn.setText("Remove Student");
        BottomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottomBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(avatarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                        .addComponent(classField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UpperBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BottomBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(UpperBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BottomBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(avatarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(classField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(usernameLabel)))))
                .addGap(0, 13, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void UpperBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpperBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpperBtnActionPerformed

    private void BottomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottomBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BottomBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BottomBtn;
    private javax.swing.JButton UpperBtn;
    private javax.swing.JLabel avatarLabel;
    private javax.swing.JLabel classField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
