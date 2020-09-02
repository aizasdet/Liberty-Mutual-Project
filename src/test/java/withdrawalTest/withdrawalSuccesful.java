package withdrawalTest;

public class withdrawalSuccesful extends RuntimeException {
    public withdrawalSuccesful (Integer amount, Integer balance) {
        super("Attempted to withdraw " + amount + " with a balance of " + balance);
    }
}
