package com.telran.org.lesson3;

public class PhoneApp {

    public static void main(String[] args) { // obyazatelno sozdaem Main class for realizing the code


        RadioPhone radioPhone = new RadioPhone();
        SatPhone satPhone = new SatPhone();

        Phone[] phones = {radioPhone, satPhone};

        for (Phone phone : phones) {
            phone.call();
            phone.receiveCall();
        }
    }
}
