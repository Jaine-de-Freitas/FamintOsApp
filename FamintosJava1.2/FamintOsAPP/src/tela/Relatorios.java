/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import java.awt.Color;

/**
 *
 * @author jaine
 */
public class Relatorios extends javax.swing.JFrame {

    /**
     * Creates new form Relatorios
     */
    public Relatorios() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtUser = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        linkft = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JComboBox<>();
        txtMes = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPeriodo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/famintos.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 40, 1310, 50);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText(" Conectado como");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, 100, 640, 30);

        txtUser.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtUser);
        txtUser.setBounds(650, 100, 660, 30);

        jButton1.setText("MENU");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1140, 10, 70, 23);

        jButton3.setText("SAIR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(1220, 10, 80, 23);

        linkft.setEnabled(false);
        jPanel1.add(linkft);
        linkft.setBounds(40, 500, 220, 0);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Período de Referência");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(360, 290, 260, 29);

        txtCategoria.setEditable(false);
        txtCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "VENDAS", "ESTOQUE" }));
        txtCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoriaActionPerformed(evt);
            }
        });
        jPanel1.add(txtCategoria);
        txtCategoria.setBounds(360, 210, 270, 30);

        txtMes.setEditable(false);
        txtMes.setText(" JANEIRO");
        txtMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMesActionPerformed(evt);
            }
        });
        jPanel1.add(txtMes);
        txtMes.setBounds(740, 330, 230, 30);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tipo de Dado");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(360, 430, 230, 29);

        jButton2.setText("+");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(700, 330, 40, 30);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Dia de Referência");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(700, 170, 230, 29);

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(jFormattedTextField1);
        jFormattedTextField1.setBounds(700, 470, 270, 30);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Ano de Referência");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(700, 430, 230, 29);

        txtPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "DIÁRIO", "SEMANAL", "MENSAL", "ANUAL" }));
        txtPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPeriodoActionPerformed(evt);
            }
        });
        jPanel1.add(txtPeriodo);
        txtPeriodo.setBounds(360, 330, 270, 30);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Mês de Referência");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(700, 290, 230, 29);
        jPanel1.add(jFormattedTextField2);
        jFormattedTextField2.setBounds(700, 210, 270, 30);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Tipo de Relatório");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(360, 170, 230, 29);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "ENTRADAS", "SAIDAS", "EM ESTOQUE", "GERAL" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(360, 470, 270, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logofamintos.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-290, -110, 630, 520);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logofamintos.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(810, 220, 630, 540);

        jButton4.setText("GERAR PDF");
        jPanel1.add(jButton4);
        jButton4.setBounds(600, 540, 150, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String Nome = txtUser.getText();
        Menu mn = new Menu();
        mn.txtUsuario.setText(Nome);
        mn.setVisible(true);
        mn.chamar();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoriaActionPerformed

    private void txtMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMesActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        if(txtMes.getText().equals(" JANEIRO")){
            txtMes.setText(" FEVEREIRO");
        }else if(txtMes.getText().equals(" FEVEREIRO")){
            txtMes.setText(" MARÇO");
        }else if(txtMes.getText().equals(" MARÇO")){
            txtMes.setText(" ABRIL");
        }else if(txtMes.getText().equals(" ABRIL")){
            txtMes.setText(" MAIO");
        }else if(txtMes.getText().equals(" MAIO")){
            txtMes.setText(" JUNHO");
        }else if(txtMes.getText().equals(" JUNHO")){
            txtMes.setText(" JULHO");
        }else if(txtMes.getText().equals(" JULHO")){
            txtMes.setText(" AGOSTO");
        }else if(txtMes.getText().equals(" AGOSTO")){
            txtMes.setText(" SETEMBRO");
        }else if(txtMes.getText().equals(" SETEMBRO")){
            txtMes.setText(" OUTUBRO");
        }else if(txtMes.getText().equals(" OUTUBRO")){
            txtMes.setText(" NOVEMBRO");
        }else if(txtMes.getText().equals(" NOVEMBRO")){
            txtMes.setText(" DEZEMBRO");
        }else if(txtMes.getText().equals(" DEZEMBRO")){
            txtMes.setText(" JANEIRO");
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void txtPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPeriodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPeriodoActionPerformed

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
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatorios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel linkft;
    private javax.swing.JComboBox<String> txtCategoria;
    private javax.swing.JTextField txtMes;
    private javax.swing.JComboBox<String> txtPeriodo;
    public javax.swing.JLabel txtUser;
    // End of variables declaration//GEN-END:variables
}