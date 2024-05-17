package Example2;

public interface DispenseChain {
    void setChain(DispenseChain chain);
    void dispense(Currency cur);
}
