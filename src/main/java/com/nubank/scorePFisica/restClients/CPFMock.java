package com.nubank.scorePFisica.restClients;

import java.io.Serializable;

public class CPFMock implements Serializable {

    private long cpf;
    private long score;

    public CPFMock(){}
    public CPFMock(final long cpf, final long score){
        setCpf(cpf);
        setScore(score);
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
}
