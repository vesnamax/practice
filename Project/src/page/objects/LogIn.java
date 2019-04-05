package page.objects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn {

	protected static final String LOG_USERNAME = "//input[@placeholder='username']";
	private static final String LOG_PASSWORD = "//input[@placeholder='password']";

	private static final String LOGIN = "//input[@value='Log in']";

	private static final String LOGOUT = "//a[contains(text(),'Logout')]";

	// LOG_USERNAME
	public static WebElement getLog_UserName(WebDriver driver) {

		WebElement wb = driver.findElement(By.xpath(LOG_USERNAME));
		return wb;
	}

	public static void clickLog_UserName(WebDriver driver) {
		getLog_UserName(driver).click();
	}

	public static void sendKeysLog_UserName(WebDriver driver, String str) {
		getLog_UserName(driver).sendKeys(str);
	}

	// LOG_PASSWORD
	public static WebElement getLog_Password(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(LOG_PASSWORD));
		return wb;
	}

	public static void clickLog_Password(WebDriver driver) {
		getLog_Password(driver).click();
	}

	public static void sendKeysLog_Password(WebDriver driver, String str) {
		getLog_Password(driver).sendKeys(str);
	}

	// LOGIN button
	public static WebElement getLogIn(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(LOGIN));
		return wb;
	}

	public static void clickLogIn(WebDriver driver) {
		getLogIn(driver).click();
	}

	// LOGOUT button
	public static WebElement getLogOut(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(LOGOUT));
		return wb;
	}

	public static void clickLogOut(WebDriver driver) {
		getLogOut(driver).click();
	}

}
