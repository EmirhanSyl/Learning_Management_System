package com.blackflower.curriculumcreator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author emirs
 */
public class MainFrame extends javax.swing.JFrame {


// --------------- VARIABLE DECLERATIONS ------------------

    public static MainFrame instance;
    
    private final HomePagePanel homePage;
    private final LoginPanel loginPage;
    private final RegisterPanel registerPage;
    private final TestPanel testPage;
    
    private final JPanel pageContainer;
    
    
    public MainFrame() {
        initComponents();
        
        // Initilize Variables
        testPage = new TestPanel();
        homePage = new HomePagePanel();
        loginPage = new LoginPanel();
        registerPage = new RegisterPanel();
        
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
    }
    
    public static void testInit(){
        Instructor instructor = new Instructor("Ali", "Nizam");
        Lesson lesson = new Lesson("CP2", instructor);
        Lesson lesson2 = new Lesson("CP1", instructor);
        
        Class newClass = new Class("Software Eng.");
        Class newClass2 = new Class("Computer Eng.");
        
        Database.getLessons().add(lesson);
        Database.getLessons().add(lesson2);
        
        Database.getClasses().add(newClass);
        Database.getClasses().add(newClass2);
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
