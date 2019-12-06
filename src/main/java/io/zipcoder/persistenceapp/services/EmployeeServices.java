package io.zipcoder.persistenceapp.services;


import io.zipcoder.persistenceapp.repository.EmployerRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServices {
    private EmployerRepository repository;

    public EmployeeServices(EmployerRepository repository){
        this.repository = repository;
    }
}
