package br.com.olx.leadIntegration.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import br.com.olx.leadIntegration.DTO.ModDistricts;
import br.com.olx.leadIntegration.DTO.ModProperties;
import br.com.olx.leadIntegration.Repository.ModDistrictsRepository;
import br.com.olx.leadIntegration.Repository.ModPropertiesRepository;
import br.com.olx.leadIntegration.domain.ContactInfo;
import br.com.olx.leadIntegration.domain.Country;
import br.com.olx.leadIntegration.domain.Details;
import br.com.olx.leadIntegration.domain.Item;
import br.com.olx.leadIntegration.domain.ListPrice;
import br.com.olx.leadIntegration.domain.Listing;
import br.com.olx.leadIntegration.domain.Listings;
import br.com.olx.leadIntegration.domain.LivingArea;
import br.com.olx.leadIntegration.domain.Location;
import br.com.olx.leadIntegration.domain.LotArea;
import br.com.olx.leadIntegration.domain.Media;
import br.com.olx.leadIntegration.domain.State;
import br.com.olx.leadIntegration.domain.enums.MostrarEndereco;
import br.com.olx.leadIntegration.domain.enums.PublicacaoTipo;
import br.com.olx.leadIntegration.domain.enums.TipoPropriedade;
import br.com.olx.leadIntegration.domain.enums.TipoPropriedadeBordulis;
import br.com.olx.leadIntegration.domain.enums.TipoUso;
import br.com.olx.leadIntegration.domain.enums.TransacaoTipo;

@Service
public class ListingService {

	@Autowired
	private ModPropertiesRepository repo;

	@Autowired
	private ModDistrictsRepository districtService;

	@Value("${default.dados.hostname}")
	private String hostname;

	@Autowired
	private ItemService itemService;

	public Listings getListing() {

		Listings lista = new Listings();
		
		List<ModProperties> casas = repo.findAll();

		casas.removeIf(a -> a.getModDistrict() == null || a.getAtivo() == 0);
		//casas.removeIf(a -> a.getCode() != "CS0084");
		
		for (ModProperties pro : casas) {

			if (pro.getModDistrict() != null) {

				Media media = new Media();
				media.getItems().add(new Item("image","img1","true",pro.getImagem() == null ? "" : hostname + pro.getImagem()));

				media.getItems().addAll(itemService.findByItemId(pro.getId()));

				media.getItems().add(new Item("video",null,"true",pro.getVideo() == null ? "" : pro.getVideo()));

				Optional<ModDistricts> pri = districtService.findById(pro.getModDistrict());
				
				PublicacaoTipo Ptipo = null;
				
				if (pro.getObservacao() != null) {
					if (pro.getObservacao().contains("!SDCP!")) {
						Ptipo = PublicacaoTipo.SUPER_PREMIUM;
					}
					else if (pro.getFeature() == 1) {
						Ptipo = PublicacaoTipo.STANDARD;						
					}
					else {
						Ptipo = PublicacaoTipo.STANDARD;						
					}
				}
				else {
					if (pro.getFeature() == 1) {
						Ptipo = PublicacaoTipo.PREMIUM;
					}
					else {
						Ptipo = PublicacaoTipo.STANDARD;						
					}
				}

				lista.getListings().add(new Listing(
							pro.getCode(),
							TipoPropriedadeBordulis.toEnum(pro.getTipo() == null ? 1 : pro.getTipo()).getDescricao().toUpperCase() + " | " + pri.get().getTitulo(),
							TransacaoTipo.FOR_SALE,
							new Location(MostrarEndereco.NEIGHBORHOOD,
									"Sinop",
									new State("MT", "Mato Grosso"),
									new Country("BR", "Brasil"),
									pri.get().getTitulo()
									),
							media,
							new ContactInfo("Bordulis Imóveis Selecionados",
											"contato@bordulis.com",
											"https://bordulis.com",
											"https://bordulis.com/upload/1/1/6037bcf177ffc58ae5.png",
											"Bordulis Imóveis Selecionados",
											"66 99662-5248",
											new Location(new Country("BR", "Brasil"), new State("MT", "Mato Grosso"), "Sinop", "Aquarela Brasil", "Rua Dorival Cayme, 151", "78556-500")),
							Ptipo,
							new Details(new ListPrice(pro.getPreco(), "BRL"),
											pro.getDecricao(),
											TipoPropriedade.CASA,
											new LivingArea("square metres", pro.getAreaConstruida()),
											new LotArea("square metres", pro.getTerreno()),
											0,
											pro.getQuarto(),
											pro.getGaragem(),
											1,
											TipoUso.RESIDENTIAL)
						));
			}
		}

		lista.getListings().forEach((n) -> {
			n.setTitle( "<![CDATA[" + n.getTitle() + "]]>" );
			n.getLocation().getState().setValue("<![CDATA[" + n.getLocation().getState().getValue() + "]]>");
			n.getLocation().setCity("<![CDATA[" + n.getLocation().getCity() + "]]>");
			n.getDetails().setDescription("<![CDATA[" + n.getDetails().getDescription() + "]]>");;
		});

		return lista;
	}
}
