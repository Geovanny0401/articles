package com.example.jugnicaragua.jugnicaragua.service;

import com.example.jugnicaragua.jugnicaragua.dao.IPersonDAO;
import com.example.jugnicaragua.jugnicaragua.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private IPersonDAO dao;

    public Person save(Person t) { return dao.save(t); }

    public Person update(Person t) { return dao.save(t); }

    public void delete(Person t) { dao.delete(t); }

    public Iterable<Person> list() { return dao.findAll(); }

    public Optional<Person> listId(long id) {
        return dao.findById(id);
    }

}
