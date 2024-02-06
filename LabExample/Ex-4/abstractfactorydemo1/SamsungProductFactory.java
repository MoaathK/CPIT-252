package abstractfactorydemo1;

public class SamsungProductFactory implements AbstractFactory{

    @Override
    public Phone createPhone(String type) {
        return new SamsungPhone();
    }

    @Override
    public Tablet createTablet(String type) {
        return new SamsungTablet();
    }
}
