package atm.machine;

import java.util.HashSet;
import java.util.Random;

public class Account {

    private String name;
    private String password;
    private long accountNumber;
    private double accountBalance;
    private String emailAddress;
    private static int NUMBER_OF_USERS = 0;
    private final Random random = new Random();
    private HashSet<Long> accountNumbers = new HashSet<>();

    public static int getNumberOfUsers() {
        return NUMBER_OF_USERS;
    }

    public Account(String name, String password) {
        this.name = name;
        this.password = password;
        this.accountBalance = 0.00;
        this.accountNumber = generateAccountNumber();
        NUMBER_OF_USERS++;
    }

    public Account(String name, String password, double accountBalance) {
        this(name, password);
        this.accountBalance = accountBalance;
    }

    public Account(String name, String password, String email, double accountBalance) {
        this(name, password, accountBalance);
        this.emailAddress = email;
    }

    void withdraw(long amount) {
        // withdraw amount
    }

    void deposit(long amount) {
        // deposit amount

    }

    private long generateAccountNumber() {
        long accountNum = Math.abs(random.nextLong());

        // If the generated number is already taken, generate another
        return (accountNumbers.contains(accountNum)) ? generateAccountNumber() : accountNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isBlank()) {
            this.name = name;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() >= 4) {
            this.password = password;
        }
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    @Override
    public String toString() {
        return "\nFull Name: " + this.name
                + "\nAccount Number: " + this.accountNumber
                + "\nAccount Balance: " + this.accountBalance;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        if (emailAddress.contains("@") && emailAddress.length() > 6) {
            this.emailAddress = emailAddress;
        }
    }

}
