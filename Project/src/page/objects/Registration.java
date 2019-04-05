package page.objects;

import org.openqa.selenium.*;


public class Registration {

	// register polja
	private static final String FIRSTNAME = "//input[@name='firstname']";
	private static final String LASTNAME = "//input[@name='lastname']";
	private static final String REG_USERNAME = "//form[@action='processregister.php']//input[@name='username']";
	private static final String EMAIL = "//input[@name='email']";
	private static final String REG_PASSWORD = "//form[@action='processregister.php']//input[@name='password']";

	private static final String REGISTER = "//input[@value='Register']";

// FIRSTNAME
	public static WebElement getFirstName(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(FIRSTNAME));
		return wb;
	}

	public static void clickFirstName(WebDriver driver) {
		getFirstName(driver).click();
	}

	public static void sendKeysFirstName(WebDriver driver, String str) {
		getFirstName(driver).sendKeys(str);
	}

//LASTNAME
	public static WebElement getLastName(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(LASTNAME));
		return wb;
	}

	public static void clickLastName(WebDriver driver) {
		getLastName(driver).click();
	}

	public static void sendKeysLastName(WebDriver driver, String str) {
		getLastName(driver).sendKeys(str);
	}

//REG_USERNAME
	public static WebElement getReg_UserName(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(REG_USERNAME));
		return wb;
	}

	public static void clickReg_UserName(WebDriver driver) {
		getReg_UserName(driver).click();
	}

	public static void sendKeysReg_UserName(WebDriver driver, String str) {
		getReg_UserName(driver).sendKeys(str);
	}

//EMAIL
	public static WebElement getEMail(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(EMAIL));
		return wb;
	}

	public static void clickEMail(WebDriver driver) {
		getEMail(driver).click();
	}

	public static void sendKeysEMail(WebDriver driver, String str) {
		getEMail(driver).sendKeys(str);
	}

//REG_PASSWORD
	public static WebElement getReg_Password(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(REG_PASSWORD));
		return wb;
	}

	public static void clickReg_Password(WebDriver driver) {
		getReg_Password(driver).click();
	}

	public static void sendKeysReg_Password(WebDriver driver, String str) {
		getReg_Password(driver).sendKeys(str);
	}

//REGISTER button
	public static WebElement getRegister(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(REGISTER));
		return wb;
	}

	public static void clickRegister(WebDriver driver) {
		getRegister(driver).click();
	}

}
