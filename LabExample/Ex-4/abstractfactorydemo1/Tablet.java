package abstractfactorydemo1;

public abstract class Tablet {
    String name;

    void prepare(){
        System.out.println("\nCreating "+name);
    }
}
