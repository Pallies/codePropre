package ex2;

/**
 * Class servant à l'ouverture d'un compte de type : livret A
 * 
 * @extends Compte
 * 
 * @author Yvan Palliès
 *
 */
public class LivretA extends Compte {

	private static final int POUR_CENT = 100;

	/**
	 * #constructeur
	 * 
	 * @param type             = LA définit à la création (Ref: Compte)
	 * @param solde            représente le solde du compte
	 * @param decouvert        représente le découvert autorisé (init : 0)
	 * @param tauxRemuneration représente le taux de rémunération du livret A
	 */
	public LivretA(double solde, double tauxRemuneration) {
		super(solde, tauxRemuneration);
	}

	/**
	 * {@link Compte#debiterMontant() double} Ajoute un montant au solde
	 * 
	 * @param montant
	 */
	@Override
	public void debiterMontant(double montant) {
		if (this.getSolde() - montant > 0) {
			this.setSolde(this.getSolde() - montant);
		}
	}

	/**
	 * Application du Taux annuel pour la valorisation du Livret
	 */
	public void appliquerRemuAnnuelle() {
		Double newSolde = this.getSolde() + this.getSolde() * this.getTauxRemuneration() / POUR_CENT;
		this.setSolde(newSolde);

	}
}
