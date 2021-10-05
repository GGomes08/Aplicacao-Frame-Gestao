/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_DAO;

import Conexao_e_Tabela.connectionFactory;
import Model_Bean.Ocorrencia;
import Sistema.Tela_14_User2_Menu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Refrigeração Josemaq
 */
public class OcorrenciaDAO {
    public void create(Ocorrencia c){
        //CONEXOES COM O BANCO E VAR
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        //COMANDOS
        try{
            //COMANDO SE INSERT 
            stmt = con.prepareStatement("UPDATE ocorrencia SET resposta = ? WHERE (protocolo = ?);");
            
            //SETANDO OS PARAMENTOS
            stmt.setString(1, c.getResposta());
            stmt.setInt(2, c.getProtocolo());
            
            //REALIZANDO A EXECUCTION
            stmt.executeUpdate();
            
            //CHAMADA DA TELA DE CADASTRADO COM SUCESSO
            JOptionPane.showMessageDialog(null,"Resposta enviada com sucesso");
            
            
        }catch(SQLException ex){
            Logger.getLogger(OcorrenciaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        //FINALIZA/SALVA O BANCO
        finally{
            connectionFactory.closeConnection(con, stmt);
        }
    }

    //METODO LISTANDO TABELA CHAMADO TELA 6
    public List<Ocorrencia> read(){
        //CONEXOES COM O BANCO E VAR
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs= null;
        
        List<Ocorrencia> listagem= new ArrayList<>();
        try{
            stmt = con.prepareStatement("Select *from ocorrencia");
            //REALIZANDO A EXECUCTION
            rs=stmt.executeQuery();
            
            while(rs.next()){
                Ocorrencia ocorre = new Ocorrencia();
            
                ocorre.setData_ocorrencia(rs.getString("data_ocorrencia"));
                ocorre.setAssunto(rs.getString("assunto"));
                ocorre.setResposta(rs.getString("resposta"));
                
                //ADD NO ARRAY
                listagem.add(ocorre);
            }
        
        }catch(SQLException ex){
            Logger.getLogger(OcorrenciaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        //FINALIZA/SALVA O BANCO
        finally{
            connectionFactory.closeConnection(con, stmt);
        }
        
        return listagem;
    }
    
    public List<Ocorrencia> read2(){
        //CONEXOES COM O BANCO E VAR
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs= null;
        
        List<Ocorrencia> listagem= new ArrayList<>();
        try{
            stmt = con.prepareStatement("Select *from ocorrencia");
            //REALIZANDO A EXECUCTION
            rs=stmt.executeQuery();
            
            while(rs.next()){
                Ocorrencia ocorre = new Ocorrencia();
                
                ocorre.setProtocolo(rs.getInt("protocolo"));
                ocorre.setData_ocorrencia(rs.getString("data_ocorrencia"));
                ocorre.setAssunto(rs.getString("assunto"));
                ocorre.setResposta(rs.getString("resposta"));
                
                //ADD NO ARRAY
                listagem.add(ocorre);
            }
        
        }catch(SQLException ex){
            Logger.getLogger(OcorrenciaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        //FINALIZA/SALVA O BANCO
        finally{
            connectionFactory.closeConnection(con, stmt);
        }
        
        return listagem;
    }
    
}
