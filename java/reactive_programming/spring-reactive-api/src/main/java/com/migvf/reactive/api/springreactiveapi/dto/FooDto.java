package com.migvf.reactive.api.springreactiveapi.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author migvf
 * @project spring-reactive-api
 */

@NoArgsConstructor
@Data
public class FooDto implements Serializable {

    private static final long serialVersionUID = 349562322517043260L;
    private String message;

    public FooDto(String message){
        this.message = message;
    }

}
