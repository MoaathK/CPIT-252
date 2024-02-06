package abstractfactorydemo1;

import java.util.Scanner;

public class AbstractFactoryDemo1 {

    public static void main(String[] args){
        AbstractFactory factory;
        Phone phone;
        Tablet tablet;

        String company = "";
        System.out.println("Enter company name");
        try (Scanner input = new Scanner(System.in)){
            company = input.next();
        }
        if (company.equalsIgnoreCase("apple")){
            factory = new AppleProductFactory();
            phone = factory.createPhone("phone");
            phone.prepare();

        }
        else if (company.equalsIgnoreCase("samsung")){
            factory = new SamsungProductFactory();
            phone = factory.createPhone("phone");
            phone.prepare();
            tablet = factory.createTablet("tablet");
            tablet.prepare();

        }
        else
            System.out.println("Not supported");
    }
}
