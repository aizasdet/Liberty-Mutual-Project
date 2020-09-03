package withdrawalTest;

public class BankAccount {

    private Integer m_balance;

    BankAccount(Integer initialBalance) {
        m_balance = initialBalance;
    }

    public Integer withdraw(Integer amount) {
        if (m_balance < amount) {
            throw new NotEnoughFundException(amount, m_balance);
        }
        m_balance -= amount;
        return m_balance;
    }
}