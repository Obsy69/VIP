/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import vip.Vip;

/**
 *
 * @author Lucas
 */
public class ModeleVoicela {
    //  MonModele décrit le modèle de données pour la JTable
  private String[] nomsColonnes={ "Numéro", "Nom", "Prénom 1", "Prénom 2", "Prénom 3", "Profession", "Date de Naissance", "Date de Décès", "Lieu de Naissance", "Lieu de Décès", "Nationalité"};
  private java.util.ArrayList <Vip> donnees;
        
         public ModeleVoicela(java.util.ArrayList<Vip> vVip) {
            donnees = vVip;
           // ajout  d'un écouteur perso pour espionner les modif
          //this.addTableModelListener( new MonEcouteurTable() );
        }

        //@Override
        public int getColumnCount() {
            return nomsColonnes.length;
        }
       //@Override
        public int getRowCount() {
            return donnees.size();
        }
      // @Override
        public Object getValueAt(int row, int col) {
            if      ( col == 0 ) return donnees.get(row).getM_numVip();
            else if ( col == 1 ) return donnees.get(row).getM_nomVip();
            else if ( col == 2 ) return donnees.get(row).getM_prenom1Vip();
            else if ( col == 3 ) return donnees.get(row).getM_prenom2Vip();
            else if ( col == 4 ) return donnees.get(row).getM_prenom3Vip();
            else if ( col == 5 ) return donnees.get(row).getM_typeVip();
            else if ( col == 6 ) return donnees.get(row).getM_dateNaissVip();
            else if ( col == 7 ) return donnees.get(row).getM_dateDecesVip();
            else if ( col == 8 ) return donnees.get(row).getM_lieuNaissVip();
            else if ( col == 9 ) return donnees.get(row).getM_lieuDecesVip();
            else return donnees.get(row).getM_nationaliteVip();
        }

        //@Override
        public String getColumnName(int col) {
            return col >= 0 ? nomsColonnes[col] : null;
        }

        //@Override
        public Class getColumnClass(int c) {
            return getValueAt(0, c).getClass();
        }

       //@Override
        // Seul la première cellule n'est pas éditable
        public boolean isCellEditable(int row, int col) {
            return (  col != 0  ?  true : false );
        }

        //@Override
        // Seul la première cellule n'est pas éditable
        public void setValueAt(Object value, int row, int col) {
            if ( col == 1 )
                donnees.get(row).setM_nomVip((String)value );
            else if ( col == 2 )
                donnees.get(row).setM_prenom1Vip((String)value );
            else if ( col == 3 )
                donnees.get(row).setM_prenom2Vip((String)value );
            else if ( col == 4 )
                donnees.get(row).setM_prenom3Vip((String)value );
            else if ( col == 5 )
                donnees.get(row).setM_typeVip((String)value );
            else if ( col == 6) {}
                //donnees.get(row).setM_dateNaissVip(value);
            else if ( col == 7 ) {}
                //donnees.get(row).setM_dateDecesVip((String)value );
            else if ( col == 8 )
                donnees.get(row).setM_lieuNaissVip((String)value );
            else if ( col == 9 )
                donnees.get(row).setM_lieuDecesVip((String)value );
            else
                donnees.get(row).setM_nationaliteVip((String)value );
            
            fireTableCellUpdated( row, col );
        }
        // insertion en fin de table
        public void ajoutLigne(Personne p) {
            donnees.add(p);
            int ligne = donnees.size() - 1;
            fireTableChanged(new javax.swing.event.TableModelEvent(this,ligne,ligne,
                   javax.swing.event.TableModelEvent.ALL_COLUMNS,
                   javax.swing.event.TableModelEvent.INSERT) );
        }
        // suppression multiple selon la sélection
        public void suppLigne(int [ ] lesLignes) {
            int nb = lesLignes.length;
            if ( nb != 0 ) {
             java.util.ArrayList<Personne> donneesSupprimees = new java.util.ArrayList<Personne>();
             for (int i = 0; i < nb; i++ )  donneesSupprimees.add( donnees.get( lesLignes[i] ) );
 
                     // suppression du sous-vecteur donneesSupprimees du Vecteur donnees
             donnees.removeAll(donneesSupprimees); 
             fireTableRowsDeleted( lesLignes[0], lesLignes[nb-1] );
            }
            else
              javax.swing.JOptionPane.showMessageDialog(
                null,
                "Vous devez sélectionner une ou plusieurs lignes dans la table",
                "Information",
                javax.swing.JOptionPane.INFORMATION_MESSAGE);   
       }
}
