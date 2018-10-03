package lk.sliit.csse.group19.springApi.SpringBackendAPI.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.Item;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.repositories.ItemRepository;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.services.ItemService;

@Service
public class ItemServiceImplementation implements ItemService {

	@Autowired
	private ItemRepository itemRepository;
	
	@Override
	public Iterable<Item> getAllItems() {
		return this.itemRepository.findAll();
	}
	
	@Override
	public Item insertItem(Item item) {
		return (Item) this.itemRepository.save(item);
	}

	@Override
	public void deleteItem(int id) {
		itemRepository.deleteById(id);	
	}

}
