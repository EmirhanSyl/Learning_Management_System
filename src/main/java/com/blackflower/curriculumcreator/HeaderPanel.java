package com.blackflower.curriculumcreator;

import com.blackflower.curriculumcreator.jpa.model.Person;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author emirs
 */
public class HeaderPanel extends javax.swing.JPanel {
    
    public HeaderPanel() {
        initComponents();
        
        ImageIcon icon = new ImageIcon("C:\\Users\\emirs\\Desktop\\pics\\user.png");
        Image imgFit = icon.getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING);
        icon.setImage(imgFit);
        cCAvatarImageLabel1.setImage(icon);
        
        usernameText.setText("Login Waiting...");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cCAvatarImageLabel1 = new com.blackflower.curriculumcreator.customComponents.CCAvatarImageLabel();
        jLabel1 = new javax.swing.JLabel();
        usernameText = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        logoutLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(cCAvatarImageLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 40, 40));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Username:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 134, 20));

        usernameText.setForeground(new java.awt.Color(0, 0, 0));
        usernameText.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        usernameText.setText("Login Waiting...");
        add(usernameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, 134, -1));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(857, 10, 90, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(775, 10, 2, 40));

        logoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutLabelMouseClicked(evt);
            }
        });
        add(logoutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 40, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void logoutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLabelMouseClicked
        MainFrame.instance.logout();
    }//GEN-LAST:event_logoutLabelMouseClicked

    public void adjustHeader(Person account) {
        if (account == null) {
            usernameText.setText("Login Waiting...");

            ImageIcon icon = new ImageIcon("C:\\Users\\emirs\\Desktop\\pics\\user.png");
            Image imgFit = icon.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
            icon.setImage(imgFit);
            cCAvatarImageLabel1.setImage(icon);
        
            logoutLabel.setIcon(null);
        } else {
            usernameText.setText(account.toString());
            
            ImageIcon icon = new ImageIcon(account.getImagePath());
            Image imgFit = icon.getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING);
            icon.setImage(imgFit);
            cCAvatarImageLabel1.setImage(icon);

            ImageIcon icon2 = new ImageIcon("C:\\Users\\emirs\\Desktop\\pics\\sideBarIcons\\exit.png");
            Image imgFit2 = icon2.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING);
            icon2.setImage(imgFit2);
            logoutLabel.setIcon(icon2);
            
        }
        logoutLabel.repaint();
        cCAvatarImageLabel1.repaint();
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.blackflower.curriculumcreator.customComponents.CCAvatarImageLabel cCAvatarImageLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JLabel usernameText;
    // End of variables declaration//GEN-END:variables
}
