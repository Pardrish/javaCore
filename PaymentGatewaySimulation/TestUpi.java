import java.util.*;

public class TestUpi{
    public static void main(String[] args) {
        Upi upi = new Upi();
        Scanner sc = new Scanner(System.in);

        PaymentThread[] paymentThreads = new PaymentThread[3];

        for (int i = 0; i < paymentThreads.length; i++){
            //paymentThreads[i] = new PaymentThread(account_balance);
            System.out.print("Enter name of user: ");
            String name = sc.nextLine();
            System.out.print("Enter the amount to be credited= ");
            int credit_amt = sc.nextInt();
            sc.nextLine();

            paymentThreads[i] = new PaymentThread(upi, name, credit_amt);

        }

        for (PaymentThread pt : paymentThreads) {
            pt.start();
        }








        
    
}}