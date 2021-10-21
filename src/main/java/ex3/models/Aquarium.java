package ex3.models;

/**
 * Class pour le Secteur Aquarium
 * @author Yvan Palliès
 *
 */
public class Aquarium extends Secteur{

	/** Nourriture journalière du secteur */
	private static final double NOURRITURE_UNITAIRE = 10d;
	
	/** #Constructor
	 * @param animal
	 */
	public Aquarium(Animal animal) {
		super(animal);
	}
	/** #Constructor
	 *! N'utiliser cette instance 
	 *! que pour la comparaison d'objet
	 */
	private Aquarium() {
		super();
	}
	/**
	 * utilise le nombre d'animaux
	 * {@link Secteur#compterAnimaux} 
	 * @return poids de nourritures
	 */
	public double calculerKgsNourritureParJour(){
		return Zoo.compterAnimaux(new Aquarium()) * NOURRITURE_UNITAIRE;
	}

}
