package classe; /**
 * Created by hugol on 18/12/2017.
 */
import classe.Arbitre;


public class ArbitreLigne extends Arbitre {
    private String mailArbitreLigne;
    public static  int nbTotalArbitreLigne=0;
    private int idArbitreLigne;
    public java.util.Collection<Match> match;

    public ArbitreLigne(String nomArbitreLigne,String prenomArbitreLigne,String nationaliteArbitreLigne,String mailArbitreLigne) {
        this.nomArbitre= nomArbitreLigne;
        this.prenomArbitre = prenomArbitreLigne;
        this.nationaliteArbitre = nationaliteArbitreLigne;
        this.mailArbitreLigne = mailArbitreLigne;
        this.nbTotalArbitreLigne++;
        this.idArbitreLigne = nbTotalArbitreLigne;
    }

    @Override
    public String getNomArbitre() {
        return  nomArbitre;
    }

    @Override
    public void setNomArbitre(String nomArbitreLigne) {
        this.nomArbitre = nomArbitreLigne;
    }

    @Override
    public String getNationaliteArbitre() {
        return nationaliteArbitre;
    }

    @Override
    public void setNationaliteArbitre(String nationaliteArbitreLigne) {
        this.nationaliteArbitre = nationaliteArbitreLigne;
    }

    @Override
    public String getPrenomArbitre() {
        return prenomArbitre;
    }

    @Override
    public void setPrenomArbitre(String prenomArbitreLigne) {
        this.prenomArbitre = prenomArbitreLigne;
    }

    public String getMailArbitreLigne() {
        return mailArbitreLigne;
    }

    public void setMailArbitreLigne(String mailArbitreLigne) {
        this.mailArbitreLigne = mailArbitreLigne;
    }

    public static int getNbTotalArbitreLigne() {
        return nbTotalArbitreLigne;
    }
    public int getIdArbitreLigne(){return idArbitreLigne;}

    public java.util.Collection<Match> getMatch() {
        if (match == null)
            match = new java.util.HashSet<Match>();
        return match;
    }

    public java.util.Iterator getIteratorMatch() {
        if (match == null)
            match = new java.util.HashSet<Match>();
        return match.iterator();
    }

    /**
     * @param newMatch */
    public void setMatch(java.util.Collection<Match> newMatch) {
        removeAllMatch();
        for (java.util.Iterator iter = newMatch.iterator(); iter.hasNext();)
            addMatch((Match)iter.next());
    }

    /**
     * @param newMatch */
    public void addMatch(Match newMatch) {
        if (newMatch == null)
            return;
        if (this.match == null)
            this.match = new java.util.HashSet<Match>();
        if (!this.match.contains(newMatch))
            this.match.add(newMatch);
    }

    /**
     * @param oldMatch */
    public void removeMatch(Match oldMatch) {
        if (oldMatch == null)
            return;
        if (this.match != null)
            if (this.match.contains(oldMatch))
                this.match.remove(oldMatch);
    }


    public void removeAllMatch() {
        if (match != null)
            match.clear();
    }


}
