import Extract.ExtractDataFromCSV;
import Models.MadaSample;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.csv.CSVRecord;
import parsers.ParseCSVToMadaSample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ETLManager manager = new ETLManager();
        manager.MadaRecordsToJson("C:\\Users\\orian\\Desktop\\curseProject\\sampler\\src\\main\\resources\\MadaReports.csv",
                "C:\\Users\\orian\\Desktop\\curseProject\\sampler files\\mada_reports\\mada");

    }
}
