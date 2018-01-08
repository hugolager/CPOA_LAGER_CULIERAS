package main;

import classe.*;
import exception.CreneauException;
import exception.NationaliteException;
import exception.NbMatchLimiteException;
import exception.ReposException;

import java.util.*;

/**
 * Created by hugol on 18/12/2017.
 */
public class Application {
    public static void main(String Args[]) {
        ArbitreChaise arbitreChaise1 = new ArbitreChaise("patrick.chirac@gmail.com", "patrick", "chirac",
                "Français");
        ArbitreChaise arbitreChaise2 = new ArbitreChaise("mark.unbut@gmail.com","mark","unbut",
                "Indien");
        ArbitreChaise arbitreChaise3 = new ArbitreChaise("gerard.mentfroid@gmail.com","gerard","mentfroid",
                "Suisse");
        ArbitreChaise arbitreChaise4 = new ArbitreChaise("emile.louis@gmail.com","emile","louis",
                "Danois");
        ArbitreChaise arbitreChaise5 = new ArbitreChaise("marcel.ino@gmail.com","marcel","ino",
                "Italien");
        ArbitreChaise arbitreChaise6 = new ArbitreChaise("jean.meluch@gmail.com","jean","meluch",
                "Venezuelien");
        ArbitreChaise arbitreChaise7 = new ArbitreChaise("phil.air@gmail.com","phil","air",
                "Anglais");
        ArbitreChaise arbitreChaise8 = new ArbitreChaise("carl.larguerrefaite@gmail.com","carl","laguerrefaite",
                "Allemand");
        ArrayList<ArbitreChaise> listArbitreChaise = new ArrayList<>();
        listArbitreChaise.add(arbitreChaise1);
        listArbitreChaise.add(arbitreChaise2);
        listArbitreChaise.add(arbitreChaise3);
        listArbitreChaise.add(arbitreChaise4);
        listArbitreChaise.add(arbitreChaise5);
        listArbitreChaise.add(arbitreChaise6);
        listArbitreChaise.add(arbitreChaise7);
        listArbitreChaise.add(arbitreChaise8);

        ArbitreLigne arbitreLigne1 = new ArbitreLigne("patrick", "demal", "Ecossais",
                "patrickcalcker@gmail.com");
        ArbitreLigne arbitreLigne2 = new ArbitreLigne("patrick", "sasi", "Français",
                "patricksasi@gmail.com");
        ArbitreLigne arbitreLigne3 = new ArbitreLigne("patrick", "abet", "Espagnol",
                "patrickabet@gmail.com");
        ArbitreLigne arbitreLigne4 = new ArbitreLigne("patrick", "chato", "Suisse",
                "patrickchato@gmail.com");
        ArbitreLigne arbitreLigne5 = new ArbitreLigne("patrick", "holin", "Congolais",
                "patrickholin@gmail.com");
        ArbitreLigne arbitreLigne6 = new ArbitreLigne("patrick", "pato", "Bresilien",
                "patrickpato@gmail.com");
        ArbitreLigne arbitreLigne7 = new ArbitreLigne("patrick", "quicet", "Gallois",
                "patrickquicet@gmail.com");
        ArbitreLigne arbitreLigne8 = new ArbitreLigne("patrick", "malade", "Danois",
                "patrickmalade@gmail.com");
        ArrayList<ArbitreLigne> listArbitreLigne1 = new ArrayList<>();
        listArbitreLigne1.add(arbitreLigne1);
        listArbitreLigne1.add(arbitreLigne2);
        listArbitreLigne1.add(arbitreLigne3);
        listArbitreLigne1.add(arbitreLigne4);
        listArbitreLigne1.add(arbitreLigne5);
        listArbitreLigne1.add(arbitreLigne6);
        listArbitreLigne1.add(arbitreLigne7);
        listArbitreLigne1.add(arbitreLigne8);

        RamasseurDeBalles ramasseurDeBalles1 = new RamasseurDeBalles("bouteflika", "abdelaziz");
        RamasseurDeBalles ramasseurDeBalles2 = new RamasseurDeBalles("boutala", "abdelaziz");
        RamasseurDeBalles ramasseurDeBalles3 = new RamasseurDeBalles("boutejele", "abdelaziz");
        RamasseurDeBalles ramasseurDeBalles4 = new RamasseurDeBalles("boutemange", "abdelaziz");
        RamasseurDeBalles ramasseurDeBalles5 = new RamasseurDeBalles("boutefroid", "abdelaziz");
        RamasseurDeBalles ramasseurDeBalles6 = new RamasseurDeBalles("boutneige", "abdelaziz");
        RamasseurDeBalles ramasseurDeBalles7 = new RamasseurDeBalles("boutgigo", "abdelaziz");
        RamasseurDeBalles ramasseurDeBalles8 = new RamasseurDeBalles("boutegiga", "abdelaziz");
        RamasseurDeBalles ramasseurDeBalles9 = new RamasseurDeBalles("bouteille", "abdelaziz");
        RamasseurDeBalles ramasseurDeBalles10 = new RamasseurDeBalles("boutdecaca", "abdelaziz");
        RamasseurDeBalles ramasseurDeBalles11 = new RamasseurDeBalles("boutdegras", "abdelaziz");
        RamasseurDeBalles ramasseurDeBalles12 = new RamasseurDeBalles("boutlol", "abdelaziz");
        RamasseurDeBalles[] tabRamasseur1 = new RamasseurDeBalles[]{ramasseurDeBalles1, ramasseurDeBalles2, ramasseurDeBalles3,
                ramasseurDeBalles4, ramasseurDeBalles5, ramasseurDeBalles6};
        RamasseurDeBalles[] tabRamasseur2 = new RamasseurDeBalles[]{ramasseurDeBalles7, ramasseurDeBalles8, ramasseurDeBalles9,
                ramasseurDeBalles10, ramasseurDeBalles11, ramasseurDeBalles12};

        EquipeRamasseur equipeRamasseur1 = new EquipeRamasseur("les chalamontais", tabRamasseur1);
        EquipeRamasseur equipeRamasseur2 = new EquipeRamasseur("les villardois", tabRamasseur2);

        Joueur joueur1 = new Joueur("Jean", "Neimar", "Bresilien", 67);
        Joueur joueur2 = new Joueur("Jean", "Peuplu", "Peruvien", 78);
        Joueur joueur3 = new Joueur("Abdel-Yves", "Icanfly", "Anglais", 125);
        Joueur joueur4 = new Joueur("Jeff", "Roi", "Belge", 147);
        Joueur joueur5 = new Joueur("Jay", "Pacho", "Australein", 76);
        Joueur joueur6 = new Joueur("Glaude", "Yohooooo", "Français", 160);
        Joueur joueur7 = new Joueur("Thierry", "Lecodeur", "Français", 367);
        Joueur joueur8 = new Joueur("Yves", "Vasenaler", "Allemand", 45);
        Joueur joueur9 = new Joueur("Damso", "Cocolo", "Tchadien", 74);
        Joueur joueur10 = new Joueur("Gerard", "Departdieu", "Belge", 768);
        Joueur joueur11 = new Joueur("Johny", "Alider", "Suedois", 44);
        Joueur joueur12 = new Joueur("Rafael", "Nadal", "Espagnol", 1);
        Joueur joueur13 = new Joueur("Yamamoto ", "Kaderate", "Japonais", 234);
        Joueur joueur14 = new Joueur("Roger", "Federer", "Suisse", 2);
        Joueur joueur15 = new Joueur("Novak", "Djokovic", "Serbe", 3);
        Joueur joueur16 = new Joueur("Jean", "Mouloud", "Marocain", 149);
        Joueur joueur17 = new Joueur("Aziz", "Khaled", "Tunisien", 56);
        Joueur joueur18 = new Joueur("Larry", "Bambelle", "Americain", 69);
        Joueur joueur19 = new Joueur("Jerry", "Kan", "Americain", 123);
        Joueur joueur20 = new Joueur("Al", "Kolick", "Egyptien", 869);
        Joueur joueur21 = new Joueur("Jean", "Meurdesoif", "Français", 22);
        Joueur joueur22 = new Joueur("Ademar", "Monoto", "Lybien", 154);
        Joueur joueur23 = new Joueur("Alphonse", "Danlmur", "Belge", 879);
        Joueur joueur24 = new Joueur("Bernard", "Tichaud", "Canadien", 546);
        Joueur joueur25 = new Joueur("Brice", "Glace", "Canadien", 63);
        Joueur joueur26 = new Joueur("Djamal", "Digere", "Marocain", 21);
        Joueur joueur27 = new Joueur("Douglas", "O’Chocolat", "Anglais", 59);
        Joueur joueur28 = new Joueur("Garcin", "Lazare", "Italien", 84);
        Joueur joueur29 = new Joueur("Hassan", "Cehef", "Tunisien", 91);
        Joueur joueur30 = new Joueur("Medhi", "Khaman", "Tunisien", 86);
        Joueur joueur31 = new Joueur("Pacôme", "Toullemonde", "Russe", 90);
        Joueur joueur32 = new Joueur("Tex", "Agere", "Anglais", 23);

        ArrayList<Joueur> listJoueur = new ArrayList<>();
        listJoueur.add(joueur1);
        listJoueur.add(joueur2);
        listJoueur.add(joueur3);
        listJoueur.add(joueur4);
        listJoueur.add(joueur5);
        listJoueur.add(joueur6);
        listJoueur.add(joueur7);
        listJoueur.add(joueur8);
        listJoueur.add(joueur9);
        listJoueur.add(joueur10);
        listJoueur.add(joueur11);
        listJoueur.add(joueur12);
        listJoueur.add(joueur13);
        listJoueur.add(joueur14);
        listJoueur.add(joueur15);
        listJoueur.add(joueur16);
        listJoueur.add(joueur17);
        listJoueur.add(joueur18);
        listJoueur.add(joueur19);
        listJoueur.add(joueur20);
        listJoueur.add(joueur21);
        listJoueur.add(joueur22);
        listJoueur.add(joueur23);
        listJoueur.add(joueur24);
        listJoueur.add(joueur25);
        listJoueur.add(joueur26);
        listJoueur.add(joueur27);
        listJoueur.add(joueur28);
        listJoueur.add(joueur29);
        listJoueur.add(joueur30);
        listJoueur.add(joueur31);
        listJoueur.add(joueur32);
        ArrayList<Match> listMatch = Match.getListMatch();


        // cette partie sera réalisé via l'interface
        GregorianCalendar calandarTest = new GregorianCalendar(2018, 03, 17, 8, 0);
        ArrayList<Joueur> listJoueurMatchTest = new ArrayList<>();
        listJoueurMatchTest.add(joueur3);
        listJoueurMatchTest.add(joueur17);
        Court courtPrincipal = new Court("Court Principal", 5600);
        // la partie qui sert à rentrer le résultat sera programmer sur l'interface
        Application testApplication = new Application();
        testApplication.genererTableau(listJoueur,listMatch);


    }


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
            if (!Match.creneauIsValide(listMatch, horraireDuMatch, courtDuMatch)) {
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

    public void genererTableau(ArrayList<Joueur> listJoueur, ArrayList<Match> listMatch) {
        // génération du premier tour de manière random sur les joueurs
        ArrayList<Joueur> listClone = new ArrayList<>();
        listClone = listJoueur;
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

}

