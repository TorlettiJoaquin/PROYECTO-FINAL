package com.portfolio.taj.Interface;

import com.portfolio.taj.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //traer una lista de Persona
    public List<Persona> getPersona();
    
    //Guardar un objeto del tipo Persona
    public void savePersona(Persona persona);
    
    //Elimar un objeto por ID
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);
}
