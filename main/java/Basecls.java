import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Basecls 
{
public static void main(String[] args)
{
	
}
String value=null;a
File f = new File("C:\\Users\\priya_000\\eclipse-workspace\\Data\\Mdata\\priya.xlsx");
FileInputStream Stream=new FileInputStream(f);
Workbook w=new XSSFWorkbook(Stream);
Sheet s=w.getSheet("greens");
Row r=s.getRow(3);
Cell c=r.getCell(4);
int type=c.getCellType();
{
if(type==1)
{
	value=c.getStringCellValue();
}
else if(type==0)
{
	if(DateUtil.isCellDateFormatted(c));
	Data Datacellvalue=c.getDateCellValue();
	SimpleDataFormat Sim=new SimpleDataFormat();
}
	
}

