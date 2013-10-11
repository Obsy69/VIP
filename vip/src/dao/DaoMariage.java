/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import vip.Mariage;
import vip.Vip;

/**
 *
 * @author Obsy
 */
public class DaoMariage {
    
    private Connection m_Connexion;
    
    public DaoMariage(Connection Connexion) {
        m_Connexion = Connexion;
    }
    
    public void listerMariages(List<Mariage> lesMariages) throws SQLException {
        // la requete
        String requete = "SELECT * FROM MARIAGE";
        // execution de la requete
        Statement stat = m_Connexion.createStatement();
            try (ResultSet rset = stat.executeQuery(requete)) {
                while(rset.next())
                {
                    Mariage m = new Mariage(rset.getInt(1),rset.getDate(2),rset.getInt(3), rset.getString(4));
                    lesMariages.add(m);
                }
            }
            catch(SQLException e)
            {
                System.out.println("Erreur daoMariage : " + e);
            }
    }
    
}
