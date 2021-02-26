package atm.machine;

import java.util.ArrayList;
import java.util.Arrays;

public class ATMMachine {

    public static void main(String[] args) {

        ArrayList<Account> accounts = new ArrayList<>(Arrays.asList(
                new Account("Jack Ma", "1234", 0.5),
                new Account("John Doe", "1234", 5.5),
                new Account("Jane Do", "1234", 4.9),
                new Account("Bill Gates", "1234", 6.54),
                new Account("Stephen King", "1234", 8.2)
        ));

        // with lambda synyax and streams
        /*
        accounts.forEach((account) -> {
            System.out.printf("Full Name: %s\nAccount Number: %d\nAccount Balance: %.3f\n\n",
                    account.getName(), account.getAccountNumber(), account.getAccountBalance());
        });
         */
        for (Account account : accounts) {
            System.out.printf("Full Name: %s\nAccount Number: %d\nAccount Balance: %.3f\n\n",
                    account.getName(), account.getAccountNumber(), account.getAccountBalance());
        }

        System.out.println("Number of Users: " + Account.getNumberOfUsers());
    }

}
