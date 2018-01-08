package classe; /**
 * Created by hugol on 18/12/2017.
 */
import java.util.*;


public class Joueur {
    private static int numJoueur = 0;
    private int idJoueur;
    private String prenomJoueur;
    private String nomJoueur;
    private String nationaliteJoueur;
    private int classementJoueur;

    public Joueur(String prenom, String nom, String nationalite, int classement) {
        this.numJoueur++;
        this.idJoueur = numJoueur;
        this.prenomJoueur = prenom;
        this.nomJoueur = nom;
        this.nationaliteJoueur = nationalite;
        this.classementJoueur = classement;
    }

    public int getIdJoueur() {
        return idJoueur;
    }

    public static int getNumJoueur() {
        return numJoueur;
    }

    public String getPrenom() {
        return prenomJoueur;
    }

    public void setPrenom(String prenom) {
        this.prenomJoueur = prenom;
    }

    public String getNom() {
        return nomJoueur;
    }

    public void setNom(String nom) {
        this.nomJoueur = nom;
    }

    public String getNationaliteJoueur() {
        return nationaliteJoueur;
    }

    public void setNationaliteJoueur(String nationalite) {
        this.nationaliteJoueur = nationalite;
    }

    public int getClassementJoueur() {
        return classementJoueur;
    }

    public void setClassementJoueur(int classement) {
        this.classementJoueur = classement;
    }

    public static boolean classementIsValid(ArrayList<Joueur> listJoueur, Joueur joueurACreer){
        for (Joueur joueur : listJoueur ){
            if (joueur.getClassementJoueur() == joueurACreer.getClassementJoueur()){
                return false;
            }
        }
        return true;
    }

    public java.util.Collection<Match> match;


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