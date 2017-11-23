package com.roshan092.tddinterview.domain;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class UserDetails {
    private Integer id;
    private String name;
    private String companyName;
}
