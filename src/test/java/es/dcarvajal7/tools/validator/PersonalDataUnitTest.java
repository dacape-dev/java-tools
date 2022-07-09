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
        assertThat(PersonalData.isValidEmail("test@test.com"));
    }

    @Test
    public void whenEmail_thenReturnIsNotValidEmail1() {
        assertThat(!PersonalData.isValidEmail("testtest.com"));
    }

    @Test
    public void whenEmail_thenReturnIsNotValidEmail2() {
        assertThat(!PersonalData.isValidEmail(".test@test.com"));
    }

    @Test
    public void whenEmail_thenReturnIsNotValidEmail3() {
        assertThat(!PersonalData.isValidEmail("test@test..com"));
    }

}
