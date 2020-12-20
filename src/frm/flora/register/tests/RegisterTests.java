package frm.flora.register.tests;

import java.io.IOException;
import java.util.Properties;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import frm.flora.register.meta.RegisterUtil;
import static frm.meta.Utils.*;
import static org.junit.Assert.*;
/*
 * This class contains the registration feature related test cases for flora
 * India web application
 */
public class RegisterTests extends RegisterUtil{
	static Properties p = null;
	private static final String ERR_INVALID_EMAIL="Email address seems incorrect (check @ and .'s)";
	@BeforeClass
	public static void setUp () throws IOException{
		p = loadData("././config/config.txt");
		startWD(p.getProperty("wd.browser"), p.getProperty("url.flora"),
				p.getProperty("wd.pageloadtimeout"), p.getProperty("wd.implicitwait"));
	}
	@Before
	public void setUpTestcase(){
		click(By.linkText(LINK_REGISTER));
	}
	
	@Test
	public void testInvalidEmail(){
		//1) Enter registration data having invalid entries
		enterrRegistrationData("abc", "1234", "1234", "manoj", "pune", "puen", "Pune",
				"maharshtra", "411046", "india", "1313331313", "11399999999", false);
		//2) click on 'Register' icon
		click(By.xpath(BTN_REGISTER));
		
		//3) handle alert and verify alert message
		Alert alert = driver.switchTo().alert();
		String actMsg = alert.getText();
		alert.dismiss();
		assertEquals(ERR_INVALID_EMAIL,actMsg);
	}
@AfterClass	
public static void cleanUp(){
	stopWD();
}

}
