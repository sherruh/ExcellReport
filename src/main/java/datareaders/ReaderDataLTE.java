package datareaders;

import enums.Operators;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static enums.Operators.ALL;

public class ReaderDataLTE extends ReaderData {

    Operators operators;

    public List<String> getValuesCQINur() {
        return valuesCQINur;
    }

    public List<String> getValuesCQIMeg() {
        return valuesCQIMeg;
    }

    public List<String> getValuesCQISky() {
        return valuesCQISky;
    }

    List<String> valuesCQINur;
    List<String> valuesCQIMeg;
    List<String> valuesCQISky;

    public ReaderDataLTE(Operators operators){
        this.operators=operators;
    }

    public void readCQIDiagLTE() throws IOException {
        if (operators==ALL){
            readCQIDiagLTENur();
            readCQIDiagLTEMeg();
            readCQIDiagLTESky();
        }
    }

    private void readCQIDiagLTENur() throws IOException {
        valuesCQINur=readData("LTE/CQI Diag LTE N.txt",16);
        for (String value:valuesCQINur){
            System.out.println(value);
        }
    }

    private void readCQIDiagLTEMeg() throws IOException {
        valuesCQIMeg=readData("LTE/CQI Diag LTE M.txt",16);
        for (String value:valuesCQIMeg){
            System.out.println(value);
        }
    }

    private void readCQIDiagLTESky() throws IOException {
        valuesCQISky=readData("LTE/CQI Diag LTE S.txt",16);
        for (String value:valuesCQISky){
            System.out.println(value);
        }
    }
}
