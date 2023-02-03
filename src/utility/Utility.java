package utility;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility
{

	static String filePath = "E:\\TestNG\\Facebook@DataProvider.xlsx";
	
	public static Object[][] getTestDataforDataProvider(String sheet) throws EncryptedDocumentException, IOException {

		
			FileInputStream file = new FileInputStream(filePath);
			Sheet sh = WorkbookFactory.create(file).getSheet(sheet);
		
		Object testData [][] = new Object[sh.getLastRowNum()][sh.getRow(0).getLastCellNum()];
		
		for(int row=0;row<sh.getLastRowNum();row++) 
		{
			for(int cell=0;cell<sh.getRow(row).getLastCellNum();cell++) 
			{
				testData [row][cell] = sh.getRow(row+1).getCell(cell).toString();
			}
		}
		
		return testData;
		
	}

}
