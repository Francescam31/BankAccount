import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {
    BankAccount bankAccount;

    LocalDate today = LocalDate.now();
    LocalDate tomorrow = today.plusDays(1);

    @BeforeEach
    public void setUp() {
        bankAccount = new BankAccount("FirstName", "LastName", today, 00000000);
    }

    //----------------------------------------------
    @Test
    public void canGetFirstName() {
//        Given
//        When
        String result = bankAccount.getFirstName();
//        Then
        String expected = "FirstName";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetFirstName() {
//        When
        bankAccount.setFirstName("newFirstName");
        String result = bankAccount.getFirstName();
//        Then
        String expected = "newFirstName";
        assertThat(result).isEqualTo(expected);
    }
//--------------------------------------------------

    @Test
    public void canGetLastName() {
//        Given
//        When
        String result = bankAccount.getLastName();
//        Then
        String expected = "LastName";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetLastName() {
//        When
        bankAccount.setLastName("newLastName");
        String result = bankAccount.getLastName();
//        Then
        String expected = "newLastName";
        assertThat(result).isEqualTo(expected);
    }
//-------------------------------------------------

    @Test
    public void canGetDateOfBirth() {
//        Given
//        When
        LocalDate result = bankAccount.getDateOfBirth();
//        Then
        LocalDate expected = today;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetDateOfBirth() {
//        When
        bankAccount.setDateOfBirth(tomorrow);
        LocalDate result = bankAccount.getDateOfBirth();
//        Then
        LocalDate expected = tomorrow;
        assertThat(result).isEqualTo(expected);
    }
//--------------------------------------------


    @Test
    public void canGetAccountNumber() {
//        Given
//        When
        int result = bankAccount.getAccountNumber();
//        Then
        int expected = 00000000;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetAccountNumber() {
//        When
        bankAccount.setAccountNumber(11111111);
        int result = bankAccount.getAccountNumber();
//        Then
        int expected = 11111111;
        assertThat(result).isEqualTo(expected);

    }

    //---------------------------------------------------
    @Test
    public void canGetBalance() {
//        Given
//        When
        int result = bankAccount.getBalance();
//        Then
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetBalance() {
//        When
        bankAccount.setBalance(100);
        int result = bankAccount.getBalance();
//        Then
        int expected = 100;
        assertThat(result).isEqualTo(expected);
    }

//-------------------------------------------
    @Test
    public void canDeposit(){

    }

}


