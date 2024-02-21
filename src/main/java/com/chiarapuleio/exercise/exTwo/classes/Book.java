package com.chiarapuleio.exercise.exTwo.classes;

import com.chiarapuleio.exercise.exTwo.interfaces.CompositeComp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class Book implements CompositeComp {
    private List<CompositeComp> components = new ArrayList<>();
    private List<String> authors;
    private double price;

    public Book(List<String> authors, double price) {
        this.authors = authors;
        this.price = price;
    }

    public void addComp(CompositeComp component){
        components.add(component);
    }

    @Override
    public int getNumberOfPages() {
        int totalPages = 0;
        for(CompositeComp component : components){
            totalPages += component.getNumberOfPages();
        }
        return totalPages;
    }

    @Override
    public void print() {
        for(CompositeComp component : components){
            component.print();
        }
    }
}
