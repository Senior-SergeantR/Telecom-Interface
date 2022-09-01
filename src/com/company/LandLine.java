package com.company;

public class LandLine implements Telephone {

    private String myNumber;
    private boolean isRinging;

    public LandLine(String myNumber){
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Landline is always On!");
    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Now Ringing "+ phoneNumber +" on Landline");
    }

    @Override
    public void answer() {
        if (isRinging){
            System.out.println("Answer the landline");
            isRinging = false;
        }else {
            System.out.println("phone is not ringing");
        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if (phoneNumber.equals(myNumber)){
            isRinging = true;
            System.out.println("Phone is Ringing");
        }else{
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
