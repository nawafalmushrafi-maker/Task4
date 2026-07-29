
package idea.project.Task4.Task4.Task4.Task4;
import java.util.ArrayList;
import java.util.Scanner;
public class BankTransactionManagementSystemUsingArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> accountNumbers = new ArrayList<>();
        ArrayList<String> customerNames = new ArrayList<>();
        ArrayList<Double> balances = new ArrayList<>();
        ArrayList<String> accountTypes = new ArrayList<>();
        ArrayList<String> accountStatus = new ArrayList<>();
        accountNumbers.add(20001);
        customerNames.add("Mohammed");
        balances.add(3000.0);
        accountTypes.add("Savings");
        accountStatus.add("Active");
        accountNumbers.add(20002);
        customerNames.add("Mariam");
        balances.add(4800.0);
        accountTypes.add("Current");
        accountStatus.add("Active");
        accountNumbers.add(20003);
        customerNames.add("Ahmed");
        balances.add(1500.0);
        accountTypes.add("Savings");
        accountStatus.add("Inactive");
        accountNumbers.add(20004);
        customerNames.add("Noor");
        balances.add(5200.0);
        accountTypes.add("Current");
        accountStatus.add("Active");
        System.out.println("===== BANK ACCOUNTS =====");
        for (int i = 0; i < accountNumbers.size(); i++) {
            System.out.println("Account Index: " + i);
            System.out.println("Account Number: " + accountNumbers.get(i));
            System.out.println("Customer Name: " + customerNames.get(i));
            System.out.println("Account Type: " + accountTypes.get(i));
            System.out.println("Balance: " + balances.get(i));
            System.out.println("Status: " + accountStatus.get(i));
        }
        System.out.println("===== ADD NEW ACCOUNT =====");
        System.out.print("Enter account number: ");
        int newAccountNumber = input.nextInt();
        input.nextLine();
        System.out.print("Enter customer name: ");
        String newCustomerName = input.nextLine();
        System.out.print("Enter initial balance: ");
        double newBalance = input.nextDouble();
        input.nextLine();
        System.out.print("Enter account type Savings or Current: ");
        String newAccountType = input.nextLine();
        System.out.print("Enter account status Active or Inactive: ");
        String newStatus = input.nextLine();
        if (newBalance < 0) {
            System.out.println("Invalid balance.");
        } else if (!newAccountType.equalsIgnoreCase("Savings") && !newAccountType.equalsIgnoreCase("Current")) {
            System.out.println("Invalid account type.");
        } else if (!newStatus.equalsIgnoreCase("Active") && !newStatus.equalsIgnoreCase("Inactive")) {
            System.out.println("Invalid account status.");
        } else {
            accountNumbers.add(newAccountNumber);
            customerNames.add(newCustomerName);
            balances.add(newBalance);
            accountTypes.add(newAccountType);
            accountStatus.add(newStatus);
            System.out.println("Account added successfully.");
        }
        System.out.println("= UPDATED ACCOUNTS ");
        for (int i = 0; i < accountNumbers.size(); i++) {
            System.out.println(accountNumbers.get(i) + " - " + customerNames.get(i) + " - " + accountTypes.get(i) + " - " + balances.get(i) + " - " + accountStatus.get(i));
        }
        System.out.println(" DEPOSIT MONEY ");
        System.out.print("Enter account number: ");
        int depositAccount = input.nextInt();
        System.out.print("Enter deposit amount: ");
        double depositAmount = input.nextDouble();
        int depositIndex = accountNumbers.indexOf(depositAccount);
        if (depositIndex == -1) {
            System.out.println("Account not found.");
        } else if (depositAmount <= 0) {
            System.out.println("Invalid deposit amount.");
        } else {
            balances.set(depositIndex, balances.get(depositIndex) + depositAmount);
            System.out.println("Deposit successful.");
            System.out.println("New balance: " + balances.get(depositIndex));
        }
        System.out.println(" WITHDRAW MONEY ");
        System.out.print("Enter account number: ");
        int withdrawAccount = input.nextInt();
        System.out.print("Enter withdrawal amount: ");
        double withdrawAmount = input.nextDouble();
        int withdrawIndex = accountNumbers.indexOf(withdrawAccount);
        if (withdrawIndex == -1) {
            System.out.println("Account not found.");
        } else if (withdrawAmount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (withdrawAmount > balances.get(withdrawIndex)) {
            System.out.println("Insufficient balance.");
        } else if (accountStatus.get(withdrawIndex).equalsIgnoreCase("Inactive")) {
            System.out.println("The account is inactive.");
        } else {
            balances.set(withdrawIndex, balances.get(withdrawIndex) - withdrawAmount);
            System.out.println("Withdrawal successful.");
            System.out.println("New balance: " + balances.get(withdrawIndex));
        }
        System.out.println(" SEARCH ACCOUNT ");
        System.out.print("Enter account number: ");
        int searchAccount = input.nextInt();
        int searchIndex = accountNumbers.indexOf(searchAccount);
        if (searchIndex != -1) {
            System.out.println("Account found.");
            System.out.println("Customer: " + customerNames.get(searchIndex));
            System.out.println("Type: " + accountTypes.get(searchIndex));
            System.out.println("Balance: " + balances.get(searchIndex));
            System.out.println("Status: " + accountStatus.get(searchIndex));
        } else {
            System.out.println("Account not found.");
        }
        input.close();
    }
}