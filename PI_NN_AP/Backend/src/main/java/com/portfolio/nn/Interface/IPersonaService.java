
package com.portfolio.nn.Interface;

import com.portfolio.nn.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer una lista de personas 
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona Persona);
    
    //Eliminar un objeto lo buscamos por ID
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);
}
