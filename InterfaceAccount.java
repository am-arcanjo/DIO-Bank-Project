package Bank_Project;

public interface InterfaceAccount {
    void extract(double value);
    void deposit(double value);
    void transfer(double value, Account destinyAccount);
    void printExcerpt();
}
