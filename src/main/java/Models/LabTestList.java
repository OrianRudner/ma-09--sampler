package Models;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@XmlRootElement(name="labTests")
@XmlAccessorType(XmlAccessType.FIELD)
public class LabTestList{

    @XmlElement(name="test")
    private List<LabTest> labTestList = new ArrayList<>();

    public LabTestList() {

    }

    public List<LabTest> getLabTestList() {
        return labTestList;
    }


    public void setLabTestList(List<LabTest> labTestList) {
        this.labTestList = labTestList;
    }

}
