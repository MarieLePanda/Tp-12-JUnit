import java.util.ArrayList;


public class Circuit {

	//-_-_-_-_-_Attribut_-_-_-_-_-\\
	
	private String nom;
	private double longueur;
	private double prixHa;
	private double tauxMarge;
	private ArrayList<Voiture> lesVoitures;
	
	//-_-_-_-_-_Get&Set_-_-_-_-_-\\
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getLongueur() {
		return longueur;
	}
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}
	public double getPrixHa() {
		return prixHa;
	}
	public void setPrixHa(double prixHa) {
		this.prixHa = prixHa;
	}
	public double getTauxMarge() {
		return tauxMarge;
	}
	public void setTauxMarge(double tauxMarge) {
		this.tauxMarge = tauxMarge;
	}
	public ArrayList<Voiture> getLesVoitures() {
		return lesVoitures;
	}
	public void setLesVoitures(ArrayList<Voiture> lesVoitures) {
		this.lesVoitures = lesVoitures;
	}

	//-_-_-_-_-_Constructeur_-_-_-_-_-\\
	
	public Circuit (String nom, double longueur, double prixHa, double tauxMarge, ArrayList<Voiture> lesVoitures)
	{
		this.nom = nom;
		this.longueur = longueur;
		this.prixHa = prixHa;
		this.tauxMarge = tauxMarge;
		this.lesVoitures = lesVoitures;
	}
	
	//-_-_-_-_-_Méthode_-_-_-_-_-\\
	
	//Retourne le prix de vente du circuit
	public double prixVente()
	{
		return prixHa * tauxMarge;
	}
	
	//Retourne la voiture du circuit la plus puissante
	public Voiture voitureLaPlusPuissanteDuCircuit()
	{
		Voiture VoiturePlusPuissante =  lesVoitures.get(0);
		for(Voiture v : lesVoitures){
			if(VoiturePlusPuissante.rapportPoidsPuissance() > v.rapportPoidsPuissance()){
				VoiturePlusPuissante = v;
			}
		}
		return VoiturePlusPuissante;
	}
	
	@Override
	public String toString() {
		return "Circuit [nom=" + nom + ", longueur=" + longueur + ", prixHa="
				+ prixHa + ", tauxMarge=" + tauxMarge + ", lesVoitures="
				+ lesVoitures + "]";
	}
}
