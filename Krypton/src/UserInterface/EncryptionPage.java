/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import EventHandling.EventHandling;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.geom.RoundRectangle2D;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.Timer;
import javax.swing.filechooser.FileNameExtensionFilter;
import net.iharder.dnd.FileDrop;

/**
 *
 * @author gauravpunjabi
 */
public class EncryptionPage extends javax.swing.JFrame implements Constants{

    private int type;
    /**
     * Creates new form MainPage
     */
    public EncryptionPage() {
        initComponents();
        
        jlBlur.setVisible(false);
        jpSideBar.setLocation(-240,0);
        loadingPanel = new Encrypting();
        loadingTimer = new Timer(2600,new LoadingAction());
        loadingTimer.setRepeats(false);
        eventHandling = new EventHandling(this);
        sideBarTimer = new Timer(7,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                if(isSideBarOpen)
                    sideBarCloseAction();
                else
                    sideBarOpenAction();
            }
        });
        
        //Adding the File Droppable Component
        fileDrop = new FileDrop(this, new FileDrop.Listener() {
            @Override
            public void filesDropped(File[] files) {
                receivedFiles(files);
            }
        });
        
        //Setting the default txtfields./
        jtfKey2.setEnabled(false);
        jsKey2.setBackground(Color.gray);
        jlKey2.setEnabled(false);
        jtfKey3.setEnabled(false);
        jsKey3.setBackground(Color.gray);
        jlKey3.setEnabled(false);
        
        this.setLocationRelativeTo(null);
    }
    private void receivedFiles(File[] files) {
        this.selectedFile = files[0];
        this.jtfBrowse.setText(files[0].getAbsolutePath());
    }
    private void sideBarOpenAction()
    {
        jpSideBar.setLocation(jpSideBar.getLocation().x + 10,0);
        if(jpSideBar.getLocation().x == 0)
        {
            jlBlur.setVisible(true);
            sideBarTimer.stop();
            isSideBarOpen = true;
        }
    }
    private void sideBarCloseAction()
    {
        jpSideBar.setLocation(jpSideBar.getLocation().x - 10,0);
        if(jpSideBar.getLocation().x == -240)
        {
            jlBlur.setVisible(false);
            sideBarTimer.stop();
            isSideBarOpen = false;
        }
    }
    private class LoadingAction implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            loadingPanel.setVisible(false);
            setVisible(true);
            setLocation(loadingPanel.getLocation().x,loadingPanel.getLocation().y);
        }
    }
            
    private void close()
    {
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(new WindowEvent(this,WindowEvent.WINDOW_CLOSING));   
    }
    
    private void loadingAnimation(String title)
    {
        loadingTimer.start();
        loadingPanel.setTitle(title);
        this.setVisible(false);
        loadingPanel.setLocation(this.getLocation().x,this.getLocation().y);
        loadingPanel.setVisible(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jpSideBar = new javax.swing.JPanel()
        ;
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jlCompression = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jlSideBarClose = new javax.swing.JLabel();
        jlSideBar = new javax.swing.JLabel();
        jlBlur = new javax.swing.JLabel();
        jrbUnbreakable = new javax.swing.JCheckBox();
        jrbStrongest = new javax.swing.JCheckBox();
        jrbStrong = new javax.swing.JCheckBox();
        jrbSimple = new javax.swing.JCheckBox();
        jlKey1 = new javax.swing.JLabel();
        jtfKey1 = new javax.swing.JTextField();
        jsKey1 = new javax.swing.JSeparator();
        jlKey3 = new javax.swing.JLabel();
        jtfKey3 = new javax.swing.JTextField();
        jsKey3 = new javax.swing.JSeparator();
        jlKey2 = new javax.swing.JLabel();
        jtfKey2 = new javax.swing.JTextField();
        jsKey2 = new javax.swing.JSeparator();
        jtfBrowse = new javax.swing.JTextField();
        jsBrowse = new javax.swing.JSeparator();
        jbBrowse = new javax.swing.JButton();
        jbDecrypt = new javax.swing.JButton();
        jbEncrypt = new javax.swing.JButton();
        jlCross = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setShape(new RoundRectangle2D.Double(0,0,800,550,30,30));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(86, 61, 124));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(null);

        jpSideBar.setBackground(new java.awt.Color(255, 255, 255));
        jpSideBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Raleway", 1, 29)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(86, 61, 124));
        jLabel1.setText("Krypton");
        jpSideBar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(86, 61, 124));
        jpSideBar.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 310, -1));

        jLabel3.setBackground(new java.awt.Color(100, 64, 124));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("  DES (64  -  Bit)");
        jLabel3.setOpaque(true);
        jpSideBar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 75, 240, 52));

        jSeparator3.setBackground(new java.awt.Color(86, 61, 124));
        jpSideBar.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 310, -1));

        jlCompression.setBackground(new java.awt.Color(255, 255, 255));
        jlCompression.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlCompression.setForeground(new java.awt.Color(86, 61, 124));
        jlCompression.setText("  Compression");
        jlCompression.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlCompressionMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlCompressionMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlCompressionMouseEntered(evt);
            }
        });
        jpSideBar.add(jlCompression, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 125, 240, 52));

        jSeparator4.setBackground(new java.awt.Color(86, 61, 124));
        jpSideBar.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 310, -1));

        jSeparator5.setBackground(new java.awt.Color(86, 61, 124));
        jpSideBar.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 310, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(86, 61, 124));
        jLabel5.setText("Sign Out");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jpSideBar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 483, 240, 50));

        jSeparator6.setBackground(new java.awt.Color(86, 61, 124));
        jpSideBar.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 310, -1));

        jlSideBarClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/back.png"))); // NOI18N
        jlSideBarClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlSideBarCloseMouseClicked(evt);
            }
        });
        jpSideBar.add(jlSideBarClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 26, -1, -1));

        jPanel1.add(jpSideBar);
        jpSideBar.setBounds(0, 0, 240, 550);

        jlSideBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/krypton_2.png"))); // NOI18N
        jlSideBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlSideBarMouseClicked(evt);
            }
        });
        jPanel1.add(jlSideBar);
        jlSideBar.setBounds(10, 10, 32, 32);

        jlBlur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/BlurBackground.png"))); // NOI18N
        jPanel1.add(jlBlur);
        jlBlur.setBounds(0, 0, 800, 550);

        bg.add(jrbUnbreakable);
        jrbUnbreakable.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        jrbUnbreakable.setForeground(new java.awt.Color(236, 240, 241));
        jrbUnbreakable.setText("Unbreakable");
        jrbUnbreakable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/unchecked.png"))); // NOI18N
        jrbUnbreakable.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/checked.png"))); // NOI18N
        jrbUnbreakable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbUnbreakableActionPerformed(evt);
            }
        });
        jPanel1.add(jrbUnbreakable);
        jrbUnbreakable.setBounds(560, 60, 150, 29);

        bg.add(jrbStrongest);
        jrbStrongest.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        jrbStrongest.setForeground(new java.awt.Color(236, 240, 241));
        jrbStrongest.setText("Strongest DES");
        jrbStrongest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/unchecked.png"))); // NOI18N
        jrbStrongest.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/checked.png"))); // NOI18N
        jrbStrongest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbStrongestActionPerformed(evt);
            }
        });
        jPanel1.add(jrbStrongest);
        jrbStrongest.setBounds(380, 60, 150, 29);

        bg.add(jrbStrong);
        jrbStrong.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        jrbStrong.setForeground(new java.awt.Color(236, 240, 241));
        jrbStrong.setText("Strong DES");
        jrbStrong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/unchecked.png"))); // NOI18N
        jrbStrong.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/checked.png"))); // NOI18N
        jrbStrong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbStrongActionPerformed(evt);
            }
        });
        jPanel1.add(jrbStrong);
        jrbStrong.setBounds(230, 60, 130, 29);

        bg.add(jrbSimple);
        jrbSimple.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        jrbSimple.setForeground(new java.awt.Color(236, 240, 241));
        jrbSimple.setSelected(true);
        jrbSimple.setText("Simple DES");
        jrbSimple.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/unchecked.png"))); // NOI18N
        jrbSimple.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/checked.png"))); // NOI18N
        jrbSimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbSimpleActionPerformed(evt);
            }
        });
        jPanel1.add(jrbSimple);
        jrbSimple.setBounds(70, 60, 130, 29);

        jlKey1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlKey1.setForeground(new java.awt.Color(236, 240, 241));
        jlKey1.setText("Key 1 :");
        jPanel1.add(jlKey1);
        jlKey1.setBounds(80, 110, 58, 30);

        jtfKey1.setBackground(new java.awt.Color(86, 61, 124));
        jtfKey1.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        jtfKey1.setForeground(new java.awt.Color(236, 240, 241));
        jtfKey1.setText("Enter Key 1 : ");
        jtfKey1.setBorder(null);
        jtfKey1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfKey1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfKey1FocusLost(evt);
            }
        });
        jPanel1.add(jtfKey1);
        jtfKey1.setBounds(80, 150, 620, 40);

        jsKey1.setBackground(new java.awt.Color(236, 240, 241));
        jsKey1.setForeground(new java.awt.Color(236, 240, 241));
        jPanel1.add(jsKey1);
        jsKey1.setBounds(80, 190, 630, 12);

        jlKey3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlKey3.setForeground(new java.awt.Color(236, 240, 241));
        jlKey3.setText("Key 3 :");
        jPanel1.add(jlKey3);
        jlKey3.setBounds(80, 310, 58, 30);

        jtfKey3.setBackground(new java.awt.Color(86, 61, 124));
        jtfKey3.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        jtfKey3.setForeground(new java.awt.Color(236, 240, 241));
        jtfKey3.setText("Enter Key 3 : ");
        jtfKey3.setBorder(null);
        jtfKey3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfKey3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfKey3FocusLost(evt);
            }
        });
        jPanel1.add(jtfKey3);
        jtfKey3.setBounds(80, 350, 620, 40);

        jsKey3.setBackground(new java.awt.Color(236, 240, 241));
        jsKey3.setForeground(new java.awt.Color(236, 240, 241));
        jPanel1.add(jsKey3);
        jsKey3.setBounds(80, 390, 630, 12);

        jlKey2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlKey2.setForeground(new java.awt.Color(236, 240, 241));
        jlKey2.setText("Key 2 :");
        jPanel1.add(jlKey2);
        jlKey2.setBounds(80, 210, 58, 30);

        jtfKey2.setBackground(new java.awt.Color(86, 61, 124));
        jtfKey2.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        jtfKey2.setForeground(new java.awt.Color(236, 240, 241));
        jtfKey2.setText("Enter Key 2 : ");
        jtfKey2.setBorder(null);
        jtfKey2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfKey2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfKey2FocusLost(evt);
            }
        });
        jPanel1.add(jtfKey2);
        jtfKey2.setBounds(80, 250, 620, 40);

        jsKey2.setBackground(new java.awt.Color(236, 240, 241));
        jsKey2.setForeground(new java.awt.Color(236, 240, 241));
        jPanel1.add(jsKey2);
        jsKey2.setBounds(80, 290, 630, 12);

        jtfBrowse.setBackground(new java.awt.Color(86, 61, 124));
        jtfBrowse.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        jtfBrowse.setForeground(new java.awt.Color(236, 240, 241));
        jtfBrowse.setText("C:/Users/Desktop/Somefile/Krypton/Des.krypt");
        jtfBrowse.setBorder(null);
        jtfBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBrowseActionPerformed(evt);
            }
        });
        jPanel1.add(jtfBrowse);
        jtfBrowse.setBounds(80, 420, 490, 40);

        jsBrowse.setBackground(new java.awt.Color(236, 240, 241));
        jsBrowse.setForeground(new java.awt.Color(236, 240, 241));
        jPanel1.add(jsBrowse);
        jsBrowse.setBounds(80, 460, 500, 20);

        jbBrowse.setBackground(new java.awt.Color(86, 61, 124));
        jbBrowse.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jbBrowse.setForeground(new java.awt.Color(236, 240, 241));
        jbBrowse.setText("Browse");
        jbBrowse.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jbBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBrowseActionPerformed(evt);
            }
        });
        jPanel1.add(jbBrowse);
        jbBrowse.setBounds(600, 420, 110, 40);

        jbDecrypt.setBackground(new java.awt.Color(86, 61, 124));
        jbDecrypt.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jbDecrypt.setForeground(new java.awt.Color(236, 240, 241));
        jbDecrypt.setText("Decrypt");
        jbDecrypt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jbDecrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDecryptActionPerformed(evt);
            }
        });
        jPanel1.add(jbDecrypt);
        jbDecrypt.setBounds(600, 490, 110, 40);

        jbEncrypt.setBackground(new java.awt.Color(86, 61, 124));
        jbEncrypt.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jbEncrypt.setForeground(new java.awt.Color(236, 240, 241));
        jbEncrypt.setText("Encrypt");
        jbEncrypt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jbEncrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEncryptActionPerformed(evt);
            }
        });
        jPanel1.add(jbEncrypt);
        jbEncrypt.setBounds(470, 490, 110, 40);

        jlCross.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/cancel.png"))); // NOI18N
        jlCross.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlCrossMouseClicked(evt);
            }
        });
        jPanel1.add(jlCross);
        jlCross.setBounds(756, 10, 32, 32);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBrowseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfBrowseActionPerformed

    private void jlCrossMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCrossMouseClicked
        close();
    }//GEN-LAST:event_jlCrossMouseClicked

    private void jrbSimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbSimpleActionPerformed
         jtfKey2.setEnabled(false);
        jsKey2.setBackground(Color.gray);
        jlKey2.setEnabled(false);
        jtfKey3.setEnabled(false);
        jsKey3.setBackground(Color.gray);
        jlKey3.setEnabled(false);
        this.type = 1;
    }//GEN-LAST:event_jrbSimpleActionPerformed

    private void jrbStrongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbStrongActionPerformed
        jlKey2.setEnabled(true);
        jtfKey2.setEnabled(true);
        jsKey2.setBackground(Color.white);
        jlKey3.setEnabled(false);
        jtfKey3.setEnabled(false);
        jsKey3.setBackground(Color.gray);
        this.type = 2;
    }//GEN-LAST:event_jrbStrongActionPerformed

    private void jrbStrongestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbStrongestActionPerformed
        jlKey2.setEnabled(true);
        jtfKey2.setEnabled(true);
        jsKey2.setBackground(Color.white);
        jlKey3.setEnabled(true);
        jtfKey3.setEnabled(true);
        jsKey3.setBackground(Color.white);
        this.type = 3;
    }//GEN-LAST:event_jrbStrongestActionPerformed

    private void jrbUnbreakableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbUnbreakableActionPerformed
        jlKey2.setEnabled(true);
        jtfKey2.setEnabled(true);
        jsKey2.setBackground(Color.white);
        jlKey3.setEnabled(true);
        jtfKey3.setEnabled(true);
        jsKey3.setBackground(Color.white);
        this.type = 4;
    }//GEN-LAST:event_jrbUnbreakableActionPerformed

    private void jtfKey1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfKey1FocusGained
        if(jtfKey1.getText().equals(KEY1_TEXT_FIELD_PLACEHOLDER))
            jtfKey1.setText("");
    }//GEN-LAST:event_jtfKey1FocusGained

    private void jtfKey2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfKey2FocusGained
        if(jtfKey2.getText().equals(KEY2_TEXT_FIELD_PLACEHOLDER))
            jtfKey2.setText("");
    }//GEN-LAST:event_jtfKey2FocusGained

    private void jtfKey3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfKey3FocusGained
        if(jtfKey3.getText().equals(KEY3_TEXT_FIELD_PLACEHOLDER))
            jtfKey3.setText("");
    }//GEN-LAST:event_jtfKey3FocusGained

    private void jtfKey1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfKey1FocusLost
        if(jtfKey1.getText().length() == 0)
            jtfKey1.setText(KEY1_TEXT_FIELD_PLACEHOLDER);
    }//GEN-LAST:event_jtfKey1FocusLost

    private void jtfKey2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfKey2FocusLost
        if(jtfKey2.getText().length() == 0)
            jtfKey2.setText(KEY2_TEXT_FIELD_PLACEHOLDER);
    }//GEN-LAST:event_jtfKey2FocusLost

    private void jtfKey3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfKey3FocusLost
        if(jtfKey3.getText().length() == 0)
            jtfKey3.setText(KEY3_TEXT_FIELD_PLACEHOLDER);
    }//GEN-LAST:event_jtfKey3FocusLost

    private void jbEncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEncryptActionPerformed
        this.eventHandling.encrypt(this.selectedFile);
        if(this.type == 2) {
            this.eventHandling.encrypt(this.selectedFile);
        }
        else if(this.type == 3) {
            this.eventHandling.encrypt(this.selectedFile);
        }
        else if(this.type == 4) {
            this.eventHandling.encrypt(this.selectedFile);
        }
        loadingAnimation(ENCRYPT);
    }//GEN-LAST:event_jbEncryptActionPerformed

    private void jbDecryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDecryptActionPerformed
        loadingAnimation(DECRYPT);
        if(this.type == 2) {
            this.eventHandling.decrypt(this.selectedFile);
        }
        else if(this.type == 3) {
            this.eventHandling.decrypt(this.selectedFile);
        }
        else if(this.type == 4) {
            this.eventHandling.decrypt(this.selectedFile);
        }
        this.eventHandling.decrypt(this.selectedFile);
    }//GEN-LAST:event_jbDecryptActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked

    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        this.setLocation(evt.getXOnScreen()-x,evt.getYOnScreen()-y);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jbBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBrowseActionPerformed
        JFileChooser jfc = new JFileChooser();
        jfc.addChoosableFileFilter(new FileNameExtensionFilter(null,"txt"));
        jfc.showOpenDialog(this);
        File selectedFile = jfc.getSelectedFile();
        if(selectedFile != null) {
            jtfBrowse.setText(selectedFile.getAbsolutePath());
        }
    }//GEN-LAST:event_jbBrowseActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jlSideBarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSideBarMouseClicked
        sideBarTimer.start();
    }//GEN-LAST:event_jlSideBarMouseClicked

    private void jlSideBarCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSideBarCloseMouseClicked
        // TODO add your handling code here:
        sideBarTimer.start();
    }//GEN-LAST:event_jlSideBarCloseMouseClicked

    private void jlCompressionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCompressionMouseEntered
        jlCompression.setOpaque(true);
        jlCompression.setBackground(new Color(86,61,124));
        jlCompression.setForeground(Color.white);
    }//GEN-LAST:event_jlCompressionMouseEntered

    private void jlCompressionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCompressionMousePressed
        CompressionPage compression = new CompressionPage();
        compression.setLocation(this.getX(),this.getY());
        compression.setVisible(true);
        WindowEvent we = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(we);
    }//GEN-LAST:event_jlCompressionMousePressed

    private void jlCompressionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCompressionMouseExited
        jlCompression.setOpaque(false);
        jlCompression.setBackground(Color.white);
        jlCompression.setForeground(new Color(86,61,124));
    }//GEN-LAST:event_jlCompressionMouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        Login login = new Login();
        close();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel5MouseClicked

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
                if ("Macintosh".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EncryptionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EncryptionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EncryptionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EncryptionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EncryptionPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JButton jbBrowse;
    private javax.swing.JButton jbDecrypt;
    private javax.swing.JButton jbEncrypt;
    private javax.swing.JLabel jlBlur;
    private javax.swing.JLabel jlCompression;
    private javax.swing.JLabel jlCross;
    private javax.swing.JLabel jlKey1;
    private javax.swing.JLabel jlKey2;
    private javax.swing.JLabel jlKey3;
    private javax.swing.JLabel jlSideBar;
    private javax.swing.JLabel jlSideBarClose;
    private javax.swing.JPanel jpSideBar;
    private javax.swing.JCheckBox jrbSimple;
    private javax.swing.JCheckBox jrbStrong;
    private javax.swing.JCheckBox jrbStrongest;
    private javax.swing.JCheckBox jrbUnbreakable;
    private javax.swing.JSeparator jsBrowse;
    private javax.swing.JSeparator jsKey1;
    private javax.swing.JSeparator jsKey2;
    private javax.swing.JSeparator jsKey3;
    private javax.swing.JTextField jtfBrowse;
    private javax.swing.JTextField jtfKey1;
    private javax.swing.JTextField jtfKey2;
    private javax.swing.JTextField jtfKey3;
    // End of variables declaration//GEN-END:variables
    private int selectedCategory = SIMPLE;
    private Timer loadingTimer,sideBarTimer = null;
    private Encrypting loadingPanel = null;
    private int x,y;
    private EventHandling eventHandling = null;
    private boolean isSideBarOpen = false;
    private FileDrop fileDrop = null;
    private File selectedFile = null;
}