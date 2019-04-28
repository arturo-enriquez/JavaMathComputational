package internalFrames;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import math.Binaries;
import math.Numericals;

public class Numericos extends javax.swing.JInternalFrame {
    
    Numericals num = new Numericals();
    Binaries bin = new Binaries();
    
    public Numericos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtDec = new javax.swing.JTextField();
        txtHex = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtOctal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtBinario = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setTitle("Conversiones Numericas");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Conversiones Numéricas");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(143, 145, 154));
        jLabel2.setText("Nota: Presiona enter al ingresar un valor.");

        jSeparator1.setForeground(new java.awt.Color(225, 228, 232));

        jLabel3.setText("Decimal");

        txtDec.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDec.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 228, 232)));
        txtDec.setMinimumSize(new java.awt.Dimension(400, 39));
        txtDec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDecKeyPressed(evt);
            }
        });

        txtHex.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHex.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 228, 232)));
        txtHex.setMinimumSize(new java.awt.Dimension(400, 39));
        txtHex.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHexKeyPressed(evt);
            }
        });

        jLabel4.setText("Hex");

        jLabel5.setText("Octal");

        txtOctal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOctal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 228, 232)));
        txtOctal.setMinimumSize(new java.awt.Dimension(400, 39));
        txtOctal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOctalKeyPressed(evt);
            }
        });

        jLabel6.setText("Binario");

        txtBinario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBinario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 228, 232)));
        txtBinario.setMinimumSize(new java.awt.Dimension(400, 39));
        txtBinario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBinarioKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtHex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOctal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBinario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(0, 242, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDec, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHex, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtOctal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBinario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDecKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDecKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            verify(txtDec.getText());
        }
    }//GEN-LAST:event_txtDecKeyPressed

    private void txtHexKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHexKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (num.isHexNumber(txtHex.getText())) {
                String dec = num.hexToDec(txtHex.getText());
                verify(dec);
            } else {
                JOptionPane.showMessageDialog(null, "Tipo de dato no valido: \n"+txtHex.getText(), "Intenta de nuevo...", 0);
            }
        }
    }//GEN-LAST:event_txtHexKeyPressed

    private void txtOctalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOctalKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (num.isNumeric(txtOctal.getText())) {
                String dec = String.valueOf(num.octalToDec(Integer.parseInt(txtOctal.getText())));
                verify(dec);
            } else {
                JOptionPane.showMessageDialog(null, "Tipo de dato no valido: \n"+txtOctal.getText(), "Intenta de nuevo...", 0);
            }
        }
    }//GEN-LAST:event_txtOctalKeyPressed

    private void txtBinarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBinarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (bin.isBinary(txtBinario.getText())) {
                String dec = String.valueOf(bin.binaryToDec(txtBinario.getText()));
                verify(dec);   
            } else {
                JOptionPane.showMessageDialog(null, "Tipo de dato no valido: \n"+txtBinario.getText(), "Intenta de nuevo...", 0);
            }
        }
    }//GEN-LAST:event_txtBinarioKeyPressed

    public void verify(String decimal) {
        if (num.isNumeric(decimal)) {
            int dec = Integer.parseInt(decimal);
            setVales(dec);
        } else {
            JOptionPane.showMessageDialog(null, "Tipo de dato no valido: \n"+decimal, "Intenta de nuevo...", 0);
        }
    }
    
    public void setVales(int decimal){
        // decimal 
        txtDec.setText(String.valueOf(decimal));
        // hex
        txtHex.setText(num.decToHex(decimal));
        // octal
        txtOctal.setText(num.decToOctal(decimal));
        // binario
        txtBinario.setText(bin.decToBinary(decimal));
    }
    
    public void clean() {
        txtDec.setText("");
        // hex
        txtHex.setText("");
        // octal
        txtOctal.setText("");
        // binario
        txtBinario.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtBinario;
    private javax.swing.JTextField txtDec;
    private javax.swing.JTextField txtHex;
    private javax.swing.JTextField txtOctal;
    // End of variables declaration//GEN-END:variables
}
