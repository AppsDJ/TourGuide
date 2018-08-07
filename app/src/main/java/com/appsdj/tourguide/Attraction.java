package com.appsdj.tourguide;

public class Attraction {

    private String mAttractionName;
    private String mAttractionDescription;
    private String mAttractionAddress1;
    private String mAttractionAddress2;
    private String mTelephonNO;
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Attraction(String mAttractionName, String mAttractionDescription, String mAttractionAddress1, String mAttractionAddress2, String mTelephonNO) {
        this.mAttractionName = mAttractionName;
        this.mAttractionDescription = mAttractionDescription;
        this.mAttractionAddress1 = mAttractionAddress1;
        this.mAttractionAddress2 = mAttractionAddress2;
        this.mTelephonNO = mTelephonNO;
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

    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }
}
