package abstractfactorydemo1;

public class IPhone extends Phone{

    public IPhone(){
        name = "IPhone";
    }
    public void prepare(){
        System.out.println("Creating "+name);
        System.out.println("Adding Apple Pay features");
    }

}
