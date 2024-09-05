package day1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class CheckBoxTraining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver =  new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.findElement(By.xpath("//div[@class=\"right-align\"]//label[@for=\"bmw\"]//input[@id=\"checkBoxOption1\"]")).click();
	Assert.assertTrue(driver.findElement(By.xpath("//div[@class=\"right-align\"]//label[@for=\"bmw\"]//input[@id=\"checkBoxOption1\"]")).isSelected());
	driver.findElement(By.xpath("//div[@class=\"right-align\"]//label[@for=\"bmw\"]//input[@id=\"checkBoxOption1\"]")).click();
	Assert.assertFalse(driver.findElement(By.xpath("//div[@class=\"right-align\"]//label[@for=\"bmw\"]//input[@id=\"checkBoxOption1\"]")).isSelected());
	driver.findElement(By.xpath("//input[@value=\"radio1\"]")).click();
	System.out.println("Count of the checkbox is: "+driver.findElements(By.xpath("//input[@type=\"checkbox\"]")).size());
	
	}
}
