package classe; /**
 * Created by hugol on 18/12/2017.
 */
import java.util.*;


public class RamasseurDeBalles {
    private static int nbTotalRamasseur=0;
    private int idRamasseur;
    private String nom;
    private String prenom;


    public RamasseurDeBalles(String nom, String prenom) {
        this.nbTotalRamasseur++;
        this.idRamasseur = nbTotalRamasseur;
        this.nom = nom;
        this.prenom = prenom;

    }
    public int getIdRamasseur(){return idRamasseur;}

    public static int getNbTotalRamasseur() {
        return nbTotalRamasseur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }





}
