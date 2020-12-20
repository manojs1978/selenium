package frm.flora.register.meta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import frm.wd.WDBase;

/*
 * This class contains the utility-level function
 * for registration feature in flora India web application
 */
public class RegisterUtil extends WDBase{

	/*
	 * selenium identifiers
	 * 
	 */
	public static final String LINK_REGISTER="Register";
	private static final String TXT_EMAIL="txtEmail";
	private static final String TXT_PREFIX="//font[normalize-space(text())='";
	private static final String TXT_SUFFIX="']/following::input[1]";
	private static final String TXT_PASSWORD="//font[normalize-space(text())='Password:']/following::input[1]";
	private static final String TXT_CONF_PASS="//font[normalize-space(text())='Confirm Password:']/following::input[1]";
	private static final String TXT_NAME=TXT_PREFIX + "Name:" + TXT_SUFFIX;
	private static final String TXT_ADDR=TXT_PREFIX + "Address:" + TXT_SUFFIX;
	private static final String TXT_ADDR_CONT=TXT_PREFIX + "Address: (contd.)" + TXT_SUFFIX;
	private static final String TXT_CITY=TXT_PREFIX + "City:" + TXT_SUFFIX;
	private static final String TXT_STATE=TXT_PREFIX + "State:" + TXT_SUFFIX;
	private static final String TXT_ZIPCODE=TXT_PREFIX + "Postal/Zip code:" + TXT_SUFFIX;
	private static final String TXT_COUNTRY=TXT_PREFIX + "Country:" + TXT_SUFFIX;
	private static final String TXT_PHONE=TXT_PREFIX + "Phone:" + TXT_SUFFIX;
	private static final String TXT_FAX=TXT_PREFIX + "Fax:" + TXT_SUFFIX;
	private static final String CHK_NEWSLETTER="//font[normalize-space(text())='Would you like to receive our future newsletters and discounts?']/input[1]";
	protected static final String BTN_REGISTER="//input[@value='Register']";
	
	
	public static void enterrRegistrationData (String email, String pass,String confpass,String name,
			String addr,String addrCont, String city,String state, String zipcode, String country,
			String phone, String fax,  boolean isNewsletter){
		//1) Entering registration data
		type(By.id(TXT_EMAIL),email==null?"":email);
		type(By.xpath(TXT_PASSWORD),pass==null?"":pass);
		type(By.xpath(TXT_CONF_PASS),confpass==null?"":confpass);
		type(By.xpath(TXT_NAME),name==null?"":name);
		type(By.xpath(TXT_ADDR),addr==null?"":addr);
		type(By.xpath(TXT_ADDR_CONT),addrCont==null?"":addrCont);
		type(By.xpath(TXT_CITY),city==null?"":city);
		type(By.xpath(TXT_STATE),state==null?"":state);
		type(By.xpath(TXT_ZIPCODE),zipcode==null?"":zipcode);
		type(By.xpath(TXT_COUNTRY),country==null?"":country);
		type(By.xpath(TXT_PHONE),phone==null?"":phone);
		type(By.xpath(TXT_FAX),fax==null?"":fax);
		
		WebElement checkbox= driver.findElement(By.xpath(CHK_NEWSLETTER));
		if(isNewsletter){
			if (!checkbox.isSelected())
				checkbox.click();
		}else {
			if (checkbox.isSelected())
				checkbox.click();
		}
		
		
		
	}
}
