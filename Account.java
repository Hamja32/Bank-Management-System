import java.util.Scanner;
class SbiBank{
    private  int account_Number;
    private  String account_HolderName;
    private  double account_Balance;

    public SbiBank(double account_Balance, int account_Number, String account_HolderName){
        this.account_Number = account_Number;
        this.account_HolderName = account_HolderName;
        this.account_Balance = account_Balance;
    }

    public void deposit(double amount){
        this.account_Balance += amount;
        System.out.println("\n Deposited : " + amount);
        System.out.println(" New Balance : " + this.account_Balance);
    }
    public void withdraw(double amount){
        if(this.account_Balance >= amount){
            this.account_Balance -= amount;
            System.out.println("\n withdraw : " + amount);
            System.out.println(" New Balance : " + this.account_Balance);
        }else{
            System.out.println(" Insufficient balance !!! ");
        }
    }

    public void displayDetails(){
        
        System.out.println("\n Account Number :  " + this.account_Number);
        System.out.println(" Holder Name :  " + this.account_HolderName);
        System.out.println(" Current Balance :  " + this.account_Balance);

    }
    public void showCurrentBalance(){
        System.out.println(" Current Balance :  : " + this.account_Balance);  
    }
    public static void printMenu(){
        System.out.println("..........................");
        System.out.println("\tMENU BAR");
	System.out.println("..........................");
        System.out.println(" 1 : Show Account Detail.");
        System.out.println(" 2 : Withdraw your money");
        System.out.println(" 3 : Deposit your money");
        System.out.println(" 4 : Show Current Balance");
        System.out.println(" 0 : Exit");
        System.out.println("============================");
    }

   public static void printMainMenu(){
        System.out.println("..........................");
        System.out.println("\t Welcome to SBI Bank.");
	System.out.println("..........................");
        System.out.println(" 8 : Log in your Bank Account.");
        System.out.println(" 9 : Create a New Bank Account");
        System.out.println("============================");
    }
}




public class Account{

    public static void main(String[] args) {
        System.out.println("\n SBI Bank is Open.");
        SbiBank user1 = new SbiBank(10000.00, 1234, "hamza");
        
        Scanner sc = new Scanner(System.in);
        SbiBank.printMenu();
        
        int choice = 10;
        while(choice != 0){
            System.out.print("\n \n Enter your choice : ");
            choice = sc.nextInt();
            if(choice == 1){
                user1.displayDetails();
                SbiBank.printMenu();
                
            }else if(choice == 2){
                
                System.out.print("\n Withdraw Amount : ");
                int amt = sc.nextInt();
                user1.withdraw(amt);
                SbiBank.printMenu();
            }else if(choice == 3){
                System.out.print("\n Deposit Amount : ");
                int amt = sc.nextInt();
                user1.deposit(amt);
                SbiBank.printMenu();
            }else if(choice == 4){
                user1.showCurrentBalance();
                SbiBank.printMenu();
            }else if(choice == 10){
		SbiBank.printMainMenu();
	    }
        }

              
    }
}