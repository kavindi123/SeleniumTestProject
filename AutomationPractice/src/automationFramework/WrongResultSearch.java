
package automationFramework; 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
  
  
/**
 * 
 * @author Kavindi Weerakkodi
 * 
 * this class tests invalid item codes 
 *
 */
  public class WrongResultSearch {
  
	  public void search(WebDriver driver) {
		  
		  WebElement search = driver.findElement(By.id("search_query_top"));
		  search.sendKeys("a");
  
		  WebElement searchBtn = driver.findElement(By.name("submit_search"));
		  searchBtn.click();
		  
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
  
		  WebElement result = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p"));
		  
		  //result.getText();

  		  String resultTxt = result.getText();
		  Assert.assertTrue(resultTxt.contains("No results were found for your search"));
		  
		  System.out.println("Wrong Search");
  
  }
	  
  
  }
 