package parsers;

import Models.MadaSample;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ParseCSVToMadaSample implements Parse{
    @Override
    public List parse(List list) {

        List<CSVRecord> records = list;
        List<MadaSample> madaRecords = new LinkedList<>();
        for (int i = 1; i < list.size(); i++) {

            //Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
            Date getDate = null;
            Date takeDate = null;
            Date resultDate = null;
            try {
                getDate = new SimpleDateFormat("dd.MM.yyyy").parse(records.get(i).get(9));
                takeDate = new SimpleDateFormat("dd.MM.yyyy").parse(records.get(i).get(10));
                resultDate = new SimpleDateFormat("dd/MM/yyyy").parse(records.get(i).get(11));
            } catch (ParseException e) {
                e.printStackTrace();
            }

            MadaSample temp = new MadaSample(records.get(i).get(0),
                    records.get(i).get(1),
                    Integer.parseInt(records.get(i).get(2)),
                    records.get(i).get(3),
                    records.get(i).get(4),
                    records.get(i).get(5),
                    records.get(i).get(6),
                    Integer.parseInt(records.get(i).get(7)),
                    records.get(i).get(8),
                    getDate,
                    takeDate,
                    resultDate);
            madaRecords.add(temp);

            String s = "a";
            //Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
        }
        return madaRecords;
    }
}
