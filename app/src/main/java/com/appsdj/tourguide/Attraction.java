package com.appsdj.tourguide;

public class Attraction {

    private String attractionName;
    private String attractionDescription;
    private String attractionAddress1;
    private String attractionAddress2;
    private String telephoneNO;
    private int imageResourceID;

    public Attraction(String attractionName, String attractionDescription, String attractionAddress1, String attractionAddress2, String telephoneNO, int imageResourceID) {
        this.attractionName = attractionName;
        this.attractionDescription = attractionDescription;
        this.attractionAddress1 = attractionAddress1;
        this.attractionAddress2 = attractionAddress2;
        this.telephoneNO = telephoneNO;
        this.imageResourceID = imageResourceID;
    }

    public void setAttractionDescription(String attractionDescription) {
        this.attractionDescription = attractionDescription;
    }

    public void setAttractionName(String attractionName) {
        this.attractionName = attractionName;
    }

    public void setAttractionAddress1(String attractionAddress1) {
        this.attractionAddress1 = attractionAddress1;
    }

    public void setAttractionAddress2(String attractionAddress2) {
        this.attractionAddress2 = attractionAddress2;
    }

    public void setTelephoneNO(String telephoneNO) {
        this.telephoneNO = telephoneNO;
    }

    public String getAttractionName() {
        return attractionName;
    }

    public String getAttractionDescription() {
        return attractionDescription;
    }

    public String getAttractionAddress1() {
        return attractionAddress1;
    }

    public String getAttractionAddress2() {
        return attractionAddress2;
    }

    public String getTelephoneNO() {
        return telephoneNO;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

}
