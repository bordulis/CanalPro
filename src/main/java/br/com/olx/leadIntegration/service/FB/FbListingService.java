package br.com.olx.leadIntegration.service.FB;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import br.com.olx.leadIntegration.DTO.ModDistricts;
import br.com.olx.leadIntegration.DTO.ModProperties;
import br.com.olx.leadIntegration.Repository.ModDistrictsRepository;
import br.com.olx.leadIntegration.Repository.ModPropertiesRepository;
import br.com.olx.leadIntegration.domain.Item;
import br.com.olx.leadIntegration.facebook.address;
import br.com.olx.leadIntegration.facebook.component;
import br.com.olx.leadIntegration.facebook.image;
import br.com.olx.leadIntegration.facebook.listing;
import br.com.olx.leadIntegration.service.BairroService;
import br.com.olx.leadIntegration.service.ItemService;

@Service
public class FbListingService {

	@Autowired
	private ModPropertiesRepository repo;

	@Autowired
	private ModDistrictsRepository districtService;

	@Value("${default.dados.hostname}")
	private String hostname;

	@Autowired
	private ItemService itemService;
	
	@Autowired
	private BairroService bairroService;
	
	public List<listing> getListings(){
		
		List<listing> lista = new ArrayList<listing>();
		
		List<ModProperties> casas = repo.findAll();

		casas.removeIf(a -> a.getModDistrict() == null || a.getAtivo() == 0 || a.getVendido() == 1);
		
		for (ModProperties pro : casas) {
			
			if (pro.getModDistrict() != null) {
				
				Optional<ModDistricts> pri = districtService.findById(pro.getModDistrict());
				
				listing imv = new listing();
				
				imv.setHome_listing_id(pro.getCode());
				imv.setName("Casa | " + pri.get().getTitulo());
				imv.setAvailability("for_sale");
				imv.setDescription(pro.getDecricao().replace("&nbsp;","").replace("<br>","")
													.replace("<br>","").replace("<strong>","")
													.replace("</strong>","").replace("<p>","")
													.replace("</p>",""));
				List<component> comp = new ArrayList<component>();
				
				comp.add(new component("addr1", pri.get().getTitulo()));
				comp.add(new component("city", "Sinop"));
				comp.add(new component("region", "Mato Grosso"));
				comp.add(new component("country", "Brasil"));
				comp.add(new component("postal_code", bairroService.getBairroCEP(pri.get().getTitulo())));				
				imv.setAddress(new address("simple",comp));
				
				imv.setLatitude("-11.857323");
				imv.setLongitude("-55.548252");
				imv.setNeighborhood(pri.get().getTitulo());
				
				List<image> imagens = new ArrayList<image>();
				List<Item> items = itemService.findByItemId(pro.getId());
				
				items.stream().forEach(a -> imagens.add(new image(a.getUrl())));
				
				imv.setImage(imagens);
				imv.setListing_type("for_sale_by_agent");
				imv.setNum_baths(3);
				imv.setNum_beds(pro.getQuarto());
				imv.setNum_units("1");
				imv.setPrice(pro.getPreco());
				
				if (pro.getTipo() == null) {
					imv.setProperty_type("house");
				}
				else if (pro.getTipo() == 1) {
					imv.setProperty_type("house");
				}
				else if (pro.getTipo() == 2) {
					imv.setProperty_type("apartment");
				}
				else if (pro.getTipo() == 4) {
					imv.setProperty_type("land");
				}
				else {
					imv.setProperty_type("house");
				}
				
				String url = "https://bordulis.com/";

				if (pro.getTipo() == null) {
					url += "casa-";
				}
				else if (pro.getTipo() == 1) {
					url += "casa-";
				}
				else if (pro.getTipo() == 2) {
					url += "apartamento-";
				}
				else if (pro.getTipo() == 4) {
					url += "terreno-";
				}
				else {
					url += "casa-";
				}
				
				url += pri.get().getTitulo().replace(" ","-") + "-" + pro.getId();				
				imv.setUrl(Normalizer.normalize(url, Normalizer.Form.NFC));
				
				imv.setYear_built(2020);
				
				lista.add(imv);
			}
		}

		return lista;
	}
}
