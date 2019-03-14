package datawirter;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.util.List;

public abstract class WriterData {

    protected void writeData(XSSFSheet worksheet, int startRow, int startCell, int endRow, int endCell,List<String> values){
        int i=startRow;
        XSSFRow row;
        Cell cell;
        for(String value:values){
            if(i==endRow){
                startCell=endCell;
            }
            row=worksheet.getRow(i);
            cell=row.getCell(startCell);
            cell.setCellValue(Double.parseDouble(value));
            i+=2;
        }
    }
}
