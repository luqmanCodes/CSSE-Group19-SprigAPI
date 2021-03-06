package lk.sliit.csse.group19.springApi.SpringBackendAPI.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.Item;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.repositories.ItemRepository;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.services.ItemService;

@Service
public class ItemServiceImplementation implements ItemService {

	@Autowired
	private ItemRepository itemRepository;
	
	@Autowired 
	private Optional<Item> item;
	
	@Override
	public Iterable<Item> getAllItems() {
		return this.itemRepository.findAll();
	}
	
	@Override
	public Optional<Item> findItem(int id) {		
		return this.itemRepository.findById(id);
	}
	
	@Override
	public Item insertItem(Item item) {
		return (Item) this.itemRepository.save(item);
	}
	
	@Override
	public Item updateItem(int id, Item itemDetails) {
		
		if(itemRepository.findById(id).isPresent()) {
			this.item = itemRepository.findById(id);
			
			if(itemDetails.getName() != null)
				item.get().setName(itemDetails.getName());
			if(itemDetails.getPrice() != 0)
				item.get().setPrice(itemDetails.getPrice());
			if(itemDetails.getItemPolicy() != null)
				item.get().setItemPolicy(itemDetails.getItemPolicy());
			if(itemDetails.getItemComment() != null)
				item.get().setItemComment(itemDetails.getItemComment());
			
			return this.itemRepository.save(item.get());
					
		} else {
			return null;
		}
	}

	@Override
	public boolean deleteItem(int itemId) {
		this.item = itemRepository.findById(itemId);
		
		if(this.item.isPresent()) {
			itemRepository.deleteById(itemId);
			return true;
		} else {
			return false;
		}
			
	}
}
