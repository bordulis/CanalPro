package br.com.olx.leadIntegration.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import br.com.olx.leadIntegration.domain.Header;

@Service
public class HeaderService {

	public Header getHeader() {

		Header head = new Header();

		head.setProvider("Bordulis Imoveis Selecionados");
		head.setEmail("contato@bordulis.com");
		head.setContactName("Bordulis Imoveis Selecionados");
		head.setPublishDate(new Date(System.currentTimeMillis()));
		head.setTelephone("(66) 99985-6929");
		
		return head;
	}
}
