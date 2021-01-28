package org.xpdojo.bank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void newAccountWithABalance(){
        Account account = new Account();
        assertThat(account.balance()).isEqualTo(0);
    }

    @Test
    public void depositSomeMoneyIntoAccount(){
        Account account = new Account();
        account.deposit(20);
        assertThat(account.balance()).isEqualTo(20);
    }

    @Test
    public void withdrawMoneyFromAccount(){
        Account account = new Account();
        account.deposit(50);
        account.withdraw(20);
        assertThat(account.balance()).isEqualTo(30);
    }
}
