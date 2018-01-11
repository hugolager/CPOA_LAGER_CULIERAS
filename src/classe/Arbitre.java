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


    public java.util.Collection<ArbitreChaise> arbitreChaise;
    public java.util.Collection<ArbitreLigne> arbitreLigne;



    public java.util.Collection<ArbitreChaise> getArbitreChaise() {
        if (arbitreChaise == null)
            arbitreChaise = new java.util.HashSet<ArbitreChaise>();
        return arbitreChaise;
    }
    public abstract String getNomArbitre();
    public abstract void setNomArbitre(String nomArbitre);
    public abstract String getNationaliteArbitre();
    public abstract void setNationaliteArbitre(String nationaliteArbitre);
    public abstract String getPrenomArbitre();
    public abstract void setPrenomArbitre(String prenomArbitre);


    public java.util.Iterator getIteratorArbitreChaise() {
        if (arbitreChaise == null)
            arbitreChaise = new java.util.HashSet<ArbitreChaise>();
        return arbitreChaise.iterator();
    }

    /**
     * @param newArbitreChaise */
    public void setArbitreChaise(java.util.Collection<ArbitreChaise> newArbitreChaise) {
        removeAllArbitreChaise();
        for (java.util.Iterator iter = newArbitreChaise.iterator(); iter.hasNext();)
            addArbitreChaise((ArbitreChaise)iter.next());
    }

    /**
     * @param newArbitreChaise */
    public void addArbitreChaise(ArbitreChaise newArbitreChaise) {
        if (newArbitreChaise == null)
            return;
        if (this.arbitreChaise == null)
            this.arbitreChaise = new java.util.HashSet<ArbitreChaise>();
        if (!this.arbitreChaise.contains(newArbitreChaise))
            this.arbitreChaise.add(newArbitreChaise);
    }

    /**
     * @param oldArbitreChaise */
    public void removeArbitreChaise(ArbitreChaise oldArbitreChaise) {
        if (oldArbitreChaise == null)
            return;
        if (this.arbitreChaise != null)
            if (this.arbitreChaise.contains(oldArbitreChaise))
                this.arbitreChaise.remove(oldArbitreChaise);
    }


    public void removeAllArbitreChaise() {
        if (arbitreChaise != null)
            arbitreChaise.clear();
    }
    public java.util.Collection<ArbitreLigne> getArbitreLigne() {
        if (arbitreLigne == null)
            arbitreLigne = new java.util.HashSet<ArbitreLigne>();
        return arbitreLigne;
    }

    public java.util.Iterator getIteratorArbitreLigne() {
        if (arbitreLigne == null)
            arbitreLigne = new java.util.HashSet<ArbitreLigne>();
        return arbitreLigne.iterator();
    }

    /**
     * @param newArbitreLigne */
    public void setArbitreLigne(java.util.Collection<ArbitreLigne> newArbitreLigne) {
        removeAllArbitreLigne();
        for (java.util.Iterator iter = newArbitreLigne.iterator(); iter.hasNext();)
            addArbitreLigne((ArbitreLigne)iter.next());
    }

    /**
     * @param newArbitreLigne */
    public void addArbitreLigne(ArbitreLigne newArbitreLigne) {
        if (newArbitreLigne == null)
            return;
        if (this.arbitreLigne == null)
            this.arbitreLigne = new java.util.HashSet<ArbitreLigne>();
        if (!this.arbitreLigne.contains(newArbitreLigne))
            this.arbitreLigne.add(newArbitreLigne);
    }

    /**
     * @param oldArbitreLigne */
    public void removeArbitreLigne(ArbitreLigne oldArbitreLigne) {
        if (oldArbitreLigne == null)
            return;
        if (this.arbitreLigne != null)
            if (this.arbitreLigne.contains(oldArbitreLigne))
                this.arbitreLigne.remove(oldArbitreLigne);
    }

    public void removeAllArbitreLigne() {
        if (arbitreLigne != null)
            arbitreLigne.clear();
    }
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
    public boolean ArbitreDispoAHorraire(GregorianCalendar horraireMatch, ArrayList<Match> listMatch){
        ArrayList<GregorianCalendar> EDTArbitre = new ArrayList<>();
        EDTArbitre = this.findEmploiDuTemps(listMatch);
        for (GregorianCalendar horraireArbitre : EDTArbitre){
            if(horraireArbitre == horraireMatch){
                return false;
            }
        }
        return true;
    }
    public boolean ArbitreBonneNationalite(ArrayList<Joueur> listJoueur){
        for (Joueur joeurDuMatch : listJoueur){
            if(this.getNationaliteArbitre() == joeurDuMatch.getNationaliteJoueur()){
                return false;
            }
        }
        return true;
    }


}
