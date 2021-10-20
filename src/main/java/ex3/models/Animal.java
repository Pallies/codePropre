package ex3.models;

import ex3.enums.Alimentation;
import ex3.enums.Categorie;

/**
 * @author Yvan Palliès
 *
 */
public class Animal {

	private Categorie categorie;
	private String nom;
	private Alimentation alimentation;

	/**
	 * #Constructor
	 * 
	 * @param categorie    MAMMIFERE / REPTILE / POISSON
	 * @param nom
	 * @param alimentation CARNIVORE / HERBIVORE
	 */
	public Animal(String nom, Categorie categorie, Alimentation alimentation) {
		this.categorie = categorie;
		this.nom = nom;
		this.alimentation = alimentation;
	}

	public boolean isCarnivore() {
		return this.getCategorie().equals(Categorie.MAMMIFERE) && this.getAlimentation().equals(Alimentation.CARNIVORE);
	}

	public boolean isSavane() {
		return this.getCategorie().equals(Categorie.MAMMIFERE) && this.getAlimentation().equals(Alimentation.HERBIVORE);
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
	 * @return the alimentation
	 */
	public Alimentation getAlimentation() {
		return alimentation;
	}

}
