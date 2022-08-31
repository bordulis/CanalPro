package br.com.olx.leadIntegration.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import br.com.olx.leadIntegration.DTO.Images;
import br.com.olx.leadIntegration.Repository.ImagesRepository;
import br.com.olx.leadIntegration.domain.Item;

@Service
public class ItemService {

	@Autowired
	private ImagesRepository repo;

	@Value("${default.dados.hostname}")
	private String hostname;
	
	public List<Item> findByItemId(int item_id) {
		
		List<Images> images = repo.findByItemId(item_id);

		images.removeIf(a -> a.getModuloId() == 9);

		List<Item> items = new ArrayList<>();
		
		Integer i = 2;

		for (Images im : images) {
			
			items.add(new Item("image","img" + i.toString() ,"", hostname + im.getUrl()));
			i++;
		}

		return items;
	}
}
