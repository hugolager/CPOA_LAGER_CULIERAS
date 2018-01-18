package main;

import classe.*;
import exception.CreneauException;
import exception.NationaliteException;
import exception.NbMatchLimiteException;
import exception.ReposException;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by hugol on 18/12/2017.
 */
public class Application {
    public static void main(String Args[]) throws IOException {
         /*
        ArrayList<ArbitreChaise> listArbitreChaise = new ArrayList<>();



        ArrayList<ArbitreLigne> listArbitreLigne1 = new ArrayList<>();


        RamasseurDeBalles[] tabRamasseur1 = new RamasseurDeBalles[]{ramasseurDeBalles1, ramasseurDeBalles2, ramasseurDeBalles3,
                ramasseurDeBalles4, ramasseurDeBalles5, ramasseurDeBalles6};
        RamasseurDeBalles[] tabRamasseur2 = new RamasseurDeBalles[]{ramasseurDeBalles7, ramasseurDeBalles8, ramasseurDeBalles9,
                ramasseurDeBalles10, ramasseurDeBalles11, ramasseurDeBalles12};


        EquipeRamasseur equipeRamasseur1 = new EquipeRamasseur("les chalamontais", tabRamasseur1);
        EquipeRamasseur equipeRamasseur2 = new EquipeRamasseur("les villardois", tabRamasseur2);

        ArrayList<Joueur> listJoueur = new ArrayList<>();
       */


        /*
        ArrayList<Match> listMatch = Match.getListMatch();
        // la partie qui sert à rentrer le résultat sera programmer sur l'interface
        Application testApplication = new Application();
        // testApplication.genererTableau(listJoueur,listMatch);
        // cette partie sera réalisé via l'interface
        // Test des méthodes programmer un match et findEDT
        GregorianCalendar calandarTest = new GregorianCalendar(2018, 03, 17, 11, 00);
        ArrayList<Joueur> listJoueurMatchTest = new ArrayList<>();
        listJoueurMatchTest.add(joueur19);
        listJoueurMatchTest.add(joueur32);
        Court courtPrincipal = new Court("Court Principal", 5600);
        //testApplication.programmerUnMatch(listMatch,calandarTest,courtPrincipal,listJoueurMatchTest,equipeRamasseur1,equipeRamasseur2,arbitreChaise1,
        //        listArbitreLigne1,true);
        ArrayList<GregorianCalendar> EDT = new ArrayList<>();
        EDT = arbitreChaise1.findEmploiDuTemps(listMatch);
        ArrayList<Arbitre> arbitreArrayListTest = new ArrayList<>();
        arbitreArrayListTest = testApplication.findArbitre(listJoueur,calandarTest,true, listArbitreChaise,listArbitreLigne1,listMatch);
        for(Arbitre arbitreTest : arbitreArrayListTest){
            System.out.println("les arbitres sont : " + arbitreTest.getPrenomArbitre() + " " + arbitreTest.getNomArbitre());
        }

       */


        File file = new File("src/assets/joueur.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();

    }

    // méthode qui permet de programmer un match de manière prioritaire sur les entrainements
    public void programmerUnMatch(ArrayList<Match> listMatch, GregorianCalendar horraireDuMatch, Court courtDuMatch,
                                  ArrayList<Joueur> listJoueurDuMatch, EquipeRamasseur equipeRamasseur1, EquipeRamasseur equipeRamasseur2,
                                  ArbitreChaise arbitreChaise, ArrayList<ArbitreLigne> listArbitreLigneDuMatch, boolean matchDeQualification) {
        try {

            if(!matchDeQualification){ /* boolean utile pour savoir si c'est un match de qualification ou non car la contrainte du nombre de match
            arbitré par l'arbitre n'existe pas dans le cadre d'un match de qualification
            */
                if(listJoueurDuMatch.size() == 2) { // test si c'est un match simple on regarde le nombre de match simple arbitré par l'arbitre
                    if (arbitreChaise.getNbMatchSimple() < 2){
                        throw new NbMatchLimiteException("cet arbitre a dépassé son nombre de match simple maximum à arbitrer");
                    }
                }
                if(listJoueurDuMatch.size() == 4){
                    if (arbitreChaise.getNbMatchDouble() < 2){
                        throw new NbMatchLimiteException("cet arbitre a dépassé son nombre de match double maximum à arbitrer");
                    }
                }
            }
            for (Match matchList : listMatch) {
                if (matchList.getDateMatch() == horraireDuMatch) {
                    if (matchList.getArbitreChaise() == arbitreChaise) {
                        throw new CreneauException("l'arbitre de chaise n'est pas disponible à cette horraire");
                    }
                    if (matchList.getEquipeRamasseur1() == equipeRamasseur1) {
                        throw new CreneauException("l'equipe ramasseur 1 n'est pas disponible à cette horraire");
                    }
                    if (matchList.getEquipeRamasseur2() == equipeRamasseur2) {
                        throw new CreneauException("l'equipe ramasseur 2 n'est pas disponible à cette horraire");
                    }
                    if (matchList.getCourt() == courtDuMatch) {
                        throw new CreneauException("le court n'est pas disponible à cette horraire");
                    }
                    ArrayList<ArbitreLigne> listArbitreLigne = new ArrayList<>();
                    listArbitreLigne = matchList.getListArbitreLigne();
                    for (ArbitreLigne arbitreLigneList : listArbitreLigne) {
                        for (ArbitreLigne arbitreLigne : listArbitreLigneDuMatch) {
                            if (arbitreLigneList.getIdArbitreLigne() == arbitreLigne.getIdArbitreLigne()) {
                                throw new CreneauException("l'arbitre de ligne" + arbitreLigneList.getPrenomArbitre() + " " +
                                        arbitreLigneList.getNomArbitre() + " n'est pas disponible à cette horraire");
                            }
                        }
                    }
                }
                if(!matchDeQualification) { // La contrainte du repos n'est pas valable dans le cas d'un match de qualification
                    ArrayList<Joueur> joueurArrayList = new ArrayList<>();
                    joueurArrayList = matchList.getJoueurMatch();
                    GregorianCalendar dateDuMatch = matchList.getDateMatch();
                    int jourDumatch = dateDuMatch.get(dateDuMatch.DAY_OF_WEEK);
                    int heureDuMatch = dateDuMatch.get(dateDuMatch.HOUR_OF_DAY);
                    // -3 -6 ou -4
                    if (jourDumatch == horraireDuMatch.get(horraireDuMatch.DAY_OF_WEEK)) {
                        if (horraireDuMatch.get(horraireDuMatch.HOUR_OF_DAY) - 3 == heureDuMatch ||
                                horraireDuMatch.get(horraireDuMatch.HOUR_OF_DAY) - 4 == heureDuMatch ||
                                horraireDuMatch.get(horraireDuMatch.HOUR_OF_DAY) - 6 == heureDuMatch) {
                            throw new ReposException("le joueur ne peut pas jouer dans la même demi-journée");
                        }
                    }
                }
            }
            if (!Match.creneauIsValide(horraireDuMatch)) {
                throw new CreneauException("le créneau n'est pas valide");
            }
            Match matchAProgrammer = new Match(horraireDuMatch, arbitreChaise, equipeRamasseur1, equipeRamasseur2, listJoueurDuMatch, listArbitreLigneDuMatch);
            listMatch.add(matchAProgrammer);

        } catch (NationaliteException e1) {
            System.err.println(e1.getMessage());
        } catch (CreneauException e2) {
            System.err.println(e2.getMessage());
        } catch (ReposException e3) {
            System.err.println(e3.getMessage());
        } catch (NbMatchLimiteException e4){
            System.err.println(e4.getMessage());
        }
    }
    // génération du premier tour de manière random sur les joueurs
    public void genererTableau(ArrayList<Joueur> listJoueur, ArrayList<Match> listMatch) {
        ArrayList<Joueur> listClone = listJoueur;
        int i = 0;
        int compteurDeMatch = 0;
        while(i < 16){ // il doit y avoir 16 matchs au premier tour étant donné qu'il y a 32 joueurs
            Random rand1 = new Random(); // random1 pour le joueur 1
            Random rand2 = new Random(); // random2 pour le joueur 2
            int randomJ1 = rand1.nextInt(listClone.size());
            int randomJ2 = rand2.nextInt(listClone.size());

            if (randomJ1 != randomJ2) { //test pour eviter un match avec les deux mêmes joueur
                ArrayList<Joueur> listJoueurNewMatch = new ArrayList<>();
                // création de la liste des joueurs pour le match
                Joueur joueur1 = listJoueur.get(randomJ1);
                Joueur joueur2 = listJoueur.get(randomJ2);
                listJoueurNewMatch.add(joueur1);
                listJoueurNewMatch.add(joueur2);
                compteurDeMatch++;
                System.out.println("le match " + compteurDeMatch + " opposera " + listJoueurNewMatch.get(0).getPrenom() + " " +
                        listJoueurNewMatch.get(0).getNom() + " contre " + listJoueurNewMatch.get(1).getPrenom() + " " +
                        listJoueurNewMatch.get(1).getNom());
                listClone.remove(joueur1);
                listClone.remove(joueur2);
                i++;
            }

        }
    }
    // méthode qui permet de donner une liste de 8 arbitres de lignes et 1 arbitre de chaise en respectant toutes les contraintes
    public ArrayList<Arbitre> findArbitre(ArrayList<Joueur> listJoueur, GregorianCalendar horraireMatch, boolean matchDeQualification,
                                          ArrayList<ArbitreChaise> listArbitreChaise, ArrayList<ArbitreLigne>listArbitreLigne, ArrayList<Match> listMatch){
        ArrayList<Arbitre> listArbitrePotentiel = new ArrayList<>();
        boolean matchSimple;
        // true = match en simple ; false = match en double
        if(listJoueur.size() == 2){
            matchSimple = true;
        }
        else{
            matchSimple = false;
        }
        for (ArbitreChaise arbitreChaisePotentiel : listArbitreChaise) {
            boolean disponible = arbitreChaisePotentiel.arbitreDispoAHorraire(horraireMatch,listMatch);
            boolean bonneNationalite = arbitreChaisePotentiel.ArbitreBonneNationalite(listJoueur);
            if (!matchDeQualification){
                if(matchSimple) {
                    int nbMatchArbitre = arbitreChaisePotentiel.getNbMatchSimple();
                    if(nbMatchArbitre < 3 && disponible && bonneNationalite){
                        listArbitrePotentiel.add(arbitreChaisePotentiel);
                    }
                }
                else {
                    int nbMatchArbitre = arbitreChaisePotentiel.getNbMatchDouble();
                    if(nbMatchArbitre < 3 && disponible && bonneNationalite){
                        listArbitrePotentiel.add(arbitreChaisePotentiel);
                    }
                }

            }
            else {
                if(disponible && bonneNationalite && listArbitrePotentiel.size() < 1) {
                    listArbitrePotentiel.add(arbitreChaisePotentiel);
                }
            }
        }

        for (ArbitreLigne arbitreLignePotentiel : listArbitreLigne) {
            boolean disponible = arbitreLignePotentiel.arbitreDispoAHorraire(horraireMatch,listMatch);
            boolean bonneNationalite = arbitreLignePotentiel.ArbitreBonneNationalite(listJoueur);
            if(disponible && bonneNationalite && listArbitrePotentiel.size() < 10){
                listArbitrePotentiel.add(arbitreLignePotentiel);
            }
        }
            return listArbitrePotentiel;

        }
        // méthode pour afficher une liste de court potentiel que peut utiliser le gérant pour un match au lieu de chercher on lui propose
        public ArrayList<Court> findCourt(ArrayList<Court> courtArrayList, GregorianCalendar horraireMatch,ArrayList<Match> listMatch){
            ArrayList<Court> listCourtPotentiel = new ArrayList<>();

            for(Court courtPotentiel : courtArrayList){
                ArrayList<GregorianCalendar> listReservation = new ArrayList<>();
                boolean disponible = courtPotentiel.courtDispoAHorraire(horraireMatch,listMatch);
                if(disponible){
                    listCourtPotentiel.add(courtPotentiel);
                }
                /* ici on ajoute à la liste des courts potentiels les courts qui ont des réservations à l'horraire du match mais on informe le gérant
                que le court est réservé pour un entrainement et qu'il faut notifier le joueur que son entrainement ne sera pas possible à cette horraire*/
                for (GregorianCalendar reservation : listReservation){
                    if(reservation == horraireMatch){
                        System.out.println("Attention le court " + courtPotentiel.getNomCourt() +
                                " est réservé pour un entrainement il faut informer les joueurs qui ont fait des réservations si vous voulez l'utiliser ");
                        listCourtPotentiel.add(courtPotentiel);
                    }

                }
            }
            if (listCourtPotentiel.size() !=0) {
                return listCourtPotentiel;
            }
            return null;
        }
    // méthode pour afficher une liste d'équipe ramasseur potentiel que peut utiliser le gérant pour un match au lieu de chercher on lui propose
    public ArrayList<EquipeRamasseur> findEquipeRamasseur(ArrayList<EquipeRamasseur> equipeRamasseurArrayList, GregorianCalendar horraireMatch,
                                                          ArrayList<Match> listMatch){
            ArrayList<EquipeRamasseur> listEquipeRamasseurPotentiel = new ArrayList<>();
            for(EquipeRamasseur equipeRamasseurPotentiel : equipeRamasseurArrayList){
                boolean disponible = equipeRamasseurPotentiel.equipeRamasseurDispoAHorraire(horraireMatch,listMatch);
                if(disponible){
                    listEquipeRamasseurPotentiel.add(equipeRamasseurPotentiel);
                }
            }
            if (listEquipeRamasseurPotentiel.size() !=0) {
                return listEquipeRamasseurPotentiel;
            }
            return null;
        }


    }



