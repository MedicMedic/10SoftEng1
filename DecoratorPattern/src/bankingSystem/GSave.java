package bankingSystem;

public class GSave implements BankAccountDecorator
{
    private BankAccount bankAccount;

    //initializes BankAccount
    public GSave(BankAccount bankAccount) 
    {
        this.bankAccount = bankAccount;
    }

    //calls BankAccount to display the details
    @Override
    public void setBankAccount(BankAccount bankAccount) 
    {
        this.bankAccount = bankAccount;
    }

    //output crafting    
    @Override
    public String showAccountType() 
    {
        return "GSave";
    }

    @Override
    public double getInterestRate() 
    {
        return 0.025;
    }

    @Override
    public double getBalance() 
    {
        return bankAccount.getBalance();
    }

    @Override
    public String showBenefits() 
    {
        return bankAccount.showBenefits() + ", GCash Transfer";
    }

    @Override
    public double computeBalanceWithInterest() 
    {
        return bankAccount.getBalance() * (1 + getInterestRate());
    }

    @Override
    public String showInfo() 
    {
        return bankAccount.showInfo();
    }
}
