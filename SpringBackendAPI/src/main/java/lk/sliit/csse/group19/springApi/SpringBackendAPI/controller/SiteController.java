/**
 * 
 */
package lk.sliit.csse.group19.springApi.SpringBackendAPI.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.Site;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.Site;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.services.SiteService;

/**
 * @author Dev
 *
 */
@RestController
@RequestMapping("/site")
public class SiteController {

	@Autowired
	private SiteService siteService;
	
	@GetMapping
	public @ResponseBody Iterable<Site> getAllSites(){
		return this.siteService.getAllSites();
	}
	
	@PostMapping
	public Site insertSite(@Valid @RequestBody Site site) {
		return this.siteService.insertSite(site);
	}
	
	@DeleteMapping("/{id}")
	public void deleteSite(@PathVariable(value="id") int id) {
		siteService.deleteSite(id);
	}
}
