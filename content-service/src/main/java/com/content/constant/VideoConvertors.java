package com.content.constant;

public sealed interface VideoConvertors permits Languages,SubTitles {

    String getName();
    String getCode();
    String getDescription();
}
