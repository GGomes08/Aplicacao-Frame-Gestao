/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_DAO;

import Conexao_e_Tabela.connectionFactory;
import Model_Bean.fornecedores;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alex
 */
public class FornecedoresDAO {
    public void cadastra(fornecedores f){
        //CONEXOES COM O BANCO E VAR
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        //COMANDOS
        try{
            //COMANDO SE INSERT 
            stmt = con.prepareStatement("insert into fornecedores (razaosocial,nomeConsultor,telefone,celular,cnpj,cidade,email) "
                    + "VALUES(?,?,?,?,?,?,?)");
            
            //SETANDO OS PARAMENTOS DADOS
            stmt.setString(1, f.getRazaosocial());
            stmt.setString(2, f.getNomeConsultor());
            stmt.setString(3, f.getTelefone());
            stmt.setString(4, f.getCelular());
            stmt.setString(5, f.getCnpj());
            stmt.setString(6, f.getCidade());
            stmt.setString(7, f.getEmail());
           
            //REALIZANDO A EXECUCTION
            stmt.executeUpdate();
            //CHAMADA DA TELA DE CADASTRADO COM SUCESSO
            
        }catch(SQLException ex){
            Logger.getLogger(FornecedoresDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        //FINALIZA/SALVA O BANCO
        finally{
            connectionFactory.closeConnection(con, stmt);
        }
    }
    
}
