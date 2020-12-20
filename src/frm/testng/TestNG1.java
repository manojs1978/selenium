package frm.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * This class explains the usage of 
 * basic TestNG annotations.
 * @author admin
 * @since January 11, 2015.
 */
public class TestNG1 {

	/**
	 * Executes before suite execution.
	 */
	@BeforeSuite
	public void setupSuite(){
		System.out.println("Executing '@BeforeSuite' block.");
	}
	
	/**
	 * Executes before Test execution.
	 */
	@BeforeTest
	public void setUpTest(){
		System.out.println("Excute '@BeforeTest' block.");
	}
	
	/**
	 * Executes before class execution.
	 */
	@BeforeClass
	public void setUpTestClass(){
		System.out.println("Execute '@beforeClass' block.");
	}
	
	/**
	 * Executes before each test case.
	 */
	@BeforeMethod
	public void setUpTestCase(){
		System.out.println("Execute '@beforeMethod' block.");
	}
	
	/**
	 * Test case 1.
	 */
	@Test
	public void testCase1(){
		System.out.println("Execute 'Test Case 1'.");
	}
	
	/**
	 * Test case 2.
	 */
	@Test
	public void testCase2(){
		System.out.println("Execute 'Test Case 2'.");
	}
	
	/**
	 * Test case 3.
	 */
	@Test
	public void testCase3(){
		System.out.println("Execute 'Test Case 3'.");
	}
	
	/**
	 * Test case 4.
	 */
	
	@Test
	public void testCase4(){
		System.out.println("Execute 'Test Case 4'.");
	}
	
	/**
	 * Test case 5.
	 */
	@Test
	public void testCase5(){
		System.out.println("Execute 'Test Case 5'.");
	}
	
	/**
	 * Executes after each test case.
	 */
	@AfterMethod
	public void cleanUpTestCase(){
		System.out.println("Execute '@AfterMethod' block.");
	}
	
	/**
	 * Executes after test class execution.
	 */
	@AfterClass
	public void cleanUpTestClass(){
		System.out.println("Execute '@AfterClass' block.");
	}
	
	/**
	 * Executes after Test execution.
	 */
	@AfterTest
	public void cleanUpTest(){
		System.out.println("Execute '@AfterTest' block.");
	}
	
	/**
	 * Executes after suite execution.
	 */
	@AfterSuite
	public void cleanUpSuite(){
		System.out.println("Execute '@afterSuite' block.");
	}
	
}
