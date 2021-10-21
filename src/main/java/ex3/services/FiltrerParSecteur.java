package ex3.services;

import java.util.function.BiConsumer;

public class FiltrerParSecteur implements BiConsumer<String, Integer> {

	public FiltrerParSecteur() {
	}


	public void accept(String secteur, Integer nombreAnimaux) {
		StringBuilder affichageString = new StringBuilder();
		affichageString.append("Le Secteur : ");
		String animalPluriel = nombreAnimaux > 1 ? " animaux \n" : " animal \n";
		affichageString.append(secteur).append(" compte ").append(nombreAnimaux).append(animalPluriel);
		System.out.println(affichageString);
	}

}
