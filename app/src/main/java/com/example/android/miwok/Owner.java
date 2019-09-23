package com.example.android.miwok;

public class Owner {
    /** Default translation for the word */
    private String mName;

    /** Miwok translation for the word */
    private String mAddress;
    private String mCity;
    private String mTelephone;
    private String mPets;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    public Owner(String name, String addr, String city, String phn, String pet) {
        mName = name;
        mAddress = addr;
        mCity = city;
        mTelephone = phn;
        mPets = pet;
    }
    public Owner(String name, String addr, String city, String phn, String pet, int ImageId) {
        mName = name;
        mAddress = addr;
        mCity = city;
        mTelephone = phn;
        mPets = pet;
        mImageResourceId = ImageId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getName() {
        return mName;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getAddress() {
        return mAddress;
    }

    public String getCity(){
        return mCity;
    }

    public String getTelephone(){
        return mTelephone;
    }

    public String getPet(){
        return mPets;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
