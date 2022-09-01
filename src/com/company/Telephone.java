package com.company;

public interface Telephone {

    //power on
    //dial a number
    //answer a phone call
    //call another phone
    //is ringing
    //type message

    void powerOn();
    void dial(String phoneNumber);
    void answer();
    boolean callPhone(String phoneNumber);
    boolean isRinging();

}
