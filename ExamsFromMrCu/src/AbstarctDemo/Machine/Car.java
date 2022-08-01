package AbstarctDemo.Machine;

import AbstarctDemo.Interfaceabble.Runnable;

public class Car extends Machine implements Runnable {
    @Override
    void start() {
        System.out.println( "xe: on on bat dau chay");
    }

    @Override
    public void run() {
        System.out.println( "xe: on on bat dau chay");
    }
}
