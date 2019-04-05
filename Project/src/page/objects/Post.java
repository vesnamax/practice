package page.objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Post {

	private static final String MAKE_POST = "/html[1]/body[1]/div[2]/div[1]/div[3]/a[1]";
	private static final String NAZIV = "//input[@placeholder='Naziv']";
	private static final String NAZIV_EDIT = "//input[@id='title']";
	private static final String LOKACIJA = "//input[@placeholder='Lokacija']";
	private static final String LOKACIJA_EDIT = "//input[@id='location']";
	private static final String OPIS = "//textarea[@placeholder='Opis']";
	private static final String OPIS_EDIT = "//textarea[@id='description']";
	private static final String POST = "//div[@class='popupPost']//input[@value='Post']";
	private static final String POST_EDIT = "//div[@class='popupEdit']//input[@value='Post']";
	private static final String DELETE_POST = "fa-trash-alt";
	private static final String EDIT_POST = "fa-edit";
	private static final String EDIT_OPIS = "//textarea[@id='description']";

//MAKE A POST
	public static WebElement getMakePost(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(MAKE_POST));
		return wb;
	}

	public static void clickMakePost(WebDriver driver) {
		getMakePost(driver).click();
	}

//NAZIV
	public static WebElement getNaziv(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(NAZIV));
		return wb;
	}

	public static void clickNaziv(WebDriver driver) {
		getNaziv(driver).click();
	}

	public static void sendKeysNaziv(WebDriver driver, String str) {
		getNaziv(driver).sendKeys(str);
	}

//LOKACIJA
	public static WebElement getLokacija(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(LOKACIJA));
		return wb;
	}

	public static void clickLokacija(WebDriver driver) {
		getLokacija(driver).click();
	}

	public static void sendKeysLokacija(WebDriver driver, String str) {
		getLokacija(driver).sendKeys(str);
	}

//OPIS
	public static WebElement getOpis(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(OPIS));
		return wb;
	}

	public static void clickOpis(WebDriver driver) {
		getOpis(driver).click();
	}

	public static void sendKeysOpis(WebDriver driver, String str) {
		getOpis(driver).sendKeys(str);

	}

// POST button
	public static WebElement getPost(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(POST));
		return wb;
	}

	public static void clickPost(WebDriver driver) {
		getPost(driver).click();
	}

// NAZIV_EDIT 
	public static WebElement getNazivEdit(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(NAZIV_EDIT));
		return wb;
	}

	public static void clickNazivEdit(WebDriver driver) {
		getNazivEdit(driver).click();
	}

	public static void sendKeysNazivEdit(WebDriver driver, String str) {
		getNazivEdit(driver).sendKeys(str);
	}

	public static void clearTextNazivEdit(WebDriver driver) {
		getNazivEdit(driver).clear();
	}

// LOKACIJA EDIT
	public static WebElement getLokacijaEdit(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(LOKACIJA_EDIT));
		return wb;
	}

	public static void clickLokacijaEdit(WebDriver driver) {
		getLokacijaEdit(driver).click();
	}

	public static void sendKeysLokacijaEdit(WebDriver driver, String str) {
		getLokacijaEdit(driver).sendKeys(str);
	}

	public static void clearTextLokacijaEdit(WebDriver driver) {
		getLokacijaEdit(driver).clear();
	}

// OPIS EDIT
	public static WebElement getOpisEdit(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(OPIS_EDIT));
		return wb;
	}

	public static void clickOpisEdit(WebDriver driver) {
		getOpisEdit(driver).click();
	}

	public static void sendKeysOpisEdit(WebDriver driver, String str) {
		getOpisEdit(driver).sendKeys(str);

	}

	public static void clearTextOpisEdit(WebDriver driver) {
		getOpisEdit(driver).clear();
	}

// POST EDIT button
	public static WebElement getPostEdit(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(POST_EDIT));
		return wb;
	}

	public static void clickPostEdit(WebDriver driver) {
		getPostEdit(driver).click();
	}

//Metoda koja klikce na delete i brise post
	public static void getDeleteButtonAndClick(WebDriver driver, int i) {

		List<WebElement> wb = driver.findElements(By.className(DELETE_POST));
		wb.get(i).click();
	}
	
	

// Metoda  za postovanje editovanih komentara
	public static void getEditButtonAndClick(WebDriver driver, int i) {
		List<WebElement> wb = driver.findElements(By.className(EDIT_POST));
		wb.get(i).click();
	}

}
