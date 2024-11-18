package com.content.models.helper;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tags")
public record Tags(

        @Id @GeneratedValue
        Long id,
        String tag,
        String value
) {
}