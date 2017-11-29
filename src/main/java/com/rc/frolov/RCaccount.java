package com.rc.frolov;

/**
 * Created by user on 29.11.2017.
 */
public class RCaccount {
    private String mainNumber;
    private String extPin;
    private String extPswd;

    public RCaccount (String mainNumber, String extPin, String extPswd){
        this.mainNumber = mainNumber;
        this.extPin = extPin;
        this.extPswd = extPswd;
    }

    public String getMainNumber() {
        return mainNumber;
    }

    public String getExtPin() {
        return extPin;
    }

    public String getExtPswd() {
        return extPswd;
    }
}
