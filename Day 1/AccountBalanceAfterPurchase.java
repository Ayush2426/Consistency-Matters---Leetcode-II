public class AccountBalanceAfterPurchase {
    public int accBalAftPur(int purchaseAmount){
        int rem = purchaseAmount % 10;
        int balance = 10 - rem;
        if(rem < 5){
            purchaseAmount = purchaseAmount - rem;
        }else{
            purchaseAmount = purchaseAmount + balance;
        }
        return 100 - purchaseAmount;
    }
    public static void main(String[] args) {
        AccountBalanceAfterPurchase abap = new AccountBalanceAfterPurchase();
        abap.accBalAftPur(320);
    }
}
