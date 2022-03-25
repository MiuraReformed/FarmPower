/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmpowerDB;
import farmpowerDB.ModeloVenda;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Psnps
 */

public class ControleVenda {
    int codProd;
    ConectaBD conecta = new ConectaBD();
    public void adicionaItem(ModeloVenda mod) {
        achaCodProduto(mod.getNomeProduto());
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("insert into itens_venda_produtos(id_vendas,id_produtos,qtd_produtosvendas)values(?,?,?)");
            pst.setInt(1, mod.getIdVenda());
            pst.setInt(2, codProd);
            pst.setInt(3, mod.getQtdItem());
            pst.execute();
            JOptionPane.showMessageDialog(null, "PRODUTO ADICIONADO!!!");
            conecta.desconecta();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO REALIZAR A VENDA: "+ex);
            conecta.desconecta();
        }
        
    }
    public void achaCodProduto(String nome) {
        conecta.conexao();
        conecta.executaSQL("select * from produtos where nome_produtos='"+nome+"'");
        try {
            conecta.rs.first();
            codProd = conecta.rs.getInt("id_produtos");
            conecta.desconecta();
        } catch (SQLException ex) {
            conecta.desconecta();
            JOptionPane.showMessageDialog(null, "ERRO: "+ex);
        }
    }
}
