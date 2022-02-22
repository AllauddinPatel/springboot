package com.codekul.Java28SeptSpring.Userbank;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponce <T> {

    private int StatusCode;
    private String message;
    private T result;
}
