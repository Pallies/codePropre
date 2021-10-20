package ex2;

/**
 * Class servant à l'ouverture d'un compte de type : Compte courant
 * 
 * @extends Class Compte
 * 
 * @author Yvan Palliès
 * 
 */
public class CompteCourant extends Compte {

	/**
	 * #constructeur
	 * 
	 * @param type      = CC définit à la création (Ref: Compte)
	 * @param solde     représente le solde du compte
	 * @param decouvert représente le découvert autorisé (init : 0)
	 */
	public CompteCourant(double solde) {
		super(solde);
	}
	/**
	 * {@link Compte#debiterMontant() double}
	 * Ajoute un montant au solde
	 * @param montant
	 */
	@Override
	public void debiterMontant(double montant) {
		if (this.getSolde() - montant > this.getDecouvert()) {
			this.setSolde(this.getSolde() - montant);
		}
	}
	
	@Override
	public void appliquerRemuAnnuelle() {}

}
