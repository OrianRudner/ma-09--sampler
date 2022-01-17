package Load;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class LoadToJson extends LoadDataToFile implements LoadData{

    public LoadToJson(String path) {
        super(path);
    }

    @Override
    public void loadData(List records) {

        ObjectMapper objectMapper = new ObjectMapper();

        int fileNumber = 1;
        String temp = "";
        for (int i = 1; i < records.size(); i++) {

            if (i % 50000 == 0){
                fileNumber++;
            }
            try (FileWriter fstream = new FileWriter(this.getPath() + fileNumber + ".json" , true);
                 BufferedWriter writer = new BufferedWriter(fstream)) {
                writer.write(objectMapper.writeValueAsString(records.get(i)) + "\n");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
