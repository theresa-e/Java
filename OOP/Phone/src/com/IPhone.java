package com;

public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return "iPhone " + this.getVersionNum() + " says " + this.getRingTone();
    }
    @Override
    public String unlock() {
        return "Unlocking via facial recognition.";
    }
    @Override
    public void displayInfo() {
        System.out.println("Iphone " + this.getVersionNum() + " " + this.getCarrier());
    }
}
