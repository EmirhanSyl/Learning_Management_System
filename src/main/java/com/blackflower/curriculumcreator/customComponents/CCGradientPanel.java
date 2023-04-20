
package com.blackflower.curriculumcreator.customComponents;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import javax.swing.JPanel;

/**
 *
 * @author emirs
 */
public class CCGradientPanel extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        
        int width = getWidth();
        int height = getHeight();
        
        Color gradientStart = new Color(182, 219, 136);
        Color gradientEnd = new Color(158, 211, 102);

        Graphics2D g2 = (Graphics2D)g;
        GradientPaint painter = new GradientPaint(0, 0, gradientStart, 0, height, gradientEnd);
        Paint oldPainter = g2.getPaint();
        
        g2.setPaint(painter);
        g2.fill(g2.getClip());
        
        gradientStart = new Color(183, 234, 198, 200);
        gradientEnd = new Color(220, 255, 149, 255);
        
        painter = new GradientPaint(0, 0, gradientEnd, 0, height / 2, gradientStart);
        
        g2.setPaint(painter);
        g2.fill(g2.getClip());
        
        painter = new GradientPaint(0, height/2, gradientStart, 0, height, gradientEnd);
        
        g2.setPaint(painter);
        g2.fill(g2.getClip());
        
        g2.setPaint(oldPainter);
    }
    
}
