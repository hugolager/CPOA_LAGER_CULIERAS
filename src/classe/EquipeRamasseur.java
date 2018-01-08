package classe; /**
 * Created by hugol on 18/12/2017.
 */

public class EquipeRamasseur {
    private static int nbTotalEquipeRamasseur = 0;
    private int idEquipeRamasseur ;
    private String nomEquipe;
    public RamasseurDeBalles[] ramasseurDeBalles;
    public java.util.Collection<Match> match;

    public EquipeRamasseur(String nomEquipe, RamasseurDeBalles[] ramasseurDeBalles) {
        this.nomEquipe = nomEquipe;
        this.ramasseurDeBalles = ramasseurDeBalles;
        this.nbTotalEquipeRamasseur++;
        this.idEquipeRamasseur = nbTotalEquipeRamasseur;
    }

    public static int getNbTotalEquipeRamasseur() {
        return nbTotalEquipeRamasseur;
    }

    public int getIdEquipeRamasseur(){
        return idEquipeRamasseur;
    }

    public String getNomEquipe() {
        return nomEquipe;
    }

    public void setNomEquipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
    }

    public RamasseurDeBalles[] getRamasseurDeBalles() {
        return ramasseurDeBalles;
    }

    public void setRamasseurDeBalles(RamasseurDeBalles[] ramasseurDeBalles) {
        this.ramasseurDeBalles = ramasseurDeBalles;
    }

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
