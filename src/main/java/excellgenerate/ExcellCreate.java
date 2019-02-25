package excellgenerate;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.sql.RowSet;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcellCreate {
    public static void run() throws IOException, InvalidFormatException, NullPointerException {
        FileInputStream myxls = new FileInputStream("Test.xlsx");
        XSSFWorkbook studentsSheet = new XSSFWorkbook(myxls);
        XSSFSheet worksheet = studentsSheet.getSheetAt(0);
        int lastRow=worksheet.getLastRowNum();
        System.out.println(lastRow);
        Row row = worksheet.createRow(++lastRow);
        Cell cell=row.createCell(2);
        cell.setCellValue(456);
        row.createCell(1).setCellValue("Dr.Hola");
        myxls.close();
        FileOutputStream output_file =new FileOutputStream(new File("Test.xlsx"));
                studentsSheet.write(output_file);
        output_file.close();
        System.out.println(" is successfully written");
    }
}
