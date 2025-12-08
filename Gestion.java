
import java.util.Vector;

public class Gestion {
    public Vector<Commune> communes;


    public int totalVotesCandidat(int numero) {
        int total = 0;
        for (Commune c : communes) {
            for (Bureau b : c.bureaux) {
                total += b.votes.getOrDefault(numero, 0);
            }
        }
        return total;
    }
    
        public int totalInscrits() {
        int total = 0;
        for (Commune c : communes) {
            for (Bureau b : c.bureaux) {
                total += b.nbr_inscrit;
            }
        }
        return total;
    }
    
        public int totalBlancs() {
        int total = 0;
        for (Commune c : communes) {
            for (Bureau b : c.bureaux) {
                total += b.nbr_blanc;
            }
        }
        return total;
    }

}