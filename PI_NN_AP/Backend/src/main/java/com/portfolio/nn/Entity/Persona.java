
package com.portfolio.nn.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
    
 
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    
    private String nombre;
    
   
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    
    private String apellido;
    
  
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String img;
}
