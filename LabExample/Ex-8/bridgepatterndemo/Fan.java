package bridgepatterndemo;

public class Fan implements Switch{
    @Override
    public void switchOn() {
        System.out.println("FAN Switched ON");
    }

    @Override
    public void switchOff() {
        System.out.println("FAN Switched OFF");
    }
}
