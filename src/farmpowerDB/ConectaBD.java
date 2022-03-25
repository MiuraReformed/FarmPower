/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmpowerDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Psnps
 */
    public class ConectaBD {
    
        public Statement stm;
        public ResultSet rs;
        private String driver = "org.postgresql.Driver";
        private String caminho = "jdbc:postgresql://localhost:5432/farmpowerdb";
        private String user = "postgres";
        private String pass = "admin";
        public Connection conn;
        
        public void conexao (){
            
            try {
                System.setProperty("jdbc.Drivers", driver);
                conn = DriverManager.getConnection(caminho, user, pass);
                //JOptionPane.showMessageDialog(null, "Conectado com sucesso!!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Banco não conectado!!\n Erro!:" +ex.getMessage());
            }
        }
        
        public void executaSQL(String sql){
            try {
                stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
                rs = stm.executeQuery(sql);
            } catch (SQLException ex) {
                //JOptionPane.showMessageDialog(null, "Erro no executaSQL\n Erro!:" +ex.getMessage());
            }
        }
        
        public void desconecta(){
            try {
                conn.close();
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão!!\n Erro!:" +ex.getMessage());
            }
        }
        
}
