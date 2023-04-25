package com.company;

import java.util.*;

public class Main {
    void mainMenu() {

        mobilePhone mp = new mobilePhone();
        do {
            Scanner txt = new Scanner(System.in);
            System.out.println("What do you wish to do with the phone: " +
                    "\n 1. Call" +
                    "\n 2. Text" +
                    "\n 3. Play games" +
                    "\n Enter Choice:");
            int enter = txt.nextInt();
            switch (enter) {
                case 1 -> mp.calling();
                case 2 -> {
                    System.out.println("The Messaging App");
                    mp.message();
                }
                case 3 -> System.out.println("Not yet  installed");
                default -> System.out.println("Option not Applicable");
            }

        }while(mp.power());
    }

    public static void main(String[] args) {

        mobilePhone mp = new mobilePhone();

            if (mp.power()) {
                Main menu = new Main();
                menu.mainMenu();

            } else {
                System.out.println("The Mobile Subscriber Cannot be Reached!!!");
            }
        }

    }







