package com.content.constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum GlobalConstant {

    USER_ID("userId");

    private final String name;
}
