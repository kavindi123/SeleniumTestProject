package automationFramework;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * 
 * @author Kavindi Weerakkodi
 *
 */

public class SearchDropDown {
	
	public void dropdown(WebDriver driver) {
		
		WebElement correctsearch = driver.findElement(By.id("search_query_top"));
		correctsearch.sendKeys("print");
		
		WebElement searchbtn = driver.findElement(By.name("submit_search"));
		searchbtn.click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Select dropdown = new Select(driver.findElement(By.id("selectProductSort")));
		dropdown.selectByVisibleText("Price: Highest first");
		
		int i = 0;
		List<WebElement> list = driver.findElements(By.cssSelector("ul[class='product_list grid row']>li"));
		
		for(i=0; i<=list.size(); i++)
		{
			System.out.println("hhhhh");
			WebElement price = (WebElement) driver.findElements(By.className("price product-price"));
			
			
			int maxprice = 0;
			//WebElement price = Integer.parseInt(driver.findElement(By.className("price product-price"))).getText();
			
						
		}
		
		//System.out.println(price);
		
		//List<WebElement> listclid = driver.findElements(By.cssSelector("ul#product_list grid row span.price product-price"));
		//List<WebElement> listclid = driver.findElements(By.cssSelector("ul[@class='product_list grid row']//li[2]/span[[@class='price product-price']"));
		//List<WebElement> listclid = driver.findElements(By.cssSelector("//ul[@id='product_list grid row']//li//span"));
		
		
		
		
		
		//
			//double value = 0;
			
		//}
		
		
		
		
	}

}
