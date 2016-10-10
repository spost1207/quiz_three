/**
 * 
 */
package quiz_3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Triangle_Test {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void perimeterTest() {
		Triangle t1 = new Triangle(1,2,3);
		double perimeter1 = t1.getPerimeter();
		assertEquals(6,perimeter1,0);
	}
	
	@Test
	public void areaTest() {
		Triangle t2 = new Triangle(3,4,5);
		double area1 = t2.getArea();
		equals(area1 == 30);
	}
	
}
