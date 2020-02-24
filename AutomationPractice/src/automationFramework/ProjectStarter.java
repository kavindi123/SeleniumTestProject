package automationFramework;
import org.openqa.selenium.By;
//import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;

/**
 * 
 * @author Kavindi Weerakkodi
 * 
 *  Main class 
 *
 */
public class ProjectStarter {
	private static CharSequence EMAIL = "";
	private static final String BASEURL = "http://automationpractice.com/index.php";
	private static final String CHROME_DRIVER_PATH = "C:\\chromedriver.exe";
	

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
	
		System.setProperty("webdriver.chrome.driver",CHROME_DRIVER_PATH);
		//WebDriver driver = new ChromeDriver();
	
		String baseURL = BASEURL;
		
		String expectedTitle = "My Store";
		String actualTitle = "";
		
		driver.get(baseURL);
		
		//Title
		
		actualTitle =  driver.getTitle();
	
		AssertJUnit.assertEquals(actualTitle, expectedTitle);
		System.out.println("Test Pass");
		
		//Logo                                                                   
		
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"header_logo\"]/a/img"));
		
		AssertJUnit.assertNotNull(logo);
		System.out.println("Logo Appear");
		
				
		//close
		
		Register signin = new Register();
	    //signin.createaccountwithoutemail(driver);
		signin.createaccountwithemail(driver);
		
		Login logins = new Login();
		logins.login(driver);
		
		//WrongResultSearch wrongSearch = new WrongResultSearch();
		//wrongSearch.search(driver);
		
		Order correctsearch = new Order();
		correctsearch.orderItem(driver);
		
		Contactus contact = new Contactus();
		contact.contact(driver);
		
		
		driver.close();
		
		//SearchDropDown searchdropdown = new SearchDropDown();
		//searchdropdown.dropdown(driver);
		
		
				
				

	}



	public static CharSequence getEMAIL() {	
		if(EMAIL.length() == 0) {
			EMAIL = WebUtil.randomEmailGenerator();
		}
		
		return EMAIL;
	}


}
