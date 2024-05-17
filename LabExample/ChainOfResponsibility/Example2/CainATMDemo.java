package Example2;

import java.util.Scanner;

public class CainATMDemo {
    private DispenseChain c1;
        public CainATMDemo() {
            this.c1 = new Riyal50Dispenser();
            DispenseChain c2 = new Riyal20Dispenser();
            DispenseChain c3 = new Riyal10Dispenser();

            c1.setChain(c2);
            c2.setChain(c3);

        }

    public static void main(String[] args) {
        CainATMDemo atmDispense = new CainATMDemo();
        while (true){
            int amount =0 ;
            System.out.println("Enter amount to dispense: ");
            Scanner sc = new Scanner(System.in);
            amount = sc.nextInt();
            if (amount % 10 != 0){
                System.out.println("Amount should be in multiple of 10s");
                return;
            }
            atmDispense.c1.dispense(new Currency(amount));
        }
    }

}
