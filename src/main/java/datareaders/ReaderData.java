package datareaders;

import org.omg.CORBA.portable.InputStream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public abstract class ReaderData {
    private List<String> values;
    private List<String> correctValues;

    public List<String> readData(String fileName,int countOfValues) throws IOException {
        values=new ArrayList();
        correctValues=new ArrayList();
        BufferedReader file=new BufferedReader(new FileReader("sources/"+fileName));
        for (int i=1;i<=countOfValues*2;i++){
            values.add(file.readLine());
        }
        for(String value:values){
            char[] temp;
            System.out.println("Value " + value);
            temp=value.toCharArray();
            if (temp.length==0|| value.contains("Distance/m")){continue;}
            correctValues.add(value.substring(value.indexOf(".")-2).replace("\t","").replace("%",""));
        }
        file.close();
        return correctValues;
    }
}
