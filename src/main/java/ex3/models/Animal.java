package ex3.models;

import ex3.enums.Categorie;
import ex3.enums.Regime;

/**
 * Création d'un Animal
 * @author Yvan Palliès
 *
 */
public class Animal {

	private String nom;
	/** enum MAMMIFERE / REPTILE / POISSON  */
	private Categorie categorie;
	/** enum CARNIVORE / HERBIVORE */
	private Regime alimentaire;


	/**
	 * #Constructor
	 * 
	 * @param categorie    
	 * @param nom
	 * @param alimentation 
	 */
	public Animal(String nom, Categorie categorie, Regime alimentaire) {
		this.categorie = categorie;
		this.nom = nom;
		this.alimentaire = alimentaire;
	}

	/**
	 * fait-il partie du secteur Carnivore ?
	 * @return true or false
	 */
	public boolean isCarnivore() {
		return this.getCategorie().equals(Categorie.MAMMIFERE) && this.getRegimeAlimentaire().equals(Regime.CARNIVORE);
	}
	/**
	 * fait-il partie du secteur Savane ?
	 * @return true or false
	 */
	public boolean isSavane() {
		return this.getCategorie().equals(Categorie.MAMMIFERE) && this.getRegimeAlimentaire().equals(Regime.HERBIVORE);
	}
	/**
	 * fait-il partie du secteur Reptile ?
	 * @return true or false
	 */
	public boolean isReptile() {
		return this.getCategorie().equals(Categorie.REPTILE);
	}
	/**
	 * fait-il partie du secteur Aquarium ?
	 * @return true or false
	 */
	public boolean isAquarium() {
		return this.getCategorie().equals(Categorie.POISSON);
	}

	/**
	 * Getter
	 * 
	 * @return the categorie
	 */
	public Categorie getCategorie() {
		return categorie;
	}

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Getter
	 * 
	 * @return the alimentaire
	 */
	public Regime getRegimeAlimentaire() {
		return alimentaire;
	}

	@Override
	public String toString() {
		StringBuilder animalString=new StringBuilder();
		animalString
		.append("\nNom : ").append(nom)
		.append("\nCatégorie : ").append(categorie)
		.append("\nRégime alimentaire : ").append(alimentaire)
		.append("\n\n");
		return animalString.toString();
	}

}
