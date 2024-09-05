package day1;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropdownDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int i=1;
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		//staticDropdown  -> use select method if tag is having select type
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		Thread.sleep(1000);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		//Add counts from the List using looping
		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Thread.sleep(1000);
		while(i<5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertEquals((driver.findElement(By.id("divpaxinfo")).getText()), "5 Adult");
		
		//Dynamic dropdown using the Index or Parent child xpath
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("(//a[@value='MAA'])")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
		
		//Auto suggestion drop down
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(1000);
		List<WebElement> Options = driver.findElements(By.xpath("//li[@class=\"ui-menu-item\"]//a"));
		for(WebElement Option : Options) {
			if (Option.getText().equalsIgnoreCase("India")) {
				Option.click();
				break;
			}
		}
		Thread.sleep(1000);
		driver.quit();
	}

}
