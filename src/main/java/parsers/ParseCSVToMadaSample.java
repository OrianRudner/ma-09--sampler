package parsers;
import Models.MadaSample;
import org.apache.commons.csv.CSVRecord;
import java.util.LinkedList;
import java.util.List;

public class ParseCSVToMadaSample implements Parse{
    @Override
    public List parse(List list) {

        List<CSVRecord> records = list;
        List<MadaSample> madaRecords = new LinkedList<>();
        for (int i = 1; i < list.size(); i++) {

            MadaSample temp = new MadaSample(records.get(i).get(0),
                    records.get(i).get(1),
                    Integer.parseInt(records.get(i).get(2)),
                    records.get(i).get(3),
                    records.get(i).get(4),
                    records.get(i).get(5),
                    records.get(i).get(6),
                    Integer.parseInt(records.get(i).get(7)),
                    records.get(i).get(8),
                    records.get(i).get(9),
                    records.get(i).get(10),
                    records.get(i).get(11));
            madaRecords.add(temp);

        }
        return madaRecords;
    }
}
