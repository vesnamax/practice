package page.tests;


import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import page.objects.Post;
import utility.Constant;
import utility.ExcelUtils;

public class PostTest {

	static WebDriver driver;
// Metoda koja edituje postove, na osnovu podataka iz excel tabele
	public static void fillForm(WebDriver driver, int i) throws Exception {
		String data;
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET_NAME1);
//make a post button
		Post.clickMakePost(driver);
//post naziv
		Post.clickNaziv(driver);
		data = ExcelUtils.getCellData(i, 1);
		Post.sendKeysNaziv(driver, data);
//post lokacija
		Post.clickLokacija(driver);
		data = ExcelUtils.getCellData(i, 2);
		Post.sendKeysLokacija(driver, data);
//post opis
		Post.clickOpis(driver);
		data = ExcelUtils.getCellData(i, 0);
		Post.sendKeysOpis(driver, data);
//post button - klikom na ovo dugme potvrdjum da je post napravljen	
		Post.clickPost(driver);

	}

// Metoda koja postuje unoseci sve podatke iz excel tabele (red po red)
	public static void testWithAllData(WebDriver driver) throws Exception {
		// pronalazi excel fajl na kompu i njen path
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET_NAME1);

		// prolazi kroz sve redove u tom excel fajlu
		for (int i = 1; i < ExcelUtils.getWorkSheet().getLastRowNum(); i++) {
			// popunjava formu, tj izvrsava sve metode koje se nalaze u metodi fillForm
			fillForm(driver, i);
		}
	}
	
	// Metoda koja edituje post unoseci izabrane podatke iz excel tabele (red po red)
	public static void testWithExcelData(WebDriver driver, int j) throws Exception {
		// pronalazi excel fajl na kompu i njen path
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET_NAME1);

		// prolazi kroz sve redove u tom excel fajlu
		for (int i = 1; i <= j; i++) {
			// popunjava formu, tj izvrsava sve metode koje se nalaze u metodi fillForm
			fillForm(driver, i);
		}
	}
// Metoda koja unosi potrebne podatke za pravljenje posta preko skenera
	public static void scannerPost(WebDriver driver) throws Exception {
		Scanner sc = new Scanner(System.in);

//makepost
		Post.clickMakePost(driver);
//naziv
		Post.clickNaziv(driver);
		System.out.println("Enter naziv: ");
		String Naziv = sc.nextLine();
		Post.sendKeysNaziv(driver, Naziv);
//lokacija
		Post.clickLokacija(driver);
		System.out.println("Enter lokacija: ");
		String Lokacija = sc.nextLine();
		Post.sendKeysLokacija(driver, Lokacija);
//opis
		Post.clickOpis(driver);
		System.out.println("Enter opis: ");
		String Opis = sc.nextLine();
		Post.sendKeysOpis(driver, Opis);
// post button
		Post.clickPost(driver);

	}

// DELETE POST - Metoda koja brise poslednje postove (prve kreirane), int i nam daje info koliko postova zelimo da obrisemo
	public static void deleteLastPosts(WebDriver driver, int i) {
		List<WebElement> allElementsMore = driver.findElements(By.className("fa-ellipsis-v")); // svi web elementi koji
		// imaju more dugme

		for (int j = 0; j < i; j++) {
			allElementsMore.get(allElementsMore.size() - 1).click(); // pronadji poslednje more dugme i klikni
			Post.getDeleteButtonAndClick(driver, allElementsMore.size() - 1);
			allElementsMore = driver.findElements(By.className("fa-ellipsis-v"));

		}

	}



//EDIT POST VIA SCANNER - Metoda koja edituje post, unoseci podatke preko skenera
	public static void editPostViaScanner(WebDriver driver) throws Exception {

		Scanner sc = new Scanner(System.in);

		List<WebElement> allElementsMore = driver.findElements(By.className("fa-ellipsis-v")); // svi web elementi koji
		// imaju more dugme
		allElementsMore.get(0).click();
//dugme za editovanje posta
		Post.getEditButtonAndClick(driver, 0);
//naziv
		Post.clearTextNazivEdit(driver);
		System.out.println("Enter naziv: ");
		String NazivEdit = sc.nextLine();
		Post.sendKeysNazivEdit(driver, NazivEdit);
//lokacija
		Post.clearTextLokacijaEdit(driver);
		System.out.println("Enter lokacija: ");
		String LokacijaEdit = sc.nextLine();
		Post.sendKeysLokacijaEdit(driver, LokacijaEdit);
//opis
		Post.clearTextOpisEdit(driver);
		System.out.println("Enter opis: ");
		String OpisEdit = sc.nextLine();
		Post.sendKeysOpisEdit(driver, OpisEdit);
// post button
		Post.clickPostEdit(driver);

	}
		
		

}
