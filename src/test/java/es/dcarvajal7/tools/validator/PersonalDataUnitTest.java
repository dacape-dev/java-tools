package es.dcarvajal7.tools.validator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class PersonalDataUnitTest {

    @Test
    void contextLoads() {
    }

    @Test
    public void whenEmail_thenReturnIsValidEmail() {
        assertThat(PersonalData.isValidEmail("test@test.com")).isTrue();
    }

    @Test
    public void whenEmail_thenReturnIsNotValidEmail1() {
        assertThat(PersonalData.isValidEmail("testtest.com")).isFalse();
    }

    @Test
    public void whenEmail_thenReturnIsNotValidEmail2() {
        assertThat(!PersonalData.isValidEmail(".test@test.com")).isFalse();
    }

    @Test
    public void whenEmail_thenReturnIsNotValidEmail3() {
        assertThat(!PersonalData.isValidEmail("test@test..com")).isFalse();
    }

}
