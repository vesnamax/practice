package zSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Z3Selenium {

	public static void main(String[] args) {
		// izvrsiti navigaciju na sajt www.youtube.com
		// U pretrazi ukucati Rick Astley
		// Kliknuti na prvi video klip

		WebDriver driver = new ChromeDriver();

		String url = "https://www.youtube.com/";
		driver.get(url);

		WebElement searchBar = driver.findElement(By.id("search"));
		searchBar.sendKeys("Rick Astley");

		WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon"));
		searchButton.click();

		driver.findElement(By.id("video-title")).click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		WebElement pausePlayButton = driver.findElement(By.xpath("//button[@title='Pause (k)']"));
		pausePlayButton.click();

		List<WebElement> playSecondRecomended = driver
				.findElements(By.className("ytd-watch-next-secondary-results-renderer"));
		playSecondRecomended.get(2).click();

		driver.quit();

	}

}
