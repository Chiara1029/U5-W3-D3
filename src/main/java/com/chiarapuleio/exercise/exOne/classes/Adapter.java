package com.chiarapuleio.exercise.exOne.classes;

import com.chiarapuleio.exercise.exOne.interfaces.DataSource;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.time.Period;

@AllArgsConstructor
@ToString
public class Adapter implements DataSource {
    private Info infos;

    @Override
    public String getFullName() {
        return infos.getName() + " " + infos.getSurname();
    }

    @Override
    public int getAge() {
        LocalDate today = LocalDate.now();
        Period diff = Period.between(infos.getDateOfBirth(), today);
        return diff.getYears();
    }
}
