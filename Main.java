import java.util.HashMap;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Candidat c1 = new Candidat();
        c1.numero = 1;
        c1.nom = "Andry";

        Candidat c2 = new Candidat();
        c2.numero = 2;
        c2.nom = "Hery";

        Candidat c3 = new Candidat();
        c3.numero = 3;
        c3.nom = "Ravalo";

        Candidat c4 = new Candidat();
        c4.numero = 4;
        c4.nom = "Siteny";

        Bureau b1 = new Bureau();
        b1.code = "B200";
        b1.toerana = "Ampitatafika";
        b1.nbr_inscrit = 400;
        b1.nbr_blanc = 10;
        b1.nbr_null = 4;

        HashMap<Integer, Integer> votes1 = new HashMap<>();
        votes1.put(1, 64);
        votes1.put(2, 90);
        votes1.put(3, 100);
        votes1.put(4, 200);
        b1.votes = votes1;

        Bureau b2 = new Bureau();
        b2.code = "B300";
        b2.toerana = "Analakely";
        b2.nbr_inscrit = 400;
        b2.nbr_blanc = 10;
        b2.nbr_null = 4;

        HashMap<Integer, Integer> votes2 = new HashMap<>();
        votes2.put(1, 34);
        votes2.put(2, 90);
        votes2.put(3, 10);
        votes2.put(4, 300);
        b2.votes = votes2;

        b2.afficher();
        if (b2.estEnRegle()) {
            System.out.println("Bureau en règle");
        } else {
            System.out.println("le bureau n'est pas en règle");
        }
            b1.afficher();
            if (b1.estEnRegle()) {
                System.out.println("Bureau en règle");
            } else {
                System.out.println("le bureau n'est pas en règle");
            }

        Vector<Candidat> candidats = new Vector<>();
        candidats.add(c1);
        candidats.add(c2);
        candidats.add(c3);
        candidats.add(c4);
        Vector<Bureau> bureaux = new Vector<>();
        bureaux.add(b1);
        bureaux.add(b2);
        Commune commune1 = new Commune();
        commune1.candidats = candidats;
        commune1.bureaux = bureaux;

        Gestion gestion = new Gestion();
        gestion.communes = new Vector<>();
        gestion.communes.add(commune1);
        

        for (Candidat c : candidats) {
            System.out.println("Total des votes pour le candidat numéro: " + c.numero + "->"
                    + gestion.totalVotesCandidat(c.numero));
        }
        
        System.out.println("Total des inscrits: " + gestion.totalInscrits());
        System.out.println("Total des votes blancs: " + gestion.totalBlancs());
  
    }
}
