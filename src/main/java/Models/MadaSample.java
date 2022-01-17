package Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class MadaSample {

    @JsonProperty("MDACode") String MDACode;
    @JsonProperty("IDNum") String IDNum;
    @JsonProperty("IDType") int IDType;
    @JsonProperty("firstName") String firstName;
    @JsonProperty("lastName") String lastName;
    @JsonProperty("city") String city;
    @JsonProperty("street") String street;
    @JsonProperty("buildingNumber") int buildingNumber;
    @JsonProperty("barcode") String barcode;
    @JsonProperty("getDate") String getDate;
    @JsonProperty("takeDate") String takeDate;
    @JsonProperty("resultDate") String resultDate;

    public MadaSample(String MDACode, String IDNum, int IDType, String firstName, String lastName, String city, String street,
                      int buildingNumber, String barcode, String  getDate, String takeDate, String resultDate) {
        this.MDACode = MDACode;
        this.IDNum = IDNum;
        this.IDType = IDType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.barcode = barcode;
        this.getDate = getDate;
        this.takeDate = takeDate;
        this.resultDate = resultDate;
    }

    public MadaSample() {

    }
}
