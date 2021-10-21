package ex3.models;

import ex3.enums.Categorie;
import ex3.enums.Regime;

/**
 * @author Yvan Palliès
 *
 */
public class Animal {

	private Categorie categorie;
	private String nom;
	private Regime alimentaire;

	/**
	 * #Constructor
	 * 
	 * @param categorie    MAMMIFERE / REPTILE / POISSON
	 * @param nom
	 * @param alimentation CARNIVORE / HERBIVORE
	 */
	public Animal(String nom, Categorie categorie, Regime alimentaire) {
		this.categorie = categorie;
		this.nom = nom;
		this.alimentaire = alimentaire;
	}

	public boolean isCarnivore() {
		return this.getCategorie().equals(Categorie.MAMMIFERE) && this.getAlimentaire().equals(Regime.CARNIVORE);
	}

	public boolean isSavane() {
		return this.getCategorie().equals(Categorie.MAMMIFERE) && this.getAlimentaire().equals(Regime.HERBIVORE);
	}

	public boolean isReptile() {
		return this.getCategorie().equals(Categorie.REPTILE);
	}

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
	public Regime getAlimentaire() {
		return alimentaire;
	}

}
