package ex3.models;

import java.util.ArrayList;
import java.util.List;

import ex3.affichages.View;

/**
 * @author Yvan Palliès
 * Class parent des class citées ci-dessous
 * 
 * @see childreen
 * Aquarium
 * Carnivore
 * Reptile
 * Savane
 */
public abstract class Secteur {
	/** constante pour l'affichage de toString() */
	
	
	/**
	 * Liste des animaux du zoo
	 */
	private List<Animal> animals = new ArrayList<>();

	/**
	 * #Constructor
	 * Ajoute un animal au secteur
	 * @param animal
	 */
	Secteur(Animal animal) {
		animals.add(animal);
	}
	/** #do not use in ordinary case
	 *  #Constructor
	 *! @see children #constructor 
	 *! instanciation effectuer pour 
	 *! ne pas rompre l'héritage
	 */
	protected Secteur() {
		animals=null;
	}

	/**
	 * Affiche la méthode .toString d'Animal
	 * {@link Animal#toString()}
	 */
	public void afficherListeAnimaux() {
		View.affichageStream(getAnimals().stream().map(Animal::getNom));
	}
	/** @see children*/
	public abstract double calculerKgsNourritureParJour();


	@Override
	public String toString() {
		StringBuilder secteurString=new StringBuilder();
		getAnimals().forEach(animal->secteurString
			.append(View.getBorder())
			.append("\n*    Description de l'animal    *\n")
			.append(View.getBorder())
			.append(animal));
		return secteurString.toString();
	}
	/**Getter
	 * @return the animals
	 */
	public List<Animal> getAnimals() {
		return animals;
	}
}
