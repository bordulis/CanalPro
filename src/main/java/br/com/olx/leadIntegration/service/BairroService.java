package br.com.olx.leadIntegration.service;

import org.springframework.stereotype.Service;

@Service
public class BairroService {

	public String getBairroCEP(String bairroNome) {
		
		String cep = "";
		
		switch (bairroNome) {
			
			case "Aquarela Brasil" :
				cep = "78556-500";
				break;

			case "Aquarela das Artes" :
				cep = "78555-474";
				break;

			case "Alameda das Cores" :
				cep = "78555-701";
				break;

			case "Portal da Mata" :
				cep = "78550-970";
				break;

			case "Recanto Suíço" :
				cep = "78555-605";
				break;

			case "Mondrian" :
				cep = "78555-900";
				break;

			case "Carpe Diem Resort" :
				cep = "78555-902";
				break;

			case "Jardim Barcelona" :
				cep = "78555-343";
				break;

			case "Jardim Maringá" :
				cep = "78556-244";
				break;

			case "Jardim Botânico" :
				cep = "78556-044";
				break;

			case "Bella Suíça" :
				cep = "78556-588";
				break;

			case "Jardim Paraíso" :
				cep = "78556-104";
				break;

			case "Jardim Belo Horizonte" :
				cep = "78556-280";
				break;

			case "Centro" :
				cep = "78550-970";
				break;

			case "Florença" :
				cep = "78555-414";
				break;

			case "Jardim Itália" :
				cep = "78555-321";
				break;

			case "Nossa Senhora Aparecida" :
				cep = "78556-336";
				break;

			case "Ipanema" :
				cep = "78555-556";
				break;

			case "Deville" :
				cep = "78555-572";
				break;

			case "Reviera Suiça" :
				cep = "78556-463";
				break;

			case "Jardim das Itaúbas" :
				cep = "78556-754";
				break;

			case "Quinta da Pampulha" :
				cep = "78556-286";
				break;

			case "Santorini Residence" :
				cep = "78555-848";
				break;

			case "Paris" :
				cep = "78555-674";
				break;

			case "Monet" :
				cep = "78550-970";
				break;

			case "Residencial Ipanema" :
				cep = "78555-556";
				break;
				
			default :
				cep = "78556-500";
				break;
		}
		
		return cep;
	}
}
