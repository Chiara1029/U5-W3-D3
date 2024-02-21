package com.chiarapuleio.exercise.exOne.classes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Info {
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
}
