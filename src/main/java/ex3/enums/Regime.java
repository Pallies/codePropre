package ex3.enums;

/**
 * Comportement Alimentaire
 * des animaux au zoo
 * @author Yvan Palliès
 *
 */
public enum Regime {
	CARNIVORE("Carnivore"),
	HERBIVORE("Herbivoire");

	private String alimentaire;

	/** #Constructor
	 * @param alimentaire
	 */
	Regime(String alimentaire) {
		this.alimentaire=alimentaire;
	}

	/**
	 * Getter
	 * 
	 * @return the alimentaire
	 */
	public String getRegimeAlimentaire() {
		return alimentaire;
	}

}
