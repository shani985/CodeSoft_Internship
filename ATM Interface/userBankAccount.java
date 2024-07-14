public class userBankAccount{
    private  Double accounBalance = 0.0;

    protected  Double getAccounBalance() {
        return accounBalance;
    }

    protected void depositAmount(int amount) {
        this.accounBalance += amount;
    }

    protected void withdrawAmount(int amount) {
        this.accounBalance -= amount;
    }
}
