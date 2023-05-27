package com.blackflower.curriculumcreator;

import com.blackflower.curriculumcreator.jpa.model.*;
import com.blackflower.curriculumcreator.customComponents.Item;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author emirs
 */
public class SideMenuPanel extends javax.swing.JPanel {

    
    public SideMenuPanel() {
        initComponents();
        adjustSideMenuContent(null);
        cCGradientPanel1.setColorAdjustment(0.2f);
        
//        CCScrollBar sp = new CCScrollBar();
//        sp.setForeground(new Color(123,52,219));
//        cCTransparentScrollPane1.setVerticalScrollBar(sp);
//        CCScrollBar sp2 = new CCScrollBar();
//        sp2.setOrientation(JScrollBar.HORIZONTAL);
//        cCTransparentScrollPane1.setHorizontalScrollBar(sp2);
        
        
        ImageIcon icon = new ImageIcon("C:\\Users\\emirs\\Desktop\\pics\\appIcons\\logo.png");
        Image imgFit = icon.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        icon.setImage(imgFit);
        logoLabel.setIcon(icon);
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cCGradientPanel1 = new com.blackflower.curriculumcreator.customComponents.CCGradientPanel();
        logoText = new javax.swing.JLabel();
        logoLabel = new javax.swing.JLabel();
        cCSideMenuList1 = new com.blackflower.curriculumcreator.customComponents.CCSideMenuList<>();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(123, 52, 219));
        setPreferredSize(new java.awt.Dimension(230, 230));

        cCGradientPanel1.setGradientEndd(new java.awt.Color(48, 170, 250));
        cCGradientPanel1.setGradientStart(new java.awt.Color(140, 4, 219));

        logoText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        logoText.setForeground(new java.awt.Color(255, 255, 255));
        logoText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        logoText.setText(" FSMVU LMS");

        logoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        cCSideMenuList1.setBackground(new java.awt.Color(123, 52, 219));
        cCSideMenuList1.setBorder(null);
        cCSideMenuList1.setForeground(new java.awt.Color(255, 255, 255));
        cCSideMenuList1.setOpaque(false);
        cCSideMenuList1.setSelectedColor(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Developed by BlackFlower");

        javax.swing.GroupLayout cCGradientPanel1Layout = new javax.swing.GroupLayout(cCGradientPanel1);
        cCGradientPanel1.setLayout(cCGradientPanel1Layout);
        cCGradientPanel1Layout.setHorizontalGroup(
            cCGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cCGradientPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(cCGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cCSideMenuList1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cCGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cCGradientPanel1Layout.createSequentialGroup()
                            .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(logoText, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE)))))
        );
        cCGradientPanel1Layout.setVerticalGroup(
            cCGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cCGradientPanel1Layout.createSequentialGroup()
                .addGroup(cCGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoText, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cCSideMenuList1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cCGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cCGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        JPanel page = null;
        if(MainFrame.instance != null){
           page = MainFrame.instance.getLoginPage();
        }
        
        // ------------ LOGIN -------------
        ImageIcon icon = new ImageIcon("C:\\Users\\emirs\\Desktop\\pics\\sideBarIcons\\login2.png");
        Image imgFit = icon.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        icon.setImage(imgFit);
        cCSideMenuList1.addItem(new Item("Login", icon, page));


        cCSideMenuList1.setSelectedIndex(0);

    }

    private void adminList() {
        cCSideMenuList1.removeAllItems();
        
        // ------------ HOME -------------
        ImageIcon icon = new ImageIcon("C:\\Users\\emirs\\Desktop\\pics\\sideBarIcons\\home.png");
        Image imgFit = icon.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        icon.setImage(imgFit);
        cCSideMenuList1.addItem(new Item("Home", icon,MainFrame.instance.getAdminHomePage()));
        
         // ------------ MANAGE CLASS -------------
        ImageIcon icon2 = new ImageIcon("C:\\Users\\emirs\\Desktop\\pics\\sideBarIcons\\classroom.png");
        Image imgFit2 = icon2.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        icon2.setImage(imgFit2);
        cCSideMenuList1.addItem(new Item("Manage Classes", icon2,MainFrame.instance.getAddClassPage()));
        
        // ------------ ADD STUDENT' TO CLASS -------------
        ImageIcon icon3 = new ImageIcon("C:\\Users\\emirs\\Desktop\\pics\\sideBarIcons\\persons-in-a-class.png");
        Image imgFit3 = icon3.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        icon3.setImage(imgFit3);
        cCSideMenuList1.addItem(new Item("Manage Class Students", icon3,MainFrame.instance.getManageClassesStudentsPage()));
        
        // ------------ Manage Class' Lessons -------------
        ImageIcon icon4 = new ImageIcon("C:\\Users\\emirs\\Desktop\\pics\\sideBarIcons\\books.png");
        Image imgFit4 = icon4.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        icon4.setImage(imgFit4);
        cCSideMenuList1.addItem(new Item("Manage Class' Lessons", icon4,MainFrame.instance.getManageClassesPage()));
        
         // ------------ ACCOUNT MANAGEMENT -------------
        ImageIcon icon5 = new ImageIcon("C:\\Users\\emirs\\Desktop\\pics\\sideBarIcons\\accountManagement.png");
        Image imgFit5 = icon5.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        icon5.setImage(imgFit5);
        cCSideMenuList1.addItem(new Item("Manage Acounts", icon5, MainFrame.instance.getAccountManagementPage()));
        
        // ------------ CREATE NEW ACCOUNT -------------
        ImageIcon icon6 = new ImageIcon("C:\\Users\\emirs\\Desktop\\pics\\sideBarIcons\\add-friend.png");
        Image imgFit6 = icon6.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        icon6.setImage(imgFit6);
        cCSideMenuList1.addItem(new Item("Create New Account", icon6,MainFrame.instance.getRegisterPage()));
        
         // ------------ MANAGE LESSONS -------------
        ImageIcon icon7 = new ImageIcon("C:\\Users\\emirs\\Desktop\\pics\\sideBarIcons\\video-lesson.png");
        Image imgFit7 = icon7.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        icon7.setImage(imgFit7);
        cCSideMenuList1.addItem(new Item("Manage Lessons", icon7,MainFrame.instance.getAddLessonPage()));
        
         // ------------ ACCOUNT MANAGEMENT NEW -------------
        ImageIcon icon8 = new ImageIcon("C:\\Users\\emirs\\Desktop\\pics\\sideBarIcons\\accountManagement.png");
        Image imgFit8 = icon8.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        icon8.setImage(imgFit8);
        cCSideMenuList1.addItem(new Item("Account Management NEW", icon8,MainFrame.instance.getShowAccountsNewStylePage()));
        
        
        cCSideMenuList1.setSelectedIndex(0);
    }
    
    private void instructorList(){
        cCSideMenuList1.removeAllItems();
        
        // ------------ HOME -------------
        ImageIcon icon = new ImageIcon("C:\\Users\\emirs\\Desktop\\pics\\sideBarIcons\\home.png");
        Image imgFit = icon.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        icon.setImage(imgFit);
        cCSideMenuList1.addItem(new Item("Home", icon,MainFrame.instance.getInstructorHomePage()));
        
        // ------------ SHOW CLASS' STUDENTS -------------
        ImageIcon icon2 = new ImageIcon("C:\\Users\\emirs\\Desktop\\pics\\sideBarIcons\\classroom.png");
        Image imgFit2 = icon2.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        icon2.setImage(imgFit2);
        cCSideMenuList1.addItem(new Item("Clas' Students", icon2, MainFrame.instance.getShowClassDeteails_InstructorPage()));
        
        // ------------ ADD SESSION -------------
        ImageIcon icon3 = new ImageIcon("C:\\Users\\emirs\\Desktop\\pics\\sideBarIcons\\session.png");
        Image imgFit3 = icon3.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        icon3.setImage(imgFit3);
        cCSideMenuList1.addItem(new Item("Add Session", icon3, MainFrame.instance.getaddSessionPage()));
        
        // ------------ MANAGE SESSIONS -------------
        ImageIcon icon4 = new ImageIcon("C:\\Users\\emirs\\Desktop\\pics\\sideBarIcons\\timetable.png");
        Image imgFit4 = icon4.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        icon4.setImage(imgFit4);
        cCSideMenuList1.addItem(new Item("Manage Sessions", icon4, MainFrame.instance.getManageSessionsPage()));
        
        // ------------ MANAGE TOPICS -------------
        ImageIcon icon5 = new ImageIcon("C:\\Users\\emirs\\Desktop\\pics\\sideBarIcons\\list.png");
        Image imgFit5 = icon5.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        icon5.setImage(imgFit5);
        cCSideMenuList1.addItem(new Item("Manage Topics", icon5, MainFrame.instance.getManageLessons_InstructorPage()));
        
        cCSideMenuList1.setSelectedIndex(0);
    }
    
    private void studentList(){
        cCSideMenuList1.removeAllItems();
        
        // ------------ HOME -------------
        ImageIcon icon = new ImageIcon("C:\\Users\\emirs\\Desktop\\pics\\sideBarIcons\\home.png");
        Image imgFit = icon.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        icon.setImage(imgFit);
        cCSideMenuList1.addItem(new Item("Home", icon,MainFrame.instance.getStudentHomePage()));
        
         // ------------ SHOW CLASS' STUDENTS -------------
        ImageIcon icon2 = new ImageIcon("C:\\Users\\emirs\\Desktop\\pics\\sideBarIcons\\classroom.png");
        Image imgFit2 = icon2.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        icon2.setImage(imgFit2);
        cCSideMenuList1.addItem(new Item("Class Details", icon2,MainFrame.instance.getShowClass_StudentPage()));
        
        // ------------ SHOW SESSIONS -------------
        ImageIcon icon3 = new ImageIcon("C:\\Users\\emirs\\Desktop\\pics\\sideBarIcons\\timetable.png");
        Image imgFit3 = icon3.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        icon3.setImage(imgFit3);
        cCSideMenuList1.addItem(new Item("Lesson Sessions", icon3,MainFrame.instance.getShowSessionDetailsPage()));
        
        // ------------ LESSON TOPICS -------------
        ImageIcon icon4 = new ImageIcon("C:\\Users\\emirs\\Desktop\\pics\\sideBarIcons\\list.png");
        Image imgFit4 = icon4.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        icon4.setImage(imgFit4);
        cCSideMenuList1.addItem(new Item("Lesson Topics", icon4,MainFrame.instance.getShowLessonDetailsPage()));
        
        cCSideMenuList1.setSelectedIndex(0);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.blackflower.curriculumcreator.customComponents.CCGradientPanel cCGradientPanel1;
    private com.blackflower.curriculumcreator.customComponents.CCSideMenuList<String> cCSideMenuList1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel logoText;
    // End of variables declaration//GEN-END:variables
}
