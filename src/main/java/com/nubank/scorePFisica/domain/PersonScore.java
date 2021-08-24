package com.nubank.scorePFisica.domain;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity(name="PersonCreditScore")
@Table(name="PersonCreditScore")
public class PersonScore {

    @Id
    private long cpf;
    @NotNull
    private long score;
    @NotNull
    private String dateAsString;

    public PersonScore(){}

    public PersonScore(final long cpf, final long score, final String dateAsString) {
        this.cpf = cpf;
        this.score = score;
        this.dateAsString = dateAsString;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getScore() {
        return score;
    }

    public void setScore(long score) {
        this.score = score;
    }

    public String getDateAsString() {
        return dateAsString;
    }

    public void setDateAsString(String dateAsString) {
        this.dateAsString = dateAsString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonScore)) return false;
        PersonScore personScore = (PersonScore) o;
        return getCpf() == personScore.getCpf() &&
                getScore() == personScore.getScore() &&
                getDateAsString().equals(personScore.getDateAsString());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCpf(), getScore(), getDateAsString());
    }

    @Override
    public String toString (){
        return "Person Score {" + cpf + "}, Score {" + score + "}, Date {" + dateAsString + "}";
    }
}
