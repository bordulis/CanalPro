package br.com.olx.leadIntegration.Resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.olx.leadIntegration.DTO.ModDistricts;
import br.com.olx.leadIntegration.service.ModDistrictsService;

@RestController
@RequestMapping(value="/casas")
public class ModDistrictsResource {

	@Autowired
	private ModDistrictsService service;

	@RequestMapping(method=RequestMethod.GET)
	public String findAll() {
		
		String retorno = "";
		
		List<ModDistricts> casas = service.findAll();
		
		for (ModDistricts i : casas) {
			retorno += i.toString();
		}
		
		return retorno;
	}
}
