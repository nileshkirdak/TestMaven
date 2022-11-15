package MayMavenProject.TestMaven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ExcelReadInSelenium {
	WebDriver driver;
	String path="";
	String actual_path="";	


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ExcelReadInSelenium t=new ExcelReadInSelenium();
		t.test_file_read();
	}
	
	public void test_file_read() throws IOException
	{
		File f=new File("C:\\Users\\admin\\Desktop\\test case templet.xlsx");
		FileInputStream fin=new FileInputStream(f);
		
		@SuppressWarnings("resource")
		XSSFWorkbook workbook=new XSSFWorkbook(fin);
		XSSFSheet sheet=workbook.getSheet("test1");
		
		int n=sheet.getPhysicalNumberOfRows();
		System.out.println(n);
		
	
		System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
		
		for(int i=0;i<n;i++) { 
			String str_name=sheet.getRow(0).getCell(i).getStringCellValue(); 
			String str_value=sheet.getRow(1).getCell(i).getStringCellValue();

			System.out.println(str_name+" : "+str_value); 
		}
		
		
		int x=sheet.getLastRowNum();
		System.out.println(x);
	}


		
	

}
