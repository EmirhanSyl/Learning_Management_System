package com.blackflower.curriculumcreator.customComponents;

import javax.swing.Icon;
import javax.swing.JPanel;

/**
 *
 * @author emirs
 */
public class Item {

    private String text;
    private Icon icon;
    private JPanel page;

    public Item() {
    }
    
    public Item(String text, Icon icon, JPanel page) {
        this.text = text;
        this.icon = icon;
        this.page = page;
    }
    
    public String getText() { return text; }
    public void setText(String text) { this.text = text; }

    public Icon getIcon() { return icon; }
    public void setIcon(Icon icon) { this.icon = icon; }

    public JPanel getPage() { return page; }
    public void setPage(JPanel page) { this.page = page; }
    
    
}
