package com.company;

public class Main {

    public static void main(String[] args) {

        LandLine officePhone = new LandLine("98562141");
        officePhone.powerOn();
        officePhone.callPhone("98562141");
        officePhone.answer();
        officePhone.dial("52545136");

        System.out.println("\t\t=");
        mobilePhone myPhone = new mobilePhone("3241216516");
        myPhone.powerOn();
        myPhone.callPhone("3241216516");
        myPhone.answer();
        myPhone.dial("82545136");
        myPhone.isRinging();


    }
}
