package com.example;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
public class SimpleObjectJava {
    private String id;


    public SimpleObjectJava(final String id) {
        this.id = id;
    }
}
