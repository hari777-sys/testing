package ss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class liktxt {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.Driver", "D:\\21SUCG11\\testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/21SUCG11/project/index.html");
		String actualtitle = driver.getTitle();
		System.out.println(driver.getTitle());
		WebElement wb = driver.findElement(By.linkText("ABOUT"));
		wb.click();
		driver.close();

	}

}
