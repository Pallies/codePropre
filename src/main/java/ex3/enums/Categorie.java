package ex3.enums;

/**
 * Types d' Animal existant au zoo
 * @author Yvan Palliès
 *
 */
public enum Categorie {
	
	MAMMIFERE("Mammifère"), 
	REPTILE("Reptile"), 
	POISSON("Poisson");

	private String categorie;

	/** #Constructor
	 * @param categorie
	 */
	Categorie(String categorie) {
		this.categorie = categorie;
	}

	/**
	 * Getter
	 * 
	 * @return the categorie
	 */
	public String getType() {
		return categorie;
	}
}
