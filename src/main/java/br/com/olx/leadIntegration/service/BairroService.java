package br.com.olx.leadIntegration.service;

import org.springframework.stereotype.Service;

import br.com.olx.leadIntegration.domain.enums.TipoInformacaoBairro;

@Service
public class BairroService {

	public String getBairroCEPouLocalizacao(String bairroNome, TipoInformacaoBairro tipoInformacao) {
		
		String cep = "";
		String latitude = "";
		String longitude = "";
		
		switch (bairroNome) {
			
			case "Aquarela Brasil" :
				cep = "78556-500";
				latitude = "-11.857010";
				longitude = "-55.547704";
				break;

			case "Aquarela das Artes" :
				cep = "78555-474";
				latitude = "-11.835684";
				longitude = "-55.546073";
				break;

			case "Alameda das Cores" :
				cep = "78555-701";
				latitude = "-11.824986";
				longitude = "-55.546682";
				break;

			case "Portal da Mata" :
				cep = "78550-970";
				latitude = "-11.850328";
				longitude = "-55.548104";
				break;

			case "Recanto Suíço" :
				cep = "78555-605";
				latitude = "-11.858379";
				longitude = "-55.540733";
				break;

			case "Mondrian" :
				cep = "78555-900";
				latitude = "-11.852615";
				longitude = "-55.547322";
				break;

			case "Carpe Diem Resort" :
				cep = "78555-902";
				latitude = "-11.847289";
				longitude = "-55.553945";
				break;

			case "Jardim Barcelona" :
				cep = "78555-343";
				latitude = "-11.850900";
				longitude = "-55.531629";
				break;

			case "Jardim Maringá" :
				cep = "78556-244";
				latitude = "-11.857542";
				longitude = "-55.518485";
				break;

			case "Jardim Botânico" :
				cep = "78556-044";
				latitude = "";
				longitude = "";
				break;

			case "Bella Suíça" :
				cep = "78556-588";
				latitude = "-11.867242";
				longitude = "-55.506246";
				break;

			case "Jardim Paraíso" :
				cep = "78556-104";
				latitude = "-11.866095";
				longitude = "-55.514805";
				break;

			case "Jardim Belo Horizonte" :
				cep = "78556-280";
				latitude = "-11.868723";
				longitude = "-55.525915";
				break;

			case "Centro" :
				cep = "78550-970";
				latitude = "-11.857419";
				longitude = "-55.498148";
				break;

			case "Florença" :
				cep = "78555-414";
				latitude = "-11.847991";
				longitude = "-55.536992";
				break;

			case "Jardim Itália" :
				cep = "78555-321";
				latitude = "-11.849601";
				longitude = "-55.530973";
				break;

			case "Nossa Senhora Aparecida" :
				cep = "78556-336";
				latitude = "-11.853883";
				longitude = "-55.526406";
				break;

			case "Ipanema" :
				cep = "78555-556";
				latitude = "-11.852489";
				longitude = "-55.544544";
				break;

			case "Deville" :
				cep = "78555-572";
				latitude = "-11.843684";
				longitude = "-55.538962";
				break;

			case "Reviera Suiça" :
				cep = "78556-463";
				latitude = "-11.857428";
				longitude = "-55.555783";
				break;

			case "Jardim das Itaúbas" :
				cep = "78556-754";
				latitude = "-11.882360";
				longitude = "-55.519605";
				break;

			case "Quinta da Pampulha" :
				cep = "78556-286";
				latitude = "-11.872643";
				longitude = "-55.529286";
				break;

			case "Santorini Residence" :
				cep = "78555-848";
				latitude = "-11.859935";
				longitude = "-55.560785";
				break;

			case "Paris" :
				cep = "78555-674";
				latitude = "-11.845066";
				longitude = "-55.556970";
				break;

			case "Monet" :
				cep = "78550-970";
				latitude = "-11.860014";
				longitude = "-55.536600";
				break;

			case "Residencial Ipanema" :
				cep = "78555-556";
				latitude = "-11.852489";
				longitude = "-55.544544";
				break;
				
			default :
				cep = "78556-500";
				latitude = "-11.857010";
				longitude = "-55.547704";
				break;
		}

		if (tipoInformacao == TipoInformacaoBairro.CEP) {
			return cep;
		}
		else if (tipoInformacao == TipoInformacaoBairro.LATITUDE) {
			return latitude;
		}
		else if (tipoInformacao == TipoInformacaoBairro.LONGITUDE) {
			return longitude;
		}
		else {
			return cep;
		}
	}
}
