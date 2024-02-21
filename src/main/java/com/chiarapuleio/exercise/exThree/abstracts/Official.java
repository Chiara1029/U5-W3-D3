package com.chiarapuleio.exercise.exThree.abstracts;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Official {
    private Official superior;
    private String role;
    private int salary;

}
