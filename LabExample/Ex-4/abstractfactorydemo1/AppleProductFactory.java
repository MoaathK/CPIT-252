package abstractfactorydemo1;

public class AppleProductFactory implements AbstractFactory {

    @Override
    public Phone createPhone(String type) {
        return new IPhone();
    }

    @Override
    public Tablet createTablet(String type) {
        return new IPad();
    }
}
