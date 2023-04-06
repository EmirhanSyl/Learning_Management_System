package com.blackflower.curriculumcreator;

import com.blackflower.curriculumcreator.test.*;
import com.blackflower.curriculumcreator.core.*;
import com.blackflower.curriculumcreator.core.Class;
import com.blackflower.curriculumcreator.adminpages.*;
import com.blackflower.curriculumcreator.instructorpages.*;
import javax.swing.JPanel;

/**
 *
 * @author emirs
 */
public class MainFrame extends javax.swing.JFrame {

    public Admin tmp_admin = new Admin("admin", "admin", "admin", "123");
    
// --------------- VARIABLE DECLERATIONS ------------------

    public static MainFrame instance;
    
    private final HomePagePanel homePage;
    private final TestPanel testPage;
    
    private final LoginPanel loginPage;
    private final RegisterPanel registerPage;
    private final AccountManagementPanel accountManagementPage;
    
    private final AddClassPanel addClassPage;
    private final ManageClassesPanel manageClassesPage;
    private final ManageClassStudentsPanel manageClassStudentsPage;
    
    private final AddLessonPanel addLessonPage;
    private final AdminHomePanel adminHomePage;
    
    private final AddSessionPanel addSessionPage;
    private final InstructorHomePanel instructorHomePage;
    private final ShowClassDeteails_InstructorPanel showClassDeteails_InstructorPage;
    
    private final JPanel pageContainer;
    
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
        
        pageContainer = new JPanel();
        
        this.add(pageContainer);
        pageContainer.add(loginPage);
        setSize(950, 600);
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

    public Person getAccount(){ return  account; }
    public void setAccount(Person account){ this.account = account; }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

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
                if ("Nimbus".equals(info.getName())) {
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
                testInit();
                // ---------------- SINGLETON -----------------
                instance = new MainFrame();
                instance.setVisible(true);
            }
        });
    }
    
    public final void setPage(JPanel page){
        pageContainer.removeAll();
        pageContainer.add(page);
        pageContainer.revalidate();
        pageContainer.repaint();
        System.out.println("Page Setted!");
        
        if (page instanceof IPage) {
            IPage iPage = (IPage)page;
            iPage.onPageSetted();
        }
    }
    
    public void logout() {
          account = null;
          setPage(getLoginPage());
    }
    
    public static void testInit(){
        Admin admin = new Admin("admin", "admin", "admin", "123");
        
        Instructor instructor = new Instructor("Ali", "Nizam");
        Instructor instructor2 = new Instructor("Nazlı", "Doğan");
        
        Database.addLesson("CP2", instructor, 6);
        Database.addLesson("CP1", instructor, 6);
        
        Class newClass = new Class("Software Eng.");
        Class newClass2 = new Class("Computer Eng.");
        
        Student student = new Student("Meryem", "Kılıç");
        Student student2 = new Student("Emirhan", "Soylu");
        student.setStudentClass(newClass);
        student2.setStudentClass(newClass);
        
        Student student3 = new Student("Zahid", "Baltaci");
        Student student4 = new Student("Sare", "Bayram");
        student3.setStudentClass(newClass2);
        student4.setStudentClass(newClass2);
        
        newClass.getStudents().add(student);
        newClass.getStudents().add(student2);
        
        newClass2.getStudents().add(student3);
        newClass2.getStudents().add(student4);
        
        Database.getUsers().add(admin);
        
        Database.getUsers().add(instructor);
        Database.getUsers().add(instructor2);
        
        Database.getClasses().add(newClass);
        Database.getClasses().add(newClass2);
        
        Database.getUsers().add(student);
        Database.getUsers().add(student2);
        Database.getUsers().add(student3);
        Database.getUsers().add(student4);
    }
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
