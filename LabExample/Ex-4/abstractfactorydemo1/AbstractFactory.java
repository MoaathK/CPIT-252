package abstractfactorydemo1;

public interface AbstractFactory {
    public Phone createPhone(String type);
    public Tablet createTablet(String type);
}

