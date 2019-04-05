package start;

import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.HomePage;
import page.tests.HomePageTest;
import page.tests.PostTest;


import java.util.Scanner;

import org.openqa.selenium.*;

public class GlavnaKlasa {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		try {
			HomePage.openPage(driver);
			HomePage.maximizeWindow(driver);

			Scanner sc = new Scanner(System.in);
			
			//register, login, post
			HomePageTest.reg_Log_Post(driver);
			
			// edituje jedan post, unosenjem podataka preko skenera
			PostTest.editPostViaScanner(driver);
			// brise poslednja 2 posta ( 2 posta prva postavljena)
			PostTest.deleteLastPosts(driver, 2);

			sc.close();

			System.out.println("FINISH !!!");

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
