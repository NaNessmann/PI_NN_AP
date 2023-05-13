
package com.portfolio.nn.Interface;

import com.portfolio.nn.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    
    //Traer lista de personas
    public List <Persona> getPersona();
    
    //Guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //Elimionar un objeto por id
    public void deletePersona(Long id);
    
    //Buscar persona por id
    public Persona findPersona(Long id);
    
}
