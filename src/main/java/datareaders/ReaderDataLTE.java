package datareaders;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReaderDataLTE extends ReaderData {
    FileReader fileReader;

    public void readCQIDiagLTE() throws IOException {
        List<String> valuesCQI=readData("CQI Diag LTE.txt",16);
        for (String value:valuesCQI){
            System.out.println(value);
        }
    }
}
