/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.geom.RoundRectangle2D;

/**
 *
 * @author gauravpunjabi
 */
public class Loading extends javax.swing.JFrame {

    /**
     * Creates new form Loading
     */ 
    public Loading(String name) {
        initComponents();
        this.setName(name);
    }
    public void setName(String name)
    {
        this.jlName.setText("Welcome, " + name);
    }
    public void close()
    {
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(new WindowEvent(this,WindowEvent.WINDOW_CLOSING));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlName = new javax.swing.JLabel();
        jlQuote = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlAnimation = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setShape(new RoundRectangle2D.Double(0,0,800,550,30,30));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlName.setFont(new java.awt.Font("Raleway", 0, 36)); // NOI18N
        jlName.setForeground(new java.awt.Color(86, 61, 124));
        jlName.setText("Welcome, Gaurav");
        getContentPane().add(jlName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));

        jlQuote.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        jlQuote.setForeground(new java.awt.Color(86, 61, 124));
        jlQuote.setText("Please wait while we set things up for you");
        getContentPane().add(jlQuote, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/cross.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(766, 10, 24, 24));

        jlAnimation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/LoadingAnimation.gif"))); // NOI18N
        jlAnimation.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jlAnimationMouseDragged(evt);
            }
        });
        jlAnimation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlAnimationMousePressed(evt);
            }
        });
        getContentPane().add(jlAnimation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        close();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jlAnimationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlAnimationMousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_jlAnimationMousePressed

    private void jlAnimationMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlAnimationMouseDragged
        this.setLocation(evt.getXOnScreen() - x,evt.getYOnScreen() - y);
    }//GEN-LAST:event_jlAnimationMouseDragged

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
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loading("Sahil").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jlAnimation;
    private javax.swing.JLabel jlName;
    private javax.swing.JLabel jlQuote;
    // End of variables declaration//GEN-END:variables
    private int x,y;
}
