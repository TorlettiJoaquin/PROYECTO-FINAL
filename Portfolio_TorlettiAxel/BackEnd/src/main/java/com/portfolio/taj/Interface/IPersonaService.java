package com.portfolio.taj.Interface;

import com.portfolio.taj.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer una persona
    public List<Persona> getPersona();
    
    //Guadar un objeto del tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto, lo buscamos por id
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);   
}
