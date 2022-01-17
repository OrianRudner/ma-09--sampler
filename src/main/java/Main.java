import Extract.ExtractDataFromCSV;
import Models.MadaSample;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.csv.CSVRecord;
import parsers.ParseCSVToMadaSample;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ObjectMapper m = new ObjectMapper();

        ExtractDataFromCSV e = new ExtractDataFromCSV("C:\\Users\\orian\\Desktop\\curseProject\\" +
                "sampler\\src\\main\\resources\\MadaReports.csv");

        List<CSVRecord> list = e.extractData();

        ParseCSVToMadaSample p = new ParseCSVToMadaSample();
        List<MadaSample> samples = p.parse(list);

    }
}
