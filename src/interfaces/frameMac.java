package interfaces;

import java.awt.Frame;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class frameMac extends javax.swing.JInternalFrame {
    
    int desktopX, desktopY;
    JInternalFrame iFrame;
    
    public frameMac(int x, int y, JInternalFrame iFrame) {
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
        jLabel1 = new javax.swing.JLabel();
        contentFrame = new javax.swing.JDesktopPane();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Prueba ");

        pnlBarTitle.setBackground(new java.awt.Color(41, 44, 52));
        pnlBarTitle.setMaximumSize(new java.awt.Dimension(32767, 20));
        pnlBarTitle.setMinimumSize(new java.awt.Dimension(10, 20));
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

        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Title");

        btnClose.setBackground(new java.awt.Color(41, 44, 52));
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close-macos.png"))); // NOI18N
        btnClose.setBorderPainted(false);
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.setFocusPainted(false);
        btnClose.setFocusable(false);
        btnClose.setRequestFocusEnabled(false);
        btnClose.setRolloverEnabled(false);
        btnClose.setVerifyInputWhenFocusTarget(false);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnMaximize.setBackground(new java.awt.Color(41, 44, 52));
        btnMaximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/maximize-macos.png"))); // NOI18N
        btnMaximize.setBorderPainted(false);
        btnMaximize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMaximize.setFocusPainted(false);
        btnMaximize.setFocusable(false);
        btnMaximize.setRequestFocusEnabled(false);
        btnMaximize.setRolloverEnabled(false);
        btnMaximize.setVerifyInputWhenFocusTarget(false);
        btnMaximize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaximizeActionPerformed(evt);
            }
        });

        btnMinimize.setBackground(new java.awt.Color(41, 44, 52));
        btnMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minimize-macos.png"))); // NOI18N
        btnMinimize.setBorderPainted(false);
        btnMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimize.setFocusPainted(false);
        btnMinimize.setFocusable(false);
        btnMinimize.setRequestFocusEnabled(false);
        btnMinimize.setRolloverEnabled(false);
        btnMinimize.setVerifyInputWhenFocusTarget(false);
        btnMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizeActionPerformed(evt);
            }
        });

        jLabel1.setText(".");

        javax.swing.GroupLayout pnlBarTitleLayout = new javax.swing.GroupLayout(pnlBarTitle);
        pnlBarTitle.setLayout(pnlBarTitleLayout);
        pnlBarTitleLayout.setHorizontalGroup(
            pnlBarTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBarTitleLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnMaximize, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        pnlBarTitleLayout.setVerticalGroup(
            pnlBarTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addGroup(pnlBarTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClose, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMaximize, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMinimize, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contentFrameLayout = new javax.swing.GroupLayout(contentFrame);
        contentFrame.setLayout(contentFrameLayout);
        contentFrameLayout.setHorizontalGroup(
            contentFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );
        contentFrameLayout.setVerticalGroup(
            contentFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 314, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentFrame)
            .addComponent(pnlBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBarTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(contentFrame))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizeActionPerformed
        try {
            this.setIcon(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frameMac.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMinimizeActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnMaximizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaximizeActionPerformed
        try {
            this.setMaximum(!this.isMaximum);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frameMac.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlBarTitle;
    // End of variables declaration//GEN-END:variables
}
