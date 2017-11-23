package com.roshan092.tddinterview.service;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class CompanyServiceTest {
    private CompanyService companyService;

    @Before
    public void setUp() {
        companyService = new CompanyService();
    }

    @Test
    public void getRefinedNames() throws Exception {
        List<String> companyNames = asList("Cordell", "VMS", "Valex", "On The House", "Rpdata");
        List<String> results = companyService.getRefinedNames(companyNames);
        assertThat(results).containsExactlyInAnyOrder("CORDELL", "ON THE HOUSE", "RPDATA");
    }

    @Test
    public void getRefinedSortedNames() throws Exception {
        List<String> companyNames = asList("Rpdata", "VMS", "On The House", "Valex", "Cordell");
        List<String> results = companyService.getRefinedNames(companyNames);
        assertThat(results).containsExactly("CORDELL", "ON THE HOUSE", "RPDATA");
    }

}