import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadStringValueFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
FileInputStream fis=new FileInputStream("./data/Demo.xlsx");
Workbook wb = WorkbookFactory.create(fis);
int rowCount = wb.getSheet("Sheet2").getLastRowNum();
for(int i=0;i<=rowCount;i++)
{
	int cellCount = wb.getSheet("Sheet2").getRow(i).getLastCellNum();
	
	for(int j=0;j<cellCount;j++)
	{
		CellType c = wb.getSheet("Sheet2").getRow(i).getCell(j).getCellType();
		switch(c)
		{
		case STRING:String data=wb.getSheet("Sheet2").getRow(i).getCell(j).getStringCellValue();
		System.out.print(data+ " ");
		break;
		case NUMERIC: int num=(int)wb.getSheet("Sheet2").getRow(i).getCell(j).getNumericCellValue();
		String s=Integer.toString(num);
		System.out.print(s+ " ");
		break;
		
		
		}
		
	}
	System.out.println();
}
	}

}
