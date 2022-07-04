package com.portfolio.taj.Interface;

import com.portfolio.taj.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer una lista personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Elimar un objeto buscandolo por ID
    public void deletePersona(long id); 
    
    //Buscar una persona por ID
    public Persona findPersona(long id);
}
