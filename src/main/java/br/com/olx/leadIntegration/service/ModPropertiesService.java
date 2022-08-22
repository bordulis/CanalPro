package br.com.olx.leadIntegration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.olx.leadIntegration.DTO.ModProperties;
import br.com.olx.leadIntegration.Repository.ModPropertiesRepository;

@Service
public class ModPropertiesService {

	@Autowired
	private ModPropertiesRepository repo;

	public List<ModProperties> findAll(){
		return repo.findAll();
	}
}
