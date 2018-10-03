/**
 * 
 */
package lk.sliit.csse.group19.springApi.SpringBackendAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
}
