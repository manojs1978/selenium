package frm.wd;


import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * this class contains the basic utility level function for 
 * WebDriver
 * @author Administrator
 *
 */
public class WDBase {

	public static WebDriver driver = null;
	
	public static void startWD(String browser, String url, String pageLoadTimeout,
			String implicitWait){
	
		if (browser.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
			
		}else if (browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\mypersonal\\Testing\\automation_selenium\\chromedriver.exe");
				driver = new ChromeDriver();
			
		} else if (browser.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver","C:\\mypersonal\\Testing\\automation_selenium\\IEDriverServer.exe");
					driver = new InternetExplorerDriver();
		}else 
			Assert.fail("Unsupported browser"+ browser+"specified");
		
		driver.manage().timeouts().pageLoadTimeout(Long.parseLong(pageLoadTimeout), TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Long.parseLong(implicitWait), TimeUnit.SECONDS);
		driver.get(url);
	}
	public static void stopWD(){
		if (driver !=null){
			driver.quit();
			driver = null;
		}
	
	}
	
	public static void type(By by , String value){
		WebElement textbox = driver.findElement(by);
		textbox.clear();
		textbox.sendKeys(value);
	}
	public static void  click (By by){
		driver.findElement(by).click();
	}
	
	public static String getText(By by){
		return driver.findElement(by).getText();
	}
	public static void selectByVisibeText(By by,String value){
		WebElement we = driver.findElement(by);
		Select dd = new Select(we);
		dd.selectByVisibleText(value);
		
	}
	public static void seelctByIndex (By by,int index){
		WebElement we= driver.findElement(by);
		Select dd = new Select(we);
		dd.selectByIndex(index);
			}
	public static boolean isElementExists(By by){
		return driver.findElements(by).size()!=0;
			}
	public static boolean isElementVisible(By by){
		
		if (isElementExists(by)){
			if (driver.findElement(by).isDisplayed())
				return true;
		}
		return false;
		}
	public static boolean isEnabled(By by){
		return driver.findElement(by).isEnabled();
	}
}
