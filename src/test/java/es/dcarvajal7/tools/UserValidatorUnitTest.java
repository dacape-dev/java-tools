package es.dcarvajal7.tools;

import es.dcarvajal7.tools.UserValidator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class UserValidatorUnitTest {

    @Test
    void contextLoads() {
    }

    @Test
    public void whenEmail_thenReturnIsValidEmail() {
        assertThat(UserValidator.isValidEmail("test@test.com")).isTrue();
    }

    @Test
    public void whenEmail_thenReturnIsNotValidEmail1() {
        assertThat(UserValidator.isValidEmail("testtest.com")).isFalse();
    }

    @Test
    public void whenEmail_thenReturnIsNotValidEmail2() {
        assertThat(!UserValidator.isValidEmail("tesççt@test.com")).isFalse();
    }

    @Test
    public void whenEmail_thenReturnIsNotValidEmail3() {
        assertThat(!UserValidator.isValidEmail("tes=t@test.com")).isFalse();
    }

}
