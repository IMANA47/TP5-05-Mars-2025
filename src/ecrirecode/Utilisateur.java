package ecrirecode;

public class Utilisateur {

	  private int id;
	  private String nom;
	  private String prenom;
	   private String sexe;
      private String adresse;
	  private String email;
	  private String  motDePasse;
	  
	public Utilisateur(int id, String nom, String prenom, String sexe, String adresse, String email,
			String motDePasse) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.adresse = adresse;
		this.email = email;
		this.motDePasse = motDePasse;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	// les methodes
	
	 public void seConnecter(){}
	public void  seDeconnecter(){}
	 public void envoyerArgent(){}
	 public void recevoirArgent(){}
	 public void recevoirMessage(){}
	public void  envoyerMessage(){}
	
	
	
	
	
	
	
}
