package tests;

import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;

import loader.TxtLoader;
import model.Product;

@RunWith(JavaFXJunit4ClassRunner.class)
@ContextConfiguration(locations = { "/testConfiguration.xml" })
public class TxtLoaderTests {

	@Resource(name = "TxtLoader")
	TxtLoader txtLoader;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testInitialisierung() {

		assertNotEquals(null, txtLoader);
	}

	@Test
	public void testReadTxt() {
		ArrayList<String> strings = txtLoader.readTxt();
		assertNotEquals(null, strings.get(0));
	}

	@Test
	public void testReadProducts() {
		Product product = new Product();
		product.setName("Bier");
		product.setPrice(2.50f);

		List<Product> products = txtLoader.readProducts();

		assertNotEquals(product, products.get(0));

	}
}
