package com.DAKR.web.JWT_Auth_DAKR_SOLUTION.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DAKR.web.JWT_Auth_DAKR_SOLUTION.Models.DAKRSolutionForm;

@Repository
public interface FormsRepository extends JpaRepository<DAKRSolutionForm, Long>{

}
