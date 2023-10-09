package org.example;

import lombok.*;

@Builder
public record Teacher(
        int id,
        String name,
        @With String subject) {


}


