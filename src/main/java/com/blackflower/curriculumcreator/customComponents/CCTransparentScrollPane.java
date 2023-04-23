
package com.blackflower.curriculumcreator.customComponents;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JScrollPane;

/**
 *
 * @author emirs
 */
public class CCTransparentScrollPane extends JScrollPane{

     public CCTransparentScrollPane() {
        super();
        setOpaque(false);
         setBackground(new Color(0, 0, 0, 0));
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(new Color(0, 0, 0, 0));
        g.fillRect(0, 0, getWidth(), getHeight());
        //super.paintComponent(g);
    }
}
