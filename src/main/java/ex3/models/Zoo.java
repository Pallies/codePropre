package ex3.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import ex3.affichages.View;
import ex3.services.FiltrerParSecteur;


public class Zoo {

	private static List<Secteur> secteur = new ArrayList<>();
	private String nom;

	public Zoo(String nom) {
		this.nom = nom;
	}

	/**
	 * Ajoute un secteur et son animal associé
	 * @param animal
	 */
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

	/**
	 * Affichage des Animaux
	 */
	public void afficherListeAnimaux() {
		secteur.forEach(Secteur::afficherListeAnimaux);
	}
	public void afficherListeSecteur() {
		View.affichageNbAnimaux(secteur);
	}
	protected static int compterAnimaux(Secteur s) {
		return (int) secteur.stream().filter(c->c.equals(s)).count();
	}
	
	public static int compterAnimaux() {
		return secteur.size();
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

	@Override
	public String toString() {
		StringBuilder zooString = new StringBuilder();
		zooString.append(" Zoo ").append(nom);
		for (Secteur SecteurAnimaux : secteur) {
			zooString.append("\nSecteur d'affectation : ").append(SecteurAnimaux.getClass().getSimpleName())
			.append("\n").append(SecteurAnimaux.toString());
		}
		return zooString.toString();
	}



}