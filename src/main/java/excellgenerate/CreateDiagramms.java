package excellgenerate;

import interfaces.ICopyFile;

import java.io.File;
import java.io.IOException;

public class CreateDiagramms implements ICopyFile {

    File sourceLTE=new File("sources//LTE/DiagrammsLTE.xlsx");
    File destLTE=new File("LTE/Diagramms.xlsx");
    public CreateDiagramms() throws IOException {

    }

    public void createForLTE() throws IOException {
        this.copyFileUsingJava7Files(sourceLTE,destLTE);
    }
}
