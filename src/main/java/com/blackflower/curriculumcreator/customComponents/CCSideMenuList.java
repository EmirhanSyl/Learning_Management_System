package com.blackflower.curriculumcreator.customComponents;

import com.blackflower.curriculumcreator.MainFrame;
import com.blackflower.curriculumcreator.jpa.model.Database;
import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author emirs
 */
public class CCSideMenuList<E extends Object> extends JList<E>{

    private final DefaultListModel model;
    private Color selectedColor;
    private int hoverIndex = -1;
    private ListItem selectedListItem;
    private int selectedPreIndex = -1;
    
    public CCSideMenuList() {
        this.model = new DefaultListModel();
        selectedColor = new Color(153, 43, 243);
        setModel(model);
        
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                hoverIndex = -1;
                repaint();
            }
            
        });
        
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                checkMouse(e);
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                checkMouse(e);
            }
            
            
        });
    }
    
    private void checkMouse(MouseEvent evt){
        Point p = evt.getPoint();
        int index = locationToIndex(p);
        if (index != hoverIndex) {
            hoverIndex = index;
            repaint();
        }
    }

    public Color getSelectedColor() { return selectedColor; }
    public void setSelectedColor(Color selectedColor) { this.selectedColor = selectedColor; }

    
    @Override
    public ListCellRenderer<? super E> getCellRenderer() {
        return new DefaultListCellRenderer(){
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                ListItem item = new ListItem();
                item.setItem(value);
                item.setBackground(CCSideMenuList.this.getBackground());
                item.setForeground(CCSideMenuList.this.getForeground());
                item.setOpaque(CCSideMenuList.this.isOpaque());
                item.setIsSelected(isSelected);
                if (index == hoverIndex || isSelected) {
                    if (!item.isOpaque()) {
                        item.setOpaque(true);
                        item.setBackground(new Color(selectedColor.getRed(), selectedColor.getGreen(), selectedColor.getBlue(), 60));
                    }else{
                        item.setBackground(selectedColor);
                    }
                    
                }
                
                if (isSelected && selectedPreIndex != getSelectedIndex()) {
                    selectedPreIndex = getSelectedIndex();
                    selectedListItem = item;
                    if (item.getItem().getPage() != null) {
                        Database.close();
                        MainFrame.instance.setPage(item.getItem().getPage());
                    }
                }
                
                return item;
            }
            
        };
    }
    
    public void addItem(Item item){
        model.addElement(item);
    }
    public void removeItem(int index){
        model.remove(index);
    }
    public void removeAllItems(){
        model.removeAllElements();
    }
    
    public Item getSelectedItem(){
        if (CCSideMenuList.this.getSelectedIndex() == -1) {
            return null;
        }
        ListItem listItem = (ListItem)model.getElementAt(CCSideMenuList.this.getSelectedIndex());
        
        return listItem.getItem();
    }

//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        
//        int width = getWidth();
//        int height = getHeight();
//        
//        Color gradientStart = new Color(182, 219, 136);
//        Color gradientEnd = new Color(158, 211, 102);
//
//        Graphics2D g2 = (Graphics2D)g;
//        GradientPaint painter = new GradientPaint(0, 0, gradientStart, 0, height, gradientEnd);
//        Paint oldPainter = g2.getPaint();
//        
//        g2.setPaint(painter);
//        g2.fill(g2.getClip());
//        
//        gradientStart = new Color(183, 234, 198, 200);
//        gradientEnd = new Color(220, 255, 149, 255);
//        
//        painter = new GradientPaint(0, 0, gradientEnd, 0, height / 2, gradientStart);
//        
//        g2.setPaint(painter);
//        g2.fill(g2.getClip());
//        
//        painter = new GradientPaint(0, height/2, gradientStart, 0, height, gradientEnd);
//        
//        g2.setPaint(painter);
//        g2.fill(g2.getClip());
//        
//        g2.setPaint(oldPainter);
//        super.paintComponent(g);
//    }
    
    
    
}
