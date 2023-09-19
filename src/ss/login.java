package ss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.Driver", "D:\\21SUCG11\\testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("D:\\21SUCG11\\project\\index.html");
		driver.manage().window().maximize();
		WebElement input = driver.findElement(By.id("username"));
		input.sendKeys("21sucg11");
		input.sendKeys(Keys.ENTER);
	}

}
