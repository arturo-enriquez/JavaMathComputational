package internalFrames;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.border.MatteBorder;
import math.Binaries;

public class SumaRestaBinario extends javax.swing.JInternalFrame {
    
    Binaries bin = new Binaries();
    
    public SumaRestaBinario() {
        initComponents();
        
        txtNum1.setBorder( new MatteBorder(0, 0, 0, 2, Color.black));
        txtNum2.setBorder( new MatteBorder(0, 0, 0, 2, Color.black));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtDec1 = new javax.swing.JTextField();
        txtDec2 = new javax.swing.JTextField();
        txtDecRes = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtAcarreo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        lblOperacion = new javax.swing.JLabel();
        txtNum1 = new javax.swing.JTextField();
        txtRes = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtNum2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setTitle("Suma y Resta Binaria");

        jPanel1.setBackground(new java.awt.Color(225, 228, 230));
        jPanel1.setToolTipText("");

        txtDec1.setEditable(false);
        txtDec1.setBackground(new java.awt.Color(225, 228, 230));
        txtDec1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtDec1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDec1.setBorder(null);

        txtDec2.setEditable(false);
        txtDec2.setBackground(new java.awt.Color(225, 228, 230));
        txtDec2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtDec2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDec2.setBorder(null);

        txtDecRes.setEditable(false);
        txtDecRes.setBackground(new java.awt.Color(225, 228, 230));
        txtDecRes.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtDecRes.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDecRes.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDec2, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(txtDecRes)
                    .addComponent(txtDec1))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(txtDec1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDec2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(txtDecRes, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Suma y Resta de Binaria");

        txtAcarreo.setEditable(false);
        txtAcarreo.setBackground(new java.awt.Color(255, 255, 255));
        txtAcarreo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtAcarreo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtAcarreo.setBorder(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lblOperacion.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        lblOperacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOperacion.setText("+");
        lblOperacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblOperacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOperacionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 51, Short.MAX_VALUE)
                .addComponent(lblOperacion))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addComponent(lblOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtNum1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtNum1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNum1.setBorder(null);
        txtNum1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNum1KeyPressed(evt);
            }
        });

        txtRes.setEditable(false);
        txtRes.setBackground(new java.awt.Color(255, 255, 255));
        txtRes.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtRes.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtRes.setBorder(null);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        txtNum2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtNum2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNum2.setBorder(null);
        txtNum2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNum2KeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(143, 145, 154));
        jLabel1.setText("Nota: Presiona enter al ingresar los 2 valores. ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNum1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAcarreo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                            .addComponent(txtNum2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRes, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtAcarreo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtRes, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNum1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            operacion();
        }
    }//GEN-LAST:event_txtNum1KeyPressed

    private void lblOperacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOperacionMouseClicked
        if (lblOperacion.getText() == "+") {
            lblOperacion.setText("-");
            operacion();
        } else {
            lblOperacion.setText("+");
            operacion();
        }
    }//GEN-LAST:event_lblOperacionMouseClicked

    private void txtNum2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            operacion();
        }
    }//GEN-LAST:event_txtNum2KeyPressed

    public void operacion() {
        String bin1 = txtNum1.getText();
        String bin2 = txtNum2.getText();
        if (bin.isBinary(bin1) && bin.isBinary(bin2)) {
            if (lblOperacion.getText() == "+") {
                txtAcarreo.setText(sumAcarreo(bin1, bin2));
                txtRes.setText(bin.sumBinary(bin1, bin2));
                txtDec1.setText("= "+bin.binaryToDec(bin1));
                txtDec2.setText("= "+bin.binaryToDec(bin2));
                txtDecRes.setText("= "+bin.binaryToDec(txtRes.getText()));
            } else {
                if (bin.binaryToDec(bin1) < bin.binaryToDec(bin2)) {
                    JOptionPane.showMessageDialog(null, "No se puede restar un numero mayor", "Intenta de nuevo...", 0);
                } else {
                    txtAcarreo.setText("");
                    txtRes.setText(bin.subtractBinary(bin1, bin2));
                    txtDec1.setText("= "+bin.binaryToDec(bin1));
                    txtDec2.setText("= "+bin.binaryToDec(bin2));
                    txtDecRes.setText("= "+bin.binaryToDec(txtRes.getText()));
                }
            }
        } 
    }
 
    public String sumAcarreo(String bin1, String bin2) {
        String suma="", cadAcarreo=" ";
        byte bit1, bit2, bitSuma, bitSumaAcarreo, acarreo = 0, sumaAcarreo;
        int ciclo;
        if (bin1.length() > bin2.length()) {
            ciclo = bin1.length();
            bin2 = llenar(bin1.length(), bin2);
        } else {
            ciclo = bin2.length();
            bin1 = llenar(bin2.length(), bin1);
        }
        char[] b1 = bin1.toCharArray(), b2 = bin2.toCharArray();
        
        for (int i = ciclo-1; i >= 0; i--){
            bit1 = Byte.parseByte(String.valueOf(b1[i]));
            bit2 = Byte.parseByte(String.valueOf(b2[i]));
            
            sumaAcarreo = sumBits( acarreo, bit1)[1];
            suma = sumBits(sumaAcarreo, bit2)[1] + suma;
            
            if (sumBits(acarreo, bit1)[0] == 1) {
                acarreo = 1;
                cadAcarreo = "1"+cadAcarreo;
            } else {
                acarreo = sumBits(sumaAcarreo, bit2)[0];
            }
            if (i!=0) {
                cadAcarreo = (acarreo == 1) ? 1 + cadAcarreo : " " + cadAcarreo;
            }
        }
        suma = (acarreo==1) ? acarreo + suma : suma;
        
        return cadAcarreo;
    }
    public static byte[] sumBits(byte b1, byte b2){
        if (b1 == 0 && b2 == 0) return new byte[]{0,0};
        else if (b1 == 1 && b2 == 1) return new byte[]{1,0};
        return new byte[]{0,1};
    }
    
    public static String llenar(int lon,String cad){
        String res=cad;
        while(res.length() != lon) res = 0 + res;
        return res;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblOperacion;
    private javax.swing.JTextField txtAcarreo;
    private javax.swing.JTextField txtDec1;
    private javax.swing.JTextField txtDec2;
    private javax.swing.JTextField txtDecRes;
    private javax.swing.JTextField txtNum1;
    private javax.swing.JTextField txtNum2;
    private javax.swing.JTextField txtRes;
    // End of variables declaration//GEN-END:variables
}
