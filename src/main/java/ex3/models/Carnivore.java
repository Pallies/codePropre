package ex3.models;

public class Carnivore extends Secteur{

	private static final double NOURRITURE_UNITAIRE = 10d;
	
	public Carnivore(Animal animal) {
		super(animal);
	}

	public double calculerKgsNourritureParJour(){
		return compterAnimaux() * NOURRITURE_UNITAIRE;
	}
}
