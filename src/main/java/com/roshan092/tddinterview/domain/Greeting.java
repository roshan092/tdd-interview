package com.roshan092.tddinterview.domain;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class Greeting {
    private String name;
    private String message;
}
