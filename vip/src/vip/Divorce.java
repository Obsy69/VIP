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
public class Divorce {
    private int m_numVip1;
    private Date m_dateDiv;
    private int m_numVip2;
    
    public Divorce( int numVip1, Date dateDiv, int numVip2)
    {
        m_numVip1 = numVip1;
        m_dateDiv = dateDiv;
        m_numVip2 = numVip2;
    }
}
