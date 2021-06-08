package com.example.webserviceperson.services.impl;

import com.example.webserviceperson.entities.Person;
import com.example.webserviceperson.services.PersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    private static int i = 0;
    @Override
    public Person getById(Long id) {
        i++;
        System.out.println("iteration " + i);
        return new Person(1L, "Mohamed");
    }
}
