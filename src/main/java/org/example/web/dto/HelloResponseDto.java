package org.example.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
//@AllArgsConstructor
public class HelloResponseDto {

    private final String name ;
    private final int amount ;
    //private int mount ;

}
