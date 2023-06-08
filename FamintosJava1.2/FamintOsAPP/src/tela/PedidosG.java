/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import DAO.PedidosDAO;
import DTO.PedidosDTO;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/*import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.*;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import java.awt.Desktop;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import org.apache.log4j.*;*/
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;

/**
 *
 * @author jaine
 */
public class PedidosG extends javax.swing.JFrame {

    /**
     * Creates new form PedidosG
     */
    public PedidosG() {
        initComponents();
        ListarPedidos();
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
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        rolagem = new javax.swing.JScrollPane();
        panelroll = new javax.swing.JPanel();

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

        jButton2.setText("TESTE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(60, 10, 63, 23);

        jButton4.setText("TESTE 2");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(150, 10, 71, 23);

        panelroll.setPreferredSize(new java.awt.Dimension(900, 448));

        javax.swing.GroupLayout panelrollLayout = new javax.swing.GroupLayout(panelroll);
        panelroll.setLayout(panelrollLayout);
        panelrollLayout.setHorizontalGroup(
            panelrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 981, Short.MAX_VALUE)
        );
        panelrollLayout.setVerticalGroup(
            panelrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );

        rolagem.setViewportView(panelroll);

        jPanel1.add(rolagem);
        rolagem.setBounds(170, 150, 1000, 440);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1328, Short.MAX_VALUE)
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(PedidosG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PedidosG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PedidosG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PedidosG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PedidosG().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel linkft;
    private javax.swing.JPanel panelroll;
    private javax.swing.JScrollPane rolagem;
    public javax.swing.JLabel txtUser;
    // End of variables declaration//GEN-END:variables
    private void ListarPedidos() {
        PedidosDTO pedDTO = new PedidosDTO();
        PedidosDAO pedDAO = new PedidosDAO();
        ArrayList<PedidosDTO> listar = pedDAO.FiltrarNomes(pedDTO);
        String[] pedidos = new String[listar.size()];
        Set<String> setar = new HashSet<>();

        JPopupMenu jpm = new JPopupMenu();
        JMenuItem jmiImprimir = new JMenuItem();
        JMenuItem jmiEntregue = new JMenuItem();
        JMenuItem jmiAlterar = new JMenuItem();
        JMenuItem jmiCancelar = new JMenuItem();
        jmiImprimir.setText("Imprimir comanda");
        jmiEntregue.setText("Marcar como entregue");
        jmiAlterar.setText("Alterar pedido");
        jmiCancelar.setText("Cancelar pedido");
        jpm.add(jmiImprimir);
        jpm.add(jmiEntregue);
        jpm.add(jmiAlterar);
        jpm.add(jmiCancelar);

        for (int n = 0; n < listar.size(); n++) {
            pedidos[n] = listar.get(n).getNo_Ticket();
        }
        for (String a : pedidos) {
            setar.add(a);
        }

        String arr[] = new String[setar.size()];
        setar.toArray(arr);

        int ver = setar.size();
        panelroll.setPreferredSize(new java.awt.Dimension(80 + 310 * ver, 400));

        String compras = "";
        for (int n = 0; n < setar.size(); n++) {
            int numero=0;
            PedidosDAO pddDAO = new PedidosDAO();
            PedidosDTO pddDTO = new PedidosDTO();
            pddDTO.setBusca(arr[n]);
            ArrayList<PedidosDTO> pedidosE = pddDAO.Exibir(pddDTO);
            String[] listagem = new String[pedidosE.size()];
            String[] codigos = new String[pedidosE.size()];
            String[] nome = new String[1];
            String[] mesa = new String[1];
            double soma = 0;
            String formSoma = "";
            for (int num = 0; num < pedidosE.size(); num++) {
                codigos[num] = pedidosE.get(num).getCd_comida();
                PedidosDAO pddsDAO = new PedidosDAO();
                PedidosDTO pddsDTO = new PedidosDTO();
                pddsDTO.setBusca2(codigos[num]);
                ArrayList<PedidosDTO> consultar = pddsDAO.Exibir2(pddsDTO);
                String[] teste = new String[consultar.size()];
                for (int ns = 0; ns < consultar.size(); ns++) {
                    teste[ns] = (consultar.get(ns).getNm_comida()).toUpperCase();
                    nome[0] = pedidosE.get(num).getNome_cliente();
                    mesa[0] = pedidosE.get(num).getCd_mesa();
                    listagem[num] = "    " + pedidosE.get(num).getQt_comida() + "    " + teste[ns]/*+valor */ + "    R$" + pedidosE.get(num).getVl_item() + " /und"/* + " R$" + pedidosE.get(num).getVl_total_item()*/;
                    numero=numero+1;
                    compras = compras + listagem[num] + "\n";
                    String[] conv = new String[1];
                    conv[0] = pedidosE.get(num).getVl_total_item();
                    soma = soma + (Double.parseDouble(conv[0]));
                }
                formSoma = (String.valueOf(soma));
                StringTokenizer casasN = new StringTokenizer(formSoma);
                String inteiro = casasN.nextToken(".");
                String decimal = casasN.nextToken(".");
                if (decimal.length() < 2) {
                    decimal = decimal + "0";
                } else {
                    decimal = decimal.substring(0, 2);
                }
                formSoma = inteiro + "," + decimal;
            }

            JTextArea jTextArea = new javax.swing.JTextArea("jTextArea" + n);
            String total = String.format("%58.5s", " ");
            String dados;
            dados = "\n" + "  Nome do cliente: " + nome[0] + "\n" + "  Nº Ticket: " + arr[n] + "\n" + "  Nº Mesa: " + mesa[0] + "\n" + "\n" + "  Qtde    Descrição" + "\n" + compras + "\n" + "\n" + total + "TOTAL:   R$" + formSoma;

            JScrollPane scroll = new JScrollPane(jTextArea);
            scroll.setBounds(15 + 320 * n, 20, 310, 390);

            panelroll.add(scroll);

            jTextArea.setLineWrap(true);
            jTextArea.setWrapStyleWord(true);
            jTextArea.setText(dados);
            jTextArea.setEditable(false);
            jTextArea.setSelectionColor(Color.white);
            jTextArea.setSelectedTextColor(Color.black);
            jTextArea.setFocusable(false);
            jTextArea.setAutoscrolls(true);

            if (n == 0) {
                jTextArea.setBounds(15, 20, 310, 390);
            } else {
                jTextArea.setBounds(15 + 320 * n, 20, 310, 390);
            }
            String nmarq = arr[n];
            compras = "";
            int testes=(180+(20*numero));
            jTextArea.setCaretPosition(0);
            jTextArea.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    if (evt.getModifiersEx() != 0) {
                        jTextArea.setBackground(new Color(216, 216, 216));
                        jpm.show(jTextArea, jTextArea.getX(), jTextArea.getY());
                        jmiImprimir.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent evt1) {
                                System.out.println("I");
                                try {
                                    
                                    Rectangle pagesize = new Rectangle(320f, 720f /*f720f*/);
                                    Document documento = new Document(pagesize, 10f, 10f, 0f, 10f);
                                    try {
                                        PdfWriter.getInstance(documento, new FileOutputStream("D:\\guardarpdfs\\"+nmarq+".pdf"));
                                    documento.open();
                                    Paragraph pgr=new Paragraph(dados);
                                    //pgr.setAlignment(Element.ALIGN_CENTER);
                                    //documento.setPageSize(PageSize.A10);
                                    documento.add(pgr);
                                    documento.close();
                                    } catch (DocumentException ex) {
                                        Logger.getLogger(PedidosG.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    
                                } catch (FileNotFoundException ex) {
                                    Logger.getLogger(PedidosG.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        });
                        jmiEntregue.addActionListener((ActionEvent evt1) -> {
                            System.out.println("E");
                        });
                        jmiAlterar.addActionListener((ActionEvent evt1) -> {
                            System.out.println("A");
                        });
                        jmiCancelar.addActionListener((ActionEvent evt1) -> {
                            System.out.println("C");
                        });
                    }
                }

                @Override
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jTextArea.setBackground(Color.white);
                }
            });

        }
    }
}
