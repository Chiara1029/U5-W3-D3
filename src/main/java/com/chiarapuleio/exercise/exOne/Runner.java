package com.chiarapuleio.exercise.exOne;

import com.chiarapuleio.exercise.exOne.classes.Adapter;
import com.chiarapuleio.exercise.exOne.classes.Info;
import org.springframework.boot.CommandLineRunner;

import java.time.LocalDate;

public class Runner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Info user = new Info("Chiara", "Puleio", LocalDate.of(1994,10,29));
        Adapter userAd = new Adapter(user);

        System.out.println(userAd.getNomeCompleto());
        System.out.println(userAd.getEta());
    }
}
