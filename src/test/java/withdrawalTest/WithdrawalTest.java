package withdrawalTest;

import org.junit.Assert;
import org.junit.Test;

public class WithdrawalTest {

    /** This is a negative scenario where the withdrawal is more than the initial balance **/

    @Test
    void notEnoughFunds() {
        BankAccount amount = new BankAccount(9);
        Assert.assertEquals(NotEnoughFundException.class, () -> amount.withdraw(10),
                "Withdrawal exceeds balance");
    }

    /** This is a happy path scenario where the withdrawal is successful **/
    @Test
    void withdrawalSuccessful() {
        final BankAccount amount = new BankAccount(19);
        Assert.assertEquals(WithdrawalSuccesfulException.class, () -> amount.withdraw(15),
                "Withdrawal successful");

    }
}

