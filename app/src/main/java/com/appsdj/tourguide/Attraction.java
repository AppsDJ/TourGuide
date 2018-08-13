package com.appsdj.tourguide;

public class Attraction {

    private String mAttractionName;
    private String mAttractionDescription;
    private String mAttractionAddress1;
    private String mAttractionAddress2;
    private String mTelephonNO;
    private int mImageResourceID;

    public Attraction(String mAttractionName, String mAttractionDescription, String mAttractionAddress1, String mAttractionAddress2, String mTelephonNO, int mImageResourceID) {
        this.mAttractionName = mAttractionName;
        this.mAttractionDescription = mAttractionDescription;
        this.mAttractionAddress1 = mAttractionAddress1;
        this.mAttractionAddress2 = mAttractionAddress2;
        this.mTelephonNO = mTelephonNO;
        this.mImageResourceID = mImageResourceID;
    }

    public void setmAttractionDescription(String mAttractionDescription) {
        this.mAttractionDescription = mAttractionDescription;
    }

    public void setmAttractionName(String mAttractionName) {
        this.mAttractionName = mAttractionName;
    }

    public void setmAttractionAddress1(String mAttractionAddress1) {
        this.mAttractionAddress1 = mAttractionAddress1;
    }

    public void setmAttractionAddress2(String mAttractionAddress2) {
        this.mAttractionAddress2 = mAttractionAddress2;
    }

    public void setmTelephonNO(String mTelephonNO) {
        this.mTelephonNO = mTelephonNO;
    }

    public String getmAttractionName() {
        return mAttractionName;
    }

    public String getmAttractionDescription() {
        return mAttractionDescription;
    }

    public String getmAttractionAddress1() {
        return mAttractionAddress1;
    }

    public String getmAttractionAddress2() {
        return mAttractionAddress2;
    }

    public String getmTelephonNO() {
        return mTelephonNO;
    }

    public int getImageResourceID() {
        return mImageResourceID;
    }

}
