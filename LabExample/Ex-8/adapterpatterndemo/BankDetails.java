package adapterpatterndemo;

public class BankDetails {
    private String bankName;
    private String accHolderName;
    private long accNumber;

    public String getBankName() {
        return bankName;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public long getAccNumber() {
        return accNumber;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public void setAccNumber(long accNumber) {
        this.accNumber = accNumber;
    }
}
