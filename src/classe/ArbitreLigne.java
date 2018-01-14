package classe; /**
 * Created by hugol on 18/12/2017.
 */
import classe.Arbitre;

import java.util.ArrayList;
import java.util.GregorianCalendar;


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
}
