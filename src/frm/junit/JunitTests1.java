package frm.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * This class explains the usage of 
 * baisc junit annotations.
 * @author admin
 * @since April 26, 2015.
 */
public class JunitTests1 {
	
	/**
	 * Set-up one time pre-conditions.
	 */
	@BeforeClass
	public static void setUpClass(){
		System.out.println("Executing 'BeforeClass' block...");
	}

	/**
	 * Set-up pre-conditions for each test case.
	 */
	@Before
	public void setUpTestCase(){
		System.out.println("Executing 'Before' block...");
	}
	
	/**
	 * Test case 1.
	 */
	@Test
	public void testCase1(){
		System.out.println("Executing 'TestCase1'...");
	}
	
	/**
	 * Test case 2.
	 */
	@Test
	public void testCase2(){
		System.out.println("Executing 'TestCase2'...");
	}
	
	/**
	 * Test case 3.
	 */
	@Test
	public void testCase3(){
		System.out.println("Executing 'TestCase3'...");
	}
	
	/**
	 * Test case 4.
	 */
	@Test
	public void testCase4(){
		System.out.println("Executing 'TestCase4'...");
	}
	
	/**
	 * Test case 5.
	 */
	@Test
	public void testCase5(){
		System.out.println("Executing 'TestCase5'...");
	}
	
	/**
	 * Performs test case level clean-up.
	 */
	@After
	public void cleanUpTestCase(){
		System.out.println("Executing 'After' block...");
	}
	
	/**
	 * Performs one-time class level clean-up.
	 */
	@AfterClass
	public static void cleanUpClass(){
		System.out.println("Executing 'AfterClass' block...");
	}
}
