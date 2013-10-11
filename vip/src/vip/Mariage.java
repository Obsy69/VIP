/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vip;

import java.util.Date;

/**
 *
 * @author Obsy
 */
public class Mariage {
    private int m_numVip1;
    private Date m_dateMar;
    private int m_numVip2;
    private String m_etatM; // ACTIF ou NON ACTIF
    
    public Mariage(int numVip1, Date dateMar, int numVip2, String etatM)
    {
        m_numVip1 = numVip1;
        m_dateMar = dateMar;
        m_numVip2 = numVip2;
        m_etatM = etatM;
    }

    
}
