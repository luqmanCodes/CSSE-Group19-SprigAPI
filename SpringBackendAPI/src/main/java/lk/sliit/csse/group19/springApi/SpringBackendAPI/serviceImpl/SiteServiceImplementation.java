package lk.sliit.csse.group19.springApi.SpringBackendAPI.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.Site;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.repositories.SiteRepository;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.services.SiteService;

/**
 * 
 * @author Dev
 *
 */
@Service
public class SiteServiceImplementation implements SiteService {

	@Autowired
	private SiteRepository siteRepository;
	
	@Override
	public Iterable<Site> getAllSites() {
		return this.siteRepository.findAll();
	}

}
