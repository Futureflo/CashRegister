package tests;

import static org.junit.Assert.assertNotEquals;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;

import model.Food;

@RunWith(JavaFXJunit4ClassRunner.class)
@ContextConfiguration(locations = { "/testConfiguration.xml" })
public class FoodTests {

	@Resource(name = "Currywurst1")
	Food currywurst;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		assertNotEquals(null, currywurst);
	}

}
