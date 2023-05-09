
package com.portfolio.nn.Service;

import com.portfolio.nn.Entity.Persona;
import com.portfolio.nn.Interface.IPersonaService;
import com.portfolio.nn.Repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class PersonaService implements IPersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public List<Persona> getPersonas() {
        List<Persona> listaPersonas = this.personaRepository.findAll();
        return listaPersonas;
    }

    /**
     *
     * @param persona
     * @return
     */
    @Override
    public Persona savePersona(Persona persona) {
        return this.personaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        this.personaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        return this.personaRepository.findById(id).orElse(null);
    }
}