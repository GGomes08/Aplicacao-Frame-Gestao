package Model_DAO;

import Conexao_e_Tabela.connectionFactory;
import Model_Bean.Ranking;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RankingDAO {
    
    //METODO LISTANDO TABELA CHAMADO TELA 6
    public List<Ranking> read(){
        //CONEXOES COM O BANCO E VAR
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs= null;
        
        List<Ranking> listagem= new ArrayList<>();
        try{
            stmt = con.prepareStatement("Select *from ranking order by qtd_vendas desc");
            //REALIZANDO A EXECUCTION
            rs=stmt.executeQuery();
            
            while(rs.next()){
                Ranking rk = new Ranking();
                
                rk.setCod_barras(rs.getString("cod_barras"));
                rk.setQtd_vendas(rs.getInt("qtd_vendas"));
                rk.setId_ranking(rs.getInt("id_ranking"));
                //ADD NO ARRAY
                listagem.add(rk);
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
