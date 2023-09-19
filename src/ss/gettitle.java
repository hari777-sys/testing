package ss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\21SUCG11\\testing\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String actualtitle = driver.getTitle();	
		System.out.println(actualtitle);
		String expected ="Google";
		if(actualtitle.contentEquals(expected)){
			System.out.println("test case passed");
		}
		else {
			System.out.println("fail");
		}
		driver.close();

	}

}
