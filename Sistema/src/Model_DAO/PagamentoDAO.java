/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_DAO;

import Conexao_e_Tabela.connectionFactory;
import Model_Bean.Pagamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PagamentoDAO {
    public void create(Pagamento c){
        //CONEXOES COM O BANCO E VAR
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        //COMANDOS
        try{
            //COMANDO SE INSERT 
            stmt = con.prepareStatement("insert into pagamento(forma_pagamento)\n" +
                                        "values (?)");
            
            //SETANDO OS PARAMENTOS
            stmt.setString(1, c.getForma_pagamento());
            
            //REALIZANDO A EXECUCTION
            stmt.executeUpdate();
            
            //CHAMADA DA TELA DE CADASTRADO COM SUCESSO
            
        }catch(SQLException ex){
            Logger.getLogger(OcorrenciaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        //FINALIZA/SALVA O BANCO
        finally{
            connectionFactory.closeConnection(con, stmt);
        }
    }
public void consulta(Pagamento c) {
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("select * from pagamento");
            
            //CONFIGURANDO OS PARAMETROS
            stmt.setInt(1, c.getId_pagamento());
            stmt.setInt(2, c.getParcelas());
            stmt.setDate(3, c.getData_pagamento());
            stmt.setString(4, c.getForma_pagamento());
            stmt.setDouble(5, c.getValor_compra());
            stmt.setInt(6, c.getId_compra());
        } catch(SQLException ex){
            Logger.getLogger(OcorrenciaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        //FINALIZA/SALVA O BANCO
        finally{
            connectionFactory.closeConnection(con, stmt);
        }
}
}