package com.example.dao.api;

import com.example.model.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDaoApi extends CrudRepository <Persona,Long> {


}
