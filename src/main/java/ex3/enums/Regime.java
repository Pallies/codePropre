package ex3.enums;

/**
 * Comportement Alimentaire
 * 
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
	public String getAlimentaire() {
		return alimentaire;
	}

	@Override
	public String toString() {
		return "Comportement alimentaire : " + alimentaire;
	}
}
