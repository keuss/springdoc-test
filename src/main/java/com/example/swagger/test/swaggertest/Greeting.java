package com.example.swagger.test.swaggertest;


import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@JsonRootName(value = "hello")
public class Greeting {

    private long id;
    private String content;

}
