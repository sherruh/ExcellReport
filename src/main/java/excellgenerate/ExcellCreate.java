package excellgenerate;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcellCreate {
    public static void run() throws IOException, InvalidFormatException, NullPointerException {
        Workbook workbook = WorkbookFactory.create(new File("Test.xlsx"));
        Sheet sheet = workbook.getSheetAt(0);
        Row row = sheet.getRow(1);
        Cell cell = row.getCell(1);
        if (cell == null)
            cell = row.createCell(2);
        cell.setCellType(Cell.CELL_TYPE_STRING);
        cell.setCellValue("Updated Value");
        FileOutputStream fileOut = new FileOutputStream("TestEdit.xlsx");
        workbook.write(fileOut);
        fileOut.close();
    }
}
