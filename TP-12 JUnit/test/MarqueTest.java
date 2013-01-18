import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;


public class MarqueTest {

	
	
	@Before
	public void setUp() throws Exception {	
	
	}

	@Test
	public void testConstructeur(){
		Marque uneMarque = new Marque("Fiat");

		assertNotNull("Constructeur incorect", uneMarque);
	}
	
	@Test
	public void testCircuitsAyantUneLongueurMinimale(){
		//déclaration de variable
		Marque uneMarque;
		Circuit c1, c2, c3;
		ArrayList<Circuit> lesCircuits;
		ArrayList<Voiture> lesVoitures;
		Voiture voiture1;
		
		//Instanciation des variable
		uneMarque = new Marque("Fiat");
		voiture1 = new Voiture("Panda Roux", 50.0, 2.0);
		lesVoitures = new ArrayList<Voiture>();
		lesCircuits = new ArrayList<Circuit>();

		
		lesVoitures.add(voiture1);
		c1 = new Circuit("WWF", 30, 12.99, 1.35, lesVoitures); //resultat
		c2 = new Circuit("WWF", 50, 12.99, 1.35, lesVoitures); //resultat
		c3 = new Circuit("WWF", 10, 12.99, 1.35, lesVoitures);
		
		lesCircuits.add(c1); //resultat
		lesCircuits.add(c2); //resultat
		lesCircuits.add(c3);
		
		uneMarque.setLesCircuits(lesCircuits);		
		
		//Test
		assertSame("CircuitsAyantUneLongueurMinimale incorrect",c1, uneMarque.circuitsAyantUneLongueurMinimale(30).get(0));
		assertSame("CircuitsAyantUneLongueurMinimale incorrect",c2, uneMarque.circuitsAyantUneLongueurMinimale(30).get(1));
	}
	
	@Test
	public void testCircuitsAyantUnTypeDeVoiture(){
		//déclaration de variable
		Marque uneMarque;
		Circuit c1, c2;
		ArrayList<Circuit> lesCircuits;
		ArrayList<Voiture> lesVoitures1, lesVoitures2;
		Voiture v1, v2;
		
		//Instanciation des variable
		uneMarque = new Marque("Fiat");
		v1 = new Voiture("Panda Roux", 50.0, 2.0); //Resultat 
		v2 = new Voiture("Panda Géant", 50, 3.0);
		
		lesVoitures1 = new ArrayList<Voiture>(); 
		lesVoitures2 = new ArrayList<Voiture>();
		lesCircuits = new ArrayList<Circuit>();
		
		lesVoitures1.add(v1); //Resultat
		lesVoitures2.add(v2);
		
		c1 = new Circuit("WWF", 30, 12.99, 1.35, lesVoitures1); //Resultat
		c2 = new Circuit("WWF", 50, 12.99, 1.35, lesVoitures2);
		
		lesCircuits.add(c1);
		lesCircuits.add(c2);
		
		uneMarque.setLesCircuits(lesCircuits);	
		
		assertSame("CircuitsAyantUnTypeDeVoiture incorrect",c1 ,uneMarque.circuitsAyantUnTypeDeVoiture("Panda Roux").get(0));
	}
	
	@Test
	public void testCircuitAyantLaVoitureLaPlusPuissante(){
		
		//déclaration de variable
		Marque marqueCaMarque;
		Circuit circuit1, circuit3;
		Voiture voiture1, voiture2;
		ArrayList<Circuit> circuits1, circuits2;
		ArrayList<Voiture> voitures1, voitures2;
				
		//Instanciation des variable
		circuits1 = new ArrayList<Circuit>();
		circuits2 = new ArrayList<Circuit>();
		voitures1 = new ArrayList<Voiture>();
		voitures2 = new ArrayList<Voiture>();
		
		voiture1 = new Voiture("Panda Roux", 50.0, 2.0);
		voiture2 = new Voiture("Panda Géant", 50.0, 20.0);
				
		voitures1.add(voiture1);
		voitures2.add(voiture2);
				
		circuit1 = new Circuit("WWF", 50.30, 12.99, 1.35, voitures1);
		circuit3 = new Circuit("WWF", 50.30, 12.99, 1.35, voitures2);
				
		circuits1.add(circuit1);
		circuits2.add(circuit3);
				
		marqueCaMarque = new Marque("Marie");
		marqueCaMarque.setLesCircuits(circuits1);
		marqueCaMarque.setLesCircuits(circuits2);

		//Test
		assertTrue("Resultat circuit ayant la voiture la plus puissante non conforme", marqueCaMarque.circuitAyantLaVoitureLaPlusPuissante().equals(circuit3));
	}
	
	@Test
	public void testcaMarque() {
		
		//déclaration de variable////
		Marque marqueCaMarque;
		Circuit circuit1, circuit2, circuit3;
		Voiture voiture1, voiture2;
		ArrayList<Circuit> circuits;
		ArrayList<Voiture> voitures;
		
		//Instanciation des variable
		circuits = new ArrayList<Circuit>();
		voitures = new ArrayList<Voiture>();
		voiture1 = new Voiture("Panda Roux", 50.0, 2.0);
		voiture2 = new Voiture("Panda Géant", 50.0, 20.0);
		
		voitures.add(voiture1);
		voitures.add(voiture2);
		
		circuit1 = new Circuit("WWF", 50.30, 12.99, 1.35, voitures);
		circuit2 = new Circuit("WWF", 50.30, 12.99, 1.35, voitures);
		circuit3 = new Circuit("WWF", 50.30, 12.99, 1.35, voitures);
		
		circuits.add(circuit1);
		circuits.add(circuit2);
		circuits.add(circuit3);
		
		marqueCaMarque = new Marque("Marie");
		marqueCaMarque.setLesCircuits(circuits);
		
		//Test
		assertEquals("Resultat ca marque non conforme", marqueCaMarque.caMarque(), 52.6095,0.0001);
	}

}
