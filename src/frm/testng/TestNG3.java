package frm.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG3 {
	
	@Test
	public void begin(){
		System.out.println("Executing 'begin' testcase...");
		
	}
	
	@Test(dependsOnMethods = {"begin"})
	public void initialize(){
		
		System.out.println("Executing 'initialize' test case...");
	}
	
	@Test (dependsOnMethods = {"begin", "initialize"})
	public void process(){
		System.out.println("Executing 'process' test case...");
		Assert.fail("Testcase 'begin' failed...");
	}
	
	@Test(dependsOnMethods={"initialize", "process"})
	public void end(){
		System.out.println("Executing 'end' testcase...");
	}
	
}
