package com.chiarapuleio.exercise;

import com.chiarapuleio.exercise.exOne.classes.Adapter;
import com.chiarapuleio.exercise.exOne.classes.Info;
import com.chiarapuleio.exercise.exOne.classes.UserData;
import com.chiarapuleio.exercise.exTwo.classes.Book;
import com.chiarapuleio.exercise.exTwo.classes.Pages;
import com.chiarapuleio.exercise.exTwo.classes.Section;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class ExerciseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExerciseApplication.class, args);

		System.out.println("----- ESERCIZIO 1 -----");

		Info user = new Info("Chiara", "Puleio", LocalDate.of(1994,10,29));
		Adapter userAd = new Adapter(user);
		System.out.println(userAd.getFullName());
		System.out.println(userAd.getAge());

		UserData userDt = new UserData(userAd.getFullName(), userAd.getAge());
		userDt.getData(userAd);

		System.out.println("----- ESERCIZIO 2 -----");
		Book divinaCommedia = new Book(List.of("Dante Alighieri", "Dante"), 19.90);

		Section sec1 = new Section("Introduction");
		Section sec2 = new Section("Inferno");
		Section sec3 = new Section("Canto III");
		sec1.addComp(new Pages("Biografia"));
		sec1.addComp(new Pages("Commento"));
		sec2.addComp(sec3);
		sec3.addComp(new Pages("Per me si va nella città dolente, \n Per me si va nell'eterno dolore, \n Per me si va tra la perduta gente."));
		sec3.addComp(new Pages("Giustizia mosse il mio Alto Fattore; \n Fecemi la Divina Podestate, \n La Somma Sapienza e 'l primo amore."));
		sec3.addComp(new Pages("Dinnanzi a me non fuor cose create \n Se non eterne, e io eterna duro. \n Lasciate ogne speranza, voi ch'entrate."));

		divinaCommedia.addComp(sec1);
		divinaCommedia.addComp(sec2);

		divinaCommedia.print();
	}

}
