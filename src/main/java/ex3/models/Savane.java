package ex3.models;

public class Savane extends Secteur {

	private static final double NOURRITURE_UNITAIRE = 10d;

	public Savane(Animal animal) {
		super(animal);
	}

	public double calculerKgsNourritureParJour() {
		return compterAnimaux() * NOURRITURE_UNITAIRE;
	}
}
