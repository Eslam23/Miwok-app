package com.example.miwokapp;

public class Word {
    private String mDefaultTranslation ;
    private String mMiwokTranslation ;
    private int mImageResourceID =NO_IMAGE_PROVIDER;
    private  int mAudioResourceId;
    private static  final int NO_IMAGE_PROVIDER =-1;

    public Word(String mDefaultTranslation, String mMiwokTranslation,int audio) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mAudioResourceId =audio;
    }

    public Word(String mDefaultTranslation, String mMiwokTranslation, int mImageResourceID,int audio) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImageResourceID = mImageResourceID;
        this.mAudioResourceId=audio;
    }

    public void setmDefaultTranslation(String mDefaultTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
    }

    public void setmMiwokTranslation(String mMiwokTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public void setmImageResourceID(int mImageResourceID) {
        this.mImageResourceID = mImageResourceID;
    }

    public int getmImageResourceID() {
        return mImageResourceID;
    }
    public boolean hasImage(){
        return mImageResourceID!=NO_IMAGE_PROVIDER;
    }
}
