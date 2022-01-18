package parsers;

import Models.LabTest;
import Models.LabTestList;
import org.apache.commons.csv.CSVRecord;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ParseCSVToLabTest implements Parse{
    @Override
    public List parse(List list) {

        List<CSVRecord> records = list;
        List<LabTest> labRecords = new LinkedList<>();

        for (int i = 1; i < list.size(); i++) {

            Date birthDate = null;
            Date resultDate = null;
            try {
                resultDate = new SimpleDateFormat("dd/mm/yyyy").parse(records.get(i).get(4));
                birthDate = new SimpleDateFormat("dd/mm/yyyy").parse(records.get(i).get(5));
            } catch (ParseException e) {
                e.printStackTrace();
            }

            LabTest temp = new LabTest(Integer.parseInt(records.get(i).get(0)),
                    Integer.parseInt(records.get(i).get(1)),
                    records.get(i).get(2),
                    records.get(i).get(3),
                    resultDate,
                    birthDate,
                    records.get(i).get(6),
                    records.get(i).get(7),
                    Integer.parseInt(records.get(i).get(8)),
                    records.get(i).get(9),
                    records.get(i).get(10));
            labRecords.add(temp);

        }
        return labRecords;
    }
}
