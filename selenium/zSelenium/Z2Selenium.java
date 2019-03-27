package zSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Z2Selenium {

	public static void main(String[] args) {
//		1. Launch new Browser
//		2. Open http://newtours.demoaut.com/
//		3. Click on Register link using “driver.findElement(By.xpath(“<pronaci id u DOM-u>”)).click();“
//		4. Come back to Home page (Use ‘Back’ command)
//		5. Again go back to Registration page (This time use ‘Forward’ command)
//		6. Again come back to Home page (This time use ‘To’ command)
//		7. Refresh the Browser (Use ‘Refresh’ command)
//		8. Close the Browser

// 1. tacka
		WebDriver driver = new ChromeDriver();
// 2. tacka
		String url = "http://newtours.demoaut.com/";
		driver.get(url);
//3. tacka nije pronadjen id
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
//4. 
		driver.navigate().back();
//5
		driver.navigate().forward();
//6
		driver.navigate().to(url);
//7
		driver.navigate().refresh();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//8
		driver.close();

	}

}
