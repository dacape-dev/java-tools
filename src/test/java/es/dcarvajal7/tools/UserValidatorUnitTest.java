package es.dcarvajal7.tools;

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
    public void whenEmail_thenReturnIsValidEmailKO() {
        assertThat(UserValidator.isValidEmail("testtest.com")).isFalse();
    }

    @Test
    public void whenEmail_thenReturnIsValidEmailKO2() {
        assertThat(!UserValidator.isValidEmail("tesççt@test.com")).isFalse();
    }

    @Test
    public void whenEmail_thenReturnIsValidEmailKO3() {
        assertThat(!UserValidator.isValidEmail("tes=t@test.com")).isFalse();
    }

}
