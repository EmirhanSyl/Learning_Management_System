package com.blackflower.curriculumcreator.customComponents;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

/**
 *
 * @author RAVEN (https://www.youtube.com/watch?v=gxhTjQMqjJY/)
 */
public class CCScrollBar extends JScrollBar {

    public CCScrollBar() {
        setUI(new CCModernScrollBar());
        setPreferredSize(new Dimension(8, 8));
        setForeground(new Color(48, 144, 216));
        setBackground(Color.WHITE);
    }
}
