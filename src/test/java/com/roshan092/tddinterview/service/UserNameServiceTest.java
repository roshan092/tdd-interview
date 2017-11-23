package com.roshan092.tddinterview.service;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class UserNameServiceTest {

    private UserNameService userNameService;

    @Before
    public void setUp() {
        userNameService = new UserNameService();
    }

    @Test
    public void shouldReturnFullName() throws Exception {
        String result = userNameService.getFullNameInUpperCase("Roshan", "Lobo");
        assertThat(result).isEqualTo("ROSHAN LOBO");
    }

    @Test
    public void shouldReturnEmptyStringWhenFirstNameIsNull() throws Exception {
        String result = userNameService.getFullNameInUpperCase(null, "Lobo");
        assertThat(result).isEqualTo("");
    }

    @Test
    public void shouldReturnEmptyStringWhenLastNameIsNull() throws Exception {
        String result = userNameService.getFullNameInUpperCase("Roshan", null);
        assertThat(result).isEqualTo("");
    }
}
