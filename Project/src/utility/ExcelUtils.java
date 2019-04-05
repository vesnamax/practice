package utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelUtils {

	// Reference na privatna polja koja nam sluze za skladistenje objekata excell-a
	private static HSSFSheet excelWSheet;
	private static HSSFWorkbook excelWBook;
	private static HSSFCell cell;
	private static HSSFRow row;
	// Pomocu ovoga bilo koji podatak pretvaramo u string
	private static DataFormatter formatter;

	// Metoda za postavljanje konkretnog Excel fajla i trazenog worksheeta
	public static void setExcelFile(String Path, String SheetName) throws Exception {
		try {
			// Ucitavamo excel fajl cija je putanja poslata kao Path
			FileInputStream excelFile = new FileInputStream(Path);

			excelWBook = new HSSFWorkbook(excelFile);// Otvaramo fajl kao excel fajl

			excelWSheet = excelWBook.getSheet(SheetName);// Uzimamo worksheet iz datog excell fajla

			formatter = new DataFormatter();// Inicijalizujemo dataformatter objekat
		} catch (Exception e) {
			throw (e);
		}

	}

	// Metoda koja uzima podatak iz excel tabele iz datog reda i kolone
	public static String getCellData(int rowNum, int colNum) throws Exception {
		try {

			cell = excelWSheet.getRow(rowNum).getCell(colNum); // Uzimanje celije dohvatanjem prvo reda pa kolone

			String cellData = formatter.formatCellValue(cell);// Pretvara u string infomarciju iz celije
			// String CellData = Cell.getStringCellValue();
			return cellData;
		} catch (Exception e) {
			return "";
		}

	}

	// Metoda za postavljanje podataka u tabelu u zadatu celiju na osnovu reda i
	// kolone
	public static void setCellData(String result, int rowNum, int colNum) throws Exception {
		try {

			row = excelWSheet.getRow(rowNum);// uzimamo red u koji upisujemo

			cell = row.getCell(colNum, MissingCellPolicy.RETURN_BLANK_AS_NULL); // uzimamo celiju u koju zelimo da
																				// upisemo

			if (cell == null) { // ukoliko je celija prazna ili nepostojeca

				cell = row.createCell(colNum); // kreiramo celiju na zadatom mestu

				cell.setCellValue(result); // postavljamo vrednost u celiji
			} else {

				// ako postooji podatak, svakako postavljamo vrednost tj
				cell.setCellValue(result); // ako je vec postojala vrednost,stara vrednost se gazi
			}

			// Ovaj deo koda upisuje izmene u excell fajl
			FileOutputStream fileOut = new FileOutputStream(Constant.Path_TestData + Constant.File_TestData);
			excelWBook.write(fileOut);

			fileOut.flush(); // prazni podatke unutar fajla

			fileOut.close(); // zatvaramo izlazni tok ka fajlu
		} catch (Exception e) {
			throw (e);

		}

	}

	// Metoda koja vraca referencu na worksheet
	public static HSSFSheet getWorkSheet() {
		return excelWSheet;
	}

}
