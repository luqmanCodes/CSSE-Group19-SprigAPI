package lk.sliit.csse.group19.springApi.SpringBackendAPI.services;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.Item;

/**
 * @author Dev
 *
 */
public interface ItemService {

	public Iterable<Item> getAllItems();
	public Item insertItem(Item item);
	public void deleteItem(int id);
}
