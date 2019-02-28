package excellgenerate;

import interfaces.ICopyFile;

import java.io.File;
import java.io.IOException;

public class CreateDiagramms implements ICopyFile {

    File sourceLTE;
    File destLTE;
    public CreateDiagramms(String pathDestLTE,String pathSourceLTE) throws IOException {
        sourceLTE=new File(pathSourceLTE);
        destLTE=new File(pathDestLTE);
    }

    public void createForLTE() throws IOException {
        this.copyFileUsingJava7Files(sourceLTE,destLTE);
    }
}
