import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


public class CircuitTest {

	
	
	@Before
	public void setUp() throws Exception {
		
	}
	
	@Test
	public void testConstructeur() {
		Circuit unCircuit;
		Voiture uneVoiture;
		ArrayList<Voiture> lesVoitures = new ArrayList<Voiture>();
		
		uneVoiture = new Voiture("Panda", 50.0, 2.0);
		lesVoitures.add(uneVoiture);
		
		unCircuit = new Circuit("WWF", 30, 12.99, 1.35, lesVoitures);
		
		assertNotNull("Constructeur incorrect", unCircuit);	
	}
	
	@Test
	public void testPrixVente(){
		Circuit unCircuit;
		Voiture uneVoiture;
		ArrayList<Voiture> lesVoitures = new ArrayList<Voiture>();
		
		uneVoiture = new Voiture("Panda", 50.0, 2.0);
		lesVoitures.add(uneVoiture);
		
		unCircuit = new Circuit("WWF", 30, 12.99, 1.35, lesVoitures);
		
		assertTrue("Prix de vente incorrect",unCircuit.prixVente() == 17.5365 );
	}
	
	@Test
	public void testVoitureLaPlusPuissanteDuCircuit(){
		Circuit unCircuit;
		Voiture v1, v2, v3;
		ArrayList<Voiture> lesVoitures = new ArrayList<Voiture>();
		
		v1 = new Voiture("Panda", 50.0, 2.0);
		v2 = new Voiture("Raccon", 50.0, 20.0); //La plus puissante
		v3 = new Voiture("fox", 25.0, 2.0);
		
		lesVoitures.add(v1);
		lesVoitures.add(v2);
		lesVoitures.add(v3);
		
		unCircuit = new Circuit("WWF", 30, 12.99, 1.35, lesVoitures);
		
		assertSame("Voiture la plus puissante du circuit incorrect",v2, unCircuit.voitureLaPlusPuissanteDuCircuit());
	}

}
