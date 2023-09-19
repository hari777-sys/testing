package ss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class findelements {

		public static void main(String[] args) {
			// Launch web browser
			System.setProperty("webdriver.chrome.driver","D:\\21SUCG11\\testing\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();  
			
			driver.get("D:\\21SUCG11\\testing\\login.html");
			
			//		 to maximize the window
			 driver.manage().window().maximize();  
					 		 
			 
				// To collect how many input tags in html file		  	    		     
			      System.out.println("\nInput tag Details");
			      System.out.println("__________________\n");
			      
			      List<WebElement> allInputElements = driver.findElements(By.tagName("input"));
			    System.out.println("No of Elements in input Tag --"+allInputElements.size()+"\n");
			  
			    
			    // Get the attributes of the input tag
			     for(WebElement i : allInputElements) 
				   {
					   System.out.println("The Attribute of Input Tag --"+i.getAttribute("placeholder"));
					//  System.out.println("The Attribute of Radio Tag --"+inputElement.getAttribute("name"));
				   }
			     
			     
			  // To collect how many radio buttons in html file	
			     System.out.println("\nRadio Button Attribute");
			     System.out.println("______________________\n");
			     		     
			     List<WebElement> elements = driver.findElements(By.name("gender"));
			        System.out.println("No. of Elements in Radio Button--"+elements.size());

			     // Get the value of the radio button
			        for(int i=0; i<elements.size(); i++){
			            System.out.println("Radio button text--" + elements.get(i).getAttribute("value"));
			     	}
			        		        
			    
			        // To collect how many anchor tag in html file	   
			        List<WebElement> allanchorElements = driver.findElements(By.tagName("a"));
			       		     System.out.println("\nAnchor tag Attribute");
			     System.out.println("_____________________\n");
			     System.out.println("No. of Elements in Anchor tag--"+allanchorElements.size() + "\n");
			    
			     
			     
			  // Get the Attribute of the anchor tag
			     for(WebElement i1 : allanchorElements) 
				   {
					 //  System.out.println(inputElement.getAttribute("placeholder"));
					   System.out.println("The Attribute of Anchor Tag --"+i1.getAttribute("name"));
				   }
			     
			     // To collect how many label button in html file	
			     List<WebElement> alllabelElements = driver.findElements(By.tagName("label"));
			     System.out.println("\nLabel tag ");
			     System.out.println("_______________\n");
			     System.out.println("Elements found by TagName  as Label--"+alllabelElements.size());
			   }
		}

