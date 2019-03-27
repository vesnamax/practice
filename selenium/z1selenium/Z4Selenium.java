package z1selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import z1selenium.Data;

public class Z4Selenium {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		try {
			driver.get(Data.URLYT);
			WebElement searchTab = driver.findElement(By.xpath("//div[@id='search-input']/input[@id='search']"));
			searchTab.sendKeys("Rick Astley");
			Thread.sleep(2000);
			WebElement searchButton = driver.findElement(
					By.xpath("//button[@id='search-icon-legacy']/yt-icon[@class='style-scope ytd-searchbox']"));
			searchButton.click();
			Thread.sleep(3000);
			WebElement playSong = driver.findElement(
					By.xpath("//a[@title='Rick Astley - Never Gonna Give You Up (Official Music Video)']"));
			playSong.click();
			Thread.sleep(3000);
			WebElement pausePlayButton = driver.findElement(By.xpath("//button[@class='ytp-play-button ytp-button']"));
			pausePlayButton.click();
			Thread.sleep(2000);
			pausePlayButton.click();
			Thread.sleep(2000);
			pausePlayButton.click();
			Thread.sleep(2000);
			List<WebElement> playSecondRecomended = driver
					.findElements(By.className("ytd-watch-next-secondary-results-renderer"));
			playSecondRecomended.get(2).click();
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			// driver.close();
		}

	}

}
