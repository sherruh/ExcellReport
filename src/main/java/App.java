import excellgenerate.CreateDiagramms;
import excellgenerate.ExcellCreate;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;

public class App {
    public static void main(String[] args) {
        try {
            ExcellCreate.run();
            CreateDiagramms createDiagramms=new CreateDiagramms();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }
    }
}
