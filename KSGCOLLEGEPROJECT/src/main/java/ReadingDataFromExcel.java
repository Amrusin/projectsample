import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("./data/Demo.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		int Rowcount = wb.getSheet("Sheet1").getLastRowNum();
		for(int i=0;i<=Rowcount;i++)
			{
			int cellCount=wb.getSheet("Sheet1").getRow(i).getLastCellNum();
		
			for(int j=0;j<cellCount;j++)
			{
			String data = wb.getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();			
			System.out.print(data +" ");
			}
			
	
		System.out.println();
			}	

	}	

}
