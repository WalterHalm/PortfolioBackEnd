
package com.miportfoliowalter.SpringBoot.Service;

import com.miportfoliowalter.SpringBoot.Entity.Persona;
import com.miportfoliowalter.SpringBoot.Interface.IPersonaService;
import com.miportfoliowalter.SpringBoot.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService {
@Autowired IPersonaRepository iPersonaRepository;

    @Override
    public List<Persona> getPersonas() {
        List <Persona> persona = iPersonaRepository.findAll();
        return persona;        
    }

    @Override
    public void savePersona(Persona persona) {
        iPersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
       iPersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = iPersonaRepository.findById(id).orElse(null);
        return persona;
    }
    
    
}
