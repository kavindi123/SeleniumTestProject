package automationFramework;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

/**
 * 
 * @author Kavindi Weerakkodi
 * 
 *  This class tests the Register page 
 *
 */
public class Register {
	
	// create account without email
	public void createaccountwithoutemail(WebDriver driver) 
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement login = driver.findElement(By.className("login"));
		login.click();
		
		WebElement create = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span/i"));
		create.click();
		
		WebElement email = driver.findElement(By.id("email_create"));
		
		if(email.getText().length()==0)
		{
			String error = "Invalid email address.";
			WebElement actual = driver.findElement(By.xpath("//*[@id=\"create_account_error\"]/ol/li"));
			String actualerror = actual.getText();
			
			Assert.assertEquals(error, actualerror);
			System.out.println("Invalid email address");
			
		}
		
	}
	
	// create account with email
	public void createaccountwithemail(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement login = driver.findElement(By.className("login"));
		login.click();
		
		WebElement email = driver.findElement(By.id("email_create"));
		email.sendKeys(ProjectStarter.getEMAIL());
		
		WebElement create = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span/i"));
		create.click();
		
		//Fill the form
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement title = driver.findElement(By.id("uniform-id_gender1"));
		title.click();
		
		boolean tatlebtn = title.isSelected();
		System.out.println("Radio button selected");
		
		WebElement fname = driver.findElement(By.id("customer_firstname"));
		fname.sendKeys("Kavindi");
		System.out.println("Fname Inserted");
		
		WebElement lname = driver.findElement(By.id("customer_lastname"));
		lname.sendKeys("Weerakkodi");
		System.out.println("Lname Inserted");
		
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("kavi1234");
		System.out.println("password Inserted");
		
		Select date = new Select(driver.findElement(By.id("days")));
		date.selectByValue("15");
		System.out.println("date Inserted");
		
		Select month = new Select(driver.findElement(By.id("months")));
		//month.selectByVisibleText("January");
		month.selectByIndex(1);
		System.out.println("month Inserted");
		
		Select year = new Select(driver.findElement(By.id("years")));
		year.selectByValue("1996");
		System.out.println("year Inserted");
		
		WebElement checkbox = driver.findElement(By.id("newsletter"));
		checkbox.click();
		System.out.println("checkbox selected");
		
		//Address Section
		
		WebElement fname1 = driver.findElement(By.id("firstname"));
		fname1.sendKeys("Kavindi");
		System.out.println("Fname Inserted");
		
		WebElement lname1 = driver.findElement(By.id("lastname"));
		lname1.sendKeys("Weerakkodi");
		System.out.println("Lname Inserted");
		
		WebElement company = driver.findElement(By.id("company"));
		company.sendKeys("Max Holdings");
		System.out.println("company Inserted");
		
		WebElement address = driver.findElement(By.id("address1"));
		address.sendKeys("365 Kohuwala, Nugegoda");
		System.out.println("address Inserted");
		
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Nugegoda");
		System.out.println("city Inserted");
		
		Select state = new Select(driver.findElement(By.id("id_state")));
		state.selectByIndex(3);
		System.out.println("state Inserted");
		
		WebElement zip = driver.findElement(By.id("postcode"));
		zip.sendKeys("10104");
		System.out.println("zip Inserted");
		
		//Select country = new Select(driver.findElement(By.id("uniform-id_country")));
		//country.selectByIndex(0);
		//System.out.println("country Inserted");
		
		WebElement info = driver.findElement(By.id("other"));
		info.sendKeys("test info");
		System.out.println("info Inserted");
		
		//WebElement homephone = driver.findElement(By.id("phone"));
		//homephone.sendKeys("0112589635");
		//System.out.println("homephone Inserted");
		
		WebElement mobile = driver.findElement(By.id("phone_mobile"));
		mobile.sendKeys("0714562598");
		System.out.println("mobile Inserted");
		
		WebElement alias = driver.findElement(By.id("alias"));
		alias.sendKeys("52/3 Galle");
		System.out.println("alias Inserted");
		
		WebElement register = driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span"));
		register.click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement signout = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a"));
		signout.click();
		
	}

}
