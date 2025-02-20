package employe;

public class Vendeur extends Salaire {
	private double Vente;
	private double Pourcentage;
	public Vendeur() {
		super();
	}
	public Vendeur(int matricule, String nom, int recrutement, double vente, double pourcentage) {
		super(matricule, nom, recrutement);
		this.Vente = vente;
		this.Pourcentage = pourcentage;
	}
	public double getVente() {
		return Vente;
	}
	public void setVente(double vente) {
		Vente = vente;
	}
	public double getPourcentage() {
		return Pourcentage;
	}
	public void setPourcentage(double pourcentage) {
		Pourcentage = pourcentage;
	}
	@Override
	public String toString() {
		return "Vendeur [Vente=" + Vente + ", Pourcentage=" + Pourcentage + ", toString()=" + super.toString() +this.Salaire()+ "]";
	}
	
	public double Salaire() {
		return this.salaireDate()+(this.Vente*this.Pourcentage);
	}
	
	
}
