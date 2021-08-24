package com.nubank.scorePFisica.service;

import com.nubank.scorePFisica.domain.PersonScore;
import com.nubank.scorePFisica.repository.PersonScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class PersonScoreService {

    private final PersonScoreRepository personScoreRepo;

    @Autowired
    public PersonScoreService(final PersonScoreRepository pScoreRepo){
        this.personScoreRepo=pScoreRepo;
    }

    @Transactional
    public PersonScore add(final long cpf, final long score, final String dateAsString){
        return add(new PersonScore(cpf,score,dateAsString));
    }

    @Transactional
    public PersonScore add(final PersonScore pScore){
        return personScoreRepo.save(pScore);
    }

    public Optional<PersonScore> find(final long cpf){
        return personScoreRepo.findById(cpf);
    }

    public Optional<PersonScore> find(final PersonScore pScore){
        return find(pScore.getCpf());
    }

    public long count(){
       return personScoreRepo.count();
    }

}
