package com.chiarapuleio.exercise;

import com.chiarapuleio.exercise.exOne.classes.Adapter;
import com.chiarapuleio.exercise.exOne.classes.Info;
import com.chiarapuleio.exercise.exOne.classes.UserData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class ExerciseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExerciseApplication.class, args);

		System.out.println("----- ESERCIZIO 1 -----");

		Info user = new Info("Chiara", "Puleio", LocalDate.of(1994,10,29));
		Adapter userAd = new Adapter(user);
		System.out.println(userAd.getNomeCompleto());
		System.out.println(userAd.getEta());

		UserData userDt = new UserData(userAd.getNomeCompleto(), userAd.getEta());
		userDt.getData(userAd);
	}

}
