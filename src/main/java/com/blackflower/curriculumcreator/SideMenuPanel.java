package com.blackflower.curriculumcreator;

import com.blackflower.curriculumcreator.core.Admin;
import com.blackflower.curriculumcreator.core.Instructor;
import com.blackflower.curriculumcreator.core.Person;
import com.blackflower.curriculumcreator.core.Student;
import com.blackflower.curriculumcreator.customComponents.CCScrollBar;
import com.blackflower.curriculumcreator.customComponents.Item;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;

/**
 *
 * @author emirs
 */
public class SideMenuPanel extends javax.swing.JPanel {

    
    public SideMenuPanel() {
        initComponents();
        adjustSideMenuContent(null);
        
        CCScrollBar sp = new CCScrollBar();
        sp.setForeground(new Color(123,52,219));
        jScrollPane1.setVerticalScrollBar(sp);
        CCScrollBar sp2 = new CCScrollBar();
        sp2.setOrientation(JScrollBar.HORIZONTAL);
        jScrollPane1.setHorizontalScrollBar(sp2);
        
        ImageIcon icon = new ImageIcon("C:\\Users\\emirs\\Desktop\\pics\\appIcons\\logo.png");
        Image imgFit = icon.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        icon.setImage(imgFit);
        logoLabel.setIcon(icon);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        cCSideMenuList1 = new com.blackflower.curriculumcreator.customComponents.CCSideMenuList<>();
        logoText = new javax.swing.JLabel();
        logoLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(123, 52, 219));
        setPreferredSize(new java.awt.Dimension(230, 230));

        cCSideMenuList1.setBackground(new java.awt.Color(123, 52, 219));
        cCSideMenuList1.setBorder(null);
        cCSideMenuList1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(cCSideMenuList1);

        logoText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        logoText.setForeground(new java.awt.Color(255, 255, 255));
        logoText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        logoText.setText("  BLACK FLOWER");

        logoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(logoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(logoText, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoText, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    public final void adjustSideMenuContent(Person account){
        if (account == null) {
            logoutList();
        }else if (account instanceof Admin) {
            adminList();
        }else if (account instanceof Instructor) {
            instructorList();
        }else if (account instanceof Student) {
            studentList();
        }
    }    
    
    private void logoutList(){
        cCSideMenuList1.removeAllItems();

        for (int i = 0; i < 5; i++) {
            // ------------ LOGIN -------------
            ImageIcon icon = new ImageIcon("C:\\Users\\emirs\\Desktop\\pics\\user.png");
            Image imgFit = icon.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
            icon.setImage(imgFit);
            cCSideMenuList1.addItem(new Item("Login", icon));

        }

    }

    private void adminList() {
        cCSideMenuList1.removeAllItems();
        
        // ------------ MANAGE CLASS -------------
        ImageIcon icon = new ImageIcon("C:\\Users\\emirs\\Desktop\\pics\\user.png");
        Image imgFit = icon.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        icon.setImage(imgFit);
        cCSideMenuList1.addItem(new Item("Manage Classes", icon));
    }
    
    private void instructorList(){
        cCSideMenuList1.removeAllItems();
        
        // ------------ MANAGE LESSONS -------------
        ImageIcon icon = new ImageIcon("C:\\Users\\emirs\\Desktop\\pics\\user.png");
        Image imgFit = icon.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        icon.setImage(imgFit);
        cCSideMenuList1.addItem(new Item("Manage Lessons", icon));
    }
    
    private void studentList(){
        cCSideMenuList1.removeAllItems();
        
        // ------------ SHOW CLASS DETAILS -------------
        ImageIcon icon = new ImageIcon("C:\\Users\\emirs\\Desktop\\pics\\user.png");
        Image imgFit = icon.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        icon.setImage(imgFit);
        cCSideMenuList1.addItem(new Item("Class Details", icon));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.blackflower.curriculumcreator.customComponents.CCSideMenuList<String> cCSideMenuList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel logoText;
    // End of variables declaration//GEN-END:variables
}
