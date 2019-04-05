package z1selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Z5Selenium {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		String url = "http://newtours.demoaut.com/";
		driver.get(url);

		// register
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();

		// first name
		// driver.findElement(By.xpath("//input[@name='firstName']")).click();
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstName']"));
		firstName.sendKeys("Vesna");

		// last name
		// driver.findElement(By.xpath("//input[@name='lastName']")).click();
		WebElement lastName = driver.findElement(By.xpath("//input[@name='lastName']"));
		lastName.sendKeys("Maksimovic");

		WebElement phone = driver.findElement(By.xpath("//input[@name='phone']"));
		phone.sendKeys("0643334441");

		WebElement eMail = driver.findElement(By.xpath("//input[@id='userName']"));
		eMail.sendKeys("vesnamaksimovic07@gmail.com");

		WebElement adress = driver.findElement(By.xpath("//input[@name='address1']"));
		adress.sendKeys("Bulevar Zorana Djindjica");

		WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
		city.sendKeys("Beograd");

		WebElement state = driver.findElement(By.xpath("//input[@name='state']"));
		state.sendKeys("Srbija");

		WebElement postalCode = driver.findElement(By.xpath("//input[@name='postalCode']"));
		postalCode.sendKeys("11000");

		Select country = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		country.selectByVisibleText("SERBIA");

		WebElement userName = driver.findElement(By.xpath("//input[@id='email']"));
		userName.sendKeys("vesnamaksimovic@gmail.com");

		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("aaa11112A");

		WebElement confirmPassword = driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		confirmPassword.sendKeys("aaa11112A");

		WebElement submit = driver.findElement(By.xpath("//input[@name='register']"));
		submit.click();

		//// a[contains(text(),'SIGN-OFF')]
		WebElement signOff = driver.findElement(By.xpath("//a[contains(text(),'SIGN-OFF')]"));
		signOff.click();

		WebElement signInName = driver.findElement(By.xpath("//input[@name='userName']"));
		signInName.sendKeys("vesnamaksimovic@gmail.com");

		WebElement signInPassword = driver.findElement(By.xpath("//input[@name='password']"));
		signInPassword.sendKeys("aaa11112A");

		WebElement submitAgain = driver.findElement(By.xpath("//input[@value='Login']"));
		submitAgain.click();

		if (driver.getCurrentUrl().equals("http://newtours.demoaut.com/mercuryreservation.php")) {
			System.out.println("USPESAN TEST");

		} else
			System.out.println("NEUSPESAN TEST");

		driver.quit();

	}

}
