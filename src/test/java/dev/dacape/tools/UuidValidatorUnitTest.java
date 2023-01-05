package dev.dacape.tools;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class UuidValidatorUnitTest {

    @Test
    void contextLoads() {
    }

    @Test
    public void whenUuid_thenReturnIsValidUuid() {
        assertThat(UuidValidator.isValidUUID("009692ee-f930-4a74-bbd0-63b8baa5a927")).isTrue();
    }

    @Test
    public void whenUuid_thenReturnIsValidUuidKO1() {
        assertThat(UuidValidator.isValidUUID(null)).isFalse();
    }

    @Test
    public void whenUuid_thenReturnIsValidUuidKO2() {
        assertThat(UuidValidator.isValidUUID("")).isFalse();
    }

    @Test
    public void whenUuid_thenReturnIsValidUuidKO3() {
        assertThat(UuidValidator.isValidUUID("test-ss-ss-ss-s")).isFalse();
    }

    @Test
    public void whenUuid_thenReturnIsValidUuidKO4() {
        assertThat(UuidValidator.isValidUUID("009692ee-f9309-4a74-bbd0-63b8baa5a927")).isFalse();
    }


}
