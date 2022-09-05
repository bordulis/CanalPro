package br.com.olx.leadIntegration.Resource;

import java.io.IOException;

import javax.xml.stream.XMLStreamException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.olx.leadIntegration.facebook.link;
import br.com.olx.leadIntegration.facebook.listings;
import br.com.olx.leadIntegration.service.FB.FbListingService;

@RestController
@RequestMapping(value="/fb")
public class FacebookResource {

	@Autowired
	private FbListingService listingService;

	@GetMapping(produces = {MediaType.APPLICATION_XML_VALUE})
	public listings findListings() throws XMLStreamException, IOException {

		listings list = new listings("Bordulis Imóveis", new link(), listingService.getListings());
		
		return list;
	}
}
