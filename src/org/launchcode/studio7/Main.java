package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD cd = new CD();

        cd.spinDisc();
        cd.storeData();

        DVD dvd = new DVD();

        dvd.spinDisc();
        dvd.storeData();

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
