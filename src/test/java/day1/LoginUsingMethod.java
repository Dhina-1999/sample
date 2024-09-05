package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUsingMethod {
	static String TempPassword;
	static String Password;
	static String Code;
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Code = getPassword(driver);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Dhina");
		driver.findElement(By.name("inputPassword")).sendKeys(Code);
		driver.findElement(By.className("submit")).click();
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		//driver.navigate().forward();

	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form/div/button[2]")).click();
		Thread.sleep(1000);
		TempPassword = driver.findElement(By.cssSelector("form p")).getText();
		String Password = TempPassword.split("'")[1];
		System.out.println("Password  "+Password);
		//String Code = Password.split("'")[0];
		//System.out.println("Code  "+Code);
		return Password;
	}

}
