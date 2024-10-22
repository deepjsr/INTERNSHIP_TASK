package com.DAKR.web.JWT_Auth_DAKR_SOLUTION.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAKR.web.JWT_Auth_DAKR_SOLUTION.Models.DAKRSolutionForm;
import com.DAKR.web.JWT_Auth_DAKR_SOLUTION.repository.FormsRepository;

@Service
public class FormsServiceImpl {

	@Autowired
	private FormsRepository formsRepository;

// Get all users
	public List<DAKRSolutionForm> getAllUsersForms() {
		return formsRepository.findAll();
	}

// Get user by ID
	public DAKRSolutionForm getUsersFormsById(long id) {
		Optional<DAKRSolutionForm> fOptional = formsRepository.findById(id);
		return fOptional.get();
	}

// Create or save a person
	public boolean saveUsersForms(DAKRSolutionForm form) {

		if (form != null) {
			
			formsRepository.save(form);
			return true;
		} else {
			return false;
		}
	}

// Update a form
	public DAKRSolutionForm updateUsersForms(long id, DAKRSolutionForm form) {
		Optional<DAKRSolutionForm> dform = formsRepository.findById(id);
		if (dform.get() != null) {
			return formsRepository.save(form);
		} else {
			return null;
		}
	}

// Delete a DAKR SOLUTION Form
	public DAKRSolutionForm deleteForm(long id) {
		Optional<DAKRSolutionForm> dform = formsRepository.findById(id);

		if (dform.get() != null) {
			formsRepository.deleteById(id);
		} 
		return dform.get();
	}
}
