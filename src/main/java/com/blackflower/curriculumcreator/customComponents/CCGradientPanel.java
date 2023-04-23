
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

    private Color gradientStart = new Color(123,52,219);
    private Color gradientEndd = getBackground();
    
    public boolean isVertical = true;
    private boolean flipColor = true;
    
    private boolean controlBool = false;
    
    private float colorAdjustment = 0.5f;

    public Color getGradientStart() { return gradientStart; }
    public void setGradientStart(Color gradientStart) { this.gradientStart = gradientStart; }
    
    public Color getGradientEndd() { return gradientEndd; }
    public void setGradientEndd(Color gradientEndd) { this.gradientEndd = gradientEndd; }

//    public boolean isIsVertical() { return isVertical; }
//    public void setIsVertical(boolean isVertical) { this.isVertical = isVertical; }
    
    public boolean getflipColor() { return flipColor; }
    public void setFlipColor(boolean flipColor) { this.flipColor = flipColor; }
    
    public float getColorAdjustment() { return colorAdjustment; }
    public void setColorAdjustment(float colorAdjustment) { this.colorAdjustment = colorAdjustment; }
    
    @Override
    protected void paintComponent(Graphics g) {
        
        int width = getWidth();
        int height = getHeight();

        if (flipColor &&  flipColor != controlBool) {
            Color tmp = gradientEndd;
            gradientEndd = gradientStart;
            gradientStart = tmp;
            flipColor = controlBool;
        }else if (!flipColor &&  flipColor != controlBool){
            Color tmp = gradientEndd;
            gradientEndd = gradientStart;
            gradientStart = tmp;
            flipColor = controlBool;
        }
        
        Graphics2D g2 = (Graphics2D)g;
        GradientPaint painter;
        if (isVertical) {
            painter = new GradientPaint(0, 0, gradientStart, width, 0, gradientEndd);
        }
        else{
            painter = new GradientPaint(0, 0, gradientStart, 0, height, gradientEndd);
        }
        Paint oldPainter = g2.getPaint();
        
        g2.setPaint(painter);
        g2.fill(g2.getClip());
        
//        gradientStart = new Color(183, 234, 198, 200);
//        gradientEnd = new Color(220, 255, 149, 255);
        
        if (isVertical) {
            painter = new GradientPaint(0, 0, gradientEndd, width * colorAdjustment, 0, gradientStart);
        }else{
            painter = new GradientPaint(0, 0, gradientEndd, 0, height * colorAdjustment, gradientStart);
        }
       
        
        g2.setPaint(painter);
        g2.fill(g2.getClip());
        
        if (isVertical) {
             painter = new GradientPaint(width * colorAdjustment, 0, gradientStart, width, 0, gradientEndd);
        }else{
            painter = new GradientPaint(0, width * colorAdjustment, gradientStart, 0, height, gradientEndd);
        }
       
        
        g2.setPaint(painter);
        g2.fill(g2.getClip());
        
        g2.setPaint(oldPainter);
    }


    
}
