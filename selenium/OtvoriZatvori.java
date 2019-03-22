package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OtvoriZatvori {

//	1. Launch a new web browser
//	2. Open http://newtours.demoaut.com/
//	3. Get Page Title name and Title length
//	4. Print Page Title and Title length on the Eclipse Console
//	5. Get Page URL and verify if the it is a correct page opened
//	6. Get Page Source (HTML Source code) and Page Source length
//	7. Print Page Length on Eclipse Console
//	8. Close the browser

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		String url = "http://newtours.demoaut.com/";
		driver.get(url);
		
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		driver.getTitle().length();
		System.out.println(driver.getTitle().length());
		
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		
		if(driver.getCurrentUrl().equals("http://newtours.demoaut.com/"))
				{
			System.out.println("correct page is oppened"); 
		}else System.out.println("not correct");
				
			
		driver.getPageSource().length();
		System.out.println(driver.getPageSource().length());
		
		driver.quit();
		


	}

}