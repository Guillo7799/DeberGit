/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pryecuacioncuadratica.CapaInterfaz;

import java.awt.Color;
import pryecuacioncuadratica.CapaNegocio.Clsecuacion2;

/**
 *
 * @author Programacion Objetos
 */
public class WinCuadratica extends javax.swing.JFrame {

   float a,b,c,k;
   //correccion en este punto
   Clsecuacion2 p,q;
   int codigo,paso=0;
   public float rangoinicial,rangofinal,incremento;
   int contador=0;
   
    public WinCuadratica() {
        initComponents();
        this.getContentPane().setBackground(Color.gray);
        jTextTabla.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPantalla = new javax.swing.JTextField();
        btnCoeficientes = new javax.swing.JButton();
        btnSALIR = new javax.swing.JButton();
        btnLIMPIAR = new javax.swing.JButton();
        btnRaices = new javax.swing.JButton();
        btnEvaluar = new javax.swing.JButton();
        btnRango = new javax.swing.JButton();
        btnMas = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextTabla = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtPantalla.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txtPantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPantallaActionPerformed(evt);
            }
        });

        btnCoeficientes.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnCoeficientes.setText("Coef x^2");
        btnCoeficientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoeficientesActionPerformed(evt);
            }
        });

        btnSALIR.setBackground(new java.awt.Color(204, 0, 0));
        btnSALIR.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnSALIR.setText("SALIR");
        btnSALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSALIRActionPerformed(evt);
            }
        });

        btnLIMPIAR.setBackground(new java.awt.Color(0, 204, 0));
        btnLIMPIAR.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnLIMPIAR.setText("LIMPIAR");
        btnLIMPIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLIMPIARActionPerformed(evt);
            }
        });

        btnRaices.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnRaices.setText("Raices");
        btnRaices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaicesActionPerformed(evt);
            }
        });

        btnEvaluar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnEvaluar.setText("Evaluar k");
        btnEvaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvaluarActionPerformed(evt);
            }
        });

        btnRango.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnRango.setText("Rango");
        btnRango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRangoActionPerformed(evt);
            }
        });

        btnMas.setBackground(new java.awt.Color(255, 255, 102));
        btnMas.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnMas.setText("+");
        btnMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasActionPerformed(evt);
            }
        });

        btnMenos.setBackground(new java.awt.Color(255, 255, 102));
        btnMenos.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnMenos.setText("-");
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });

        btnIgual.setBackground(new java.awt.Color(153, 255, 255));
        btnIgual.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnIgual.setText("=");
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        jTextTabla.setColumns(20);
        jTextTabla.setRows(5);
        jScrollPane1.setViewportView(jTextTabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPantalla)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCoeficientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRaices, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEvaluar, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(btnMenos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRango, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(btnIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLIMPIAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSALIR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCoeficientes)
                    .addComponent(btnSALIR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLIMPIAR)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRaices)
                            .addComponent(btnEvaluar)
                            .addComponent(btnRango))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMas)
                            .addComponent(btnMenos)
                            .addComponent(btnIgual))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLIMPIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLIMPIARActionPerformed
        txtPantalla.setText("");
        txtPantalla.requestFocus();
        paso=0;
    }//GEN-LAST:event_btnLIMPIARActionPerformed

    private void btnCoeficientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoeficientesActionPerformed
        switch (paso){
            case 0:
                 a=Float.parseFloat(txtPantalla.getText());
                 paso=1;
                 btnCoeficientes.setText("Coef x");
                 txtPantalla.setText("");
                 break;
            case 1:
                b=Float.parseFloat(txtPantalla.getText());
                 paso=2;
                 btnCoeficientes.setText("Term ind");
                 txtPantalla.setText("");
                 break;
            case 2:
                c=Float.parseFloat(txtPantalla.getText());
                 paso=0;
                 btnCoeficientes.setText("Coef x^2");
                 q=new Clsecuacion2(a,b,c);
                 txtPantalla.setText(q.toString());
                 break;     
        }
        txtPantalla.requestFocus();
    }//GEN-LAST:event_btnCoeficientesActionPerformed

    private void btnRaicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaicesActionPerformed
        txtPantalla.setText(q.raices());
        txtPantalla.requestFocus();
    }//GEN-LAST:event_btnRaicesActionPerformed

    private void btnEvaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvaluarActionPerformed
        k=Float.parseFloat(txtPantalla.getText());
        txtPantalla.setText("F(k)" + q.evaluar(k));
    }//GEN-LAST:event_btnEvaluarActionPerformed

    private void btnRangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRangoActionPerformed
        switch(contador){
            case 1:
                rangoinicial= Float.parseFloat(txtPantalla.getText());
                contador=1;
                btnRango.setText("Rango Inicial");
                txtPantalla.setText("");
                txtPantalla.requestFocus();
                break;
            case 2:
                rangofinal= Float.parseFloat(txtPantalla.getText());
                contador=2;
                btnRango.setText("Rango Final");
                txtPantalla.setText("");
                txtPantalla.requestFocus();
                break;
            case 3:
                incremento= Float.parseFloat(txtPantalla.getText());
                contador=0;
                btnRango.setText("Incremento");
                txtPantalla.setText("");
                txtPantalla.requestFocus();
                String tabla ="TABLA DE VALORES /n";
                tabla=tabla + "Factor          Valor/n";
                for(int i=(int)rangoinicial; i <= rangofinal; i +=incremento ){
                    tabla =tabla +i +"          "+q.evaluar(i)+"/n";
                }
                jTextTabla.setText(tabla);
                txtPantalla.setText(q.toString());
                break;
        }
    }//GEN-LAST:event_btnRangoActionPerformed

    private void btnMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasActionPerformed
        txtPantalla.setText("");
        txtPantalla.requestFocus();
        p=q;
        codigo=1;
    }//GEN-LAST:event_btnMasActionPerformed

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
        txtPantalla.setText("");
        txtPantalla.requestFocus();
        p=q;
        codigo=2;
    }//GEN-LAST:event_btnMenosActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        switch (codigo){
            case 1: //suma
                p=p.mas(q);
                break;
            case 2: //resta
                p=p.menos(q);
                break;   
        }
        txtPantalla.setText(p.toString());
        txtPantalla.requestFocus();
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnSALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSALIRActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSALIRActionPerformed

    private void txtPantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPantallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPantallaActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCoeficientes;
    private javax.swing.JButton btnEvaluar;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnLIMPIAR;
    private javax.swing.JButton btnMas;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnRaices;
    private javax.swing.JButton btnRango;
    private javax.swing.JButton btnSALIR;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextTabla;
    private javax.swing.JTextField txtPantalla;
    // End of variables declaration//GEN-END:variables

 
