package ex3.models;
/**
 * Class pour le Secteur Savane
 * @author Yvan Palliès
 *
 */
public class Savane extends Secteur {
	/** Nourriture journalière du secteur */
	private static final double NOURRITURE_UNITAIRE = 10d;

	/** #Constructor
	 * @param animal
	 */
	public Savane(Animal animal) {
		super(animal);
	}
	/** #Constructor
	 *! N'utiliser cette instance 
	 *! que pour la comparaison d'objet
	 */
	private Savane() {
		super();
	}
	/**
	 * utilise le nombre d'animaux
	 * {@link Secteur#compterAnimaux} 
	 * @return poids de nourritures
	 */
	public double calculerKgsNourritureParJour() {
		return Zoo.compterAnimaux(new Savane()) * NOURRITURE_UNITAIRE;
	}


	
}
