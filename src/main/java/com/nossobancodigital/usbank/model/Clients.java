package com.nossobancodigital.usbank.model;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;

public class Clients {

    @NotBlank(message = "Nome é Obrigatório")
    private String client_name;

    @NotBlank(message = "Sobrenome é Obrigatório")
    private String client_lastname;

    @NotNull(message = "Email é Obrigatório")
    private String client_email;

    @NotNull(message = "Número da CNH é um campo Obrigatório")
    private String client_cnh;

    @NotNull(message = "Data de Nascimento é Obrigatório")
    private Date client_birthday;

    @CPF(message = "Número do CPF é Obrigatório")
    private String client_cpf;

    public String getClient_cpf() {
        return client_cpf;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public String getClient_lastname() {
        return client_lastname;
    }

    public void setClient_lastname(String client_lastname) {
        this.client_lastname = client_lastname;
    }

    public String getClient_email() {
        return client_email;
    }

    public void setClient_email(String client_email) {
        this.client_email = client_email;
    }

    public String getClient_cnh() {
        return client_cnh;
    }

    public void setClient_cnh(String client_cnh) {
        this.client_cnh = client_cnh;
    }

    public Date getClient_birthday() {
        return client_birthday;
    }

    public void setClient_birthday(Date client_birthday) {
        this.client_birthday = client_birthday;
    }

    public void setClient_cpf(String client_cpf) {
        this.client_cpf = client_cpf;
    }
    
}
