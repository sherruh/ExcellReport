import datareaders.ReaderDataLTE;
import excellgenerate.CreateDiagramms;
import excellgenerate.ExcellCreate;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;


public class App {
    public static void main(String[] args) {
        try {
            ExcellCreate.run();
            CreateDiagramms createDiagramms=new CreateDiagramms();
            createDiagramms.createForLTE();
            ReaderDataLTE readerDataLTE=new ReaderDataLTE();
            readerDataLTE.readCQIDiagLTE();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }
    }
}
