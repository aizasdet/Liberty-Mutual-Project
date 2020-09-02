package withdrawalTest;

public class WithdrawalTest {

    //This is a negative scenario where the withdrawal is more than the initial balance
    @Test
    void notEnoughFunds() {
        BankAccount account = new BankAccount(9);
        assertThrows(NotEnoughFundsException.class, () -> account.withdraw(10),
                "Balance must be greater than amount of withdrawal");
    }

    // This is a happy path scenario where the withdrawal is successful
    @Test
    void withdrawalSuccessful() {
        final BankAccount account = new BankAccount(19);
        assertThrows(WithdrawalSuccesful.class, () -> account.withdraw(15),
                "Withdrawal successful");

    }
}