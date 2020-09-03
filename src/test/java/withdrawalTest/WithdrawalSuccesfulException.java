package withdrawalTest;

public class WithdrawalSuccesfulException extends RuntimeException {
    public WithdrawalSuccesfulException(Integer amount, Integer balance) {
        super("Attempted to withdraw " + amount + " with a balance of " + balance);
    }
}
