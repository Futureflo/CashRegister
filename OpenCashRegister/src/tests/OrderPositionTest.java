package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;

import model.Orderposition;
import model.Product;

@RunWith(JavaFXJunit4ClassRunner.class)
@ContextConfiguration(locations = { "/testConfiguration.xml" })
public class OrderPositionTest {

	@Resource(name = "Orderposition1")
	Orderposition orderposition;
	@Resource(name = "Currywurst1")
	Product currywurst1;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testInitialisierung() {
		assertNotEquals(null, orderposition);
	}

	@Test
	public void testGetProduct() {
		assertEquals(currywurst1, orderposition.getProduct());
	}

	@Test
	public void testGetCount() {
		assertEquals(2, orderposition.getCount());
	}

}
