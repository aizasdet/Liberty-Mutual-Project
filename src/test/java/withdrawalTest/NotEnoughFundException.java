package withdrawalTest;

public class NotEnoughFundException extends RuntimeException  {

    public NotEnoughFundException(Integer amount, Integer balance) {
            super("Attempted to withdraw " + amount + " with a balance of " + balance);
        }
    }

