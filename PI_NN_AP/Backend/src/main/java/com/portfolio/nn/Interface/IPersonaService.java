
package com.portfolio.nn.Interface;

import com.portfolio.nn.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    public List<Persona> getPersonas();
    public Persona savePersona(Persona persona);
    public void deletePersona(Long id);
    public Persona findPersona(Long id);
}