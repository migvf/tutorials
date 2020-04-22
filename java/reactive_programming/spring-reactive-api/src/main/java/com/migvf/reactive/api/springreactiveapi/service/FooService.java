package com.migvf.reactive.api.springreactiveapi.service;

import com.migvf.reactive.api.springreactiveapi.dto.FooDto;
import com.migvf.reactive.api.springreactiveapi.event.FooEvent;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.stream.Stream;

/**
 * @author miguel, 20/3/20
 * @project spring-reactive-api
 */

@Service
public class FooService {

    public Flux<FooEvent> streamFoo(){
        Flux<Long> interval = Flux.interval(Duration.ofSeconds(1));
        Flux<FooEvent> events = Flux.fromStream(Stream.generate(() -> new FooEvent(new FooDto(this.generateMessage()), LocalDateTime.now())));
        return Flux.zip(events, interval, (key,value) -> key);
    }

    private String generateMessage(){
        String [] messages = "Hello there! , How its going?, Im glad to talk with you , Im alone :( , Lets go programming! ".split(",");
        return messages[new Random().nextInt(messages.length) ];
    }
}
