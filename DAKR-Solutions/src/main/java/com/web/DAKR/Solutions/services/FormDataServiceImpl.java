package com.web.DAKR.Solutions.services;

import com.web.DAKR.Solutions.dto.FormData;
import com.web.DAKR.Solutions.repository.FormDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormDataServiceImpl implements FormDataService {
    @Autowired
    private FormDataRepository formDataRepository;

    @Override
    public boolean registerFormData(FormData formData) {
        try {
            formDataRepository.save(formData);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
