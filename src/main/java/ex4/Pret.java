package ex4;

import java.util.Date;

public class Pret {
	/** stratégie d'entreprise */
	private Strategy strategy = new PretATerme();
	/** montant max d'emprunt */
	private double capital;
	/** reste pour le remboursement total de l'emprunt */
	private double capitalRestantDu;

	private double taux;
	/** date de création */
	private Date dateDebut = new Date();
	/** date de cloture */
	private Date dateFin;

	/**
	 * #Constructor faisant appel à la méthode commune {@link #completionPret}
	 * signature de méthode commune des constructeurs (double capital, double
	 * taux,...)
	 * 
	 * @throws PretSansCapitalException
	 */
	public Pret(double capital, double taux) throws PretSansCapitalException  {
		super();
		completionPret(capital, taux);
	}

	/**
	 * #Constructor faisant appel à la méthode commune {@link #completionPret}
	 * 
	 * @param dateFin
	 * @throws PretDateFinException
	 * @throws PretSansCapitalException
	 */
	public Pret(double capital, double taux, Date dateFin) throws PretSansCapitalException, PretDateFinException  {
		super();
		completionPret(capital, taux);
		if(getDateDebut().compareTo(dateFin)>=0)
			throw new PretDateFinException("Date de fin antérieur au début du prêt");
		this.dateFin = dateFin;
	}

	/**
	 * #Constructor faisant appel à la méthode commune {@link #completionPret}
	 * 
	 * @param capitalRestantDu
	 * @param dateFin
	 * @throws PretSansCapitalException
	 * @throws PretDateFinException 
	 */
	public Pret(double capital, double taux, Date dateFin, double capitalRestantDu) throws PretSansCapitalException, PretDateFinException {
		super();
		completionPret(capital, taux);
		this.capitalRestantDu = capitalRestantDu;
		if(getDateDebut().compareTo(dateFin)>=0)
			throw new PretDateFinException("Date de fin antérieur au début du prêt");
		this.dateFin = dateFin;
	}

	/**
	 * Paramètre commun à la création d'un prêt
	 * 
	 * @param capital
	 * @param taux
	 * @param dateDebut
	 * @throws PretSansCapitalException
	 */
	private void completionPret(double capital, double taux) throws PretSansCapitalException {
		if(capital<=0 || taux <0)
			throw new PretSansCapitalException("le capital d'emprunt ne peut être à zéro");
		this.capital = capital;
		this.taux = taux;
	}

	/**
	 * Getter for strategy
	 * 
	 * @return the strategy
	 */
	public Strategy getStrategy() {
		return strategy;
	}

	/**
	 * Setter
	 * 
	 * @param strategy the strategy to set
	 */
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * Getter for capital
	 * 
	 * @return the capital
	 */
	public double getCapital() {
		return capital;
	}

	/**
	 * Setter
	 * 
	 * @param capital the capital to set
	 */
	public void setCapital(double capital) {
		this.capital = capital;
	}

	/**
	 * Getter for capitalRestantDu
	 * 
	 * @return the capitalRestantDu
	 */
	public double getCapitalRestantDu() {
		return capitalRestantDu;
	}

	/**
	 * Setter
	 * 
	 * @param capitalRestantDu the capitalRestantDu to set
	 */
	public void setCapitalRestantDu(double capitalRestantDu) {
		this.capitalRestantDu = capitalRestantDu;
	}

	/**
	 * Getter for taux
	 * 
	 * @return the taux
	 */
	public double getTaux() {
		return taux;
	}

	/**
	 * Setter
	 * 
	 * @param taux the taux to set
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}

	/**
	 * Getter for dateDebut
	 * 
	 * @return the dateDebut
	 */
	public Date getDateDebut() {
		return dateDebut;
	}

	/**
	 * Setter
	 * 
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	/**
	 * Getter for dateFin
	 * 
	 * @return the dateFin
	 */
	public Date getDateFin() {
		return dateFin;
	}

	/**
	 * Setter
	 * 
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

}
