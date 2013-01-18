import java.util.ArrayList;


public class Marque {

	//-_-_-_-_-_Attribut_-_-_-_-_-\\
	
	private String nom;
	private ArrayList<Circuit> lesCircuits;
	
	//-_-_-_-_-_Get&Set_-_-_-_-_-\\
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Circuit> getLesCircuits() {
		return lesCircuits;
	}

	public void setLesCircuits(ArrayList<Circuit> lesCircuits) {
		this.lesCircuits = lesCircuits;
	}

	//-_-_-_-_-_Constructeur_-_-_-_-_-\\
	
	public Marque(String leNom)
	{
		this.nom = leNom;
	}
	
	//-_-_-_-_-_Méthode_-_-_-_-_-\\
	
	//Retourne les circuits qui sont plus grand ou égale à la longueur entrée en paramètre
	public ArrayList<Circuit> circuitsAyantUneLongueurMinimale(double laLongueur)
	{
		ArrayList<Circuit> circuitLong = new ArrayList<Circuit>();
		for(Circuit c : lesCircuits){
			if(laLongueur <= c.getLongueur()){
				circuitLong.add(c);
			}
		}
		return circuitLong;
	}
	
	//Retourne les circuits qui ont une voiture du type entré en paramètre
	public ArrayList<Circuit> circuitsAyantUnTypeDeVoiture(String leType)
	{
		ArrayList<Circuit> circuitType = new ArrayList<Circuit>();
		for(Circuit c : lesCircuits){
			for(Voiture v : c.getLesVoitures()){
				if(leType == v.getType()){
					circuitType.add(c);
				}
			}
			
		}
		return circuitType;
	}
	
	//Retourne le circuit qui à la voiture la plus puissante
	public Circuit circuitAyantLaVoitureLaPlusPuissante ()
	{
		
		double puissance = lesCircuits.get(0).getLesVoitures().get(0).getPuissance();
		Circuit circuitPuissant = lesCircuits.get(0);
		for(Circuit c : lesCircuits){
			for(Voiture v : c.getLesVoitures()){
				if(puissance <= v.getPuissance()){
					puissance = v.getPuissance();
					circuitPuissant = c;
				}
			}
			
		}
		return circuitPuissant;
		
	}
	
	//Retourne le prix de tous les circuits de la marque
	public float caMarque()
	{
		float cummulPrix = 0;
		for(Circuit c : lesCircuits){
			cummulPrix += c.prixVente();
		}
		return cummulPrix;
	}

	@Override
	public String toString() {
		return "Marque [nom=" + nom + ", lesCircuits=" + lesCircuits + "]";
	}
}
