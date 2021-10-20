package ex1;

/**
 * Class servant au Calcul Arithmétique
 * @author Yvan Palliès
 *
 */
public class Calcul {

	/**
	 * Calcul la somme
	 * @param a entier 1
	 * @param b entier 2
	 * @return la somme des deux entiers
	 * le résultat sera positif si a et b sont +
	 * ou négatif si a et b sont -
	 */
	public int addition(int a, int b) {
		return a + b;
	}

	/**
	 * Calcul la différence
	 * @param a entier 1
	 * @param b entier 2
	 * @return la différence des deux entiers 
	 * le résultat peut être positif ou négatif
	 */
	public int soustraction(int a, int b) {
		return a - b;
	}
}
