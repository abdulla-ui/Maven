package excelutil;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelshow {

	
	 public static String getcellValue(String xl,String sheet1,int r,int c)
     {
    	try
    	{
    		FileInputStream fi=new FileInputStream(xl);
    		XSSFWorkbook wb=new XSSFWorkbook(fi);
    		XSSFCell cell=wb.getSheet(sheet1).getRow(r).getCell(c);
    	
    		if(cell.getCellType()==CellType.STRING)
    		{
    			return cell.getStringCellValue();
    		}
    		else
    		{
    			
    			return cell.getRawValue();
    		}
    	}
    	catch(Exception a) {
    		return "";
    	}
}
  

  
  public static int getrowcount(String xl,String sheet1)
     {try
     {
    	 FileInputStream fi=new FileInputStream(xl);
 		XSSFWorkbook wb=new XSSFWorkbook(fi);
 		return wb.getSheet(sheet1).getLastRowNum();
     }
		catch(Exception a)
     {
			return 0;
     }
     }
}
