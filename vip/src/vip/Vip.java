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
public class Vip {
    private int m_numVip;
    private String m_nomVip;
    private String m_prenom1Vip;
    private String m_prenom2Vip;
    private String m_prenom3Vip;
    private String m_typeVip; // ACTEUR, REALISATEUR, ou AUTRE
    private Date m_dateNaissVip;
    private Date m_dateDecesVip;
    private String m_lieuNaissVip;
    private String m_lieuDecesVip;
    private String m_nationaliteVip;
    
    public Vip(int numVip, String nomVip, String prenom1Vip, String prenom2Vip, String prenom3Vip, String typeVip, Date dateNaissVip, Date dateDecesVip, String lieuNaissVip, String lieuDecesVip, String nationaliteVip)
    {
        m_numVip = numVip;
        m_nomVip = nomVip;
        m_prenom1Vip = prenom1Vip;
        m_prenom2Vip = prenom2Vip;
        m_prenom3Vip = prenom3Vip;
        m_typeVip = typeVip;
        m_dateNaissVip = dateNaissVip;
        m_dateDecesVip = dateDecesVip;
        m_lieuNaissVip = lieuNaissVip;
        m_lieuDecesVip = lieuDecesVip;
        m_nationaliteVip = nationaliteVip;
    }

    public int getM_numVip() {
        return m_numVip;
    }

    public String getM_nomVip() {
        return m_nomVip;
    }

    public String getM_prenom1Vip() {
        return m_prenom1Vip;
    }

    public String getM_prenom2Vip() {
        return m_prenom2Vip;
    }

    public String getM_prenom3Vip() {
        return m_prenom3Vip;
    }

    public String getM_typeVip() {
        return m_typeVip;
    }

    public Date getM_dateNaissVip() {
        return m_dateNaissVip;
    }

    public Date getM_dateDecesVip() {
        return m_dateDecesVip;
    }

    public String getM_lieuNaissVip() {
        return m_lieuNaissVip;
    }

    public String getM_lieuDecesVip() {
        return m_lieuDecesVip;
    }

    public String getM_nationaliteVip() {
        return m_nationaliteVip;
    }

    public void setM_numVip(int m_numVip) {
        this.m_numVip = m_numVip;
    }

    public void setM_nomVip(String m_nomVip) {
        this.m_nomVip = m_nomVip;
    }

    public void setM_prenom1Vip(String m_prenom1Vip) {
        this.m_prenom1Vip = m_prenom1Vip;
    }

    public void setM_prenom2Vip(String m_prenom2Vip) {
        this.m_prenom2Vip = m_prenom2Vip;
    }

    public void setM_prenom3Vip(String m_prenom3Vip) {
        this.m_prenom3Vip = m_prenom3Vip;
    }

    public void setM_typeVip(String m_typeVip) {
        this.m_typeVip = m_typeVip;
    }

    public void setM_dateNaissVip(Date m_dateNaissVip) {
        this.m_dateNaissVip = m_dateNaissVip;
    }

    public void setM_dateDecesVip(Date m_dateDecesVip) {
        this.m_dateDecesVip = m_dateDecesVip;
    }

    public void setM_lieuNaissVip(String m_lieuNaissVip) {
        this.m_lieuNaissVip = m_lieuNaissVip;
    }

    public void setM_lieuDecesVip(String m_lieuDecesVip) {
        this.m_lieuDecesVip = m_lieuDecesVip;
    }

    public void setM_nationaliteVip(String m_nationaliteVip) {
        this.m_nationaliteVip = m_nationaliteVip;
    }
    
}
