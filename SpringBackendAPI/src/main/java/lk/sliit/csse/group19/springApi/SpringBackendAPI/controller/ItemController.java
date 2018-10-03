/**
 * 
 */
package lk.sliit.csse.group19.springApi.SpringBackendAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
@RequestMapping("/item")
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	
	@GetMapping
	public @ResponseBody Iterable<Item> getAllItems() {
		return this.itemService.getAllItems();
	}
}
