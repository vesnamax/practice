package domaci;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		DBBanka database = new DBBanka("jdbc:sqlite:" + DBConfig.dbLocalBanka);

		Scanner sc = new Scanner(System.in);

		try {
			database.ispisiSveFil_nMesta();

		} catch (SQLException e) {
		}
	}
}
