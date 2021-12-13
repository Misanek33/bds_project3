package org.but.feec.bds_project3.services;

import org.but.feec.bds_project3.api.PersonBasicView;
import org.but.feec.bds_project3.data.PersonRepository;

import java.util.List;

public class PersonService {

    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) { this.personRepository = personRepository; }

    public PersonService() {

    }

    public List<PersonBasicView> getPersonBasicView() {
        return personRepository.getPersonBasicView();
    }



}
