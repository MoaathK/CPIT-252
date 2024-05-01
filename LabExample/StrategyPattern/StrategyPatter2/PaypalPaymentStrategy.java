package StrategyPatter2;

public class PaypalPaymentStrategy implements PaymentStrategy{
    private String emailId;
    private String password;
    public PaypalPaymentStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount+" Paid using Paypal");

    }
}
