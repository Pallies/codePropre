package ex3.models;

public class Reptile extends Secteur{
	
	private static final double NOURRITURE_UNITAIRE = 10d;
	
	public Reptile(Animal animal) {
		super(animal);
	}

	public double calculerKgsNourritureParJour(){
		return compterAnimaux() * NOURRITURE_UNITAIRE;
	}
}
