/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_DAO;

import Conexao_e_Tabela.connectionFactory;
import Model_Bean.Funcionarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alex
 */
public class FuncionariosDAO {
    public void cadastra(Funcionarios f){
        //CONEXOES COM O BANCO E VAR
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        //COMANDOS
        try{
            //COMANDO SE INSERT 
            stmt = con.prepareStatement("insert into funcionario(nome,telefone,periodo,cpf,nascimento,sexo,login,senha) "
                    + "VALUES(?,?,?,?,?,?,?,?)");
            
            //SETANDO OS PARAMENTOS DADOS
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getTelefone());
            stmt.setString(3, f.getPeriodo());
            stmt.setString(4, f.getCpf());
            stmt.setString(5, f.getNascimento());
            stmt.setString(6, f.getSexo());
            stmt.setString(7, f.getLogin());
            stmt.setString(8, f.getSenha());
           
            //REALIZANDO A EXECUCTION
            stmt.executeUpdate();
            //CHAMADA DA TELA DE CADASTRADO COM SUCESSO
            
        }catch(SQLException ex){
            Logger.getLogger(FuncionariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        //FINALIZA/SALVA O BANCO
        finally{
            connectionFactory.closeConnection(con, stmt);
        }
    }
    
}
