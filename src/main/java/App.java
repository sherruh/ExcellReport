import datareaders.ReaderDataLTE;
import datawirter.WriterData;
import datawirter.WriterDataLTE;
import enums.Operators;
import excellgenerate.CreateDiagramms;
import excellgenerate.ExcellCreate;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;


public class App {


    public static void main(String[] args) {
        try {
            ExcellCreate.run();

            Operators operators=Operators.ALL;//TODO user set

            String pathDestLTE="LTE/Diagramms.xlsx";
            String pathSourceLTE="sources//LTE/DiagrammsLTE.xlsx";

            CreateDiagramms createDiagramms=new CreateDiagramms(pathDestLTE,pathSourceLTE);
            createDiagramms.createForLTE();

            ReaderDataLTE readerDataLTE=new ReaderDataLTE(operators);
            readerDataLTE.readCQIDiagLTE();
            readerDataLTE.readPRBDiagLTE();

            WriterDataLTE writerDataLTE=new WriterDataLTE(readerDataLTE,pathDestLTE);
            writerDataLTE.writeCQIDiagLTE();
            writerDataLTE.writePRBDiagLTE();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }
    }
}
