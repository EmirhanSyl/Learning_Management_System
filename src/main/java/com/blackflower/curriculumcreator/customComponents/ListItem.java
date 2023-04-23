package com.blackflower.curriculumcreator.customComponents;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 *
 * @author emirs
 */
public class ListItem extends javax.swing.JPanel {

    private boolean isSelected;
    private Item item;
    
    public ListItem() {
        initComponents();
    }
    
    public Item getItem(){ return item; }
    public void setItem(Item item){ this.item = item; }

    @Override
    public void setForeground(Color fg) {
        super.setForeground(fg); 
        
        if (jLabel1 != null) {
            jLabel1.setForeground(fg);
        }
    }
    
    

    public void setItem(Object obj){
        if (obj == null) {
            return;
        }
        
        if (obj instanceof Item givenItem) {
            jLabel1.setIcon(givenItem.getIcon());
            jLabel1.setText(givenItem.getText());
            item = givenItem;
        }
        else{
            jLabel1.setText(obj.toString());
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        if (isIsSelected()) {
            g2.fillRect(0, 0, 3, this.getHeight());
            
            // new style
            int x[] = {getWidth()-10, getWidth(), getWidth()};
            int y[] = {getHeight()/2, 5, getHeight()-5};
            
            g2.fillPolygon(x, y, x.length);
            this.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255, 160)));
        }
        else{
            this.setBorder(null);
        }
    }
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Item Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    public boolean isIsSelected() { return isSelected; }
    public void setIsSelected(boolean isSelected) { this.isSelected = isSelected; }
}
