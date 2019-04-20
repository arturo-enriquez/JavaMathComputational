package internalFrames;

import arbolBinario.SimuladorArbolBinario;
import internalFrames.*;
import java.awt.BorderLayout;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import math.Numericals;

public class ArbolBinario extends javax.swing.JInternalFrame {
    
    Numericals num = new Numericals();

    SimuladorArbolBinario simulador = new SimuladorArbolBinario();
    ArrayList<Integer> nodos = new ArrayList<Integer>();
    
    public ArbolBinario() {
        initComponents();
                
        BasicInternalFrameUI bi = (BasicInternalFrameUI)ifArbol.getUI();
        bi.setNorthPane(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollArbol = new javax.swing.JScrollPane();
        jDesktop = new javax.swing.JDesktopPane();
        ifArbol = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtInsertar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtInOrden = new javax.swing.JTextField();
        txtPreOrden = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPostOrden = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnDeshacer = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setTitle("Arboles Binarios (Construcción y Recorridos) ");
        setFocusCycleRoot(false);
        setMinimumSize(new java.awt.Dimension(400, 27));
        setName(""); // NOI18N

        scrollArbol.setBackground(new java.awt.Color(204, 204, 204));
        scrollArbol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 228, 232)));
        scrollArbol.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollArbol.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jDesktop.setBackground(new java.awt.Color(255, 255, 255));

        ifArbol.setBackground(new java.awt.Color(255, 255, 255));
        ifArbol.setBorder(null);
        ifArbol.setVisible(true);

        javax.swing.GroupLayout ifArbolLayout = new javax.swing.GroupLayout(ifArbol.getContentPane());
        ifArbol.getContentPane().setLayout(ifArbolLayout);
        ifArbolLayout.setHorizontalGroup(
            ifArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 491, Short.MAX_VALUE)
        );
        ifArbolLayout.setVerticalGroup(
            ifArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 347, Short.MAX_VALUE)
        );

        jDesktop.setLayer(ifArbol, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopLayout = new javax.swing.GroupLayout(jDesktop);
        jDesktop.setLayout(jDesktopLayout);
        jDesktopLayout.setHorizontalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ifArbol)
        );
        jDesktopLayout.setVerticalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ifArbol)
        );

        scrollArbol.setViewportView(jDesktop);

        jPanel1.setBackground(new java.awt.Color(246, 247, 249));
        jPanel1.setMaximumSize(new java.awt.Dimension(32767, 350));

        jLabel1.setText("Insertar:");

        txtInsertar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtInsertar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 228, 232)));
        txtInsertar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtInsertarKeyPressed(evt);
            }
        });

        jLabel3.setText("InOrden:");

        txtInOrden.setEditable(false);
        txtInOrden.setBackground(new java.awt.Color(255, 255, 255));
        txtInOrden.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtInOrden.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 228, 232)));

        txtPreOrden.setEditable(false);
        txtPreOrden.setBackground(new java.awt.Color(255, 255, 255));
        txtPreOrden.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPreOrden.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 228, 232)));

        jLabel4.setText("PreOrden:");

        txtPostOrden.setEditable(false);
        txtPostOrden.setBackground(new java.awt.Color(255, 255, 255));
        txtPostOrden.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPostOrden.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 228, 232)));

        jLabel5.setText("PostOrden");

        btnDeshacer.setBackground(new java.awt.Color(80, 160, 245));
        btnDeshacer.setForeground(new java.awt.Color(255, 255, 255));
        btnDeshacer.setText("Deshacer");
        btnDeshacer.setBorder(null);
        btnDeshacer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeshacer.setFocusPainted(false);
        btnDeshacer.setFocusable(false);
        btnDeshacer.setRequestFocusEnabled(false);
        btnDeshacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeshacerActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(80, 160, 245));
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(null);
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.setFocusPainted(false);
        btnLimpiar.setFocusable(false);
        btnLimpiar.setRequestFocusEnabled(false);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtInsertar)
                    .addComponent(txtInOrden, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPreOrden, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPostOrden, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDeshacer, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(btnDeshacer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPreOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPostOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Representación gráfica:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(scrollArbol))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollArbol)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtInsertarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInsertarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (num.isNumeric(txtInsertar.getText())) {
                int dato = Integer.parseInt(txtInsertar.getText());
                if (this.simulador.insertar(dato)) {
                    this.nodos.add(dato);
                    complementos();
                    recorridos();
                    txtInsertar.setText("");
                }
            }  else {
                JOptionPane.showMessageDialog(null, "Tipo de dato no valido: \n"+txtInsertar.getText(), "Intenta de nuevo...", 0);
            }
        }
    }//GEN-LAST:event_txtInsertarKeyPressed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
        this.nodos.clear();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnDeshacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeshacerActionPerformed
        deshacer();
    }//GEN-LAST:event_btnDeshacerActionPerformed

    
    public void recorridos(){
        this.txtInOrden.setText(this.simulador.inOrden());
        this.txtPreOrden.setText(this.simulador.preOrden());
        this.txtPostOrden.setText(this.simulador.postOrden());
    }
    
    public void limpiar(){
        this.jDesktop.removeAll();
        this.jDesktop.repaint();
        this.simulador = new SimuladorArbolBinario();
        
        this.txtInOrden.setText("");
        this.txtPreOrden.setText("");
        this.txtPostOrden.setText("");
    }
    
    public void deshacer(){
        if (nodos.size() > 0) {
            limpiar();
            nodos.remove(nodos.size()-1);
            for (int i = 0; i < nodos.size(); i++) {
                if (this.simulador.insertar(nodos.get(i))) {
                    complementos();
                    recorridos();
                }
            }
        }
    }
    
    public void complementos(){
        this.repintarArbol();
    }
    
    private void repintarArbol() {
        this.jDesktop.removeAll();
        Rectangle size = this.ifArbol.getBounds();
        this.ifArbol = null;
        this.ifArbol = new JInternalFrame("Representación gráfica", true);
        
        BasicInternalFrameUI bi = (BasicInternalFrameUI)ifArbol.getUI();
        bi.setNorthPane(null);
        ifArbol.setBorder(null);
        
        this.jDesktop.add(this.ifArbol, JLayeredPane.DEFAULT_LAYER);
        this.ifArbol.setVisible(true);
        this.ifArbol.setBounds(size);
        this.ifArbol.setEnabled(false);
        this.ifArbol.add(this.simulador.getDibujo(), BorderLayout.CENTER);
        
        try {
            this.ifArbol.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(ArbolBinario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeshacer;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JInternalFrame ifArbol;
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane scrollArbol;
    private javax.swing.JTextField txtInOrden;
    private javax.swing.JTextField txtInsertar;
    private javax.swing.JTextField txtPostOrden;
    private javax.swing.JTextField txtPreOrden;
    // End of variables declaration//GEN-END:variables
}
