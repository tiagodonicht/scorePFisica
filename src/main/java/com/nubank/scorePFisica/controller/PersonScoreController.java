package com.nubank.scorePFisica.controller;

import com.nubank.scorePFisica.domain.PersonScore;
import com.nubank.scorePFisica.service.ConsultaCPFClient;
import com.nubank.scorePFisica.service.PersonScoreService;
import com.nubank.scorePFisica.utils.DateSupport;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(
        "/PersonScore"
)
public class PersonScoreController {

    private final PersonScoreService personScoreService;

    public PersonScoreController(final PersonScoreService personScoreService) {
        this.personScoreService = personScoreService;
    }

    @GetMapping(
            path = "{id}"
    )
    public ResponseEntity<PersonScore> get(@PathVariable("id") long cpf){
        ResponseEntity<PersonScore> rEnt;
        Optional<PersonScore> pScore = personScoreService.find(cpf);
        //is it present and it is not today (meaning) it is older than 1 day
        if( pScore.isPresent() &&
                        pScore.get().getDateAsString().equals(DateSupport.getToday()))
        {
            //get the score from local database
            rEnt = ResponseEntity.ok(pScore.get());
            System.out.println("Returned from local database");
        }else {
            //we don't have it local, get it from external
            rEnt = ResponseEntity.ok(personScoreService.add(cpf, new ConsultaCPFClient().ConsultaCPF(cpf).getScore(), DateSupport.getToday()));
            System.out.println("Returned from external provider");
        }
        return rEnt;
    }

}
