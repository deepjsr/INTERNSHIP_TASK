package com.DAKR.web.JWT_Auth_DAKR_SOLUTION.Models;


import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class DAKRSolutionEnterpriseForm {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;

	    @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "dakrForm_id", referencedColumnName = "id")
	    private DAKRSolutionForm dakrSolutionForm;
	
	    private String fname;
	    
	    private String lname;

private String ecount;
private String clientTarget;
private String projectQuality;
private String clientSatisfaction;


}
