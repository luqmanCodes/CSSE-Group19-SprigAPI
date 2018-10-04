package lk.sliit.csse.group19.springApi.SpringBackendAPI.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.Site;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.services.SiteService;

/**
 * 
 * @author Dev
 *
 */
@RestController
public class SiteController {

	@Autowired
	private SiteService siteService;
	
	@GetMapping("/sites")
	public @ResponseBody Iterable<Site> getAllPolicies(){
			return this.siteService.getAllSites();
	}
	
	@GetMapping("/sites/{siteId}")
	public @ResponseBody Optional<Site> findSite(@PathVariable(value="siteId") int siteId){
			return this.siteService.findSite(siteId);
	}
	
	@PostMapping("/authorizedEmployees/{authorizedEmployeeId}/sites")
	public Site insertSite(@PathVariable(value="authorizedEmployeeId") String authorizedEmployeeId, @Valid @RequestBody Site site) {
		return this.siteService.insertSite(authorizedEmployeeId, site);
	}
	
	@PutMapping("/sites/{siteId}")
	public Site updateSite(@PathVariable(value="siteId") int siteId, @Valid @RequestBody Site siteDetails){
		return this.siteService.updateSite(siteId, siteDetails);	
	}
	
	@DeleteMapping("sites/{siteId}")
	public boolean deleteSite(@PathVariable(value="siteId") int siteId) {
		return siteService.deleteSite(siteId);
	}
}
