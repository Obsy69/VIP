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
import vip.Divorce;

/**
 *
 * @author Obsy
 */
public class DaoDivorce {
    
        private Connection m_Connexion;
    
    public DaoDivorce(Connection Connexion) {
        m_Connexion = Connexion;
    }
    
    public void listerDivorces(List<Divorce> lesDivorces) throws SQLException {
        // la requete
        String requete = "SELECT * FROM DIVORCE";
        // execution de la requete
        Statement stat = m_Connexion.createStatement();
            try (ResultSet rset = stat.executeQuery(requete)) {
                while(rset.next())
                {
                    Divorce d = new Divorce(rset.getInt(1),rset.getDate(2),rset.getInt(3));
                    lesDivorces.add(d);
                }
            }
            catch(SQLException e)
            {
                System.out.println("Erreur daoDivorce : " + e);
            }
    }
    
}
