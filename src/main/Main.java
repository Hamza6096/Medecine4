package main;

import medecine.*;

public class Main {

	public static void main(String[] args) {
		Patient gilles = new Patient("Gilles");
		Maladie grippe = new Maladie("grippe");
		gilles.contracter(grippe);
		Medecin marc = new Medecin("Marc", 30);
		marc.recevoir(gilles);
		Medicament aspirine = new Medicament("aspirine", 10);
		marc.prescrire(aspirine);
		marc.demanderPaiement();
		gilles.payer(marc);
		Pharmacien paul = new Pharmacien("Paul");
		paul.vendre(gilles, aspirine);
		gilles.payer(paul, aspirine);
		gilles.guerir();
	}

}
