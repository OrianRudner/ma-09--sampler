package Extract;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ExtractDataFromCSV extends ExtractDataFromFile implements ExtractData {

    public ExtractDataFromCSV(String path) {
        super(path);
    }

    @Override
    public List extractData() {

        CSVParser p = null;
        List<CSVRecord> records = null;

        try {
            p = new CSVParser(new FileReader(super.getPath()), CSVFormat.RFC4180);
            records = p.getRecords();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return records;
    }
}
