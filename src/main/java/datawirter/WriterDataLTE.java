package datawirter;

import datareaders.ReaderData;
import datareaders.ReaderDataLTE;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriterDataLTE extends WriterData {

    XSSFSheet CQISheet;
    ReaderDataLTE readerData;
    FileInputStream diagrammLTE;
    FileOutputStream diagrammLTEedited;
    XSSFWorkbook diagrammLTESheets;
    String pathDestLTE;

    public WriterDataLTE(ReaderDataLTE readerData,String pathDestLTE) throws IOException {
        this.readerData=readerData;
        this.pathDestLTE=pathDestLTE;
        diagrammLTE = new FileInputStream(pathDestLTE);

        diagrammLTESheets = new XSSFWorkbook(diagrammLTE);
        CQISheet = diagrammLTESheets.getSheetAt(0);
    }

    public void writeCQIDiagLTE() throws IOException {
        writeData(CQISheet,38,8,66,5,readerData.getValuesCQINur());
        writeData(CQISheet,38,16,66,13,readerData.getValuesCQIMeg());
        writeData(CQISheet,38,32,66,21,readerData.getValuesCQISky());
        diagrammLTE.close();
        diagrammLTEedited=new FileOutputStream(pathDestLTE);
        diagrammLTESheets.write(diagrammLTEedited);
        diagrammLTEedited.close();

    }
}
