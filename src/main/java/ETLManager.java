import Extract.ExtractDataFromCSV;
import Load.LoadToJson;
import Load.LoadToXML;
import Models.LabTest;
import Models.MadaSample;
import org.apache.commons.csv.CSVRecord;
import parsers.ParseCSVToLabTest;
import parsers.ParseCSVToMadaSample;

import java.util.List;

public class ETLManager {

    public void madaRecordsToJson(String sourcePath, String destPath){

        ExtractDataFromCSV e = new ExtractDataFromCSV(sourcePath);
        ParseCSVToMadaSample p = new ParseCSVToMadaSample();
        LoadToJson loadToJson = new LoadToJson(destPath);

        List<CSVRecord> list = e.extractData();
        List<MadaSample> samples = p.parse(list);
        loadToJson.loadData(samples);
    }

    public void labTestsToXML(String sourcePath, String destPath ){
        ExtractDataFromCSV e = new ExtractDataFromCSV(sourcePath);
        ParseCSVToLabTest p = new ParseCSVToLabTest();
        LoadToXML load = new LoadToXML(destPath);

        List<CSVRecord> list = e.extractData();
        List<LabTest> samples = p.parse(list);
        load.loadData(samples);

    }

}
