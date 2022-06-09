package medecine;

public class Medicament {
    String nom;
    int prix;

    public Medicament(String nom, int prix) {
        this.nom = nom;
        this.prix = prix;
//        aspirine est un medicament (prix:10)
        System.out.println(this.nom + " est un medicament (prix:" + this.prix + ")");
    }
}
