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
    XSSFSheet PRBSheet;
    XSSFSheet ThrputSheet;
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
        PRBSheet = diagrammLTESheets.getSheetAt(1);
        ThrputSheet = diagrammLTESheets.getSheetAt(2);
    }

    public void writeCQIDiagLTE() throws IOException {
        writeData(CQISheet,38,8,66,5,readerData.getValuesCQINur());
        writeData(CQISheet,38,16,66,13,readerData.getValuesCQIMeg());
        writeData(CQISheet,38,24,66,21,readerData.getValuesCQISky());

    }

    public void writePRBDiagLTE() throws IOException {
        writeData(PRBSheet,40,10,78,7,readerData.getValuesPRBNur());
        writeData(PRBSheet,40,19,78,16,readerData.getValuesPRBMeg());
        writeData(PRBSheet,40,28,78,25,readerData.getValuesPRBSky());
    }

    public void writeThrputDiagLTE() throws IOException {
        writeData(ThrputSheet,55,10,105,7,readerData.getValuesThrputNur());

        saveFile();
    }

    private void saveFile() throws IOException {
        diagrammLTE.close();
        diagrammLTEedited=new FileOutputStream(pathDestLTE);
        diagrammLTESheets.write(diagrammLTEedited);
        diagrammLTEedited.close();
    }
}
