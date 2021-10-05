package Model_DAO;


import Conexao_e_Tabela.connectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO {

    public int verificaLogin(String login, String senha) {

        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        //VAR VERIFICADORA
        int identifica=0;

        try {
            //
            stmt = con.prepareStatement("select * from funcionario where login = ? and senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();

            if (rs.next()){
                if("Gusta_Gomes".equals(login)){
                    identifica=2;
                }
                if("Biel_Felipe".equals(login)){
                    identifica=1;
                }
                if("sammy_lo123".equals(login)){
                    identifica=2;
                }
                
                if("Yudy_Kitahara".equals(login)){
                    identifica=1;
                }
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            connectionFactory.closeConnection(con, stmt, rs);
        }

        return identifica;
    }

}
