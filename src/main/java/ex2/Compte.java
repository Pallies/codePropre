package ex2;

/**
 * Représente un compte bancaire de type compte courante (type=CC) ou livret A
 * (type=LA)
 * 
 * @author DIGINAMIC
 */
public abstract class Compte {
	/** Désignation d'un compte courant */
	private static final String COMPTE_COURANT = "CC";
	/** Désignation d'un livret A */
	private static final String LIVRET_A = "LA";

	/** un découvert est autorisé seulement pour les comptes courants */
	private double decouvert = 0;

	/** solde du compte */
	private double solde;

	/** taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	/** Le type vaut soit CC=Compte courant, ou soit LA=Livret A */
	private String type;

	/** #Contructeur COMPTE_COURANT
	 * {@link CompteCourant}
	 * @param solde
	 */
	public Compte(double solde) {
		this.type = COMPTE_COURANT;
		this.solde = solde;
	}

	/** #Contructeur LivretA
	 * {@link LivretA}
	 * @param solde
	 * @param tauxRemuneration
	 */
	public Compte(double solde, double tauxRemuneration) {
		this.type = LIVRET_A;
		this.solde = solde;
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * Ajoute un montant au solde
	 * 
	 * @param montant
	 */
	public void ajouterMontant(double montant) {
		this.solde += montant;
	}

	/**
	 * Remise annuelle aplicable
	 * que pour les Livrets A
	 * {@link LivretA#appliquerRemuAnnuelle() double}
	 */
	public abstract void appliquerRemuAnnuelle();

	/**
	 * Ajoute un montant au solde 
	 * 
	 * {@link LivretA#debiterMontant() double}
	 * {@link CompteCourant#debiterMontant() double}
	 */
	public abstract void debiterMontant(double montant);

	/**
	 * Getter for decouvert
	 * 
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}

	/**
	 * Getter for solde
	 * 
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * Getter for tauxRemuneration
	 * 
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Getter for type
	 * 
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Setter
	 * 
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	/**
	 * Setter
	 * 
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * Setter
	 * 
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * Setter
	 * 
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
}
