package com.blackflower.curriculumcreator;

import com.blackflower.curriculumcreator.test.*;
import com.blackflower.curriculumcreator.jpa.model.Person;
import com.blackflower.curriculumcreator.adminpages.*;
import com.blackflower.curriculumcreator.core.IPage;
import com.blackflower.curriculumcreator.instructorpages.*;
import com.blackflower.curriculumcreator.jpa.model.Login;
import com.blackflower.curriculumcreator.studentspages.*;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author emirs
 */
public class MainFrame extends javax.swing.JFrame {

    //public Admin tmp_admin = new Admin("admin", "admin", "admin", "123");
    
// --------------- VARIABLE DECLERATIONS ------------------

    public static MainFrame instance;
    
    private final HomePagePanel homePage;
    private final TestPanel testPage;
    
    private final WelcomePanel welcomePage;
    private final LoginPanel loginPage;
    private final RegisterPanel registerPage;
    private final AccountManagementPanel accountManagementPage;
    
    private final AddClassPanel addClassPage;
    private final ManageClassesPanel manageClassesPage;
    private final ManageClassStudentsPanel manageClassStudentsPage;
    private final ShowAccountsNewStylePanel showAccountsNewStylePage;
    
    private final AddLessonPanel addLessonPage;
    private final AdminHomePanel adminHomePage;
    
    private final AddSessionPanel addSessionPage;
    private final InstructorHomePanel instructorHomePage;
    private final ShowClassDeteails_InstructorPanel showClassDeteails_InstructorPage;
    private final ManageSessionsPanel manageSessionsPage;
    private final ManageLessons_InstructorPanel manageTopics;
    
    private final StudentHomePanel studentHomePage;
    private final ShowClass_StudentPanel showClass_StudentPage;
    private final ShowSessionDetailsPanel showSessionDetailsPage;
    private final ShowLessonDetailsPanel showLessonDetailsPage;
    
    private final HeaderPanel header;
    private final SideMenuPanel sideMenu;
    
    //private final JPanel pageContainer;
    
    private Person account;
    
    public MainFrame() {
        initComponents();
        
        // Initilize Variables
        testPage = new TestPanel();
        homePage = new HomePagePanel();
        loginPage = new LoginPanel();
        registerPage = new RegisterPanel();
        addClassPage = new AddClassPanel();
        manageClassesPage = new ManageClassesPanel();
        manageClassStudentsPage = new ManageClassStudentsPanel();
        addLessonPage = new AddLessonPanel();
        accountManagementPage = new AccountManagementPanel();
        adminHomePage = new AdminHomePanel();
        addSessionPage = new AddSessionPanel();
        instructorHomePage = new InstructorHomePanel();
        showClassDeteails_InstructorPage = new ShowClassDeteails_InstructorPanel();
        manageSessionsPage = new ManageSessionsPanel();
        manageTopics = new ManageLessons_InstructorPanel();
        studentHomePage = new StudentHomePanel();
        showClass_StudentPage = new ShowClass_StudentPanel();
        showSessionDetailsPage = new ShowSessionDetailsPanel();
        showAccountsNewStylePage = new ShowAccountsNewStylePanel();
        showLessonDetailsPage = new ShowLessonDetailsPanel();
        welcomePage = new WelcomePanel();
        
        headerPanel.setLayout(new GridLayout());
        header = new HeaderPanel();
        header.setSize(headerPanel.getWidth(), headerPanel.getWidth());
        headerPanel.add(header);
        
        sideMenuPanel.setLayout(new GridLayout());
        sideMenu = new SideMenuPanel();
        sideMenu.setSize(sideMenuPanel.getWidth(), sideMenuPanel.getWidth());
        sideMenuPanel.add(sideMenu);
        
        this.add(mainPanel);
        
        account = Login.checkRememberMe();
        setPage(welcomePage);        
        
        this.setPreferredSize(new Dimension(1200, 600));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        ImageIcon icon = new ImageIcon("C:\\Users\\emirs\\Desktop\\pics\\appIcons\\logo.png");
        this.setIconImage(icon.getImage());
        
//        dispose();
//        this.setUndecorated(true);
//        this.getRootPane().setWindowDecorationStyle(JRootPane.PROPERTIES);
//        this.setDefaultCloseOperation(0);
    }
    
    // --------------- ENCAPSULATE FIELDS ------------------
    public HomePagePanel getHomePage() { return homePage; }
    public TestPanel getTestPage() { return testPage; }
    public LoginPanel getLoginPage() { return loginPage; }
    public RegisterPanel getRegisterPage() { return registerPage; }
    public AddClassPanel getAddClassPage() { return addClassPage; }
    public ManageClassesPanel getManageClassesPage() { return manageClassesPage; }
    public ManageClassStudentsPanel getManageClassesStudentsPage() { return manageClassStudentsPage; }
    public AddLessonPanel getAddLessonPage() { return addLessonPage; }
    public AccountManagementPanel getAccountManagementPage() { return accountManagementPage; }
    public AdminHomePanel getAdminHomePage() { return adminHomePage; }
    public AddSessionPanel getaddSessionPage() { return addSessionPage; }
    public InstructorHomePanel getInstructorHomePage() { return instructorHomePage; }
    public ShowClassDeteails_InstructorPanel getShowClassDeteails_InstructorPage(){ return showClassDeteails_InstructorPage; };
    public ManageSessionsPanel getManageSessionsPage() { return manageSessionsPage; }
    public ManageLessons_InstructorPanel getManageLessons_InstructorPage(){ return manageTopics; }
    public StudentHomePanel getStudentHomePage(){ return studentHomePage; }
    public ShowClass_StudentPanel getShowClass_StudentPage(){ return showClass_StudentPage; }
    public ShowSessionDetailsPanel getShowSessionDetailsPage(){ return showSessionDetailsPage; }
    public ShowAccountsNewStylePanel getShowAccountsNewStylePage() { return showAccountsNewStylePage; }
    public ShowLessonDetailsPanel getShowLessonDetailsPage(){ return showLessonDetailsPage; }
    
    public Person getAccount(){ return  account; }
    public void setAccount(Person account){ this.account = account; }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        sideMenuPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(240, 248, 255));
        setForeground(new java.awt.Color(240, 248, 255));
        setSize(new java.awt.Dimension(1000, 600));

        mainPanel.setBackground(new java.awt.Color(225, 225, 225));
        mainPanel.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout sideMenuPanelLayout = new javax.swing.GroupLayout(sideMenuPanel);
        sideMenuPanel.setLayout(sideMenuPanelLayout);
        sideMenuPanelLayout.setHorizontalGroup(
            sideMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        sideMenuPanelLayout.setVerticalGroup(
            sideMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sideMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 934, Short.MAX_VALUE)
                    .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(sideMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //testInit();
                // ---------------- SINGLETON -----------------
                instance = new MainFrame();
                instance.setVisible(true);
            }
        });
    }

    public final void setPage(JPanel page) {
        mainPanel.removeAll();
        mainPanel.add(page);
        mainPanel.revalidate();
        mainPanel.repaint();
        System.out.println("Page Setted!");

        if (page instanceof IPage) {
            IPage iPage = (IPage) page;
            iPage.onPageSetted();
        }
    }

    public void logout() {
        loginPage.forgetMe();
        account = null;
        setPage(getLoginPage());

        sideMenu.adjustSideMenuContent(account);
        header.adjustHeader(account);
    }

    public void login() {
        sideMenu.adjustSideMenuContent(account);
        header.adjustHeader(account);
    }


    public static void testInit(){
//        Admin admin = new Admin("admin", "admin", "admin", "123");
//        
//        Instructor instructor = new Instructor("Ali", "Nizam");
//        Instructor instructor2 = new Instructor("Nazlı", "Doğan");
//        
//        Database.addLesson("CP2", instructor, 6);
//        Database.addLesson("CP1", instructor, 6);
//        
//        Class newClass = new Class("Software Eng.");
//        Class newClass2 = new Class("Computer Eng.");
//        
//        Student student = new Student("Meryem", "Kılıç");
//        Student student2 = new Student("Emirhan", "Soylu");
//        student.setStudentClass(newClass);
//        student2.setStudentClass(newClass);
//        
//        Student student3 = new Student("Zahid", "Baltaci");
//        Student student4 = new Student("Sare", "Bayram");
//        student3.setStudentClass(newClass2);
//        student4.setStudentClass(newClass2);
//        
//        newClass.getStudents().add(student);
//        newClass.getStudents().add(student2);
//        student.setImagePath("C:\\Users\\emirs\\Desktop\\pics\\papatya.jpg");
//        student2.setImagePath("C:\\Users\\emirs\\Desktop\\pics\\s1.png");
//        
//        newClass2.getStudents().add(student3);
//        newClass2.getStudents().add(student4);
//        
//        Database.getUsers().add(admin);
//        
//        Database.getUsers().add(instructor);
//        Database.getUsers().add(instructor2);
//        
//        Database.getClasses().add(newClass);
//        Database.getClasses().add(newClass2);
//        
//        Database.getUsers().add(student);
//        Database.getUsers().add(student2);
//        Database.getUsers().add(student3);
//        Database.getUsers().add(student4);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel sideMenuPanel;
    // End of variables declaration//GEN-END:variables
}
