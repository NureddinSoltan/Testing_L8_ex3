package ex3;

public class BankAccountFacade {
    //Data fields
    private int accountNumber;
    private int securityCode;
    AccountNumberCheck accountNumberCheck;
    SecurityCodeCheck securityCodeCheck;
    FundsCheck fundsCheck;
    WelcomeToBank welcome;

    //Constructor
    public BankAccountFacade(int accountNumber, int securityCode){
        this.accountNumber = accountNumber;
        this.securityCode = securityCode;
        this.accountNumberCheck = new AccountNumberCheck();
        this.securityCodeCheck = new SecurityCodeCheck();
        this.fundsCheck = new FundsCheck();
        this.welcome = new WelcomeToBank();
        welcome.WelcomeToTheBank();
    }

    //Methods
    public int getAccountNumber(){
        return accountNumber;
    }
    public int getSecurityCode(){
        return securityCode;
    }
    public void withdrawCash(double cashToGet){
        if(accountNumberCheck.accountActive(getAccountNumber())&&securityCodeCheck.isCodeCorrect(getSecurityCode())&&
            fundsCheck.haveEnoughMoney(cashToGet)){
            System.out.println("Congrats bro, Transaction Complete.");
        }
        else
            System.out.println("Failed Transaction, I wish you're not a hacker");
    }
    public void depositCash(double castToDeposit){
        if(accountNumberCheck.accountActive(getAccountNumber())&securityCodeCheck.isCodeCorrect(getSecurityCode())){
            fundsCheck.makeDeposit(castToDeposit);
            System.out.println("Process Complete, You'll not take you're money again");
        }
        else
            System.out.println("Process Failed, I wish you're not a hacker");
    }
}
