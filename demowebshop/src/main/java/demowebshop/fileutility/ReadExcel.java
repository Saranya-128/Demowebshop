package demowebshop.fileutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ReadExcel {
	FileInputStream fis;
	Workbook wb;
	public String fetchProperty(int rownum,int colnum,String sheetname) {
		try {
			fis = new FileInputStream("./src/test/resources/datasheet.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Take control of sheet
		Sheet sheet=wb.getSheet(sheetname);
		//Take control of row
		Row row=sheet.getRow(rownum);
		//Take control of cell
		Cell cell=row.getCell(colnum);
		//Fetch the data
		String data=cell.getStringCellValue();
		return data;
		
	}
	
	 /*  public static void main(String[] args) {
			ReadExcel read=new ReadExcel();
			String data=read.fetchProperty(1, 1, "Sheet1");
			System.out.println(data);
			
		}*/
		
		
		
		
		public Object[][] getMultipleData(String sheetname) {
			try {
				fis = new FileInputStream("./src/test/resources/datasheet.xlsx");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				wb = WorkbookFactory.create(fis);
			} catch (EncryptedDocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//Take control of sheet
			Sheet sheet=wb.getSheet(sheetname);
			int rowcount=sheet.getPhysicalNumberOfRows();
			int cellcount=sheet.getRow(0).getPhysicalNumberOfCells();
			Object[][] data=new Object[rowcount-1][cellcount];
			for(int i=1;i<rowcount;i++)
			{
				for(int j=0;j<cellcount;j++)
				{
					data[i-1][j]=sheet.getRow(i).getCell(j).getStringCellValue();
				}
			}
			return data;
		}
		public static void main(String[] args) {
			ReadExcel read=new ReadExcel();
			Object[][] data=read.getMultipleData("Sheet1");
			for(int i=0;i<data.length;i++)
			{
				for(int j=0;j<2;j++)
				{
				System.out.println(data[i][j]);	
				}
			}
					
		}

	}

	
		
	




