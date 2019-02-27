package excellgenerate;

import interfaces.ICopyFile;

import java.io.File;
import java.io.IOException;

public class CreateDiagramms implements ICopyFile {

    File source=new File("sources/DiagrammsLTE.xlsx");
    File dest=new File("LTE/Diagramms.xlsx");
    public CreateDiagramms() throws IOException {
        this.copyFileUsingJava7Files(source,dest);
    }
}
