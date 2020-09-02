package withdrawalTest;

public class WithdrawalSuccesful extends RuntimeException {
    public WithdrawalSuccesful(Integer amount, Integer balance) {
        super("Attempted to withdraw " + amount + " with a balance of " + balance);
    }
}
