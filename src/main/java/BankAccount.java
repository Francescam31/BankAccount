import java.time.LocalDate;

public class BankAccount {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int accountNumber;
    private int balance;

    public  BankAccount(String firstName, String lastName, LocalDate dateOfBirth, int accountNumber, int balance){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }
}
