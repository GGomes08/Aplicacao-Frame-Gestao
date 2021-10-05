/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_DAO;

import Conexao_e_Tabela.connectionFactory;
import Model_Bean.Produtos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alex
 */
public class ProdutosDAO {
        public void cadastra(Produtos p){
        //CONEXOES COM O BANCO E VAR
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        //COMANDOS
        try{
            //COMANDO SE INSERT 
            stmt = con.prepareStatement("insert into produto (cod_barras,nomeproduto,validade,cod_barras_estoque,quantidade,encam_not,qtd_not,preco_uni,preco_venda,lucro,id_fornecedores) "
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?)");
            
            
            
            //SETANDO OS PARAMENTOS DADOS
            stmt.setString(1, p.getCod_barras());
            stmt.setString(2, p.getNomeproduto());
            stmt.setString(3, p.getValidade());
            stmt.setString(4, p.getCod_barras_estoque());
            stmt.setString(5, p.getQuantidade());
            stmt.setString(6, p.getEncam_not());
            stmt.setString(7, p.getQtd_not());
            stmt.setDouble(8, p.getPreco_uni());
            stmt.setDouble(9, p.getPreco_venda());
            stmt.setString(10, p.getLucro());
            stmt.setString(11, p.getId_fornecedores());
            
            //REALIZANDO A EXECUCTION
            stmt.executeUpdate();
            //CHAMADA DA TELA DE CADASTRADO COM SUCESSO
            
        }catch(SQLException ex){
            Logger.getLogger(ProdutosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        //FINALIZA/SALVA O BANCO
        finally{
            connectionFactory.closeConnection(con, stmt);
        }
    }
       
}
