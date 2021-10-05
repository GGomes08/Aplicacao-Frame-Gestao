/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_DAO;

import Conexao_e_Tabela.connectionFactory;
import Model_Bean.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Refrigeração Josemaq
 */
public class ClienteDAO {
    public void cadastra(Cliente c){
        //CONEXOES COM O BANCO E VAR
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        //COMANDOS
        try{
            //COMANDO SE INSERT 
            stmt = con.prepareStatement("insert into cliente (nome, cpf, rg, orgao, sexo, nascimento, estado_civil, salario, logradouro, cep, numeracao, bairro, complemento, cidade, estado, ponto_referencia, telefone, telefone2, celular, conhecido) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            
            //SETANDO OS PARAMENTOS DADOS
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getCpf());
            stmt.setString(3, c.getRg());
            stmt.setString(4, c.getOrgao());
            stmt.setString(5, c.getSexo());
            stmt.setString(6, c.getNascimento());
            stmt.setString(7, c.getEstado_civil());
            stmt.setDouble(8, c.getSalario());
            //SETANDO OS PARAMETROS LOCALIZATION
            stmt.setString(9, c.getLogradouro());
            stmt.setString(10, c.getCep());
            stmt.setInt(11, c.getNumeracao());
            stmt.setString(12, c.getBairro());
            stmt.setString(13, c.getComplemento());
            stmt.setString(14, c.getCidade());
            stmt.setString(15, c.getEstado());
            stmt.setString(16, c.getPonto_referencia());
            //SETANDO OS PARAMETROS CONTATO
            stmt.setString(17, c.getTelefone());
            stmt.setString(18, c.getTelefone2()); 
            stmt.setString(19, c.getCelular()); 
            stmt.setString(20, c.getConhecido()); 
           
            //REALIZANDO A EXECUCTION
            stmt.executeUpdate();
            //CHAMADA DA TELA DE CADASTRADO COM SUCESSO
            
        }catch(SQLException ex){
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        //FINALIZA/SALVA O BANCO
        finally{
            connectionFactory.closeConnection(con, stmt);
        }
    }
   
    public void cadastraID(Cliente c){
        //CONEXOES COM O BANCO E VAR
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        //COMANDOS
        try{
            //COMANDO SE INSERT 
            stmt = con.prepareStatement("insert into compra (id_cliente) "
                    + "VALUES(?)");
            
            //SETANDO OS PARAMENTOS DADOS
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getCpf());
            stmt.setString(3, c.getRg());
            stmt.setString(4, c.getOrgao());
            stmt.setString(5, c.getSexo());
            stmt.setString(6, c.getNascimento());
            stmt.setString(7, c.getEstado_civil());
            stmt.setDouble(8, c.getSalario());
            
            //SETANDO OS PARAMETROS LOCALIZATION
            stmt.setString(9, c.getLogradouro());
            stmt.setString(10, c.getCep());
            stmt.setInt(11, c.getNumeracao());
            stmt.setString(12, c.getBairro());
            stmt.setString(13, c.getComplemento());
            stmt.setString(14, c.getCidade());
            stmt.setString(15, c.getEstado());
            stmt.setString(16, c.getPonto_referencia());
            
            //SETANDO OS PARAMETROS CONTATO
            stmt.setString(17, c.getTelefone());
            stmt.setString(18, c.getTelefone2()); 
            stmt.setString(19, c.getCelular()); 
            stmt.setString(20, c.getConhecido()); 
           
            //REALIZANDO A EXECUCTION
            stmt.executeUpdate();
            //CHAMADA DA TELA DE CADASTRADO COM SUCESSO
            
        }catch(SQLException ex){
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        //FINALIZA/SALVA O BANCO
        finally{
            connectionFactory.closeConnection(con, stmt);
        }
    }
}
