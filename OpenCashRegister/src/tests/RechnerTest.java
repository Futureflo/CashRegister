package tests;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;

import rechenmodul.Rechner;

// Einbinden eines neuen Runners für JavaFX. Wird hier noch nicht benötigt, soll nur zeigen, wie es gehen würde.
@RunWith(JavaFXJunit4ClassRunner.class)
// Einbinden der Testkonfiguration für Spring, damit die Spring-Anwendung getestet werden kann
@ContextConfiguration(locations = { "/testConfiguration.xml" })
public class RechnerTest {

	// Zugriff auf die oben eingetragene Location und Suche nach der Bean mit der ID = "Rechner1"
	// Diese wird der Variable "rechner" zugewiesen
	@Resource(name = "Rechner1")
	Rechner rechner;
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testInitialisierung() {
		assertNotEquals(null, rechner);
	}
	
	@Test
	public void testAddiere() {
		assertEquals(4, rechner.addiere(3, 1));
		assertEquals(8, rechner.addiere(7, 1));
	}

}
