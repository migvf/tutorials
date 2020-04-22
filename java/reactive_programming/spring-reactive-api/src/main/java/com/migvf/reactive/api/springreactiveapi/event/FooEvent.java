package com.migvf.reactive.api.springreactiveapi.event;

import com.migvf.reactive.api.springreactiveapi.dto.FooDto;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author migvf
 * @project spring-reactive-api
 */

@NoArgsConstructor
@Data
public class FooEvent {

    private FooDto fooDto;
    private LocalDateTime date;

    public FooEvent(FooDto fooDto, LocalDateTime date){
        this.fooDto = fooDto;
        this.date = date;
    }

}
