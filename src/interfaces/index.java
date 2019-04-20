package interfaces;

import internalFrames.framePrueba;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.awt.Image;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class index extends javax.swing.JFrame {
    
    ArrayList<frame> iFrames = new ArrayList<frame>();
    
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
        jMenuBar = new javax.swing.JMenuBar();
        jmHome = new javax.swing.JMenu();
        jmArboles = new javax.swing.JMenu();
        jmArbolesBinarios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Matematicas Computacionales");

        jDesktop.setBackground(new java.awt.Color(245, 245, 246));

        javax.swing.GroupLayout jDesktopLayout = new javax.swing.GroupLayout(jDesktop);
        jDesktop.setLayout(jDesktopLayout);
        jDesktopLayout.setHorizontalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        jDesktopLayout.setVerticalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
        );

        jMenuBar.setBackground(new java.awt.Color(40, 41, 45));
        jMenuBar.setBorder(null);

        jmHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu-white.png"))); // NOI18N
        jMenuBar.add(jmHome);

        jmArboles.setBackground(new java.awt.Color(0, 0, 0));
        jmArboles.setForeground(new java.awt.Color(255, 255, 255));
        jmArboles.setText("Menu");

        jmArbolesBinarios.setBackground(new java.awt.Color(255, 255, 255));
        jmArbolesBinarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jmArbolesBinarios.setText("ventana");
        jmArbolesBinarios.setContentAreaFilled(false);
        jmArbolesBinarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmArbolesBinariosActionPerformed(evt);
            }
        });
        jmArboles.add(jmArbolesBinarios);

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

    private void jmArbolesBinariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmArbolesBinariosActionPerformed
        showFrame(new frame(this.getX(), this.getY(), new framePrueba()));
    }//GEN-LAST:event_jmArbolesBinariosActionPerformed

    public void showFrame(frame iFrame){
        BasicInternalFrameUI bi = (BasicInternalFrameUI)iFrame.getUI();
        bi.setNorthPane(null);
        jDesktop.add(iFrame);
        iFrame.show(); 
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
    private javax.swing.JMenuItem jmArbolesBinarios;
    private javax.swing.JMenu jmHome;
    // End of variables declaration//GEN-END:variables
}
