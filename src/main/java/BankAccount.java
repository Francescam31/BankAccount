import java.time.LocalDate;

public class BankAccount {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int accountNumber;
    private double balance;
    private String accountType;
    private double overdraft;

    public  BankAccount(String firstName, String lastName, LocalDate dateOfBirth, int accountNumber, String accountType, double overdraft){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.accountType = accountType;
        this.overdraft = overdraft;
    }


    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String newLastName){
        this.lastName = newLastName;
    }

    public LocalDate getDateOfBirth(){
        return this.dateOfBirth;
    }

    public void setDateOfBirth(LocalDate newDateOfBirth){
        this.dateOfBirth = newDateOfBirth;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int newAccountNumber){
        this.accountNumber = newAccountNumber;
    }


    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double newBalance){
        this.balance = newBalance;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
    }


    public void withdrawal(double withdrawalAmount) {
        if(this.balance + this.overdraft - withdrawalAmount >= 0){
            this.balance -= withdrawalAmount;
        }
        else{
            this.balance = this.overdraft * -1;
        }
    }


    public void payInterest(double interestRate) {
        if(this.accountType == "Current"){
            interestRate /= 10;
        }
        double percentage = 1 + interestRate/100;
        this.balance *= percentage;
    }

    public void setAccountType(String newAccountType){
        this.accountType = newAccountType;
    }

    public String getAccountType(){
        return this.accountType;
    }


}
