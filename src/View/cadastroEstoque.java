/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import farmpowerDB.ConectaBD;
import farmpowerDB.ModeloTabela;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Psnps
 */
public class cadastroEstoque extends javax.swing.JFrame {
    ConectaBD conecta = new ConectaBD();
    /**
     * Creates new form cadastroEstoque
     */
    public cadastroEstoque() {
        initComponents();
        conecta.conexao();
        preencherTabela("select * from  produtos order by id_produtos");
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
        jLabel2 = new javax.swing.JLabel();
        txtIdEstoque = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMedicamento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrecoProduto = new javax.swing.JTextField();
        btnCadastroEstoque = new javax.swing.JButton();
        btnExcluirEstoque = new javax.swing.JButton();
        btnSalvarEstoque = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnAlterarEstoque = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtFornecedorEstoque = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtQtdProdutos = new javax.swing.JTextField();
        btnPrimeiroEstoque = new javax.swing.JButton();
        btnUltimoEstoque = new javax.swing.JButton();
        btnProximoEstoque = new javax.swing.JButton();
        btnAnteriorEstoque = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEstoque = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 2, 36)); // NOI18N
        jLabel1.setText("ESTOQUE DE MEDICAMENTOS");

        jLabel2.setText("Codigo do Produto:");

        txtIdEstoque.setEnabled(false);

        jLabel3.setText("Nome do medicamento:");

        txtMedicamento.setEnabled(false);

        jLabel4.setText("Preço do Produto:");

        txtPrecoProduto.setEnabled(false);

        btnCadastroEstoque.setText("Novo");
        btnCadastroEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroEstoqueActionPerformed(evt);
            }
        });

        btnExcluirEstoque.setText("Excluir");
        btnExcluirEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirEstoqueActionPerformed(evt);
            }
        });

        btnSalvarEstoque.setText("Salvar");
        btnSalvarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarEstoqueActionPerformed(evt);
            }
        });

        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnAlterarEstoque.setText("Alterar");
        btnAlterarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarEstoqueActionPerformed(evt);
            }
        });

        jLabel5.setText("Fornecedor:");

        txtFornecedorEstoque.setEnabled(false);

        jLabel6.setText("Quantidade Produtos:");

        txtQtdProdutos.setEnabled(false);

        btnPrimeiroEstoque.setText("Primeiro");
        btnPrimeiroEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroEstoqueActionPerformed(evt);
            }
        });

        btnUltimoEstoque.setText("Ultimo");
        btnUltimoEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoEstoqueActionPerformed(evt);
            }
        });

        btnProximoEstoque.setText("Proximo");
        btnProximoEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoEstoqueActionPerformed(evt);
            }
        });

        btnAnteriorEstoque.setText("Anterior");
        btnAnteriorEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorEstoqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtQtdProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtIdEstoque, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                    .addComponent(txtMedicamento, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecoProduto, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(69, 69, 69)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnCadastroEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnAlterarEstoque)
                                                .addGap(18, 18, 18))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnPrimeiroEstoque)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnUltimoEstoque)
                                                .addGap(24, 24, 24)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnProximoEstoque)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnAnteriorEstoque))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnExcluirEstoque)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnSalvarEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel5)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtFornecedorEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(127, 127, 127))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtFornecedorEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAlterarEstoque)
                        .addComponent(btnCadastroEstoque)
                        .addComponent(btnExcluirEstoque)
                        .addComponent(btnSalvarEstoque)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtQtdProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPrimeiroEstoque)
                            .addComponent(btnUltimoEstoque)
                            .addComponent(btnProximoEstoque)
                            .addComponent(btnAnteriorEstoque))))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        tblEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblEstoque);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(846, 432));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnCadastroEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroEstoqueActionPerformed
        // TODO add your handling code here:
        txtIdEstoque.setText("");
        txtMedicamento.setText("");
        txtPrecoProduto.setText("");
        txtFornecedorEstoque.setText("");
        txtIdEstoque.setEnabled(true);
        txtMedicamento.setEnabled(true);
        txtPrecoProduto.setEnabled(true);
        txtFornecedorEstoque.setEnabled(true);
        txtQtdProdutos.setEnabled(true);
        btnCadastroEstoque.setEnabled(true);
        btnExcluirEstoque.setEnabled(true);
        btnAlterarEstoque.setEnabled(true);
        btnSalvarEstoque.setEnabled(true);
    }//GEN-LAST:event_btnCadastroEstoqueActionPerformed

    private void btnExcluirEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirEstoqueActionPerformed
        // TODO add your handling code here:
        conecta.executaSQL("delete from produtos where id_produtos='"+txtIdEstoque.getText()+"'");
        JOptionPane.showMessageDialog(rootPane, "Produto Deletado com sucesso!!");
        preencherTabela("select * from produtos order by id_produtos");
        txtIdEstoque.setText("");
        txtMedicamento.setText("");
        txtPrecoProduto.setText("");
        txtFornecedorEstoque.setText("");
        txtMedicamento.setEnabled(false);
        txtPrecoProduto.setEnabled(false);
        txtFornecedorEstoque.setEnabled(false);
        txtIdEstoque.setEnabled(false);
        txtQtdProdutos.setEnabled(false);
        btnCadastroEstoque.setEnabled(true);
        btnExcluirEstoque.setEnabled(true);
        btnAlterarEstoque.setEnabled(false);
        btnSalvarEstoque.setEnabled(false);

    }//GEN-LAST:event_btnExcluirEstoqueActionPerformed

    private void btnAlterarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarEstoqueActionPerformed
        // TODO add your handling code here:
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("update produtos set nome_produtos=?, preco_produtos=?, fornecedor_estoque=?, qtd_produtos=? where id_produtos=?");
            pst.setString(1, txtMedicamento.getText());
            pst.setString(2, txtPrecoProduto.getText());
            pst.setString(3, txtFornecedorEstoque.getText());
            pst.setString(4, txtQtdProdutos.getText());
            pst.setInt(5, Integer.parseInt(txtIdEstoque.getText()));
            pst.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Alterado com sucesso!");
            preencherTabela("select * from  produtos order by id_produtos");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao alterar!!\n ERRO: "+ex);
        }
        txtIdEstoque.setText("");
        txtMedicamento.setText("");
        txtPrecoProduto.setText("");
        txtQtdProdutos.setText("");
        txtFornecedorEstoque.setText("");
        txtMedicamento.setEnabled(true);
        txtPrecoProduto.setEnabled(true);
        txtQtdProdutos.setEnabled(true);
        txtFornecedorEstoque.setEnabled(true);
        
    }//GEN-LAST:event_btnAlterarEstoqueActionPerformed

    private void btnSalvarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarEstoqueActionPerformed
        // TODO add your handling code here:
         try {
            PreparedStatement pst = conecta.conn.prepareStatement("insert into produtos(nome_produtos,preco_produtos,qtd_produtos,fornecedor_estoque)values(?,?,?,?)");
            pst.setString(1, txtMedicamento.getText());
            pst.setString(2, txtPrecoProduto.getText());
            pst.setString(3, txtQtdProdutos.getText());
            pst.setString(4, txtFornecedorEstoque.getText());
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Salvo com sucesso!");
            preencherTabela("select * from produtos order by id_produtos");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro na inserção!!\n ERRO: "+ex);
        }
        txtIdEstoque.setText("");
        txtMedicamento.setText("");
        txtPrecoProduto.setText("");
        txtFornecedorEstoque.setText("");
        txtQtdProdutos.setText("");
        txtMedicamento.setEnabled(false);
        txtPrecoProduto.setEnabled(false);
        txtFornecedorEstoque.setEnabled(false);
        txtIdEstoque.setEnabled(false);
        txtQtdProdutos.setEnabled(false);
        btnCadastroEstoque.setEnabled(true);
        btnExcluirEstoque.setEnabled(false);
        btnAlterarEstoque.setEnabled(false);
        btnSalvarEstoque.setEnabled(false);
    }//GEN-LAST:event_btnSalvarEstoqueActionPerformed

    private void btnPrimeiroEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroEstoqueActionPerformed
        // TODO add your handling code here:
        txtMedicamento.setEnabled(true);
        txtPrecoProduto.setEnabled(true);
        txtFornecedorEstoque.setEnabled(true);
        txtQtdProdutos.setEnabled(true);
        btnAlterarEstoque.setEnabled(true);
        btnExcluirEstoque.setEnabled(true);
        try {
            conecta.executaSQL("select * from produtos");
            conecta.rs.first();
            
            txtIdEstoque.setText(String.valueOf(conecta.rs.getInt("id_produtos")));
            txtMedicamento.setText(conecta.rs.getString("nome_produtos"));
            txtPrecoProduto.setText(conecta.rs.getString("preco_produtos"));
            txtQtdProdutos.setText(conecta.rs.getString("qtd_produtos"));
            txtFornecedorEstoque.setText(conecta.rs.getString("fornecedor_estoque"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao buscar dados!!\n ERRO: "+ex);
        }
    }//GEN-LAST:event_btnPrimeiroEstoqueActionPerformed

    private void btnUltimoEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoEstoqueActionPerformed
        // TODO add your handling code here:
         txtMedicamento.setEnabled(true);
        txtPrecoProduto.setEnabled(true);
        txtFornecedorEstoque.setEnabled(true);
        txtQtdProdutos.setEnabled(true);
        btnAlterarEstoque.setEnabled(true);
        btnExcluirEstoque.setEnabled(true);
        try {
            conecta.executaSQL("select * from produtos");
            conecta.rs.last();
            
            txtIdEstoque.setText(String.valueOf(conecta.rs.getInt("id_produtos")));
            txtMedicamento.setText(conecta.rs.getString("nome_produtos"));
            txtPrecoProduto.setText(conecta.rs.getString("preco_produtos"));
            txtQtdProdutos.setText(conecta.rs.getString("qtd_produtos"));
            txtFornecedorEstoque.setText(conecta.rs.getString("fornecedor_estoque"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao buscar dados!!\n ERRO: "+ex);
        }
    }//GEN-LAST:event_btnUltimoEstoqueActionPerformed

    private void btnProximoEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoEstoqueActionPerformed
        // TODO add your handling code here:
         txtMedicamento.setEnabled(true);
        txtPrecoProduto.setEnabled(true);
        txtFornecedorEstoque.setEnabled(true);
        txtQtdProdutos.setEnabled(true);
        btnAlterarEstoque.setEnabled(true);
        btnExcluirEstoque.setEnabled(true);
        try {
            conecta.executaSQL("select * from produtos");
            conecta.rs.next();
            
            txtIdEstoque.setText(String.valueOf(conecta.rs.getInt("id_produtos")));
            txtMedicamento.setText(conecta.rs.getString("nome_produtos"));
            txtPrecoProduto.setText(conecta.rs.getString("preco_produtos"));
            txtQtdProdutos.setText(conecta.rs.getString("qtd_produtos"));
            txtFornecedorEstoque.setText(conecta.rs.getString("fornecedor_estoque"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao buscar dados!!\n ERRO: "+ex);
        }
    }//GEN-LAST:event_btnProximoEstoqueActionPerformed

    private void btnAnteriorEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorEstoqueActionPerformed
        // TODO add your handling code here:
         txtMedicamento.setEnabled(true);
        txtPrecoProduto.setEnabled(true);
        txtFornecedorEstoque.setEnabled(true);
        txtQtdProdutos.setEnabled(true);
        btnAlterarEstoque.setEnabled(true);
        btnExcluirEstoque.setEnabled(true);
        try {
            conecta.executaSQL("select * from produtos");
            conecta.rs.previous();
            
            txtIdEstoque.setText(String.valueOf(conecta.rs.getInt("id_produtos")));
            txtMedicamento.setText(conecta.rs.getString("nome_produtos"));
            txtPrecoProduto.setText(conecta.rs.getString("preco_produtos"));
            txtQtdProdutos.setText(conecta.rs.getString("qtd_produtos"));
            txtFornecedorEstoque.setText(conecta.rs.getString("fornecedor_estoque"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao buscar dados!!\n ERRO: "+ex);
        }
    }//GEN-LAST:event_btnAnteriorEstoqueActionPerformed
    
    
    public void preencherTabela(String SQL){
        ArrayList dados = new ArrayList();
        
        String [] Colunas = new String[]{"ID","Produto","Preço","Quantidade","Fornecedor"};
        
        conecta.executaSQL(SQL);
        try {
            conecta.rs.first();
            do {            
                dados.add(new Object[]{conecta.rs.getInt("id_produtos"),conecta.rs.getString("nome_produtos"),conecta.rs.getString("preco_produtos"),conecta.rs.getString("qtd_produtos"),conecta.rs.getString("fornecedor_estoque")});
        } while (conecta.rs.next());
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(rootPane, "Deu merda aqui em filho!!\n ERRO: "+ex);
        }
        
        
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        tblEstoque.setModel(modelo);
        tblEstoque.getColumnModel().getColumn(0).setPreferredWidth(150);
        tblEstoque.getColumnModel().getColumn(0).setResizable(false);
        tblEstoque.getColumnModel().getColumn(1).setPreferredWidth(150);
        tblEstoque.getColumnModel().getColumn(1).setResizable(false);
        tblEstoque.getColumnModel().getColumn(2).setPreferredWidth(150);
        tblEstoque.getColumnModel().getColumn(2).setResizable(false);
        tblEstoque.getColumnModel().getColumn(3).setPreferredWidth(150);
        tblEstoque.getColumnModel().getColumn(3).setResizable(false);
        tblEstoque.getColumnModel().getColumn(4).setPreferredWidth(232);
        tblEstoque.getColumnModel().getColumn(4).setResizable(false);
        tblEstoque.getTableHeader().setReorderingAllowed(false);
        tblEstoque.setAutoResizeMode(tblEstoque.AUTO_RESIZE_OFF);
        tblEstoque.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
       
    }
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
            java.util.logging.Logger.getLogger(cadastroEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarEstoque;
    private javax.swing.JButton btnAnteriorEstoque;
    private javax.swing.JButton btnCadastroEstoque;
    private javax.swing.JButton btnExcluirEstoque;
    private javax.swing.JButton btnPrimeiroEstoque;
    private javax.swing.JButton btnProximoEstoque;
    private javax.swing.JButton btnSalvarEstoque;
    private javax.swing.JButton btnUltimoEstoque;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblEstoque;
    private javax.swing.JTextField txtFornecedorEstoque;
    private javax.swing.JTextField txtIdEstoque;
    private javax.swing.JTextField txtMedicamento;
    private javax.swing.JTextField txtPrecoProduto;
    private javax.swing.JTextField txtQtdProdutos;
    // End of variables declaration//GEN-END:variables
}
