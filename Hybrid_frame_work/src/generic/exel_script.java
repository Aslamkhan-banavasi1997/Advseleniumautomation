package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hwpf.model.FileInformationBlock;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exel_script 
{
public static String getData(String sheet,int row,int cell) throws EncryptedDocumentException, IOException
{
	String val="";
	FileInputStream fis=new FileInputStream("/Hybrid_frame_work/Excel/Database.xlsx");
	Workbook book = WorkbookFactory.create(fis);

	val=book.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	return val;
}
}
