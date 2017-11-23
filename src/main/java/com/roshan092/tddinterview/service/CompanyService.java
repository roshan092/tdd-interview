package com.roshan092.tddinterview.service;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CompanyService implements ICompanyService {
    @Override
    public String getName(Integer userId) {
        return "Core Logic";
    }

    public List<String> getRefinedNames(List<String> companyNames) {
        return Collections.emptyList();
    }
}
