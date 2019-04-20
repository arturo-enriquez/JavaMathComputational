package interfaces;

import java.awt.Frame;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class frameWin extends javax.swing.JInternalFrame {
    
    int desktopX, desktopY;
    JInternalFrame iFrame;
    
    public frameWin(int x, int y, JInternalFrame iFrame) {
        initComponents();
        desktopX = x;
        desktopY = y;
        this.setLocation(20, 20);
        this.iFrame = iFrame;
        
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.iFrame.getUI();
        bi.setNorthPane(null);
        
        this.setTitle(iFrame.getTitle());
        lblTitle.setText(this.getTitle());
        this.setSize(iFrame.getWidth(), iFrame.getHeight());
        
        contentFrame.add(iFrame);
        iFrame.show();
        try {
        iFrame.setMaximum(true);
        } catch (PropertyVetoException e) {
        }
    }
    
    public void setLocationDesktop(int x, int y){
        desktopX = x;
        desktopY = y;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBarTitle = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        btnMaximize = new javax.swing.JButton();
        btnMinimize = new javax.swing.JButton();
        contentFrame = new javax.swing.JDesktopPane();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 228, 232)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Prueba ");

        pnlBarTitle.setBackground(new java.awt.Color(255, 255, 255));
        pnlBarTitle.setMaximumSize(new java.awt.Dimension(32767, 32));
        pnlBarTitle.setMinimumSize(new java.awt.Dimension(10, 100));
        pnlBarTitle.setPreferredSize(new java.awt.Dimension(0, 32));
        pnlBarTitle.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlBarTitleMouseDragged(evt);
            }
        });
        pnlBarTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlBarTitleMousePressed(evt);
            }
        });

        lblTitle.setText("Title");

        btnClose.setBackground(new java.awt.Color(255, 255, 255));
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close.png"))); // NOI18N
        btnClose.setBorderPainted(false);
        btnClose.setFocusPainted(false);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnMaximize.setBackground(new java.awt.Color(255, 255, 255));
        btnMaximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/maximize-circle.png"))); // NOI18N
        btnMaximize.setBorderPainted(false);
        btnMaximize.setFocusPainted(false);
        btnMaximize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaximizeActionPerformed(evt);
            }
        });

        btnMinimize.setBackground(new java.awt.Color(255, 255, 255));
        btnMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minimize.png"))); // NOI18N
        btnMinimize.setBorderPainted(false);
        btnMinimize.setFocusPainted(false);
        btnMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBarTitleLayout = new javax.swing.GroupLayout(pnlBarTitle);
        pnlBarTitle.setLayout(pnlBarTitleLayout);
        pnlBarTitleLayout.setHorizontalGroup(
            pnlBarTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBarTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 452, Short.MAX_VALUE)
                .addComponent(btnMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnMaximize, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlBarTitleLayout.setVerticalGroup(
            pnlBarTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlBarTitleLayout.createSequentialGroup()
                .addGroup(pnlBarTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClose)
                    .addComponent(btnMaximize)
                    .addComponent(btnMinimize))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contentFrameLayout = new javax.swing.GroupLayout(contentFrame);
        contentFrame.setLayout(contentFrameLayout);
        contentFrameLayout.setHorizontalGroup(
            contentFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentFrameLayout.setVerticalGroup(
            contentFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 314, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
            .addComponent(contentFrame)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBarTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(contentFrame))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizeActionPerformed
        try {
            this.setIcon(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frameWin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMinimizeActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnMaximizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaximizeActionPerformed
        try {
            this.setMaximum(!this.isMaximum);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frameWin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMaximizeActionPerformed

    
    // Move windows
    int xx, xy, xw;
    private void pnlBarTitleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBarTitleMousePressed
        xx = desktopX;
        xy = desktopY;
    }//GEN-LAST:event_pnlBarTitleMousePressed
    private void pnlBarTitleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBarTitleMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx-(this.getWidth()/2), y-xy-60);
    }//GEN-LAST:event_pnlBarTitleMouseDragged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnMaximize;
    private javax.swing.JButton btnMinimize;
    private javax.swing.JDesktopPane contentFrame;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlBarTitle;
    // End of variables declaration//GEN-END:variables
}
