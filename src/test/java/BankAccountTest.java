import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {
    BankAccount bankAccount;

    LocalDate today = LocalDate.now();

    @BeforeEach
    public void setUp(){
        bankAccount = new BankAccount("FirstName", "LastName", today, 01234567, 15);
    }

//    ------------------------------------------
    @Test
    public void canGetFirstName(){
//        Given
//        When
        String result = bankAccount.getFirstName();
//        Then
        String expected = "FirstName";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetFirstName(){
//        When
        bankAccount.setFirstName("newFirstName");
        String result = bankAccount.getFirstName();
//        Then
        String expected = "newFirstName";
        assertThat(result).isEqualTo(expected);
    }
//--------------------------------------------------

    @Test
    public void canGetFirstName(){
//        Given
//        When
        String result = bankAccount.getFirstName();
//        Then
        String expected = "FirstName";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetFirstName(){
//        When
        bankAccount.setFirstName("newFirstName");
        String result = bankAccount.getFirstName();
//        Then
        String expected = "newFirstName";
        assertThat(result).isEqualTo(expected);
    }


}

