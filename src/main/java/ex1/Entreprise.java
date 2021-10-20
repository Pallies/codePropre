package ex1;

import java.util.Date;

/**
 * Class décrivant une société
 * @author Yvan Palliès
 *
 */
public class Entreprise {
	/** N° d'identification */
	public int siret;
	public String nom;
	public String adresse;
	public Date dateCreation;
	
	/** constante pour définir ??*/
	public static final int CAPITAL_MAX = 3_000_000;
	
	/**
	 * Affichage du status de l'entreprise
	 */
	public void afficherStatut(){
		
	}

	/**Getter
	 * @return the siret
	 */
	public int getSiret() {
		return siret;
	}

	/**Setter
	 * @param siret the siret to set
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}

	/**Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**Getter
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**Setter
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**Getter
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/**Setter
	 * @param dateCreation the dateCreation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	@Override
	public String toString() {
		return "Entreprise siret=" + siret + ", nom=" + nom + ", adresse=" + adresse + ", dateCreation=" + dateCreation;
	}
	
	
}
