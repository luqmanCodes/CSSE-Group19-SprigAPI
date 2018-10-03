package lk.sliit.csse.group19.springApi.SpringBackendAPI.services;

import java.util.Optional;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.Item;

/**
 * @author Dev
 *
 */
public interface ItemService {

	public Iterable<Item> getAllItems();
	public Optional<Item> findItem(int id);
	public Item insertItem(Item item);
	public Item updateItem(int id, Item itemDetails);
	public void deleteItem(int id);
}
