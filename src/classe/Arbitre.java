package classe; /**
 * Created by hugol on 18/12/2017.
 */

import java.util.ArrayList;
import java.util.GregorianCalendar;

/** @pdOid 0f0c0d36-316a-44b9-b5a4-bdc5ead832b5 */
public abstract class Arbitre {

    protected String nomArbitre;
    protected String nationaliteArbitre;
    protected String prenomArbitre;

    public abstract String getNomArbitre();
    public abstract void setNomArbitre(String nomArbitre);
    public abstract String getNationaliteArbitre();
    public abstract void setNationaliteArbitre(String nationaliteArbitre);
    public abstract String getPrenomArbitre();
    public abstract void setPrenomArbitre(String prenomArbitre);
    //méthode pour trouver l'emploi du temps de l'arbitre en fonction des matches deja programmés (qui sont donc dans listMach)
    public ArrayList<GregorianCalendar> findEmploiDuTemps(ArrayList<Match> listMatch){
        ArrayList<GregorianCalendar> listEDT = new ArrayList<>();
        for(Match m : listMatch){
            // dans le cas où c'est un arbitre de chaise
            if(m.getArbitreChaise() == this){
                listEDT.add(m.getDateMatch());
            }
            // si c'est un arbitre de ligne
            ArrayList<ArbitreLigne> listArbitreLigne = new ArrayList<>();
            listArbitreLigne = m.getListArbitreLigne();
            for (ArbitreLigne arbitreLigneList : listArbitreLigne){
                if(arbitreLigneList == this ){
                    listEDT.add(m.getDateMatch());
                }
            }
        }
        return listEDT;
    }
    //méthode pour savoir si l'arbitre est disponible en fonction d'un horraire donné
    public boolean arbitreDispoAHorraire(GregorianCalendar horraireMatch, ArrayList<Match> listMatch){
        ArrayList<GregorianCalendar> EDTArbitre = this.findEmploiDuTemps(listMatch);
        for (GregorianCalendar horraireArbitre : EDTArbitre){
            if(horraireArbitre == horraireMatch){
                return false;
            }
        }
        return true;
    }
    // méthode qui permet de voir si la contrainte de nationalitée est respéctée
    public boolean ArbitreBonneNationalite(ArrayList<Joueur> listJoueur){
        for (Joueur joeurDuMatch : listJoueur){
            if(this.getNationaliteArbitre() == joeurDuMatch.getNationaliteJoueur()){
                return false;
            }
        }
        return true;
    }


}
