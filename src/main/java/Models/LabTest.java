package Models;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@XmlRootElement
public class LabTest {

    private int IDNum;
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
    private LocalDate joinDate = null;
    private int healthCareID = 0;
    private String healthCareName = "";

    public LabTest() {

    }

    public LabTest(int IDNum, int IDType, String firstName, String lastName, Date resultDate, Date birthDate, String labCode,
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

    public int getIDNum() {
        return IDNum;
    }

    public int getIDType() {
        return IDType;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getResultDate() {
        return resultDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getLabCode() {
        return labCode;
    }

    public String getStickerNumber() {
        return stickerNumber;
    }

    public int getResultTestCorona() {
        return resultTestCorona;
    }

    public String getVariant() {
        return variant;
    }

    public String getTestType() {
        return testType;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public int getHealthCareID() {
        return healthCareID;
    }

    public String getHealthCareName() {
        return healthCareName;
    }

    @XmlElement
    public void setIDNum(int IDNum) {
        this.IDNum = IDNum;
    }

    @XmlElement
    public void setIDType(int IDType) {
        this.IDType = IDType;
    }

    @XmlElement
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @XmlElement
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @XmlElement
    public void setResultDate(Date resultDate) {
        this.resultDate = resultDate;
    }

    @XmlElement
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @XmlElement
    public void setLabCode(String labCode) {
        this.labCode = labCode;
    }

    @XmlElement
    public void setStickerNumber(String stickerNumber) {
        this.stickerNumber = stickerNumber;
    }

    @XmlElement
    public void setResultTestCorona(int resultTestCorona) {
        this.resultTestCorona = resultTestCorona;
    }

    @XmlElement
    public void setVariant(String variant) {
        this.variant = variant;
    }

    @XmlElement
    public void setTestType(String testType) {
        this.testType = testType;
    }

    @XmlElement
    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    @XmlElement
    public void setHealthCareID(int healthCareID) {
        this.healthCareID = healthCareID;
    }

    @XmlElement
    public void setHealthCareName(String healthCareName) {
        this.healthCareName = healthCareName;
    }

}

