
package com.miportfoliowalter.SpringBoot.Repository;

import com.miportfoliowalter.SpringBoot.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPersonaRepository extends JpaRepository <Persona, Long>{
    
}
