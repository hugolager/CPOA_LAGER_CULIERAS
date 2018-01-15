package classe; /**
 * Created by hugol on 18/12/2017.
 */
import exception.CreneauException;
import java.util.*;


public class Court {
    private String nomCourt;
    private static int nbTotalCourt = 0;
    private int idCourt;
    private int capacite;
    private ArrayList<GregorianCalendar> listReservation = new ArrayList<>();

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

    public ArrayList<GregorianCalendar> getListReservation() {
        return listReservation;
    }
    // méthode qui permet d'avoir l'emploi du temps du court (on affiche pas les réservations pour entrainement car elles ne sont pas prioritaires
    public ArrayList<GregorianCalendar> findDisponibilitee(ArrayList<Match> listMatch){
        ArrayList<GregorianCalendar> listIndispo = new ArrayList<>();
        for(Match m : listMatch){
            // on ajoute dans liste des indisponibilitées tous les créneaux horraires ou le court est occupé
            if(m.getCourt() == this){
                listIndispo.add(m.getDateMatch());
            }
        }
        return listIndispo;
    }
    // méthode qui permet de savoir si le court est disponible à un horaire donné
    public boolean courtDispoAHorraire(GregorianCalendar horraireMatch, ArrayList<Match> listMatch){
        ArrayList<GregorianCalendar> EDTCourt = new ArrayList<>();
        EDTCourt = this.findDisponibilitee(listMatch);
        for (GregorianCalendar horraireArbitre : EDTCourt){
            if(horraireArbitre == horraireMatch){
                return false;
            }
        }
        return true;
    }
    // méthode qui permet de reserver un court d'entrainement
    public void setReserverCourtEntrainement(GregorianCalendar horraireReservation, ArrayList<Match> listMatch){
        boolean disponible = courtDispoAHorraire(horraireReservation,listMatch);
        ArrayList<GregorianCalendar> listReservation = this.getListReservation();
        try {
            for (GregorianCalendar reservation : listReservation) {
                if (reservation == horraireReservation) {
                    throw new CreneauException("Le court est déjà réservé à cette horaire");
                }
            }
            if (disponible) {
                listReservation.add(horraireReservation);
            } else {
                throw new CreneauException("Le court n'est pas disponible il y a un match");
            }
        }catch (CreneauException e1){
            e1.getMessage();
        }
    }

}
