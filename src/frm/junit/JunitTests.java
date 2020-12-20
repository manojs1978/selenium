package frm.junit;

import org.junit.Test;

import frm.java.ImplementMathInterface;
import static org.junit.Assert.*;
public class JunitTests {
	ImplementMathInterface imi = new ImplementMathInterface();
	public static final String ERR_DIVIDE_BY_ZERO = 
			"Denominator cannot be zero.";
	@Test
	public void divideValidData() 
			throws InvalidArgumentException{
		assertEquals(5, imi.divide(10, 2));
	}
	@Test
	public void test1(){
		String str = "automation";
		System.out.println("Reverse String is: " 
		+ getReverseString(str));
	}
	
	private static String getReverseString(String str){
		String reverse = "";
		for (int i=(str.length()-1);i>=0;i--){
			reverse = reverse + str.charAt(i);
			
		}
		return reverse;
	}
	
	@Test
	public void divideByZero(){
		try{
			imi.divide(8, 0);
			fail("No exception was thrown");
		} catch (InvalidArgumentException iae){
			assertEquals("ERROR_002", iae.getErrorCode());
			assertEquals(ERR_DIVIDE_BY_ZERO, iae.getMessage());
		} catch (Exception e){
			fail(e.getMessage() + "was thrown instead of " +
					"'InvalidArgumentException'.");
		}
	}
}
