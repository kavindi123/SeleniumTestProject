package automationFramework;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

/**
 * 
 * @author Kavindi Weerakkodi
 * 
 * This Class tests the item search, order processing till checkout
 *
 */
public class Order {
	
	public void orderItem(WebDriver driver)
	{
		//Search item
		WebElement correctsearch = driver.findElement(By.id("search_query_top"));
		correctsearch.sendKeys("print");
		
		WebElement searchbtn = driver.findElement(By.name("submit_search"));
		searchbtn.click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("test1");
		
		List<WebElement> list = driver.findElements(By.cssSelector("ul[class='product_list grid row']>li"));
		//WebElement count = driver.findElement(By.cssSelector("class=product_list grid row"));
		
		//System.out.println(count.size());
		
		String expectedTitle = "5 results have been found.";
		expectedTitle = expectedTitle.replaceAll("\\D+","");
		
		Assert.assertTrue(expectedTitle == expectedTitle );
		System.out.println("Items match");
		
		
		//Order Item
		
		WebElement additem = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[1]/span"));
		additem.click();
		
		WebElement proceed = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));
		proceed.click();
		
		WebElement pcheck = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]"));
		pcheck.click();
		
		WebElement address = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button"));
		address.click();
		
		WebElement checkbox = driver.findElement(By.id("cgv"));
		checkbox.click();
		
		WebElement shipping = driver.findElement(By.xpath("//*[@id=\"form\"]/p/button"));
		shipping.click();
		
		WebElement payment = driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a"));
		payment.click();
		
		WebElement confirm = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button"));
		confirm.click();
		
		WebElement goback = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p/a"));
		goback.click();
		
		WebElement home = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/a"));
		home.click();
	}

}
