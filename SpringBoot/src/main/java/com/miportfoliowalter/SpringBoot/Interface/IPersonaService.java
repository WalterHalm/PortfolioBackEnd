
package com.miportfoliowalter.SpringBoot.Interface;

import com.miportfoliowalter.SpringBoot.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    
    public List <Persona> getPersonas ();
    
    public void savePersona(Persona persona);
    
    public void deletePersona (Long id);
    
    public Persona findPersona(Long id);
    
}
