package classe; /**
 * Created by hugol on 18/12/2017.
 */
import java.util.*;


public class Court {
    private String nomCourt;
    private static int nbTotalCourt = 0;
    private int idCourt;
    private int capacite;
    public java.util.Collection<Match> match;

    public Court(String nomCourt, int capacite) {
        this.nomCourt = nomCourt;
        this.nbTotalCourt++;
        this.idCourt = nbTotalCourt;
        this.capacite = capacite;
    }

    public static int getNbTotalCourt() {
        return nbTotalCourt;
    }
    public int getIdCourt(){return idCourt;}

    public String getNomCourt() {
        return nomCourt;
    }

    public void setNomCourt(String nomCourt) {
        this.nomCourt = nomCourt;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
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
