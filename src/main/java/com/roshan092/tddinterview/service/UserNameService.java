package com.roshan092.tddinterview.service;

import com.roshan092.tddinterview.domain.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class UserNameService {

    private final ICompanyService companyService;

    public UserNameService(ICompanyService companyService) {
        this.companyService = companyService;
    }

    public String getFullNameInUpperCase(String firstName, String lastName) {
        return firstName == null || lastName == null ? "" : (firstName + " " + lastName).toUpperCase();
    }

    public UserDetails getUserDetails(Integer id) {
        return UserDetails.builder()
                .id(id)
                .name(getFullNameInUpperCase("Roshan", "Lobo"))
                .companyName(companyService.getName(id))
                .build();
    }
}
