package page.tests;

import java.util.Scanner;


import org.openqa.selenium.WebDriver;
import page.objects.LogIn;
import utility.Constant;
import utility.ExcelUtils;

public class LogInTest {
// Metoda za popunjavanje forme
	public static void fillForm(WebDriver dr, int i) throws Exception {
		String data;
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET_NAME0);

		LogIn.clickLog_UserName(dr);
		data = ExcelUtils.getCellData(i, 2);
		LogIn.sendKeysLog_UserName(dr, data);

		LogIn.clickLog_Password(dr);
		data = ExcelUtils.getCellData(i, 4);
		LogIn.sendKeysLog_Password(dr, data);

		LogIn.clickLogIn(dr);

		LogIn.clickLogOut(dr);

	}

// Metoda za Login jednog korisnika iz excel tabele
	public static void log1User(WebDriver dr, int i) throws Exception {
		String data;
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET_NAME0);

		LogIn.clickLog_UserName(dr);
		data = ExcelUtils.getCellData(i, 2);
		LogIn.sendKeysLog_UserName(dr, data);

		LogIn.clickLog_Password(dr);
		data = ExcelUtils.getCellData(i, 4);
		LogIn.sendKeysLog_Password(dr, data);

		LogIn.clickLogIn(dr);
		// AssertJUnit.assertTrue("User is not logged in",
		// dr.findElement(By.xpath("//input[@placeholder='username']")).isDisplayed());
	}

// Metoda koja izvrsava Login za sve korisnike, unoseci podatke iz excel tabele (red po red)
	public static void testWithAllData(WebDriver dr) throws Exception {
		// pronalazi excel fajl na kompu i njen path
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET_NAME0);

		// prolazi kroz sve redove u tom excel fajlu
		for (int i = 1; i <= ExcelUtils.getWorkSheet().getLastRowNum(); i++) {
			fillForm(dr, i); // popunjava formu, tj izvrsava sve metode koje se nalaze u ovoj metodi
		}
	}

// Metoda koja izvrsava login jednog korisnika
// za kog podatke unosimo preko skenera
	public static void scannerLogIn(WebDriver driver) throws Exception {
		Scanner sc = new Scanner(System.in);

//Log_UserName
		LogIn.clickLog_UserName(driver);
		System.out.println("Enter your username to login: ");
		String Log_UserName = sc.nextLine();
		LogIn.sendKeysLog_UserName(driver, Log_UserName);

//Log_Password		
		LogIn.clickLog_Password(driver);
		System.out.println("Enter your password to login: ");
		String Log_Password = sc.nextLine();
		LogIn.sendKeysLog_Password(driver, Log_Password);

//LogIn button
		LogIn.clickLogIn(driver);

	}
}
