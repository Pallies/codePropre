package ex3.models;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private List<Secteur> secteur=new ArrayList<>();
	private String nom;

	public Zoo(String nom) {
		this.nom = nom;
	}

	public void addAnimal(Animal animal) {

		if (animal.isCarnivore()) {
			secteur.add(new Carnivore(animal));
		} else if (animal.isSavane()) {
			secteur.add(new Savane(animal));
		} else if (animal.isReptile()) {
			secteur.add(new Reptile(animal));
		} else if (animal.isAquarium()) {
			secteur.add(new Aquarium(animal));
		}
	}

	public void afficherListeAnimaux() {
		secteur.forEach(Secteur::afficherListeAnimaux);
	}

	/**
	 * Getter for nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
