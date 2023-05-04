package ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter you bank account: ");
//        int bankAccount = scan.nextInt();
//        System.out.print("Enter you Password account: ");
//        int Password = scan.nextInt();

        BankAccountFacade i1 = new BankAccountFacade(987,1234);

        System.out.print("Enter the amount that you want to withdraw: ");
        int withdrawAmount = scan.nextInt();
        i1.withdrawCash(withdrawAmount);

        System.out.print("Enter the amount that you want to Deposit: ");
        int DepositAmount = scan.nextInt();
        i1.depositCash(DepositAmount);
    }
}
