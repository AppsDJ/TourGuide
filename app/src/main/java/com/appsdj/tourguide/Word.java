package com.appsdj.tourguide;

public class Word {

    private String mDefaulTranslation;
    private String mMiwokTranslation;
    private int mImageResourceID = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResourceID;

    public Word(String mDefaulTranslation, String mMiwokTranslation, int mAudioResourceID) {
        this.mDefaulTranslation = mDefaulTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mAudioResourceID = mAudioResourceID;
    }

    public Word(String mDefaulTranslation, String mMiwokTranslation, int mImageResourceID, int mAudioResourceID) {
        this.mDefaulTranslation = mDefaulTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImageResourceID = mImageResourceID;
        this.mAudioResourceID = mAudioResourceID;
    }

    public void setmDefaulTranslation(String mDefaulTranslation) {
        this.mDefaulTranslation = mDefaulTranslation;
    }

    public void setmMiwokTranslation(String mMiwokTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public String getDefaulTranslation() {
        return mDefaulTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceID() {
        return mImageResourceID;
    }

    public int getmAudioResourceID() {
        return mAudioResourceID;
    }

    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }
}
