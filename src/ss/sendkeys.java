package ss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeys {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.Driver", "D:\\21SUCG11\\testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement input = driver.findElement(By.id("APjFqb"));
		input.sendKeys("software");
		input.sendKeys(Keys.ENTER);
		
}
	}
	
