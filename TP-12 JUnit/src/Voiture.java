
public class Voiture {

	//-_-_-_-_-_Attribut_-_-_-_-_-\\
	
	private String type;
	private double poids;
	private double puissance;
	
	//-_-_-_-_-_Get&Set_-_-_-_-_-\\
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPoids() {
		return poids;
	}
	public void setPoids(double poids) {
		this.poids = poids;
	}
	public double getPuissance() {
		return puissance;
	}
	public void setPuissance(double puissance) {
		this.puissance = puissance;
	}
	
	//-_-_-_-_-_Constructeur_-_-_-_-_-\\
	
	public Voiture (String type, double poids, double puissance)
	{
		this.type = type;
		this.poids = poids;
		this.puissance = puissance;
	}
	
	//-_-_-_-_-_Méthode_-_-_-_-_-\\
	
	//Retourne le rapport poids puissance de la voiture
	public double rapportPoidsPuissance()
	{
		return poids/puissance;
	}
	@Override
	public String toString() {
		return "Voiture [type=" + type + ", poids=" + poids + ", puissance="
				+ puissance + "]";
	}
}
