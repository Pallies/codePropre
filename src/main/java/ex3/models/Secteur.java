package ex3.models;

import java.util.List;

import ex3.enums.Alimentation;
import ex3.enums.Categorie;

public abstract class Secteur {

	private List<Categorie> categories;
	private List<String> noms;
	private List<Alimentation> alimentation;
	
	Secteur(Animal animal) {
		categories.add(animal.getCategorie());
		noms.add(animal.getNom());
		alimentation.add(animal.getAlimentation());
	}
	
	public void afficherListeAnimaux(){
		noms.stream().forEach(System.out::println);
	}
	
	public int compterAnimaux(){
		return noms.size();
	}
	
	public abstract double calculerKgsNourritureParJour();
	
	/**Getter
	 * @return the categories
	 */
	public List<Categorie> getCategories() {
		return categories;
	}
	/**Getter
	 * @return the noms
	 */
	public List<String> getNoms() {
		return noms;
	}
	/**Getter
	 * @return the alimentations
	 */
	public List<Alimentation> getAlimentations() {
		return alimentation;
	}
}
