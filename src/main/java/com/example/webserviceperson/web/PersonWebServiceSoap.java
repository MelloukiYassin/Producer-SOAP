package com.example.webserviceperson.web;

import com.example.webserviceperson.entities.Person;
import com.example.webserviceperson.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Component
@WebService
public class PersonWebServiceSoap {

    private PersonService personService;

    public PersonWebServiceSoap(){}

    @Autowired
    public PersonWebServiceSoap(PersonService personService){
        this.personService = personService;
    }

    @WebMethod
    public Person getById(){
        System.out.println("Web service running");
        return personService.getById(150L);
    }
}
