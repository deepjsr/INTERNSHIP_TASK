package com.DAKR.web.JWT_Auth_DAKR_SOLUTION.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAKR.web.JWT_Auth_DAKR_SOLUTION.Models.DAKRSolutionEnterpriseForm;
import com.DAKR.web.JWT_Auth_DAKR_SOLUTION.repository.EnterpriseFormRepository;

@Service
public class EnterpriseFormImpl {
	@Autowired
	private EnterpriseFormRepository enterpriseFormRepository;
	
	// Get all Enterprise  Form
		public List<DAKRSolutionEnterpriseForm> getAllEnterpriseUsersForms() {
			return enterpriseFormRepository.findAll();
		}

	// Get Enterprise  Form by ID
		public DAKRSolutionEnterpriseForm getEnterpriseUsersFormsById(long id) {
			Optional<DAKRSolutionEnterpriseForm> fOptional = enterpriseFormRepository.findById(id);
			return fOptional.get();
		}

	// Create or save Enterprise  Form
		public boolean saveEnterpriseForms(DAKRSolutionEnterpriseForm eform) {
			if (eform != null) {
			
				enterpriseFormRepository.save(eform);
				return true;
			} else {
				return false;
			}
		}

	// Update a Enterprise  Form
		public DAKRSolutionEnterpriseForm updateEnterpriseForms(long id, DAKRSolutionEnterpriseForm eform) {
			Optional<DAKRSolutionEnterpriseForm> etform = enterpriseFormRepository.findById(id);
			if (etform.get() != null) {
				return enterpriseFormRepository.save(eform);
			} else {
				return null;
			}
		}

	// Delete a DAKR Enterprise  Form
		public DAKRSolutionEnterpriseForm deleteForm(long id) {
			Optional<DAKRSolutionEnterpriseForm> eform = enterpriseFormRepository.findById(id);

			if (eform.get() != null) {
				enterpriseFormRepository.deleteById(id);
			} 
			return eform.get();
		}
}
