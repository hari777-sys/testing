package ss;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class check {

	public static void main(String[] args) {
		System.setProperty("webdriver.Chrome.Driver", "D:\\21SUCG11\\testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("D:\\21SUCG11\\testing\\radio\\check.html");
		WebElement wb1 = driver.findElement(By.id("1"));
		WebElement wb2 = driver.findElement(By.id("2"));
		WebElement wb3 = driver.findElement(By.id("3"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//wb1.click();
		//wb2.click();
		wb3.click();
		
		if(wb1.isSelected() && wb2.isSelected() && wb3.isSelected()) {
			js.executeScript("alert('all are selected')");
		}
		else if(wb1.isSelected() && wb2.isSelected()) {
			js.executeScript("alert('red and green is selected')");
		}
		else if(wb2.isSelected() && wb3.isSelected()) {
			js.executeScript("alert('green and blue is selected')");
		}
		else if(wb3.isSelected() && wb1.isSelected()) {
			js.executeScript("alert('blue and red is selected')");
		}
		else if(wb1.isSelected())
		{
			js.executeScript("alert('red is selected')");	
		}
		else if(wb2.isSelected()) {
			js.executeScript("alert('blue is selected')");
		}
		else if(wb3.isSelected()) {
			js.executeScript("alert('blue is selected')");
		}
		else {
			js.executeScript("alert('nothing selected')");
		}
		
	}

}
