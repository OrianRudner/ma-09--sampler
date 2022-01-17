package Models;

import java.util.Date;

public class LabTest {

    private String IDNum;
    private int IDType;
    private String firstName;
    private String lastName;
    private Date resultDate;
    private Date birthDate;
    private String labCode;
    private String stickerNumber;
    private int resultTestCorona;
    private String variant;
    private String testType;

    public LabTest(String IDNum, int IDType, String firstName, String lastName, Date resultDate, Date birthDate, String labCode,
                   String stickerNumber, int resultTestCorona, String variant, String testType) {
        this.IDNum = IDNum;
        this.IDType = IDType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.resultDate = resultDate;
        this.birthDate = birthDate;
        this.labCode = labCode;
        this.stickerNumber = stickerNumber;
        this.resultTestCorona = resultTestCorona;
        this.variant = variant;
        this.testType = testType;
    }
}
