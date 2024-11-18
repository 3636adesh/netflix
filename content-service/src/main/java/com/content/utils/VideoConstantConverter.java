package com.content.utils;

import com.content.constant.SubTitles;
import com.content.constant.VideoConvertors;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Converter
public class VideoConstantConverter implements AttributeConverter<Set<? extends VideoConvertors>, String> {

    @Override
    public String convertToDatabaseColumn(Set<? extends VideoConvertors> videoConstants) {
        if (videoConstants == null || videoConstants.isEmpty()) {
            return null;
        }
        return videoConstants.stream()
                .map(VideoConvertors::getCode)
                .collect(Collectors.joining(","));
    }

    @Override
    public Set<? extends VideoConvertors> convertToEntityAttribute(String dbData) {
        if (dbData == null || dbData.isEmpty()) {
            return new HashSet<>();
        }

        return Arrays.stream(dbData.split(","))
                .map(code -> SubTitles.valueOf(code.toUpperCase()))
                .collect(Collectors.toSet());
    }
}

