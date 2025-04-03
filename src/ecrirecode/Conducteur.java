package ecrirecode;

public class Conducteur  extends Utilisateur{
	  private String permisID;
	  private String flotteAssignée;
	  private double soldeFinancier;

	public String getPermisID() {
		return permisID;
	}

	public void setPermisID(String permisID) {
		this.permisID = permisID;
	}

	public String getFlotteAssignée() {
		return flotteAssignée;
	}

	public void setFlotteAssignée(String flotteAssignée) {
		this.flotteAssignée = flotteAssignée;
	}

	public double getSoldeFinancier() {
		return soldeFinancier;
	}

	public void setSoldeFinancier(double soldeFinancier) {
		this.soldeFinancier = soldeFinancier;
	}

	public Conducteur(int id, String nom, String prenom, String sexe, String adresse, String email, String motDePasse) {
		super(id, nom, prenom, sexe, adresse, email, motDePasse);
		// TODO Auto-generated constructor stub
	}
	
	//les methodes
	
	   public void consulterProfil(){}
	   public void modifierCompte(){}


}
