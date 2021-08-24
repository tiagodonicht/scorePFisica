package com.nubank.scorePFisica;

import com.nubank.scorePFisica.service.PersonScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScorePFisicaApplication {

	@Autowired
	private PersonScoreService personScoreService;

	public static void main(String[] args) {
		SpringApplication.run(ScorePFisicaApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		line();
//		System.out.println("ScorePFisicaApplication.run()");
//		final PersonScore pScore = personScoreService.add(30560242859L,988,java.time.LocalDate.now().toString());
//		final PersonScore pScore2 = personScoreService.add(30560242850L,988,java.time.LocalDate.now().toString());
//		System.out.println(personScoreService.count());
//		System.out.println(pScore2);
//
//		line();
//	}
//
//	private void line(){
//		System.out.println("=============");
//
//	}
}
