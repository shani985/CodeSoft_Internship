import java.util.Scanner;

public class ATM{

    public static void main(String[] args) {
        Account ac =  new Account();
        Scanner sc =  new Scanner(System.in);
        while(true){
            System.out.println("Please select an option: " +
                    "\n 1. Withdraw Amount" +
                    "\n 2. Deposit Amount" +
                    "\n 3. Check Balance" +
                    "\n 4. Exit");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter the Withdraw amount: ");
                    int amount = sc.nextInt();
                    ac.withdraw(amount);
                    break;
                case 2:
                    System.out.println("Enter the Deposit amount: ");
                    int amount1 = sc.nextInt();
                    ac.deposit(amount1);
                    break;
                case 3:
                    ac.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using ATM!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

    }
}

class Account extends userBankAccount{
    public  void withdraw(int amount) {
        if (getAccounBalance() > amount){
            withdrawAmount(amount);
            System.out.println(amount + " Rs. is Successfully Withdraw \n");
        }else {
            System.out.println("oops! Insufficient Balance \n");
        }
    }

    public void deposit(int amount) {
        depositAmount(amount);
        System.out.println(amount + " Rs. is successfully Deposit \n");
    }

    public void checkBalance(){
        System.out.println("Your Account Balance is " + getAccounBalance() + " Rs. \n");
    }
}
