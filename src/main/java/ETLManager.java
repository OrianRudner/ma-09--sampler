import Extract.ExtractDataFromCSV;
import Load.LoadToJson;
import Models.MadaSample;
import org.apache.commons.csv.CSVRecord;
import parsers.ParseCSVToMadaSample;

import java.util.List;

public class ETLManager {

    public void MadaRecordsToJson(String sourcePath, String destPath){

        ExtractDataFromCSV e = new ExtractDataFromCSV(sourcePath);
        ParseCSVToMadaSample p = new ParseCSVToMadaSample();
        LoadToJson loadToJson = new LoadToJson(destPath);

        List<CSVRecord> list = e.extractData();
        List<MadaSample> samples = p.parse(list);
        loadToJson.loadData(samples);
    }

}
