package com.content.constant;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum SubTitles implements VideoConvertors {

    ENGLISH("English", "eng", "The English language"),
    SPANISH("Spanish", "spa", "The Spanish language"),
    FRENCH("French", "fre", "The French language");

    private final String name;
    private final String code;
    private final String description;
}
