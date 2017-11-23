package com.roshan092.tddinterview.service;

import com.roshan092.tddinterview.domain.UserDetails;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserNameServiceTest {

    @InjectMocks
    private UserNameService userNameService;
    @Mock
    private ICompanyService companyService;

    @Before
    public void setUp() {
        userNameService = new UserNameService(companyService);
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

    @Test
    public void shouldReturnUserDetailsForId() throws Exception {
        when(companyService.getName(1)).thenReturn("CoreLogic");
        UserDetails userDetails = userNameService.getUserDetails(1);
        assertThat(userDetails).isEqualTo(
                UserDetails.builder()
                        .id(1)
                        .name("ROSHAN LOBO")
                        .companyName("CoreLogic")
                        .build()
        );
        verify(companyService).getName(1);
    }
}
