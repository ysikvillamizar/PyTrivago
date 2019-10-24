package co.com.accenture.certificacion.trivago.utils;
import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LoadDataExcel {
	
	 String[] fields = new String[3];
	    int position=0;

	    public String[] leerExcel(){

	        try {
	            String routeFileExcel = "src/test/resources/DataDriven/CompleteData.xlsx";
	            FileInputStream inputStream = new FileInputStream(new File(routeFileExcel));
	            Workbook workbook = new XSSFWorkbook(inputStream);
	            Sheet firstSheet = workbook.getSheetAt(0);
	            Iterator iterator = firstSheet.iterator();

	            DataFormatter formatter = new DataFormatter();
	            while (iterator.hasNext()) {
	                Row nextRow = (Row) iterator.next();
	                Iterator cellIterator = nextRow.cellIterator();
	                while(cellIterator.hasNext()) {
	                    Cell cell = (Cell) cellIterator.next();
	                    String contentCell = formatter.formatCellValue(cell);
	                    fields[position]=contentCell;
	                    position=position+1;
	                    System.out.println("cell: " + contentCell);

	                }

	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	    return fields;
	    }
}
