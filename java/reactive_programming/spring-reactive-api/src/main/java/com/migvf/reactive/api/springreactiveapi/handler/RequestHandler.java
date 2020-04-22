package com.migvf.reactive.api.springreactiveapi.handler;

import com.migvf.reactive.api.springreactiveapi.event.FooEvent;
import com.migvf.reactive.api.springreactiveapi.service.FooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * @author migvf
 * @project spring-reactive-api
 */

@Component
public class RequestHandler {

    @Autowired
    private FooService fooService;

    public Mono<ServerResponse> streamFoo(ServerRequest serverRequest){
        return ServerResponse.ok()
                .contentType(MediaType.TEXT_EVENT_STREAM)
                .body(fooService.streamFoo(), FooEvent.class);
    }
}
