package badminton;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Batch[] batches = {
           new Batch("7am-8am", 10),
           new Batch("8am-9am", 19),
           new Batch("10am-11am",12)

        };

        System.out.println("Enter name: ");
        String name = sc.nextLine();
        Users user = new Users(name);

        //while (true) {
            for (Batch batch : batches)
                System.out.print(batch);
           // }
                
            System.out.println("\nYour booking: " + (user.bookedBatchIndex == -1 ? "None" : batches[user.bookedBatchIndex].slot));

            System.out.println("\n1. Book a slot");
            System.out.println("2. Cancel booking");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

        switch(choice) {
            case 1:
                if (user.bookedBatchIndex != -1) {
                    System.out.println("You have already booked a slot.");
                } 
                else {
                    System.out.print("Enter slot number: ");
                    int slotChoice = sc.nextInt();
                    if (slotChoice < 0 || slotChoice >= batches.length) {
                        System.out.println("Invalid slot choice.");
                    } 
                    else if (batches[slotChoice].spots > 0) {
                        batches[slotChoice].spots--;
                        user.bookedBatchIndex = slotChoice;
                        System.out.println("Booking confirmed: " + batches[slotChoice].slot);
                    } 
                    else {
                        System.out.println("This batch is full.");
                    }
                }
                break;
            case 2:
                if (user.bookedBatchIndex == -1) {
                    System.out.println("You have no booking to cancel.");
                } 
                else {
                    batches[user.bookedBatchIndex].spots++;
                    System.out.println("Booking cancelled for: " + batches[user.bookedBatchIndex].slot);
                    user.bookedBatchIndex = -1;
                }
                break;
            case 3:
                System.out.println("Thank you.");
                break;
            default:
                System.out.println("Try again.");
                break;
        }
        }

    }


