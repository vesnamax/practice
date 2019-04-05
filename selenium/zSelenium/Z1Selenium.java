package zSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Z1Selenium {

	public static void main(String[] args) {
//		1. Launch a new web browser
//		2. Open http://newtours.demoaut.com/
//		3. Get Page Title name and Title length
//		4. Print Page Title and Title length on the Eclipse Console
//		5. Get Page URL and verify if the it is a correct page opened
//		6. Get Page Source (HTML Source code) and Page Source length
//		7. Print Page Length on Eclipse Console
//		8. Close the browser

// 1. tacka
		WebDriver driver = new ChromeDriver();
		try {
			// System.setProperty("webdriver.chrome.driver", "../../chromedriver");

// 2. tacka
			String url = "http://newtours.demoaut.com/";
			driver.get(url);

// 3.tacka
			String title = driver.getTitle();
			int titlelength = title.length();

// 4. tacka
			System.out.println("Title is: " + title);
			System.out.println("Title length is: " + titlelength);

// 5.tacka
			String actualUrl = driver.getCurrentUrl();

			if (actualUrl.equals(url)) {
				System.out.println("Correct page is opened");
			} else {
				System.out.println("Incorrect page is opened");
				System.out.println("Actual url is: " + actualUrl);
				System.out.println("Expected url is: " + url);
			}

// 6. tacka
			String pageSource = driver.getPageSource();
			int pageSourceLength = pageSource.length();

// 7.tacka
			System.out.println("Page Source length is: " + pageSourceLength);
		} catch (Exception ex) {

		} finally {
// 8.tacka
			driver.quit();
		}
	}

}
