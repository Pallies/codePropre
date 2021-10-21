package ex3.models;

import java.util.ArrayList;
import java.util.List;

import ex3.enums.Categorie;
import ex3.enums.Regime;

public abstract class Secteur {

	private List<Categorie> categories=new ArrayList<>();
	private List<String> noms=new ArrayList<>();
	private List<Regime> alimentaires=new ArrayList<>();
	
	/** #Constructor
	 * @param animal
	 */
	Secteur(Animal animal) {
		categories.add(animal.getCategorie());
		noms.add(animal.getNom());
		alimentaires.add(animal.getRegimeAlimentaire());
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
	 * @return the alimentaires
	 */
	public List<Regime> getRegimeAlimentaires() {
		return alimentaires;
	}
}
