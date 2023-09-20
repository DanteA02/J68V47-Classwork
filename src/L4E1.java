import java.util.*;

public class L4E1 {
    public static void main(String[] args) {
        Scanner firstname = new Scanner(System.in);
        System.out.print("What is your first name?");
        String firstName = firstname.nextLine();

        Scanner lastname = new Scanner(System.in);
        System.out.print("What is your last name?");
        String LastName = lastname.nextLine();

        Scanner total_value = new Scanner(System.in);
        System. out.print("What is the total value of your order");
        int total = total_value.nextInt();

        Scanner total_deposit = new Scanner(System.in);
        System. out.print("what amount do you wish to pay for the deposit");
        int deposit = total_deposit.nextInt();

        System.out.println("==RECEIPT==");
        System.out.println("Customer "+firstName.substring(0,1) + LastName);
        System.out.println("Deposit paid £" + (deposit));
        System.out.println("Remainder £" + (total - deposit));

        if (deposit >= 250){
            System.out.println("You get a free toaster");

        }



















    }
}
