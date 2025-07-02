public class PaymentThread extends Thread{

    Upi account_balance;
    String userName;
    int credit_amt;

    public PaymentThread(Upi account_balance, String userName, int credit_amt){
        this.account_balance = account_balance;
        this.userName = userName;
        this.credit_amt= credit_amt;
    }

    public void run(){
        account_balance.paymentGateway(userName, credit_amt);
    }
}