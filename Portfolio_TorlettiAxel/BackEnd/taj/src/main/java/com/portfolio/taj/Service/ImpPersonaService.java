package com.portfolio.taj.Service;

import com.portfolio.taj.Entity.Persona;
import com.portfolio.taj.Interface.IPersonaService;
import com.portfolio.taj.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepository ipersonaRepository;

    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(long id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(long id) {
        Persona persona = ipersonaRepository.findById(id).orElse(null);
        return persona; 
    }
    
}
