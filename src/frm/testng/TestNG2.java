package frm.testng;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * This class explains the 
 * parameterization, grouping and 
 * report log concepts of TestNG.
 * @author admin
 * @since Jaunary 11, 2015.
 */
public class TestNG2 {
	
	@Parameters({"user", "password"})
	@Test(groups={"sanity"})
	public void testNG2Test1(String u, String p){
		Reporter.log("Username: " + u);
		Reporter.log("Password: " + p);
	}
	
	@Test(groups={"newfeature"})
	public void testNG2Test2(){
		Reporter.log("Executing testNG2Test2 new " +
				"feature testcase");
	}
	
	@Test(groups={"regression"})
	public void testNG2Test3(){
		Reporter.log("Executing testNG2Test3 regression " +
				"testcase");
	}
	
	@Test(groups={"sanity", "newfeature"})
	public void testNG2Test4(){
		Reporter.log("Excuting testNG2Test4 which is " +
				"both sanity as well as new feature test case");
	}
	
	@Test(groups={"sanity", "regression"})
	public void testNG2Test5(){
		Reporter.log("Executing testNG2Test5 which is both " +
				"sanity as well as regression test case");
	}
}
