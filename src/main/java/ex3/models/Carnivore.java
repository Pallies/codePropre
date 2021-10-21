package ex3.models;
/**
 * Class pour le Secteur Carnivore
 * @author Yvan Palliès
 *
 */
public class Carnivore extends Secteur{
	/** Nourriture journalière du secteur */
	private static final double NOURRITURE_UNITAIRE = 10d;
	
	/** #Constructor
	 * @param animal
	 */
	public Carnivore(Animal animal) {
		super(animal);
	}
	/** #Constructor
	 *! N'utiliser cette instance 
	 *! que pour la comparaison d'objet
	 */
	private Carnivore() {
		super();
	}
	/**
	 * utilise le nombre d'animaux
	 * {@link Secteur#compterAnimaux} 
	 * @return poids de nourritures
	 */
	public double calculerKgsNourritureParJour(){
		return Zoo.compterAnimaux(new Carnivore()) * NOURRITURE_UNITAIRE;
	}
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Carnivore;
	}


}
