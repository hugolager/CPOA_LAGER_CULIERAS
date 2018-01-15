package classe;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * Created by hugol on 18/12/2017.
 */

public class EquipeRamasseur {
    private static int nbTotalEquipeRamasseur = 0;
    private int idEquipeRamasseur ;
    private String nomEquipe;
    public RamasseurDeBalles[] ramasseurDeBalles;


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
    public ArrayList<GregorianCalendar> findEDTEquipeRamasseur(ArrayList<Match> listMatch){
        ArrayList<GregorianCalendar> listEDT = new ArrayList<>();
        for(Match m : listMatch){
            // on ajoute dans liste des indisponibilitées tous les créneaux horraire ou le court est occupé
            if(m.getEquipeRamasseur1() == this || m.getEquipeRamasseur2() == this){
                listEDT.add(m.getDateMatch());
            }
        }
        return listEDT;
    }
    public boolean equipeRamasseurDispoAHorraire(GregorianCalendar horraireMatch, ArrayList<Match> listMatch){
        ArrayList<GregorianCalendar> EDTEquipeRamasseur = this.findEDTEquipeRamasseur(listMatch);
        for (GregorianCalendar horraireEquipeRamasseur : EDTEquipeRamasseur){
            if(horraireEquipeRamasseur == horraireMatch){
                return false;
            }
        }
        return true;
    }

}
