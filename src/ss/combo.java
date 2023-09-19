package ss;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class combo {

	public static void main(String[] args) {
		System.setProperty("webdriver.Chrome.Driver", "D:\\21SUCG11\\testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("D:\\21SUCG11\\testing\\boxes\\combo.html");
		
		
		Select col = new Select(driver.findElement(By.id("123")));
		
		col.selectByValue("red");
		col.selectByValue("blue");
		col.selectByValue("green");
		
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		System.out.print("selected value:"+col.getFirstSelectedOption().getText());
		
		System.out.print("the list is");
		
		List<WebElement> options =col.getOptions();
		for(WebElement option:options){
		    System.out.println(option.getText());
		}
		List<WebElement> Seloptions =col.getAllSelectedOptions();
		for(WebElement option:Seloptions){
		    System.out.println("The Selected Options:"+option.getText());
		

	}
	}
}
