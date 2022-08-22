package br.com.olx.leadIntegration.Resource;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.olx.leadIntegration.domain.Listing;
import br.com.olx.leadIntegration.domain.ListingDataFeed;
import br.com.olx.leadIntegration.service.HeaderService;
import br.com.olx.leadIntegration.service.ListingDataFeedService;
import br.com.olx.leadIntegration.service.ListingService;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

@RestController
@RequestMapping(value="/feeds")
public class FeedResource {

	/*@Autowired
	private ListingDataFeed headerService;

	@Autowired
	private ListingService listingService;*/

	@Autowired
	private ListingDataFeedService service;

	@GetMapping(produces = {MediaType.APPLICATION_XML_VALUE})
	public ListingDataFeed findFeeds() throws XMLStreamException, IOException {
		
		/*StringWriter stringWriter = new StringWriter();
		XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newFactory();
		XMLStreamWriter sw = xmlOutputFactory.createXMLStreamWriter(stringWriter);
		XmlMapper mapper = new XmlMapper();
		sw.writeStartDocument();
		sw.writeStartElement("ListingDataFeed");
		sw.writeNamespace("xmlns","http://www.vivareal.com/schemas/1.0/VRSync");
		sw.writeNamespace("xsi","http://www.w3.org/2001/XMLSchema-instance");
		sw.writeNamespace("schemaLocation","http://www.vivareal.com/schemas/1.0/VRSync");
		mapper.writeValue(sw, headerService.getHeader());
		mapper.writeValue(sw, listingService.getListing());
		sw.writeEndElement();
		sw.writeEndDocument();
		sw.close();

		//StreamResult result = new StreamResult(stringWriter);
		StringBuffer sb = stringWriter.getBuffer(); 
		String finalstring = sb.toString();*/
		
		return service.getData();
	}
}