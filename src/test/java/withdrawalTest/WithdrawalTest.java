package withdrawalTest;

public class WithdrawalTest {

    @Test
    void notEnoughFunds() {
        BankAccount account = new BankAccount(9);
        assertThrows(NotEnoughFundsException.class, () -> account.withdraw(10),
                "Balance must be greater than amount of withdrawal");
    }

    @Test
    void withdrawalSuccesful() {
        final BankAccount account = new BankAccount(19);
        assertThrows(withdrawalSuccesful.class, () -> account.withdraw(15),
                "Withdrawal succesul");

    }
}