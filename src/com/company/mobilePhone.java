package com.company;

public class mobilePhone implements Telephone {
    private final String myNumber;
    private boolean isRinging;
    private boolean isPowerOn;


    public mobilePhone(String myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("phone powering On");
    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Now Ringing " + phoneNumber + " on Landline");
    }

    @Override
    public void answer() {
        if (isRinging && isPowerOn) {
            System.out.println("Answer the mobile phone");
            isRinging = false;
        } else {
            System.out.println("phone is not ringing");
        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if (phoneNumber.equals(myNumber) && isPowerOn) {
            isRinging = true;
            System.out.println("Phone is Ringing");
        } else {
            System.out.println("Either phone is not ringing or its off!!!");
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        System.out.println("The phone is Ringing " + isRinging);
        return isRinging;
    }
}