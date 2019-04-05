package page.tests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

public class HomePageTest {
	public static void reg_Log_Post (WebDriver driver) throws Exception{
		
		System.out.println(
				"Unesi 1 u konzolu za unos preko skenera, 2 ako zelis unos za sve korisnike iz excel tabele, i bilo sta drugo za unos za konkretnog korisnika iz excel tabele: ");
		Scanner sc = new Scanner(System.in);
		String unos = sc.nextLine();
		if (unos.equals("1")) {
			RegistrationTest.scannerRegistration(driver);
			LogInTest.scannerLogIn(driver);
			for (int i = 0; i < 2; i++) {
				PostTest.scannerPost(driver);// 
			}
		} else if(unos.equals("2")) {
			 RegistrationTest.testWithAllData(driver);
			 LogInTest.testWithAllData(driver);
			 LogInTest.log1User(driver, 1);
			 PostTest.testWithAllData(driver);
		}
		else {
			LogInTest.log1User(driver, 1);// loguje 1 korisnika iz excel tabele
			PostTest.testWithExcelData(driver, 3);// postavlja 3 posta iz excel tabele
		}
		
	}

}
