package lk.sliit.csse.group19.springApi.SpringBackendAPI.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.AuthorizedEmployee;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.Item;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.repositories.ItemRepository;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.services.ItemService;

@Service
public class ItemServiceImplementation implements ItemService {

	@Autowired
	private ItemRepository itemRepositiory;
	
	@Override
	public Iterable<Item> getAllItems() {
		return this.itemRepositiory.findAll();
	}

	@Override
	public Item insertItem(Item item) {
		return (Item) this.itemRepositiory.save(item);
	}

	@Override
	public void deleteItem(int id) {
		itemRepositiory.deleteById(id);	
	}



}
