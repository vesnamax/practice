package z1selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Z6selenium {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();

		String url = "https://www.phptravels.net/public/expedia/";
		driver.get(url);
		
		Thread.sleep(2000);
		////div[@id='select2-drop']//input[@type='text']
		
		//driver.findElement(By.xpath("//div[@id='select2-drop']//input[@type='text']"));
		
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search by Hotel or City Name']"));
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		search.sendKeys("Paris, France");
		
		WebElement checkIn = driver.findElement(By.xpath("//input[@placeholder='Check in']"));
		checkIn.sendKeys("05/06/2019");
		
		WebElement checkOut = driver.findElement(By.xpath("//input[@placeholder='Check out']"));
		checkOut.sendKeys("05/08/2019");
		
		
		WebElement guest = driver.findElement(By.xpath("//input[@id='totalGuestsInput']"));
		guest.clear();
		guest.sendKeys("2 Adults 0 Child");
		
		WebElement searchButton = driver.findElement(By.xpath("//button[contains(text(),'Search')]"));
		searchButton.click();
		
		WebElement hotelDetails = driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[5]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[3]/a[1]/button[1]"));
		hotelDetails.click();
		
		WebElement book = driver.findElement(By.xpath("//form[1]//div[1]//div[3]//div[2]//span[1]"));
		book.click();
		
		WebElement asAGuest = driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[6]/section[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/button[1]"));
		asAGuest.click();
		
		WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstName.sendKeys("Vesna");
		
		WebElement lastName = driver.findElement(By.xpath("//input[@id='card-holder-lastname']"));
		lastName.sendKeys("Max");
		
		
		WebElement mail = driver.findElement(By.xpath("//input[@id='card-holder-email']"));
		mail.sendKeys("vesnavesna@gmail.com");
		
		WebElement contactNumber = driver.findElement(By.xpath("//input[@id='card-holder-phone']"));
		contactNumber.sendKeys("0643334445");
		
		Select country = new Select(driver.findElement(By.xpath("//select[@id='country']")));
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		country.selectByVisibleText("Serbia");
		
		WebElement state = driver.findElement(By.xpath("//input[@id='card-holder-state']"));
		state.sendKeys("Serbia");
		
		WebElement city = driver.findElement(By.xpath("//input[@placeholder='City']"));
		city.sendKeys("Belgrade");
		
		WebElement postal = driver.findElement(By.xpath("//input[@id='card-holder-postalcode']"));
		postal.sendKeys("11000");
		
		WebElement address = driver.findElement(By.xpath("//textarea[@placeholder='Address']"));
		address.sendKeys("bbbbbbbbbb");
		
		Select card = new Select(driver.findElement(By.xpath("//select[@id='cardtype']")));
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		card.selectByVisibleText("Master Card");
		
		WebElement cardNo = driver.findElement(By.xpath("//input[@id='card-number']"));
		cardNo.sendKeys("5129203314357109");
		
		
		
		Select expirationDate = new Select(driver.findElement(By.xpath("//select[@id='expiry-month']")));
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		expirationDate.selectByVisibleText("Dec (12)");
		
		Select expirationDate1 = new Select(driver.findElement(By.xpath("//select[@id='expiry-year']")));
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		expirationDate1.selectByVisibleText("2020");
		
		WebElement cardCVV = driver.findElement(By.xpath("//input[@id='cvv']"));
		cardCVV.sendKeys("768");
		
		
		WebElement policy = driver.findElement(By.xpath("//input[@id='policy']"));
		policy.click();
		
		
		WebElement confirm = driver.findElement(By.xpath("//button[@name='guest']"));
		confirm.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
