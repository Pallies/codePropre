package ex3.affichages;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

import ex3.models.Secteur;
import ex3.services.FiltrerParSecteur;

/**
 * Class gérant l'affichage de l'application Zoo
 * @author Yvan Palliès
 *
 */
public class View {
	/** Constante pour les bordures du cadres d'affichage */
	private static final String BORDER = "*********************************";

	/**
	 * Fonction d'affichage d'un stream<String>
	 * @param stream
	 */
	public static void affichageStream(Stream<String> stream) {
		stream.forEach(System.out::println);
	}

	/**
	 * Affichage du nombre total d'animaux par secteur
	 * et
	 * Affichage total d'animaux du zoo
	 * @param secteur
	 */
	public static void affichageNbAnimaux(List<Secteur> secteur) {
		HashMap<String, Integer> listSecteur = new HashMap<>();
		for (Secteur s : secteur) {
			String classes = s.getClass().getSimpleName();
			listSecteur.merge(classes, 1, Integer::sum);
		}

		listSecteur.forEach(new FiltrerParSecteur());
		View.affichageNbAnimaux(secteur.size());
	}

	/**
	 * Affichage du total d'animaux du zoo
	 * @param nbAnimaux
	 */
	public static void affichageNbAnimaux(int nbAnimaux) {
		StringBuilder msgNbAnimaux = new StringBuilder();
		String animalPluriel = nbAnimaux > 1 ? " animaux \n" : " animal \n";
		msgNbAnimaux.append("Le Total est de ").append(nbAnimaux).append(animalPluriel);
		System.out.println(msgNbAnimaux);
	}

	/**
	 * Getter
	 * 
	 * @return the border
	 */
	public static String getBorder() {
		return BORDER;
	}

}
