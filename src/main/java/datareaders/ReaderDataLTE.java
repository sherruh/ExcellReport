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

    public List<String> getValuesPRBNur() {
        return valuesPRBNur;
    }

    public List<String> getValuesPRBMeg() {
        return valuesPRBMeg;
    }

    public List<String> getValuesPRBSky() {
        return valuesPRBSky;
    }

    List<String> valuesCQINur;
    List<String> valuesCQIMeg;
    List<String> valuesCQISky;
    List<String> valuesPRBNur;
    List<String> valuesPRBMeg;
    List<String> valuesPRBSky;

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

    public void readPRBDiagLTE() throws IOException {
        readPRBDiagLTENur();
        readPRBDiagLTEMeg();
        readPRBDiagLTESky();
    }

    private void readPRBDiagLTENur() throws IOException {
        valuesPRBNur=readData("LTE/PRB Diag LTE N.txt",21);
        for (String value:valuesPRBNur){
            System.out.println("PRB "+ value);
        }
    }

    private void readPRBDiagLTEMeg() throws IOException {
        valuesPRBMeg=readData("LTE/PRB Diag LTE M.txt",21);
        for (String value:valuesPRBMeg){
            System.out.println( "PRB "+value);
        }
    }

    private void readPRBDiagLTESky() throws IOException {
        valuesPRBSky=readData("LTE/PRB Diag LTE S.txt",21);
        for (String value:valuesPRBSky){
            System.out.println("PRB "+value);
        }
    }

    private void readCQIDiagLTENur() throws IOException {
        valuesCQINur=readData("LTE/CQI Diag LTE N.txt",16);
        for (String value:valuesCQINur){
            System.out.println("CQI "+value);
        }
    }

    private void readCQIDiagLTEMeg() throws IOException {
        valuesCQIMeg=readData("LTE/CQI Diag LTE M.txt",16);
        for (String value:valuesCQIMeg){
            System.out.println("CQI "+value);
        }
    }

    private void readCQIDiagLTESky() throws IOException {
        valuesCQISky=readData("LTE/CQI Diag LTE S.txt",16);
        for (String value:valuesCQISky){
            System.out.println("CQI "+value);
        }
    }
}
