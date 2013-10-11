/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import vip.Vip;
import java.util.*;

/**
 *
 * @author Obsy
 */
public class DaoVip {
    
    private Connection m_Connexion;
    
    public DaoVip(Connection Connexion) {
        m_Connexion = Connexion;
    }
    
    public void listerEmp(List<Vip> lesVip) throws SQLException {
        // la requete
        String requete = "SELECT * FROM VIP";
        // execution de la requete
        Statement stat=m_Connexion.createStatement();
            try (ResultSet rset = stat.executeQuery(requete)) {
                while(rset.next())
                {
                    Vip v = new Vip(rset.getInt(1),rset.getString(2),rset.getString(3), rset.getString(4), rset.getString(5),
                                    rset.getString(6), rset.getDate(7), rset.getDate(8), rset.getString(9), rset.getString(10),
                                    rset.getString(11));
                    lesVip.add(v);
                }
            }
            catch(SQLException e)
            {
                System.out.println("Erreur daoVip : " + e);
            }
    }
}
    
    

