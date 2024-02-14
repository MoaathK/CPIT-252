package bridgepatterndemo;

public class Bulb implements Switch{
    @Override
    public void switchOn() {
        System.out.println("BULB Switched ON");
    }

    @Override
    public void switchOff() {
        System.out.println("BULB Switched OFF");
    }
}
