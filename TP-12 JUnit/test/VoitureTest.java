import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class VoitureTest {
	
	
	@Before
	public void setUp() throws Exception {
		
		
	}
	
	@Test
	public void testConstructeur() {
		Voiture uneVoiture = new Voiture("Panda", 50.0, 2.0);
		
		assertNotNull("Constructeur incorrect", uneVoiture);
	}
	
	@Test
	public void testRapportPoidsPuissance() {
		Voiture uneVoiture = new Voiture("Panda", 50.0, 2.0);
		
		assertTrue("Résultat rapport poids puissance non conforme", uneVoiture.rapportPoidsPuissance() == (25.0));
	}
	

}
