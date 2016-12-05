package tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;

@RunWith(JavaFXJunit4ClassRunner.class)
@ContextConfiguration(locations = { "/testConfiguration.xml" })
public class StandardTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {

	}

}
