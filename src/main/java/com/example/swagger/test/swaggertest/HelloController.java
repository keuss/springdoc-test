package com.example.swagger.test.swaggertest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping(value = "greeting", produces = MediaType.APPLICATION_JSON_VALUE)
public class HelloController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    private final ObjectMapper objectMapper = new ObjectMapper().enable(SerializationFeature.WRAP_ROOT_VALUE);

    @Operation(description = "Hello World operation")
    @GetMapping
    public String greeting(@Parameter(description = "parameter value", example = "World") @RequestParam(value = "name", defaultValue = "World") String name) throws JsonProcessingException {
        return objectMapper.writeValueAsString(new Greeting(counter.incrementAndGet(), String.format(template, name)));
    }
}
