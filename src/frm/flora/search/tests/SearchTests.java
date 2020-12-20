package frm.flora.search.tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import static org.junit.Assert.*;
import frm.wd.WDBase;

/**
 * This class contains the search feature 
 * related test cases for Flora India 
 * web application.
 * @author admin
 * @since May 02, 2015.
 */
public class SearchTests extends WDBase{
	
	@BeforeClass
	public static void setUpSearchTestClass(){
		startWD("chrome", "http://www.floraindia.com", "120", "3");
	}

	@Test
	public void searchTest1(){
		driver.findElement(By.id("kwsch")).clear();
		
	    driver.findElement(By.id("kwsch")).sendKeys("marriage");
	  driver.findElement(By.className("dkSelect")).click();
	   //ew Select(driver.findElement(By.name("occasions").
	  //driver.findElement(By.className("dkSelectDropdownElement").id("Anniversary"));
	  driver.findElement(By.xpath("//div[@class=dkSelectDropdown]/ul/li[1]/textlike=Anniversary")).click();
	  
	    driver.navigate().refresh();
	    
	 //   driver.findElement(By.xpath("html/body/div[6]/div[2]/form/div/div[2]/div/ul/li[1]/a")
	    
	   
	/*  new Select(driver.findElement(By.className("dkSelectDropdownElement"))).selectByValue("Anniversary");
	    
	    new Select(driver.findElement(By.name("flowers"))).selectByVisibleText("Anthuriums");
	    new Select(driver.findElement(By.name("range"))).selectByVisibleText("Below Rs. 500");
	    new Select(driver.findElement(By.name("flowerssch"))).selectByVisibleText("Casablanca");
	    new Select(driver.findElement(By.className("fa allease3 fa-check-circle")));
	    driver.findElement(By.cssSelector("input[type=\"image\"]")).click();
	    assertEquals("Total Items :", 
	    		driver.findElement(By.xpath("//form[@id='pp']/center/table/tbody/tr[8]/td[2]/table/tbody/tr/td[3]/table/tbody/tr/td[2]/font")).getText());
	    		
	    	*/
	}

	@AfterClass
	public static void cleanUpSearchTestClass(){
		stopWD();
	}
}
