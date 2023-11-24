package com.telran.org.lesson3;

public class RadioPhone extends Phone{

    private String radioModule;

    public void changeWave() {

    }

    @Override
    public void receiveCall() { // initialized method receiveCall for RadioPhone
        changeWave();
        if (radioModule != null) {
            System.out.println("This pone is out of service");
        }
    }
}
