package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new EdgeDriver();
		//WebDriver driver = new FirefoxDriver()
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhina_hif14s4\\eclipse-workspace\\BrowserDrivers\\chromedriver_win32\\chromedriver");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\dhina_hif14s4\\eclipse-workspace\\BrowserDrivers\\edgedriver_win64\\msedgedriver");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dhina_hif14s4\\eclipse-workspace\\BrowserDrivers\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
		*/
		String Email = "DK@gmail.com";
		String Name = "DK";
		int Phoneno = 987654321;
		String TempPassword = "";
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.id("inputUsername")).sendKeys("Dhina");
		driver.findElement(By.name("inputPassword")).sendKeys("Password1");
		driver.findElement(By.className("submit")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys(Name);
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys(Email);
		driver.findElement(By.cssSelector("input[type=\"text\"]:nth-child(4)")).sendKeys(String.valueOf(Phoneno));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form/div/button[2]")).click();
		TempPassword = driver.findElement(By.cssSelector("form p")).getText();
		System.out.println(TempPassword);
		Assert.assertEquals(TempPassword,"Please use temporary password 'rahulshettyacademy' to Login.");
		//Thread.sleep(2000);
		//driver.findElement(By.className("go-to-login-btn")).click();
		driver.findElement(By.xpath("//div/button[contains(@class,\"go-to\")]")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("Dhina");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		Thread.sleep(1000);
		driver.findElement(By.className("submit")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//p")).getText());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()=\'Log Out\']")).click();
		//System.out.println(driver.getPageSource());
		driver.quit();
		

	}

}
