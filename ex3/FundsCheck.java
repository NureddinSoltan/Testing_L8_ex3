package ex3;

public class FundsCheck {
    private double cashAccount=1000;

    public double getCashAccount() {
        return cashAccount;
    }
    public void decreaseCacheAccount(double cashWithdrawn){
        cashAccount -= cashWithdrawn;
    }
    public void increaseCacheAccount(double cashDeposit){
        cashAccount +=cashDeposit;
    }
    public boolean haveEnoughMoney(double cacheWithdrawal){
        if (cacheWithdrawal < getCashAccount()){
            decreaseCacheAccount(cacheWithdrawal);
            System.out.println("Your cache is "+ getCashAccount());
            return true;
        }
        else
            System.out.println("Error, go and buy btc :) \n Yor cash now is "+getCashAccount());
        return false;
    }
    public void makeDeposit(double cashToDeposit){
        increaseCacheAccount(cashToDeposit);
        System.out.println("Your Money is :"+ cashAccount +"\n Deposit complete gj");
    }
}
