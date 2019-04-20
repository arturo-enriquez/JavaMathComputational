package interfaces;

import internalFrames.framePrueba;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.awt.Image;
import java.awt.Graphics;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;

public class index extends javax.swing.JFrame {
    
    ArrayList<frameMac> iFrames = new ArrayList<frameMac>();
    
    public index() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        String background = "/img/background0.jpg";
        ImageIcon icon = new ImageIcon(getClass().getResource(background));
        Image image = icon.getImage();
        jDesktop = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g) {
                g.drawImage(image, 0,0,getWidth(),getHeight(),this);
            }
        };
        lblTrash = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jmHome = new javax.swing.JMenu();
        jmArboles = new javax.swing.JMenu();
        jmFramePrueba = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Matematicas Computacionales");

        jDesktop.setBackground(new java.awt.Color(245, 245, 246));

        lblTrash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trash-emty.png"))); // NOI18N
        lblTrash.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTrash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTrashMouseClicked(evt);
            }
        });

        jDesktop.setLayer(lblTrash, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopLayout = new javax.swing.GroupLayout(jDesktop);
        jDesktop.setLayout(jDesktopLayout);
        jDesktopLayout.setHorizontalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopLayout.createSequentialGroup()
                .addContainerGap(772, Short.MAX_VALUE)
                .addComponent(lblTrash)
                .addGap(20, 20, 20))
        );
        jDesktopLayout.setVerticalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopLayout.createSequentialGroup()
                .addContainerGap(442, Short.MAX_VALUE)
                .addComponent(lblTrash)
                .addGap(20, 20, 20))
        );

        jMenuBar.setBackground(new java.awt.Color(41, 44, 52));
        jMenuBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jmHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/apple.png"))); // NOI18N
        jMenuBar.add(jmHome);

        jmArboles.setBackground(new java.awt.Color(0, 0, 0));
        jmArboles.setForeground(new java.awt.Color(255, 255, 255));
        jmArboles.setText("Menu");

        jmFramePrueba.setBackground(new java.awt.Color(255, 255, 255));
        jmFramePrueba.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jmFramePrueba.setText("ventana");
        jmFramePrueba.setContentAreaFilled(false);
        jmFramePrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFramePruebaActionPerformed(evt);
            }
        });
        jmArboles.add(jmFramePrueba);

        jMenuBar.add(jmArboles);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmFramePruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFramePruebaActionPerformed
        showFrame(new frameMac(this.getX(), this.getY(), new framePrueba()));
    }//GEN-LAST:event_jmFramePruebaActionPerformed

    private void lblTrashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTrashMouseClicked
        for (int i = 0; i < iFrames.size(); i++) {
            this.jDesktop.remove(iFrames.get(i));
        }
        this.jDesktop.repaint();
        iFrames.clear();
        lblTrash.setIcon(new ImageIcon(this.getClass().getResource("/img/trash-emty.png")));
    }//GEN-LAST:event_lblTrashMouseClicked

    public boolean showFrame(frameMac iFrame){
        for (int i = 0; i < iFrames.size(); i++) {
            if (iFrames.get(i).getTitle() == iFrame.getTitle()) {
                iFrames.get(i).toFront();
                iFrames.get(i).requestFocus();
                try {
                    iFrames.get(i).setIcon(false);
                } catch (PropertyVetoException ex) {
                    Logger.getLogger(frameWin.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (iFrames.get(i).isVisible() == false) {
                    iFrames.remove(iFrames.get(i));
                } else {
                    return false;
                }
            }
        }
        BasicInternalFrameUI bi = (BasicInternalFrameUI)iFrame.getUI();
        bi.setNorthPane(null);
        iFrames.add(iFrame);
        lblTrash.setIcon(new ImageIcon(this.getClass().getResource("/img/trash-full.png")));
        jDesktop.add(iFrame);
        iFrame.show();
        return true;
    }
    
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
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jmArboles;
    private javax.swing.JMenuItem jmFramePrueba;
    private javax.swing.JMenu jmHome;
    private javax.swing.JLabel lblTrash;
    // End of variables declaration//GEN-END:variables
}
