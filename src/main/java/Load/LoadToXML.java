package Load;
import Models.LabTest;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.*;
import java.util.List;

public class LoadToXML extends LoadDataToFile implements LoadData{

    public LoadToXML(String path) {
        super(path);
    }

    @Override
    public void loadData(List records) {

        try
        {
            //Create JAXB Context
            JAXBContext jaxbContext = JAXBContext.newInstance(LabTest.class);

            //Create Marshaller
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            //Required formatting??
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            //Writes XML file to file-system
            int fileNumber = 0;
            for (int i = 0; i < records.size(); i++) {

                if (i % 50000 == 0){
                    fileNumber++;
                }
                try (FileWriter fstream = new FileWriter(this.getPath() + fileNumber + ".xml" , true);
                     BufferedWriter writer = new BufferedWriter(fstream)) {
                    jaxbMarshaller.marshal(records.get(i),fstream);

                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
        catch (JAXBException e)
        {
            e.printStackTrace();
        }
    }
}
