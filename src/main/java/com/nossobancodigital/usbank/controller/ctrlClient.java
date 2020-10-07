package com.nossobancodigital.usbank.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ctrlClient {

    private String client_name;
    private String client_lastname;
    private String client_email;
    private String client_cnh;
    private Date client_birthday;
    private String client_cpf;

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

    public String getClient_cpf() {
        return client_cpf;
    }

    public void setClient_cpf(String client_cpf) {
        this.client_cpf = client_cpf;
    }
}
