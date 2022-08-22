package br.com.olx.leadIntegration.Resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.olx.leadIntegration.DTO.ModProperties;
import br.com.olx.leadIntegration.service.ModPropertiesService;

@RestController
@RequestMapping(value = "/propriedades")
public class ModPropertiesResource {

	@Autowired
	private ModPropertiesService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public String findAll(){
		
		String retorno = "";
		
		List<ModProperties> propriedades = service.findAll();
		
		for (ModProperties i : propriedades) {
			retorno += i.toString();
		}
		
		return retorno;
	}
}
