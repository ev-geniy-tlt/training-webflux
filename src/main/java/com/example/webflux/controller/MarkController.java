package com.example.webflux.controller;

import com.example.webflux.model.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.stream.Collectors;

@RestController
public class MarkController {

    private final WebClient client = WebClient.create("http://localhost:8080");

    @GetMapping("average-mark")
    public Mono<Double> getAverageMark() {
        return client.get()
                .uri("/students")
                .retrieve()
                .bodyToFlux(StudentDto.class)
                .collect(Collectors.averagingInt(StudentDto::getMark));
    }
}
