package org.launchcode.studio7;

public class CD extends BasicDisc implements OpticalDisc{
    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }

    @Override
    public void storeData() {
        System.out.println("A CD can hold 650MB of data.");
    }

    // TODO: Implement your custom interface.

    //

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
