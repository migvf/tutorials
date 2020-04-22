package com.migvf.reactive.api.springreactiveapi.configuration;

import com.migvf.reactive.api.springreactiveapi.handler.RequestHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;

/**
 * @author migvf
 * @project spring-reactive-api
 */

@Configuration
public class RequestRouter {

    @Bean
    RouterFunction<?> routes(RequestHandler requestHandler){
        return RouterFunctions.route(RequestPredicates.GET("/foostream"), requestHandler::streamFoo);
    }
}
