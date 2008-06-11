package gui;


import java.awt.Color;

/*
 * generalJFrame.java
 *
 * Created on 5 יוני 2008, 03:17
 */
import java.awt.Cursor;
import java.awt.Toolkit;
import javax.swing.JLabel;

public class GeneralJFrame1 extends javax.swing.JFrame {
    protected static Color backgroundColor = Color.DARK_GRAY;
    protected Color headerColor = new Color(255, 51, 51);
    protected Color linkHeaderColor = new Color(155, 51, 51);
    protected Color regularFontColor = Color.LIGHT_GRAY;
    protected Color headersFontColor = Color.WHITE;
    
    
    /** Creates new form generalJFrame */
    public GeneralJFrame1() {
        
        initComponents();
    }
    
    protected void setFrameAtCenter(int width, int height){
        setResizable(false);
        Toolkit t = Toolkit.getDefaultToolkit();
        this.setSize(1320, 240);
        int x = (int)((t.getScreenSize().getWidth() - width) / 2);
        int y = (int)((t.getScreenSize().getHeight() - height) / 2);
        this.setLocation(x-20, 10);
        //setLocationRelativeTo(null);
        //setBounds(x-30, 10, width, height);
    }
    protected void setLinkEntered(JLabel label, Color color){
        label.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label.setForeground(color);
    }
    protected void setLinkExited(JLabel label, Color color){
        label.setForeground(color);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    protected void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    protected void setHeaderColor(Color headerColor) {
        this.headerColor = headerColor;
    }

    protected void setLinkHeaderColor(Color linkHeaderColor) {
        this.linkHeaderColor = linkHeaderColor;
    }

    protected void setRegularFontColor(Color regularFontColor) {
        this.regularFontColor = regularFontColor;
    }

    protected void setHeadersFontColor(Color headersFontColor) {
        this.headersFontColor = headersFontColor;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}