package br.com.olx.leadIntegration.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.olx.leadIntegration.domain.Features;

@Service
public class FeatureService {
	
	private final String[] condominiosFechados = {"Portal da Mata", "Alameda das Cores", "Mondrian", "Carpe Diem Resort",
													"Quinta da Pampulha", "Santorini Residence"};

	private final String[] condominiosAbertos = {"Aquarela Brasil", "Aquarela das Artes"};

	public Features getFeatures(String description, String bairro) {

		Features feat = new Features();

		if (description.toUpperCase().contains("SACADA")) {
			feat.getFeature().add("Balcony");
		}

		if (description.toUpperCase().contains("MOBILIADO")) {
			feat.getFeature().add("Furnished");
		}

		if (description.toUpperCase().contains("GARAGEM")) {
			feat.getFeature().add("Parking Garage");
		}

		if (description.toUpperCase().contains("LAVANDERIA")) {
			feat.getFeature().add("Laundry");
		}

		if (description.toUpperCase().contains("COZINHA")) {
			feat.getFeature().add("Kitchen");
		}

		if (description.toUpperCase().contains("JARDIM")) {
			feat.getFeature().add("Garden Area");
		}

		if (description.toUpperCase().contains("CHURRASQUEIRA")) {
			feat.getFeature().add("BBQ");
		}

		if (description.toUpperCase().contains("GOURMET")) {
			feat.getFeature().add("Gourmet Area");
		}

		if (description.toUpperCase().contains("PISCINA")) {
			feat.getFeature().add("Pool");
		}
		
		if (Arrays.stream(condominiosFechados).anyMatch(bairro::contains)) {
			feat.getFeature().addAll(this.condominioFechado());
		}

		if (Arrays.stream(condominiosAbertos).anyMatch(bairro::contains)) {
			feat.getFeature().addAll(this.condominioAberto());
		}

		if (feat.getFeature().size() > 0) {
			return feat;			
		}
		else {
			return null;
		}
	}
	
	private List<String> condominioFechado(){
		
		List<String> feats = new ArrayList<>();
		
		feats.add("Controlled Access");
		feats.add("TV Security");
		feats.add("Security Guard on Duty");
		feats.add("Fenced Yard");
		feats.add("Sports Court");
		feats.add("Tennis court");
		feats.add("Green space / Park");
		feats.add("Gym");
		
		return feats;
	}
	
	private List<String> condominioAberto(){
		
		List<String> feats = new ArrayList<>();
		
		feats.add("TV Security");
		feats.add("Security Guard on Duty");
		feats.add("Sports Court");
		feats.add("Tennis court");
		feats.add("Controlled Access");
		feats.add("Green space / Park");
		
		return feats;
	}
}
