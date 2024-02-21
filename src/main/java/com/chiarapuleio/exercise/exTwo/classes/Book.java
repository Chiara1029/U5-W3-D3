package com.chiarapuleio.exercise.exTwo.classes;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Book {
    private Pages pages;
    private double price;
    private List<String> authorsList;
}
