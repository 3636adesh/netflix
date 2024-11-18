package com.content.constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Languages implements VideoConvertors {

    ENGLISH("English","eng","The english");

    private final String name;
    private final String code;
    private final String description;
}
