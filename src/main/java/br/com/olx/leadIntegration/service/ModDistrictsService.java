package br.com.olx.leadIntegration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.olx.leadIntegration.DTO.ModDistricts;
import br.com.olx.leadIntegration.Repository.ModDistrictsRepository;

@Service
public class ModDistrictsService {

	@Autowired
	private ModDistrictsRepository repo;
	
	public List<ModDistricts> findAll(){
		return repo.findAll();
	}
}
