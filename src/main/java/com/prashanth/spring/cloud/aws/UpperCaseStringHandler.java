package com.prashanth.spring.cloud.aws;

import java.util.function.Function;

import org.springframework.stereotype.Component;

@Component("uppercase")
public class UpperCaseStringHandler implements Function<String, String> {

    @Override
    public String apply(String input) {
        return input.toUpperCase();
    }

}