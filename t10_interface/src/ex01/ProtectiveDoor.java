package ex01;

public class ProtectiveDoor extends ex01.Door implements Alarm {
    @Override
    public void open() {
        System.out.println("Opened");
    }

    @Override
    public void close() {
        System.out.println("Closed");
    }

    @Override
    public void ring() {
        System.out.println("Noise");
    }
}
