package com;

public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    // abstract method. This method will be implemented by the subclasses
    public abstract void displayInfo();
    
    public String getVersionNum() {
    	return this.versionNumber;
    }
    
    public int getBatteryPercentage() {
    	return this.batteryPercentage;
    }
    
    public String getCarrier() {
    	return this.carrier;
    }
    
    public String getRingTone() {
    	return this.ringTone;
    }
    
    public void setVersionNumber(String value) {
    	this.versionNumber = value;
    }
    
    public void setBatteryPercentage(int percentage) {
    	this.batteryPercentage = percentage;
    }
    
    public void setCarrier(String carrierNew) {
    	this.carrier = carrierNew;
    }
    
    public void setRingTone(String ringToneNew) {
    	this.ringTone = ringToneNew;
    }
}
