/**
 * 
 */
package lk.sliit.csse.group19.springApi.SpringBackendAPI.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.Item;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.services.ItemService;

/**
 * @author Dev
 *
 */
@RestController
@CrossOrigin(origins = "http://localhost:9000/items")
@RequestMapping("/items")
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	
	@GetMapping
	public @ResponseBody Iterable<Item> getAllItems() {
		return this.itemService.getAllItems();
	}
	
	@PostMapping
	public Item insertItem(@Valid @RequestBody Item item) {
		return this.itemService.insertItem(item);
	}
	
	@DeleteMapping("/{id}")
	public boolean deleteItem(@PathVariable(value="id") int id) {
		return itemService.deleteItem(id);
	}
}
