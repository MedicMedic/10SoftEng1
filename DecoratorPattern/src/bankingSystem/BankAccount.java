package bankingSystem;

public interface BankAccount 
{
    //main interface
    public String showAccountType();
    public double getInterestRate();
    public double getBalance();
    public String showBenefits();
    public double computeBalanceWithInterest();
    public String showInfo();
}
