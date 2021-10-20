package ex3.enums;

/**
 * Comportement Alimentaire
 * 
 * @author Yvan Palliès
 *
 */
public enum Alimentation {
	CARNIVORE("Carnivore"),
	HERBIVORE("Herbivoire");

	private String alimentation;

	/** #Constructor
	 * @param alimentation
	 */
	Alimentation(String alimentation) {
		this.alimentation=alimentation;
	}

	/**
	 * Getter
	 * 
	 * @return the alimentation
	 */
	public String getAlimentation() {
		return alimentation;
	}

	@Override
	public String toString() {
		return "Comportement alimentaire : " + alimentation;
	}
}
