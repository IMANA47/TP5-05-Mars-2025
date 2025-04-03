package ecrirecode;

public class Message {

	  private int id;
	  private Utilisateur expéditeur;
	  private Utilisateur destinataire;
	  private String contenu;
	  private int dateEnvoi;
	
	  
	  
	  public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Utilisateur getExpéditeur() {
		return expéditeur;
	}
	public void setExpéditeur(Utilisateur expéditeur) {
		this.expéditeur = expéditeur;
	}
	public Utilisateur getDestinataire() {
		return destinataire;
	}
	public void setDestinataire(Utilisateur destinataire) {
		this.destinataire = destinataire;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public int getDateEnvoi() {
		return dateEnvoi;
	}
	public void setDateEnvoi(int dateEnvoi) {
		this.dateEnvoi = dateEnvoi;
	}
	public int getDateReception() {
		return dateReception;
	}
	public void setDateReception(int dateReception) {
		this.dateReception = dateReception;
	}
	private int dateReception;

	
	// les methode
	
	 public void envoyerMessage(){}
	 public void consulterMessages(){}
	 public void modifierMessages(){}

	
}
