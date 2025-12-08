import java.util.HashMap;
public class Bureau {
    public String code;
    public String toerana;
    public int nbr_inscrit;
    public int nbr_blanc;
    public int nbr_null;
    public HashMap<Integer, Integer> votes;


    public void afficher() {
        System.out.println("Le Bureau numéro : " + this.code);
        System.out.println("Toerana :" + this.toerana);
        System.out.println("Isany mpifidy :" + this.nbr_inscrit +
                "\nVote blanc : " + this.nbr_blanc +
                "\n Vote null :" + this.nbr_null);
        for (Integer id : votes.keySet()) {
            System.out.println("Candidat numéro: " + id + " → " + votes.get(id));
        }
    }

    public boolean  estEnRegle() {
        int somme = 0;
        for (Integer id : votes.keySet()) {
            somme += votes.get(id);
        }
        if (somme + this.nbr_blanc + this.nbr_null == this.nbr_inscrit) {
            return true;
        } else {
            return false;
        }

    }   
} 