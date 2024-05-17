package Example2;

public class Riyal50Dispenser implements DispenseChain{private DispenseChain chain;
    @Override
    public void setChain(DispenseChain chain) {
        this.chain = chain;
    }

    @Override
    public void dispense(Currency cur) {
        if (cur.getAmount() >= 50) {
            int num = cur.getAmount() /50;
            int remainder = cur.getAmount() %50;
            System.out.println("Dispensing " + num + " 50 SAR note");
            if (remainder != 0) {
                this.chain.dispense(new Currency(remainder));
            }
            else
                this.chain.dispense(cur);
        }
    }

}
