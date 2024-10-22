package com.DAKR.web.JWT_Auth_DAKR_SOLUTION.Models;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;


@Data
@Entity
public class DAKRSolutionForm  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    // Inverse side of the relationship
    @OneToOne(mappedBy = "dakrSolutionForm", cascade = CascadeType.ALL)
    private DAKRSolutionEnterpriseForm dakrSolutionEnterpriseForm;
    
 
    private String fname;
    
    private String lname;
    
    private String goal;
    
    private String roadmap;
    
    
    
}