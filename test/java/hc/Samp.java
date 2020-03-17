package hc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Samp

{
	public static void main(String[] args) throws IOException 
	{
		File f = new File("C:\\Users\\priya_000\\eclipse-workspace\\Data\\Mdata\\priya.xlsx");
		FileInputStream Stream=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(Stream);
		Sheet s=w.getSheet("greens");
		Row r=s.getRow(3);
		Cell c=r.getCell(4);
		c.setCellValue("Chitra");
		FileOutputStream O=new FileOutputStream(f);
		w.write(O);
		System.out.println("WRITTEN SUCCESSFULLY");
	}
}
		

 

