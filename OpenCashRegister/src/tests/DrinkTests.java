package tests;

import static org.junit.Assert.assertNotEquals;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;

import model.Drink;

@RunWith(JavaFXJunit4ClassRunner.class)
@ContextConfiguration(locations = { "/testConfiguration.xml" })
public class DrinkTests {

	@Resource(name = "Beer1")
	Drink beer;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		assertNotEquals(null, beer);
	}

}
