package ex3.models;

public class Aquarium extends Secteur{

	private static final double NOURRITURE_UNITAIRE = 10d;
	
	public Aquarium(Animal animal) {
		super(animal);
	}

	public double calculerKgsNourritureParJour(){
		return compterAnimaux() * NOURRITURE_UNITAIRE;
	}
}
