package Example2;

public class Riyal10Dispenser implements DispenseChain {
    private DispenseChain chain;
    @Override
    public void setChain(DispenseChain chain) {
        this.chain = chain;
    }

    @Override
    public void dispense(Currency cur) {
        if (cur.getAmount() >= 10) {
            int num = cur.getAmount() /10;
            int remainder = cur.getAmount() %10;
            System.out.println("Dispensing " + num + " 10 SAR note");
            if (remainder != 0) {
                this.chain.dispense(new Currency(remainder));
            }
            else{
                this.chain.dispense(cur);
            }
        }
    }
}
