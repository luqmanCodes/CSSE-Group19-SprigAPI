package lk.sliit.csse.group19.springApi.SpringBackendAPI.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.Site;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.repositories.AuthorizedEmployeeRepository;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.repositories.SiteRepository;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.services.SiteService;

@Service
public class SiteServiceImplementation implements SiteService {

	@Autowired
	private SiteRepository siteRepository;
	
	@Autowired
	private AuthorizedEmployeeRepository authorizedEmployeeRepository;
	
	@Autowired 
	private Optional<Site> site;
	
	@Override
	public Iterable<Site> getAllSites() {
		return this.siteRepository.findAll();
	}
	
	@Override
	public Optional<Site> findSite(int id) {		
		return this.siteRepository.findById(id);
	}
	
	@Override
	public Site insertSite(String authorizedEmployeeId, Site site) {
		if(authorizedEmployeeRepository.existsById(authorizedEmployeeId)) {
			site.setSiteManager(authorizedEmployeeRepository.findById(authorizedEmployeeId).get());
			return siteRepository.save(site);
		} else {
			// no such employee
			return null;
		}
	}
	
	@Override
	public Site updateSite(int siteId, Site siteDetails) {

		this.site = siteRepository.findById(siteId);
		
		if(this.site.isPresent()) {
			if(siteDetails.getName() != null)
				this.site.get().setName(siteDetails.getName());
			if(siteDetails.getAddress() != null)
				this.site.get().setAddress(siteDetails.getAddress());
			return this.siteRepository.save(site.get());
		} else {
			return null;
		}
	}

	@Override
	public boolean deleteSite(int siteId) {
		this.site = siteRepository.findById(siteId);
		
		if(this.site.isPresent()) {
			siteRepository.deleteById(siteId);
			return true;
		} else {
			return false;
		}
			
	}

}
