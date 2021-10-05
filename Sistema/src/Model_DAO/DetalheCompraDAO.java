/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_DAO;

import Conexao.connectionFactory;
import Model_Bean.Dea;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gusta
 */
public class DetalheCompraDAO {
    public void cria(Dea d) {
        //CONEXOES COM O BANCO E VAR
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        //COMANDOS
        try {
            //COMANDO SE INSERT 
            stmt = con.prepareStatement("insert into compra (auxiliador) VALUES(?)");

            //SETANDO OS PARAMENTOS DADOS
            stmt.setInt(1, d.getCod_compra());

            //REALIZANDO A EXECUCTION
            stmt.executeUpdate();

        }catch(SQLException ex){
            Logger.getLogger(DetalheCompraDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        //FINALIZA/SALVA O BANCO
        finally{
            connectionFactory.closeConnection(con, stmt);
        }
    }
}
