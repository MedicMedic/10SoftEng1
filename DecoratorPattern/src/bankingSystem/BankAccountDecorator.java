package bankingSystem;

public interface BankAccountDecorator extends BankAccount
{
    //decorator interface
    void setBankAccount(BankAccount bankAccount);
}
