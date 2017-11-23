package com.roshan092.tddinterview.service;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompanyService implements ICompanyService {
    @Override
    public String getName(Integer userId) {
        return "Core Logic";
    }

    public List<String> getRefinedNames(List<String> companyNames) {
        return companyNames.stream()
                .filter(companyName -> !companyName.startsWith("V"))
                .map(companyName -> companyName.toUpperCase())
                .sorted()
                .collect(Collectors.toList());
    }
}
