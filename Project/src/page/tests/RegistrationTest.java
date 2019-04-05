package page.tests;

import java.util.Scanner;

import org.openqa.selenium.*;

import page.objects.Registration;
import utility.Constant;
import utility.ExcelUtils;

public class RegistrationTest {
	public static void fillForm(WebDriver dr, int i) throws Exception {
		String data;
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET_NAME0);
//firstname		
		Registration.clickFirstName(dr);
		data = ExcelUtils.getCellData(i, 0);
		Registration.sendKeysFirstName(dr, data);
//lastname		
		Registration.clickLastName(dr);
		data = ExcelUtils.getCellData(i, 1);
		Registration.sendKeysLastName(dr, data);
// username
		Registration.clickReg_UserName(dr);
		data = ExcelUtils.getCellData(i, 2);
		Registration.sendKeysReg_UserName(dr, data);

//email
		Registration.clickEMail(dr);
		data = ExcelUtils.getCellData(i, 3);
		Registration.sendKeysEMail(dr, data);

//Password
		Registration.clickReg_Password(dr);
		data = ExcelUtils.getCellData(i, 4);
		Registration.sendKeysReg_Password(dr, data);

		Registration.clickRegister(dr);

	}

//Metoda koja izvrsava registraciju za sve korisnike, unoseci podatke iz excel tabele (red po red)
	public static void testWithAllData(WebDriver dr) throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET_NAME0);
		// pronalazi excel fajl na kompu i njen path

		for (int i = 1; i <= ExcelUtils.getWorkSheet().getLastRowNum(); i++) { // prolazi kroz sve redove u tom excel
																				// fajlu
			fillForm(dr, i); // popunjava formu, tj izvrsava sve metode koje se nalaze u ovoj metodi
		}
	}

// Metoda koja izvrsava registraciju jednog korisnika
// za kog podatke unosimo preko skenera
	public static void scannerRegistration(WebDriver driver) throws Exception {
		Scanner sc = new Scanner(System.in);
//first name
		Registration.clickFirstName(driver);
		System.out.println("Enter your first name: ");
		String FirstName = sc.nextLine();
		Registration.sendKeysFirstName(driver, FirstName);
//last name		
		Registration.clickLastName(driver);
		System.out.println("Enter your last name: ");
		String LastName = sc.nextLine();
		Registration.sendKeysLastName(driver, LastName);
//Reg_UserName
		Registration.clickReg_UserName(driver);
		System.out.println("Enter your username: ");
		String Reg_UserName = sc.nextLine();
		Registration.sendKeysReg_UserName(driver, Reg_UserName);
//Email		
		Registration.clickEMail(driver);
		System.out.println("Enter your Email: ");
		String EMail = sc.nextLine();
		Registration.sendKeysEMail(driver, EMail);
//Reg_Password		
		Registration.clickReg_Password(driver);
		System.out.println("Enter your password: ");
		String Reg_Password = sc.nextLine();
		Registration.sendKeysReg_Password(driver, Reg_Password);
//REGISTER button
		Registration.clickRegister(driver);

	}
}
