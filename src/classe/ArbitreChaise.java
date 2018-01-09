package classe;

import classe.Arbitre;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * Created by hugol on 18/12/2017.
 */

public class ArbitreChaise extends Arbitre {
    private int nbMatchSimple = 0;
    private int nbMatchDouble = 0;
    private static int nbTotalArbitreChaise=0;
    private int idArbitreChaise;
    private String mailArbitreChaise;

    public ArbitreChaise(String mailArbitreChaise, String prenomArbitreChaise,String nomArbitreChaise, String nationaliteArbitreChaise) {
        this.mailArbitreChaise = mailArbitreChaise;
        this.prenomArbitre = prenomArbitreChaise;
        this.nomArbitre = nomArbitreChaise;
        this.nationaliteArbitre = nationaliteArbitreChaise;
        this.nbTotalArbitreChaise++;
        this.idArbitreChaise = nbTotalArbitreChaise;
    }

    public static int getNbTotalArbitreChaise() {
        return nbTotalArbitreChaise;
    }
    public int getIdArbitreChaise(){
        return idArbitreChaise;
    }
    public String getMailArbitreChaise() {
        return mailArbitreChaise;
    }

    public void setMailArbitreChaise(String mailArbitreChaise) {
        this.mailArbitreChaise = mailArbitreChaise;
    }
    public String getNomArbitre(){
        return nomArbitre;
    }


    public void setNomArbitre(String nomArbitreChaise) {
        this.nomArbitre = nomArbitreChaise;
    }

    @Override
    public String getNationaliteArbitre() {
        return nationaliteArbitre;
    }


    public void setNationaliteArbitre(String nationaliteArbitreChaise) {
        this.nationaliteArbitre = nationaliteArbitreChaise;
    }


    public String getPrenomArbitre(){
        return prenomArbitre;
    }


    public void setPrenomArbitre(String prenomArbitreChaise) {
        this.prenomArbitre = prenomArbitreChaise;

    }



    public int getNbMatchSimple() {
        return nbMatchSimple;
    }

    public void addMatchSimple() {
        nbMatchSimple++;
    }
    public void removeMatchSimple(){
        nbMatchSimple--;
    }

    public int getNbMatchDouble() {
        return nbMatchDouble;
    }

    public void addMatchDouble() {
        nbMatchDouble++;
    }

}