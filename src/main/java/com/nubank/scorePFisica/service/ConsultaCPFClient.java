package com.nubank.scorePFisica.service;

import com.nubank.scorePFisica.restClients.CPFMock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsultaCPFClient {
    private static final RestTemplate restTemplate = new RestTemplate();

    private static final String baseExternalURL = "http://localhost:8081/ConsultaCPFMock/";

    @Autowired
    private Environment env;

    public CPFMock ConsultaCPF(final long cpf) {
        CPFMock cpfMock = null;
            cpfMock = new RestTemplate()
                    .getForObject(baseExternalURL + cpf, CPFMock.class);
      return cpfMock;
    }
}
