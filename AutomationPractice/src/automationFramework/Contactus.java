package automationFramework;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;

/**
 * 
 * @author Kavindi Weerakkodi
 * 
 * This Class tests the Contact us page
 *
 */

public class Contactus {
	
	public void contact (WebDriver driver) throws Exception
	{
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement contact = driver.findElement(By.id("contact-link"));
		contact.click();
		
		Select subject = new Select(driver.findElement(By.id("id_contact")));
		subject.selectByVisibleText("Customer service");
		
		WebElement email = driver.findElement(By.id("email"));
		//if(email.getText().isEmpty())
		//{
			//email.sendKeys(ProjectStarter.getEMAIL());
		//}
		 
		
		WebElement message = driver.findElement(By.id("message"));
		message.sendKeys("Item damaged and color faded");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//System.out.println("Test Pass");
		
	    WebElement uploadattachment = driver.findElement(By.name("fileUpload"));
	    File file = new File("4.png");  //get the file
	    
	    if(file.exists()) 
	    {
	    	uploadattachment.sendKeys(file.getAbsolutePath());
	    }
	    else 
	    {
	    	throw new Exception("File Not Found");	    	
	    }
	    
	    // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    // uploadattachment.click();
	    
	    //System.out.println("Test Pass");
		WebElement send = driver.findElement(By.id("submitMessage"));
		send.click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String expectmessage = "Your message has been successfully sent to our team.";
		
		WebElement actual = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p"));
		String actualmessage = actual.getText();
		
		AssertJUnit.assertEquals(expectmessage, actualmessage);
		System.out.println("Message Matched");
				
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement login = driver.findElement(By.className("login"));
		login.click();
				
	}

}
