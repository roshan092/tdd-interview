package com.roshan092.tddinterview.service;

import org.springframework.stereotype.Service;

@Service
public class UserNameService {
    public String getFullNameInUpperCase(String firstName, String lastName) {
        return firstName == null || lastName ==null? "":(firstName + " " + lastName).toUpperCase();
    }
}
