package com.blackflower.curriculumcreator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author emirs
 */
public class CurriculumCreator {
    
    // --------------- VARIABLE DECLERATIONS ------------------

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panelContainer = new JPanel();
        //panelContainer.setLayout(new FlowLayout());
        TestPanel panel1 = new TestPanel();
        HomePagePanel panel2 = new HomePagePanel(); 
        
        //panel2.add(new JLabel("HERE IS THE PANEL 2"));
        
        JButton btn = new JButton();
        btn.setText("Login");
        
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchPanel(panelContainer, panel2);
            }
        });
        //panel1.add(btn);
        frame.add(panelContainer);


        panelContainer.add(panel1);
        
        frame.setVisible(true);

    }

    public static void switchPanel(JPanel panelContainer , JPanel newPanel) {
        panelContainer.removeAll();
        panelContainer.add(newPanel);
        panelContainer.revalidate();
        panelContainer.repaint();
    }
}
