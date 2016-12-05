package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;

import model.Drink;
import model.Food;
import model.Order;
import model.Product;

@RunWith(JavaFXJunit4ClassRunner.class)
@ContextConfiguration(locations = { "/testConfiguration.xml" })
public class OrderTests {

	@Resource(name = "Order")
	Order order;
	@Resource(name = "Beer1")
	Drink beer;

	@Resource(name = "Currywurst1")
	Food currywurst;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testInitialisierung() {
		assertNotEquals(null, order);
	}

	// Geht noch nicht. Tipp: testConfiguration anschauen
	@Test
	public void testGetProducts() {
		List<Product> products = order.getProducts();

		assertEquals(true, products.contains(beer));

		assertEquals(true, products.contains(currywurst));
	}

	// Geht noch nicht. Tipp: da fehlt doch was
	@Test
	public void testAddProduct() {
		Drink cola = new Drink();
		cola.setName("Cola");
		cola.setPrice(1.00f);
		cola.setVolume(0.5f);

		order.addProduct(cola);

		List<Product> products = order.getProducts();

		assertEquals(true, products.contains(cola));
	}

	@Test
	public void testRemoveProduct() {
		// Produkt hinzufügen
		Drink cola = new Drink();

		order.addProduct(cola);

		List<Product> products = order.getProducts();

		assertEquals(true, products.contains(cola));

		// Produkt entfernen

		order.removeProduct(cola);

		products = order.getProducts();

		assertEquals(false, products.contains(cola));

	}

}
