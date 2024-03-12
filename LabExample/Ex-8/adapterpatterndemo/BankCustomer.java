package adapterpatterndemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BankCustomer extends BankDetails implements CreditCard{
    @Override
    public void giveBankDetails() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter the account holder name: ");
            String customerName = br.readLine();
            System.out.print("Enter the account number: ");
            long accNo = Long.parseLong(br.readLine());

            System.out.print("Enter the bank name: ");
            String bankName = br.readLine();
            setAccHolderName(customerName);
            setAccNumber(accNo);
            setBankName(bankName);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public String getCreditCard() {
        long accNo = getAccNumber();
        String accHolderName = getAccHolderName();
        String bName = getBankName();
        return ("The Account number " +accNo+" of "+ accHolderName+" in "+bName+" bank is valid and authenticated for issuing the credit card. ");
    }
}
