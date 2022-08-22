package br.com.olx.leadIntegration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.olx.leadIntegration.domain.ListingDataFeed;

@Service
public class ListingDataFeedService {

	@Autowired
	private ListingService listingService;

	@Autowired
	private HeaderService headerService;
	
	public ListingDataFeed getData() {
		return new ListingDataFeed(headerService.getHeader(), listingService.getListing());
	}
}
