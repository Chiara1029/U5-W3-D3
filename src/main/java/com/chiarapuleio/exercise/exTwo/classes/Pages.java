package com.chiarapuleio.exercise.exTwo.classes;

import com.chiarapuleio.exercise.exTwo.interfaces.CompositeComp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Pages implements CompositeComp {
    private String pageContent;

    @Override
    public int getNumberOfPages() {
        return 1;
    }

    @Override
    public void print() {
        System.out.println(pageContent);
    }
}
