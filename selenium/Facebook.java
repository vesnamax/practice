package selenium;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/"); //otvara fb
		
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		if(driver.getTitle().equals("Facebook - Log In or Sign Up"))
		{
	System.out.println("correct page title"); 
}else System.out.println("not correct page title");
		
		driver.getTitle().length();
		System.out.println(driver.getTitle().length());
		
		driver.findElement(By.id("email")).sendKeys("vesnamaksimovic07@gmail.com");
		
		driver.quit();

		
		
		
		
		
		
		
		

	}

}
