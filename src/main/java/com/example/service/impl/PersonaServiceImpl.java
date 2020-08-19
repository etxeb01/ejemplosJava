package com.example.service.impl;

import com.example.commons.GenericServiceImpl;
import com.example.dao.api.PersonaDaoApi;
import com.example.model.Persona;
import com.example.service.api.PersonaServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona,Long> implements PersonaServiceAPI {

    @Autowired
    private PersonaDaoApi personaDaoApi;

    @Override
    public CrudRepository<Persona, Long> getDao() {
        return personaDaoApi;
    }
}
