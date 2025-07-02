public class Upi {
    int account_balance = 10000;

    public synchronized void paymentGateway(String name, int credit_amt){
        System.out.println("===========");
        System.out.println("Account credited by " + name);
        if(credit_amt>0){
            account_balance += credit_amt;
            System.out.println("Amount credited= " + credit_amt);
            System.out.println("Account BAlance=" + account_balance);
        }
        else{
            System.err.println("Can't credit amt<0");
        }

            System.out.println("==========");
    }
}




    

