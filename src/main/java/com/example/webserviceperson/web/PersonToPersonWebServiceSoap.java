package com.example.webserviceperson.web;

import com.example.webserviceperson.entities.Person;
import com.example.webserviceperson.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebService;

@Component
//@WebService
public class PersonToPersonWebServiceSoap {

    private PersonService personService;

    public PersonToPersonWebServiceSoap(){}

    @Autowired
    public PersonToPersonWebServiceSoap(PersonService personService){
        this.personService = personService;
    }

    @WebMethod
    public Person getByName(int id){
        return this.personService.getById(20L);
    }
}
