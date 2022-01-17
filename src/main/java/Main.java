import Extract.ExtractDataFromCSV;
import Load.LoadToJson;
import Models.LabTest;
import Models.MadaSample;
import org.apache.commons.csv.CSVRecord;
import parsers.ParseCSVToLabTest;
import parsers.ParseCSVToMadaSample;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        ETLManager manager = new ETLManager();
     //   manager.MadaRecordsToJson("C:\\Users\\orian\\Desktop\\curseProject\\sampler\\src\\main\\resources\\MadaReports.csv",
       //         "C:\\Users\\orian\\Desktop\\curseProject\\sampler files\\mada_reports\\mada");


        ExtractDataFromCSV e = new ExtractDataFromCSV("C:\\Users\\orian\\Desktop\\curseProject\\" +
                "sampler\\src\\main\\resources\\LabTests.csv");
        ParseCSVToLabTest p = new ParseCSVToLabTest();
        LoadToJson loadToJson = new LoadToJson("C:\\Users\\orian\\Desktop\\curseProject\\sampler files\\labTests\\lab");

        List<CSVRecord> list = e.extractData();
        List<LabTest> samples = p.parse(list);

    }
}
