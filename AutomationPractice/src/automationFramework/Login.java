package automationFramework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 
 * @author Kavindi Weerakkodi
 * 
 * This Class tests the Login page
 *
 */
public class Login {
	
	public void login (WebDriver driver)
	{
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(ProjectStarter.getEMAIL());
		
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("kavi1234");
		
		WebElement submit = driver.findElement(By.id("SubmitLogin"));
		submit.click();
				
	}

}
