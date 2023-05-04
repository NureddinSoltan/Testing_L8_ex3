package ex3;

public class AccountNumberCheck {
    private int accountNumber =987;

    public int getAccountNumber(){
        return accountNumber;
    }
    public boolean accountActive(int accountNumToCheck){
        if (accountNumToCheck==getAccountNumber())
            return true;
        else
            return false;
//        return accountNumber == getAccountNumber();
    }

}
