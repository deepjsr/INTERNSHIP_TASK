package com.example.EmailWithTempletAPI.repository;

import com.example.EmailWithTempletAPI.been.Email_Templet_Config;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface LoadMailTemplateRepository extends CrudRepository<Email_Templet_Config, String> {

	public List<Email_Templet_Config> findByApplicationNameAndTamplateName(String applicationName, String tamplateName);

}
