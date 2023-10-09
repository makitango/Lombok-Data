package org.example;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class Student {
    private int id;
    private String name;
    private String address;
    private int grade;
}
