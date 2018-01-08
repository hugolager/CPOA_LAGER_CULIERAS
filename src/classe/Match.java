package classe; /**
 * Created by hugol on 18/12/2017.
 */
import classe.ArbitreChaise;
import classe.ArbitreLigne;
import classe.EquipeRamasseur;
import classe.Joueur;
import exception.NationaliteException;

import java.util.*;


public class Match {
    private static int nbTotalMatch = 0;
    private int idMatch;
    private GregorianCalendar dateMatch;
    private static ArrayList<Match> listMatch = new ArrayList<>();
    private ArrayList<Joueur> listJoueurMatch = new ArrayList<>();
    private ArbitreChaise arbitreChaise;
    private ArrayList<ArbitreLigne> listArbitreLigne = new ArrayList<>();
    private EquipeRamasseur equipeRamasseur1, equipeRamasseur2;
    private Court court;

    public Match( GregorianCalendar dateMatch, ArbitreChaise arbitreChaise, EquipeRamasseur equipeRamasseur1, EquipeRamasseur equipeRamasseur2,
                 ArrayList<Joueur> listJoueurMatch, ArrayList<ArbitreLigne> listArbitreLignes) throws NationaliteException {
        for (Joueur joueur : listJoueurMatch ) {
            if (arbitreChaise.getNationaliteArbitre() == joueur.getNationaliteJoueur()) {
                throw new NationaliteException("La nationalite de l'arbitre de chaise doit être différente de celle des joueurs");
            }
            for (ArbitreLigne arbitreLigne : listArbitreLignes) {
                if (joueur.getNationaliteJoueur() == arbitreLigne.getNationaliteArbitre()) {
                    throw new NationaliteException("La nationalite des arbitres de lignes doit être différente de celle des joueurs ");
                }
            }
        }
        this.listJoueurMatch = listJoueurMatch;
        this.court = court;
        this.equipeRamasseur1 = equipeRamasseur1;
        this.equipeRamasseur2 = equipeRamasseur2;
        this.arbitreChaise = arbitreChaise;
        this.listArbitreLigne = listArbitreLignes;
        this.dateMatch = dateMatch;
        this.nbTotalMatch++;
        this.idMatch = nbTotalMatch;

    }
    public Match(ArbitreChaise arbitreChaise, ArrayList<Joueur> listJoueurMatch, ArrayList<ArbitreLigne> listArbitreLigne){
        this.arbitreChaise = arbitreChaise;
        this.listJoueurMatch = listJoueurMatch;
        this.listArbitreLigne = listArbitreLigne;


    }

    public Match() {
    }

    public void setListJoueurMatch(ArrayList<Joueur> listJoueurMatch) {
        this.listJoueurMatch = listJoueurMatch;
    }

    public void setArbitreChaise(ArbitreChaise arbitreChaise) {
        this.arbitreChaise = arbitreChaise;
    }

    public void setListArbitreLigne(ArrayList<ArbitreLigne> listArbitreLigne) {
        this.listArbitreLigne = listArbitreLigne;
    }

    public void setEquipeRamasseur1(EquipeRamasseur equipeRamasseur1) {
        this.equipeRamasseur1 = equipeRamasseur1;
    }

    public void setEquipeRamasseur2(EquipeRamasseur equipeRamasseur2) {
        this.equipeRamasseur2 = equipeRamasseur2;
    }



    public int getNbTotalMatch() {
        return nbTotalMatch;
    }
    public static boolean creneauIsValide(ArrayList<Match> listMatch, GregorianCalendar dateMatch,Court newCourt ){
        // On teste si l'heure du match est dans les créneaux qu'on a prédéfini.
        if (dateMatch.get(Calendar.HOUR_OF_DAY) != 8 || dateMatch.get(Calendar.HOUR_OF_DAY) != 11 || dateMatch.get(Calendar.HOUR_OF_DAY) != 15
                || dateMatch.get(Calendar.HOUR_OF_DAY) != 18 || dateMatch.get(Calendar.HOUR_OF_DAY) != 21  ){
            return false;
        }
        return true;
    }


    public GregorianCalendar getDateMatch() {
        return dateMatch;
    }

    public ArbitreChaise getArbitreChaise() {
        return arbitreChaise;
    }

    public ArrayList<ArbitreLigne> getListArbitreLigne() {
        return listArbitreLigne;
    }

    public EquipeRamasseur getEquipeRamasseur1() {
        return equipeRamasseur1;
    }

    public EquipeRamasseur getEquipeRamasseur2() {
        return equipeRamasseur2;
    }

    public void setDateMatch(GregorianCalendar dateMatch) {

        this.dateMatch = dateMatch;
    }

    public static ArrayList<Match> getListMatch() {
        return listMatch;
    }
    public Court getCourt(){return court;}

    public void setCourt(Court court) {
        this.court = court;
    }

    public ArrayList<Joueur> getJoueurMatch(){
        return listJoueurMatch;

    }
    public void setJoueurPerdant(Joueur joueurPerdant, ArrayList<Joueur> listJoueurSimple){
        listJoueurSimple.remove(joueurPerdant);
        //on enlève de la liste de tous les joueurs de simple ceux qui ont perdu leur match pour pas pouvoir repporgrammer de match
    }
    public void setJoueursPerdants(ArrayList<Joueur> listJoueurMatch, ArrayList<Joueur> listJoueurDouble){
        //A voir si on met les joueurs de double dans des tableaux ou dans des listes
    }
}
